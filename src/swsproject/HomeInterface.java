
package swsproject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import static swsproject.SetSurface.newGraph;


public class HomeInterface extends javax.swing.JFrame {
      private static final Logger log4j = Logger.getLogger(HomeInterface.class 
	        .getName());      
    
    
    public HomeInterface() {
        initComponents();
        this.lbl_run_state.setVisible(false);
        this.lbl_remain_time.setVisible(false);
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_roof = new javax.swing.JButton();
        btn_asphalt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sp_rain_amount = new javax.swing.JSpinner();
        sp_rain_temperature = new javax.swing.JSpinner();
        sp_hours = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        sp_mins = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        btn_pause = new javax.swing.JButton();
        btn_resume = new javax.swing.JButton();
        lbl_run_state = new javax.swing.JLabel();
        lbl_remain_time = new javax.swing.JLabel();
        btn_grass = new javax.swing.JButton();
        draw_panel = new MyPanel();
        jLabel14 = new javax.swing.JLabel();
        lbl_point_temp = new javax.swing.JLabel();
        lbl_point_height = new javax.swing.JLabel();
        graph_pannel = new LeftShowGraphic();
        btn_show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Select Surface Type");

        btn_roof.setBackground(new java.awt.Color(204, 204, 204));
        btn_roof.setText("Roof");
        btn_roof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roofActionPerformed(evt);
            }
        });

        btn_asphalt.setBackground(new java.awt.Color(170, 170, 170));
        btn_asphalt.setText("Asphalt");
        btn_asphalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asphaltActionPerformed(evt);
            }
        });

        jLabel2.setText("Rain Amount");

        jLabel3.setText("Rain Temperature");

        jLabel4.setText("Run Time");

        jLabel5.setText("hr");

        jLabel6.setText("min");

        jLabel7.setText("cm");

        jLabel8.setText("C");

        btn_start.setText("Start Rain");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_pause.setText("Pause");
        btn_pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pauseActionPerformed(evt);
            }
        });

        btn_resume.setText("Resume");
        btn_resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resumeActionPerformed(evt);
            }
        });

        lbl_run_state.setForeground(new java.awt.Color(255, 0, 51));
        lbl_run_state.setText("Simulation Running");

        lbl_remain_time.setText("2hrs 4mins remaining");

        btn_grass.setBackground(new java.awt.Color(51, 153, 0));
        btn_grass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_grass.setForeground(new java.awt.Color(255, 255, 255));
        btn_grass.setText("Grass");
        btn_grass.setActionCommand("create_Grass");
        btn_grass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sp_rain_temperature, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(sp_rain_amount))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sp_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sp_mins, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_remain_time, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(btn_pause, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_resume)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lbl_run_state))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_start))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_grass, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_roof, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_asphalt)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_roof, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_grass))
                    .addComponent(btn_asphalt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sp_rain_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_rain_temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(sp_mins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btn_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pause)
                    .addComponent(btn_resume))
                .addGap(32, 32, 32)
                .addComponent(lbl_run_state)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_remain_time)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        draw_panel.setBackground(new java.awt.Color(255, 255, 255));
        draw_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        draw_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draw_panelMouseDragged(evt);
            }
        });
        draw_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw_panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                draw_panelMouseReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setText("| |");

        lbl_point_temp.setText("0 C");

        lbl_point_height.setText("0 cm");

        javax.swing.GroupLayout draw_panelLayout = new javax.swing.GroupLayout(draw_panel);
        draw_panel.setLayout(draw_panelLayout);
        draw_panelLayout.setHorizontalGroup(
            draw_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(draw_panelLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(draw_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_point_temp)
                    .addComponent(lbl_point_height))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        draw_panelLayout.setVerticalGroup(
            draw_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, draw_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, draw_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_point_temp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_point_height)
                .addContainerGap())
        );

        graph_pannel.setBackground(new java.awt.Color(255, 255, 255));
        graph_pannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graph_pannel.setAutoscrolls(true);

        btn_show.setBackground(new java.awt.Color(102, 255, 0));
        btn_show.setText("Show");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graph_pannelLayout = new javax.swing.GroupLayout(graph_pannel);
        graph_pannel.setLayout(graph_pannelLayout);
        graph_pannelLayout.setHorizontalGroup(
            graph_pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graph_pannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_show)
                .addContainerGap())
        );
        graph_pannelLayout.setVerticalGroup(
            graph_pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_pannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_show)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graph_pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(draw_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(draw_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graph_pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_grassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grassActionPerformed
        DataSingleton.getInstance().draw_rect_state = 1;
        DataSingleton.getInstance().rect_type = 0;
       log4j.info("The user selects grass as surface"); 
       log4j.info(DataSingleton.getInstance().draw_rect_state); 
       log4j.info("The user starts drawing the surface");
        
    }//GEN-LAST:event_btn_grassActionPerformed

    private void btn_roofActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DataSingleton.getInstance().draw_rect_state = 1;
        DataSingleton.getInstance().rect_type = 1;
        log4j.info("The user selects the roof as a surface"); 
        log4j.info(DataSingleton.getInstance().draw_rect_state);
        log4j.info("The user starts drawing the surface"); 
    }

    private void btn_asphaltActionPerformed(java.awt.event.ActionEvent evt) {                                            
        DataSingleton.getInstance().draw_rect_state = 1;
        DataSingleton.getInstance().rect_type = 2;
       log4j.info("The user selects the asphalt surface"); 
       log4j.info(DataSingleton.getInstance().draw_rect_state);
       log4j.info("The user starts drawing the surface");

    }

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {
        DOMConfigurator.configure("log4j.xml");
        this.minutes = 60 * (Integer)this.sp_hours.getValue() + (Integer)this.sp_mins.getValue();
        log4j.info("User enters the rain amount, rain temperature and simulation time");
        int rain_amount = (Integer)this.sp_rain_amount.getValue();
        log4j.info("User Input Rain Amount: " + rain_amount);
        this.remained_time = this.minutes;
        log4j.info(this.remained_time); 
        this.h_rain = ((double)rain_amount)/(double)this.minutes;        
        this.t_rain = (double)((Integer)this.sp_rain_temperature.getValue()); 
        log4j.info(t_rain);
        simulator_timer = new Timer();        
        simulator_timer.schedule(new simulator_task(), 0,1000);
        this.lbl_run_state.setVisible(true);
        this.lbl_remain_time.setVisible(true);
        
        log4j.info("Jfreechart is loaded and graphs start to display");
        log4j.info("Simulation starts");
        
        
        
        
        
        // Make and Display Graphs 
        
        for (int i = 0; i < DataSingleton.getInstance().surface_list.size(); i++) {            
            newGraph = new GraphMaker();
            newGraph.MakeGraph(i);
            
            log4j.info(DataSingleton.getInstance().getInstance().surface_list.get(i).name + " graph generated");
        }
        
        this.btn_grass.setEnabled(false);
        this.btn_roof.setEnabled(false);
        this.btn_asphalt.setEnabled(false);
        this.sp_rain_amount.setEnabled(false);
        this.sp_rain_temperature.setEnabled(false);
        this.sp_hours.setEnabled(false);
        this.sp_mins.setEnabled(false);
        this.btn_start.setEnabled(false);
        this.btn_pause.setEnabled(true);
        this.btn_resume.setEnabled(false);
        
        
// TODO add your handling code here:
    }                                         

    public void set_default()
    {
        
    }
    class simulator_task extends TimerTask {

         @Override
        public void run() {
             if (remained_time == 0) {
                    simulator_timer.cancel();
                    simulator_timer.purge();
                    simulator_timer = null;
                    lbl_run_state.setVisible(false);
                    lbl_remain_time.setVisible(true);
                    
                    btn_grass.setEnabled(true);
                    btn_roof.setEnabled(true);
                    btn_asphalt.setEnabled(true);
                    sp_rain_amount.setEnabled(true);
                    sp_rain_temperature.setEnabled(true);
                    sp_hours.setEnabled(true);
                    sp_mins.setEnabled(true);
                    btn_start.setEnabled(true);
                    btn_pause.setEnabled(false);
                    btn_resume.setEnabled(false);
                    set_default();
                    return;
                 }
             for (int i = 0; i < DataSingleton.getInstance().surface_list.size(); i++) {                 
                 double temp_water = DataSingleton.getInstance().surface_list.get(i).temp_water;
                 System.out.println("temp_water:" + String.valueOf(temp_water));
                 
                 double temp_surface = DataSingleton.getInstance().surface_list.get(i).temp_surface;
                 double h_water = DataSingleton.getInstance().surface_list.get(i).h_water;
                 double h_apsorbe = DataSingleton.getInstance().surface_list.get(i).h_absorbe;
                 double h_evaporabe = DataSingleton.getInstance().surface_list.get(i).h_evaporabe;
                 double aps_constant = DataSingleton.getInstance().surface_list.get(i).aps_constant;
                 temp_water = (temp_water*h_water + h_rain*t_rain)/(h_water + h_rain);
                 h_water = h_water + h_rain;
                 System.out.println("h_water:" + String.valueOf(h_water));
                 double delta_h_up = Math.min(temp_water/10000, h_water);
                 h_water = h_water - delta_h_up;
                 double delta_h_apsorve = Math.min(1/((h_apsorbe + 1)*Math.exp(h_apsorbe/aps_constant))*h_rain, h_water);
                 h_water = h_water - delta_h_apsorve;
                 h_apsorbe = h_apsorbe + delta_h_apsorve;
                 double delta_h_down = Math.min(temp_surface/10000, h_apsorbe);
                 h_apsorbe = h_apsorbe - delta_h_down;
                 h_evaporabe = h_evaporabe + delta_h_up + delta_h_down;
                 temp_water = temp_water + (temp_surface-temp_water)/(1 + h_water * 100);
                 log4j.info("Temperature of surface water");
                 DataSingleton.getInstance().surface_list.get(i).temp_water = temp_water;
                 log4j.info(DataSingleton.getInstance().surface_list.get(i).temp_water);
                 log4j.info("Height of surface water evaporated ");
                 DataSingleton.getInstance().surface_list.get(i).h_evaporabe = h_evaporabe;
                 log4j.info(DataSingleton.getInstance().surface_list.get(i).h_evaporabe);
                 log4j.info("Height of surface water absorbed");
                 DataSingleton.getInstance().surface_list.get(i).h_absorbe = h_apsorbe;
                 log4j.info(DataSingleton.getInstance().surface_list.get(i).h_absorbe);
                 log4j.info("Height of surface rain water");
                 DataSingleton.getInstance().surface_list.get(i).h_water = h_water;
                 log4j.info(DataSingleton.getInstance().surface_list.get(i).h_water);
                 System.out.println(String.valueOf(DataSingleton.getInstance().surface_list.get(i).h_water));
                 //System.out.println(String.temp_water);
                
             }
             
             double sum_temp_water = 0.0;
             double sum_h_water = 0.0;
             double sum_h_apsorbe = 0.0;
             double sum_h_evaporabe = 0.0;             
             double sum_square = 0.0;
             for (int i = 0; i < DataSingleton.getInstance().surface_list.size(); i++) {
                 double temp_water = DataSingleton.getInstance().surface_list.get(i).temp_water;               
                 double h_water = DataSingleton.getInstance().surface_list.get(i).h_water;
                 double h_apsorbe = DataSingleton.getInstance().surface_list.get(i).h_absorbe;
                 double h_evaporabe = DataSingleton.getInstance().surface_list.get(i).h_evaporabe;
                 sum_square = sum_square + DataSingleton.getInstance().surface_list.get(i).width*DataSingleton.getInstance().surface_list.get(i).height;
                 sum_temp_water = sum_temp_water + temp_water*DataSingleton.getInstance().surface_list.get(i).width*DataSingleton.getInstance().surface_list.get(i).height;
                 sum_h_water = sum_h_water + h_water*DataSingleton.getInstance().surface_list.get(i).width*DataSingleton.getInstance().surface_list.get(i).height;
                 sum_h_apsorbe = sum_h_apsorbe + h_apsorbe*DataSingleton.getInstance().surface_list.get(i).width*DataSingleton.getInstance().surface_list.get(i).height;
                 sum_h_evaporabe = sum_h_evaporabe + h_evaporabe*DataSingleton.getInstance().surface_list.get(i).width*DataSingleton.getInstance().surface_list.get(i).height;                         
             }
             log4j.info("Height of water in channeling point");
             DataSingleton.getInstance().channel_surface.h_water = sum_h_water/sum_square;
             log4j.info(DataSingleton.getInstance().channel_surface.h_water);
             log4j.info("Height of water absorbed in channeling point");
             DataSingleton.getInstance().channel_surface.h_absorbe = sum_h_apsorbe/sum_square;
             log4j.info(DataSingleton.getInstance().channel_surface.h_evaporabe);
             log4j.info("Height of water evaporated in channeling point");
             DataSingleton.getInstance().channel_surface.h_evaporabe = sum_h_evaporabe/sum_square;
             log4j.info(DataSingleton.getInstance().channel_surface.h_evaporabe);
             log4j.info("Temperature of water in channeling point");
             DataSingleton.getInstance().channel_surface.temp_water = sum_temp_water/sum_square;
             log4j.info(DataSingleton.getInstance().channel_surface.temp_water);
             lbl_point_height.setText(String.valueOf(String.valueOf(Math.round(DataSingleton.getInstance().channel_surface.h_water*100)/100.0) + " cm"));
             lbl_point_temp.setText(String.valueOf(String.valueOf(Math.round(DataSingleton.getInstance().channel_surface.temp_water*100)/100.0) + " C"));
             remained_time = remained_time -1;
             int hours = remained_time/60;
             int mins = remained_time-60*hours;
             lbl_remain_time.setText(String.valueOf(hours) + "hrs "+ String.valueOf(mins) + "min remaining");
             draw_panel.repaint();            
        }
    };
    private void btn_pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pauseActionPerformed
        if (simulator_timer!=null) {
            simulator_timer.cancel();
            simulator_timer.purge();
            simulator_timer = null;
            this.lbl_run_state.setVisible(false);
            this.lbl_remain_time.setVisible(true);
            
            this.btn_grass.setEnabled(false);
            this.btn_roof.setEnabled(false);
            this.btn_asphalt.setEnabled(false);
            this.sp_rain_amount.setEnabled(false);
            this.sp_rain_temperature.setEnabled(false);
            this.sp_hours.setEnabled(false);
            this.sp_mins.setEnabled(false);
            this.btn_start.setEnabled(false);
            this.btn_pause.setEnabled(false);
            this.btn_resume.setEnabled(true);
            
        }
        log4j.info("The simulation paused");
    }//GEN-LAST:event_btn_pauseActionPerformed

    private void btn_resumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resumeActionPerformed
        if (simulator_timer==null) {
            simulator_timer = new Timer();        
            simulator_timer.schedule(new simulator_task(), 0,1000);
            this.lbl_run_state.setVisible(true);
            this.lbl_remain_time.setVisible(true);
            
            this.btn_grass.setEnabled(false);
            this.btn_roof.setEnabled(false);
            this.btn_asphalt.setEnabled(false);
            this.sp_rain_amount.setEnabled(false);
            this.sp_rain_temperature.setEnabled(false);
            this.sp_hours.setEnabled(false);
            this.sp_mins.setEnabled(false);
            this.btn_start.setEnabled(false);
            this.btn_pause.setEnabled(true);
            this.btn_resume.setEnabled(false);
        }
        log4j.info("The simulation resumes");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resumeActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed

    }//GEN-LAST:event_btn_showActionPerformed

    private void draw_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMousePressed
        DataSingleton.getInstance().start_x = evt.getX();
        DataSingleton.getInstance().start_y = evt.getY();
        
    }//GEN-LAST:event_draw_panelMousePressed

    private void draw_panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseReleased
        
        if (DataSingleton.getInstance().draw_rect_state == 1) {
        int start_x = Math.min(DataSingleton.getInstance().start_x,evt.getX());
        int start_y = Math.min(DataSingleton.getInstance().start_y, evt.getY());
        int width = Math.abs(DataSingleton.getInstance().start_x - evt.getX());
        int height = Math.abs(DataSingleton.getInstance().start_y - evt.getY());
        
        JLabel lbl_name = new JLabel("surface name", JLabel.CENTER);
        JLabel lbl_h_water =  new JLabel("water height", JLabel.CENTER);
        JLabel lbl_temp_water =  new JLabel("water temp", JLabel.CENTER);
        lbl_name.setLocation(start_x + width/2 - 60, start_y + height/2 - 20);
        lbl_name.setSize(new Dimension(120,20));
        lbl_h_water.setLocation(start_x + width/2 - 40, start_y + height/2);
        lbl_h_water.setSize(new Dimension(80,20));
        lbl_temp_water.setLocation(start_x + width/2 - 40, start_y + height/2 + 20);
        lbl_temp_water.setSize(new Dimension(80,20));     
        Surface new_surface = new Surface();
        new_surface.surface_type = DataSingleton.getInstance().rect_type;
        switch(DataSingleton.getInstance().rect_type)
            {
                case 0:
                    new_surface.surface_color = new Color(51, 153, 0);
                    new_surface.aps_constant = 9.0;
                    break;
                case 1:
                    new_surface.surface_color = new Color(204, 204, 204);
                    new_surface.aps_constant = 1.0;
                    break;
                case 2:
                    new_surface.surface_color = new Color(170, 170, 170);
                    new_surface.aps_constant = 2.0;
                    break;
                default:
                    break;             
            }    
        new_surface.h_water = 0;
        new_surface.h_evaporabe = 0;
        new_surface.h_absorbe = 0;
        new_surface.start_x = start_x;
        new_surface.start_y = start_y;
        new_surface.width = width;
        new_surface.height = height;
        new_surface.temp_list = new ArrayList<>();
        new_surface.h_list = new ArrayList<>();
        new_surface.lbl_name = lbl_name;
        new_surface.lbl_h_water = lbl_h_water;
        new_surface.lbl_temp_water = lbl_temp_water;        
        
        DataSingleton.getInstance().current_surface = new_surface;        
        DataSingleton.getInstance().draw_rect_state = 0;
        SetSurface setSurface_view=new SetSurface();
        setSurface_view.setLocation(this.getWidth()/2, this.getHeight()/2);
        setSurface_view.setVisible(true);        
        }        
    }//GEN-LAST:event_draw_panelMouseReleased

    private void draw_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseDragged
        if (DataSingleton.getInstance().draw_rect_state == 1) {
            DataSingleton.getInstance().end_x = evt.getX();
            DataSingleton.getInstance().end_y = evt.getY();
            this.draw_panel.repaint();
        }

    }//GEN-LAST:event_draw_panelMouseDragged

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInterface().setVisible(true);                
            }
        });
    }   
    public Timer simulator_timer;
    public double t_rain;
    public double h_rain;
    public int minutes;
    public int remained_time;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_asphalt;
    public javax.swing.JButton btn_grass;
    public javax.swing.JButton btn_pause;
    private javax.swing.JButton btn_resume;
    public javax.swing.JButton btn_roof;
    public javax.swing.JButton btn_show;
    public javax.swing.JButton btn_start;
    public javax.swing.JPanel draw_panel;
    public javax.swing.JPanel graph_pannel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_point_height;
    public javax.swing.JLabel lbl_point_temp;
    public javax.swing.JLabel lbl_remain_time;
    public javax.swing.JLabel lbl_run_state;
    public javax.swing.JSpinner sp_hours;
    public javax.swing.JSpinner sp_mins;
    public javax.swing.JSpinner sp_rain_amount;
    public javax.swing.JSpinner sp_rain_temperature;
    // End of variables declaration//GEN-END:variables
    
}
