
package swsproject;
import java.awt.Color;
import java.awt.Point;
import java.util.List;
import javax.swing.JLabel;

public class Surface {
    public int surface_type;  
    public double h_water;
    public double h_evaporabe;
    public double h_absorbe;
    public int start_x;
    public int start_y;
    public int width;
    public int height;
    public List<Integer> temp_list;
    public List<Integer> h_list;
       
    public JLabel lbl_name;
    public JLabel lbl_h_water;
    public JLabel lbl_temp_water;
    public Color surface_color;
    
    public String name;
    public double temp_surface;
    public double temp_water;
    
    public double aps_constant;
}
