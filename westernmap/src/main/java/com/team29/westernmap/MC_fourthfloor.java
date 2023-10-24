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
import java.util.ArrayList;
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
import org.json.simple.parser.ParseException;

/**
 *
 * @author Yuke
 */
public class MC_fourthfloor extends javax.swing.JFrame {

    /**
     * Creates new form MC_fourthfloor
     */
    public MC_fourthfloor() {
        initComponents();
        ImageIcon MC_3 = new ImageIcon("src/main/java/images/middlesexLevel5.png");
        Image MC_3img = MC_3.getImage();
        Image MC_3_scale = MC_3img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon MC_3_scaled = new ImageIcon(MC_3_scale);
        jLabel1.setIcon(MC_3_scaled);
        
        ImageIcon bu1 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu1img = bu1.getImage();
        Image bu1_scale = bu1img.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu1_scaled = new ImageIcon(bu1_scale);
        jButton1.setIcon(bu1_scaled);
        
        try{
        setPersist();}catch(Exception e){
            
        }
        
        jButton1.setVisible(false);
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
            Logger.getLogger(MC_fourthfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(MC_fourthfloor.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    

  
    
        private void poiList() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException{
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/MC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Fourth Floor");
        JSONObject floorObject = (JSONObject) jsonFloor.get(0);
        pList = new String[floorObject.size()][];
        int i = 0;
        for (Object currentKey: floorObject.keySet()){  
            jComboBox1.addItem((String)currentKey); 
            JSONArray cat = (JSONArray) floorObject.get(currentKey);
            pList[i] = new String[cat.size()];
            for (int j = 0; j<cat.size(); j++){
                JSONObject poi = (JSONObject)cat.get(j);
                GUIPoi temp = new GUIPoi("MC", "Fourth Floor", (String)poi.get("category"), (String)poi.get("roomNumber"), (String)poi.get("name"),0,0);
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
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Fourth Floor");
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
        } catch (ParseException ex) {
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
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(500, 500));

        jButton1.setToolTipText("ELEV. C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(966, 522, 54, 76);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(6, 50, 1210, 814);

        jCheckBox1.setText("Elevator");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
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

        jComboBox1.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox2.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(153, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, 122, Short.MAX_VALUE)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(102, 102, 102)
                        .addComponent(jCheckBox1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jButton1.setVisible(true);
        }else {
            jButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUIPoi test = new GUIPoi("MC", "Fourth Floor", "elevator", "C","ELEV. C",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox2.removeAllItems();
        try {
            this.favFind();
        } catch (IOException ex) {
            Logger.getLogger(MC_fourthfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(MC_fourthfloor.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
            JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
            if (jComboBox2.getSelectedItem().equals(poiButton.getToolTipText())){
                poiButton.doClick();
                jComboBox2.removeAllItems();
            }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MC_fourthfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MC_fourthfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MC_fourthfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MC_fourthfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MC_fourthfloor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
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
