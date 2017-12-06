package swsproject;

import java.util.List;

/**
 * Created by Ahmed.
 */

public class DataSingleton {
    public int draw_rect_state;
    public int rect_type;
    public int start_x;
    public int start_y;
    public int end_x;
    public int end_y;
    
    public int remained_mins;
    
    public Surface current_surface;
    public Surface channel_surface;
    public HomeInterface home_interface;
    public List<Surface> surface_list;
    private static class SingletonHolder{
        private static final DataSingleton INSTANCE=new DataSingleton();
    }
    public static DataSingleton getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
}
