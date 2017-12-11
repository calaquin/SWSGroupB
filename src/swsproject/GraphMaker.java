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
    
    public void updateMinutes(int mins)
    {
        this.graphMinutes = mins;
    }
    public void MakeGraph(int surface){        
        this.thisSurface = surface;
        this.graphMinutes = DataSingleton.getInstance().home_interface.remained_time;        
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
        ChartPanel label = new ChartPanel(chart);
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
                //System.out.println("This Surface: " + DataSingleton.getInstance().surface_list.get(thisSurface).name + " " + temp);
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