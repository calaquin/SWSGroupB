package graphtest;

import java.util.Random;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import swsproject.DataSingleton;

public class Main {
    static TimeSeries ts = new TimeSeries("data", Second.class);

    public static void main(String[] args) throws InterruptedException {
        gen myGen = new gen();
        new Thread(myGen).start();

        TimeSeriesCollection dataset = new TimeSeriesCollection(ts);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
            "GraphTest",
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
        axis.setFixedAutoRange(60000.0);

        JFrame frame = new JFrame("GraphTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel label = new ChartPanel(chart);
        frame.getContentPane().add(label);        

        frame.pack();
        frame.setVisible(true);
    }

    static class gen implements Runnable {
        private Random randGen = new Random();

        public void run() {
            while(true) {
                for (int i = 0; i < DataSingleton.getInstance().surface_list.size(); i++)
                {
                    double temp = DataSingleton.getInstance().surface_list.get(i).temp_water;
                }                
                //System.out.println(num);
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