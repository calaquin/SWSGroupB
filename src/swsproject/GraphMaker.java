package swsproject;

import java.util.Random;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;


public class GraphMaker {
    
    static TimeSeries ts = new TimeSeries("data", Second.class);
    int thisSurface;
    
    public void MakeGraph(int surface){        
        this.thisSurface = surface;
        gen myGen = new gen();
        new Thread(myGen).start();
        String graphName = DataSingleton.getInstance().surface_list.get(surface).name;
        TimeSeriesCollection dataset = new TimeSeriesCollection(ts);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
            graphName,
            "Time",
            "Temperature",
            dataset,
            true,
            true,
            false
        );
        final XYPlot plot = chart.getXYPlot();
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        //axis.setFixedAutoRange(9000.0);

        JFrame frame = new JFrame(DataSingleton.getInstance().surface_list.get(surface).name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel label = new ChartPanel(chart);
        frame.getContentPane().add(label);        

        frame.pack();
        frame.setVisible(true);
    }

    public class gen implements Runnable {  
        @Override
        public void run() {
            while(true) {                     
                double temp = DataSingleton.getInstance().surface_list.get(thisSurface).temp_water;                     
                ts.addOrUpdate(new Second(), temp);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

}
