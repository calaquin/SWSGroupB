
package swsproject;

import java.util.ArrayList;


public class SWSProject {

    
    public static void main(String[] args) {
        SWSProject st=new SWSProject();
        DataSingleton.getInstance().surface_list = new ArrayList<>();
        
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
