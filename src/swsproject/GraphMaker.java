package swsproject;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class GraphMaker extends HomeInterface{
    
    static TimeSeries ts = new TimeSeries("Second", Second.class);
    int thisSurface;
    int graphMinutes;
    TimeSeriesCollection dataset;
    gen graphGenerator;    
    JFrame frame;
    JFreeChart chart;
    String graphName;
    ValueAxis axis;
    ChartPanel label;
    double temp;
    
    public void MakeGraph(int surface){        
        this.thisSurface = surface;
        this.graphMinutes = DataSingleton.getInstance().home_interface.remained_time;        
        this.graphGenerator = new gen();
        new Thread(graphGenerator).start();
        this.graphName = DataSingleton.getInstance().surface_list.get(surface).name;
        this.dataset = new TimeSeriesCollection(ts);
        this.chart = ChartFactory.createTimeSeriesChart(
            graphName,
            "Time",
            "Temperature",
            this.dataset,
            true,
            true,
            false
        );
        final XYPlot plot = chart.getXYPlot();
        this.axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        this.frame = new JFrame(DataSingleton.getInstance().surface_list.get(surface).name);
        this.label = new ChartPanel(chart);
        frame.getContentPane().add(label);        

        frame.pack();
        frame.setVisible(true);
    }

    public class gen implements Runnable {  

        //@Override
        public void run() {            
            while(graphMinutes > 0) {   
                graphMinutes = DataSingleton.getInstance().home_interface.remained_time;
                double temp = DataSingleton.getInstance().surface_list.get(thisSurface).temp_water;  
                ts.addOrUpdate(new Second(), temp);
                try {
                    Thread.sleep(120);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }            
            }
        }
    }


 //graphMinutes > 0