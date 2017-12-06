
package swsproject;

import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class SWSProject {
    private static final Logger log4j = Logger.getLogger(SWSProject.class.getName());
   
    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
        SWSProject st=new SWSProject();
        DataSingleton.getInstance().surface_list = new ArrayList<>();        
        log4j.info("This is an info message."); 

    }
    public SWSProject(){
       Surface channel_surface = new Surface();
       channel_surface.h_water = 0;
       channel_surface.h_evaporabe = 0;
       channel_surface.h_absorbe = 0;
       channel_surface.temp_water = 0;        
       DataSingleton.getInstance().channel_surface = channel_surface;
       HomeInterface home_view=new HomeInterface();
       DataSingleton.getInstance().home_interface = home_view;
       home_view.setVisible(true);       
   }
   
}
