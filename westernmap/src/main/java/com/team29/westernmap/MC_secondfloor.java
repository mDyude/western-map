/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.team29.westernmap;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author 16214
 */
public class MC_secondfloor extends javax.swing.JFrame {

    /**
     * Creates new form MC_secondfloor
     */
    public MC_secondfloor() {
        initComponents();
        ImageIcon MC_2 = new ImageIcon("src/main/java/images/middlesexLevel3.png");
        Image MC_2img = MC_2.getImage();
        Image MC_2_scale = MC_2img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon MC_2_scaled = new ImageIcon(MC_2_scale);
        jLabel1.setIcon(MC_2_scaled);
        
        ImageIcon bu1 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu1img = bu1.getImage();
        Image bu1_scale = bu1img.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu1_scaled = new ImageIcon(bu1_scale);
        jButton1.setIcon(bu1_scaled);
        
        ImageIcon bu3 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bu3img = bu3.getImage();
        Image bu3_scale = bu3img.getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu3_scaled = new ImageIcon(bu3_scale);
        jButton3.setIcon(bu3_scaled);

        ImageIcon bu2 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu2img = bu2.getImage();
        Image bu2_scale = bu2img.getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu2_scaled = new ImageIcon(bu2_scale);
        jButton2.setIcon(bu2_scaled);
        
        ImageIcon bu4 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu4img = bu4.getImage();
        Image bu4_scale = bu4img.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu4_scaled = new ImageIcon(bu4_scale);
        jButton4.setIcon(bu4_scaled);
        
        ImageIcon bu5 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu5img = bu5.getImage();
        Image bu5_scale = bu5img.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu5_scaled = new ImageIcon(bu5_scale);
        jButton5.setIcon(bu5_scaled);
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        
        try{
        setPersist();}catch(Exception e){
            
        }
        
        
        jLabel1.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Get the location of the mouse click
        int x = e.getX();
        int y = e.getY();

        // Create a new POI at the mouse click location
        createPOI(x, y);
        }
        });
        
        // Create a map that maps each POI type to an icon
    poiIcons = new HashMap<>();
    poiIcons.put("Classroom", new ImageIcon("src/main/java/images/classroom.png"));
    poiIcons.put("Male Washroom", new ImageIcon("src/main/java/images/rsz_man_wash.png"));
    poiIcons.put("Female Washroom", new ImageIcon("src/main/java/images/woman_wash.png"));
    poiIcons.put("Lab", new ImageIcon("src/main/java/images/lab.png"));
    poiIcons.put("Elevator", new ImageIcon("src/main/java/images/elevator.png"));
    poiIcons.put("Mech.room", new ImageIcon("src/main/java/images/mech.room.png"));
    poiIcons.put("Entry/Exit", new ImageIcon("src/main/java/images/entry.png"));
    poiIcons.put("Stair", new ImageIcon("src/main/java/images/rsz_stair.png"));
    
        try {
            this.poiList();
            this.addRowToJTable();
            this.rowClick(); 
        } catch (IOException ex) {
            Logger.getLogger(MC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(MC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
        private void poiList() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException{
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/MC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Second Floor");
        JSONObject floorObject = (JSONObject) jsonFloor.get(0);
        pList = new String[floorObject.size()][];
        int i = 0;
        for (Object currentKey: floorObject.keySet()){  
            jComboBox1.addItem((String)currentKey); 
            JSONArray cat = (JSONArray) floorObject.get(currentKey);
            pList[i] = new String[cat.size()];
            for (int j = 0; j<cat.size(); j++){
                JSONObject poi = (JSONObject)cat.get(j);
                GUIPoi temp = new GUIPoi("MC", "Second Floor", (String)poi.get("category"), (String)poi.get("roomNumber"), (String)poi.get("name"),0,0);
                sList.add(temp);
                String name = (String)poi.get("name");
                pList[i][j] = name;
            }
            i++;
        }
        jComboBox1.addItem("favourites");
    }
    
    private void addRowToJTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[] = new Object[3];
        
        for (int i = 0; i < sList.size(); i++){
            rowData[0] = sList.get(i).getNames();
            rowData[1] = sList.get(i).getRm();
            rowData[2] = sList.get(i).getCat();
            model.addRow(rowData);
        }
        
    }
    
    private void search(String str){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void rowClick(){
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            event.getValueIsAdjusting();
            if (!event.getValueIsAdjusting()){
                for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
                JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
                if (jTable1.getValueAt(jTable1.getSelectedRow(), 0).equals(poiButton.getToolTipText())){
                    poiButton.doClick();
                }
            }
            }
        }
        });
    }
    
    private void favFind() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException{
        favList.removeAll(favList);
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/MC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Second Floor");
        JSONObject floorObject = (JSONObject) jsonFloor.get(0);
        for (Object currentKey: floorObject.keySet()){  
            JSONArray cat = (JSONArray) floorObject.get(currentKey);
            for (int j = 0; j<cat.size(); j++){
                JSONObject poi = (JSONObject)cat.get(j);
                boolean fav = (boolean)poi.get("highlighted");
                if (fav == true){
                    favList.add((String)poi.get("name"));
                }
            }
        }
    }
    
   private void createPOI(int x, int y) {
        ImageIcon img = new ImageIcon("src/main/java/images/star(1).png");
        JButton poiLabel = new JButton(img);
        poiLabel.setBounds(x, y, 40, 40);
        jLayeredPane1.add(poiLabel, jLayeredPane1.PALETTE_LAYER);
        UserCreate temp = new UserCreate(x, y);
        temp.setVisible(true);

    // Add a mouse listener to the POI label to allow the user to delete it
        poiLabel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                GUIPoi temp = new GUIPoi("", "", "", "", "", x, y);
                temp.setGUI();
            } catch (Exception ex){
                jLayeredPane1.remove(poiLabel);
                jLayeredPane1.repaint();
            }
        }
    });
        poiLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if (SwingUtilities.isRightMouseButton(e)) {
                    int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this POI?", "Delete POI", JOptionPane.YES_NO_OPTION);
                    if (confirmed == JOptionPane.YES_OPTION) {
                    jLayeredPane1.remove(poiLabel);
                    jLayeredPane1.repaint();
                    
                    }
                }
             }
        });
    }
    private void persistData(int x, int y){
        ImageIcon img = new ImageIcon("src/main/java/images/star(1).png");
        JButton poiLabel = new JButton(img);
        poiLabel.setBounds(x, y, 40, 40);
        jLayeredPane1.add(poiLabel, jLayeredPane1.PALETTE_LAYER);
        poiLabel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                GUIPoi temp = new GUIPoi("", "", "", "", "", x, y);
                temp.setGUI();
            } catch (Exception ex){
                jLayeredPane1.remove(poiLabel);
                jLayeredPane1.repaint();
            }
        }
    });
        poiLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if (SwingUtilities.isRightMouseButton(e)) {
                    int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this POI?", "Delete POI", JOptionPane.YES_NO_OPTION);
                    if (confirmed == JOptionPane.YES_OPTION) {
                    jLayeredPane1.remove(poiLabel);
                    jLayeredPane1.repaint();
                    }
                }
             }
        });
    }
    public void setPersist(){
        try {
            String file = "src/main/java/JSONmetadata/userCreated.json";
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonFile = (JSONObject) obj;
            JSONArray jsonType = (JSONArray) jsonFile.get("UserCreated");
            for(int i = 0; i < jsonType.size(); i++){
                JSONObject temp = (JSONObject) jsonType.get(i);
                if(temp.get("building").equals("AHB") && temp.get("floor").equals("Lower Floor")){
                    Long x = (Long) temp.get("x");
                    Long y = (Long) temp.get("y");
                    persistData(x.intValue(), y.intValue());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AHB_lowerfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AHB_lowerfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(AHB_lowerfloor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setToolTipText("204 CLASSROOM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(620, 300, 90, 80);

        jButton2.setToolTipText("205 woman washroom");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(510, 380, 60, 60);

        jButton3.setToolTipText("278 man washroom");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(1020, 520, 40, 40);

        jButton4.setToolTipText("ELEV. C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(970, 480, 50, 50);

        jButton5.setToolTipText("ELEV. A");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(710, 360, 60, 40);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(10, 20, 1230, 800);

        jCheckBox1.setText("Classroom");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Women Restroom");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Men Restroom");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Elevator");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox2.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(153, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("confirm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 51, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("search");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "name", "room number", "category"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton8.setBackground(new java.awt.Color(153, 51, 255));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("Enter Search:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, 123, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 73, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton8)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 475, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(44, 44, 44)
                .addComponent(jButton8)
                .addGap(379, 379, 379))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Second Floor", "man washroom", "278","278 man washroom",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jButton1.setVisible(true);
        }else {
            jButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            jButton2.setVisible(true);
        }else {
            jButton2.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            jButton3.setVisible(true);
        }else {
            jButton3.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox4.isSelected()) {
            jButton4.setVisible(true);
            jButton5.setVisible(true);
        }else {
            jButton4.setVisible(false);
            jButton5.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Second Floor", "classroom", "204","204 CLASSROOM",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Second Floor", "washingroom", "205","205 woman washroom",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Second Floor", "elevator", "A","ELEV. A",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Second Floor", "elevator", "C","ELEV. C",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jComboBox2.removeAllItems();
        try {
            this.favFind();
        } catch (IOException ex) {
            Logger.getLogger(MC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(MC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(favList.size());
        String catName = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        if (catName.equals("favourites")){
            for (int k = 0; k<favList.size(); k++){
                jComboBox2.addItem(favList.get(k));
            }
        }
        for (int i = 0; i < jComboBox1.getItemCount(); i++){
            if (jComboBox1.getItemAt(i).equals(catName)){
                for (int j = 0; j<pList[i].length; j++){
                    jComboBox2.addItem(pList[i][j]);
                }
            } 
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
            JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
            if (jComboBox2.getSelectedItem().equals(poiButton.getToolTipText())){
                poiButton.doClick();
                jComboBox2.removeAllItems();
            }
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String searchString = jTextField1.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1KeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MC_secondfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MC_secondfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MC_secondfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MC_secondfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MC_secondfloor().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private final Map<String, ImageIcon> poiIcons;
    private final ArrayList<JLabel> userPOI = new ArrayList<>();
    private String[][] pList;
    private ArrayList<GUIPoi> sList = new ArrayList<>();
    private ArrayList<String> favList = new ArrayList<>();;
}