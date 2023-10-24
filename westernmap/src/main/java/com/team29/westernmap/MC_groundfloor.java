/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 * asdasdasd
 */
package com.team29.westernmap;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
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
 * @author Hengrui
 */
public class MC_groundfloor extends javax.swing.JFrame {

    /**
     * Creates new form MC_groundfloor
     */
    public MC_groundfloor() {

        initComponents();
        ImageIcon MC_G = new ImageIcon("src/main/java/images/middleSexLevel1.png");
        Image MC_Gimg = MC_G.getImage();
        Image MC_Gimg_scale = MC_Gimg.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon MC_Gimg_scaled = new ImageIcon(MC_Gimg_scale);
        jLabel1.setIcon(MC_Gimg_scaled); 
        
        ImageIcon bu1 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu1img = bu1.getImage();
        Image bu1img_scale = bu1img.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu1img_scaled = new ImageIcon(bu1img_scale);
        jButton1.setIcon(bu1img_scaled); 
        
        ImageIcon bu2 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu2img = bu2.getImage();
        Image bu2img_scale = bu2img.getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu2img_scaled = new ImageIcon(bu2img_scale);
        jButton2.setIcon(bu2img_scaled);
        
        ImageIcon bu3 = new ImageIcon("src/main/java/images/entry.png");
        Image bu3img = bu3.getImage();
        Image bu3img_scale = bu3img.getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu3img_scaled = new ImageIcon(bu3img_scale);
        jButton3.setIcon(bu3img_scaled);
        
        ImageIcon bu4 = new ImageIcon("src/main/java/images/entry.png");
        Image bu4img = bu4.getImage();
        Image bu4img_scale = bu4img.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu4img_scaled = new ImageIcon(bu4img_scale);
        jButton4.setIcon(bu4img_scaled);
        
        ImageIcon bu5 = new ImageIcon("src/main/java/images/entry.png");
        Image bu5img = bu5.getImage();
        Image bu5img_scale = bu5img.getScaledInstance(jButton5.getWidth(), jButton5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu5img_scaled = new ImageIcon(bu5img_scale);
        jButton5.setIcon(bu5img_scaled);
        
        ImageIcon bu6 = new ImageIcon("src/main/java/images/entry.png");
        Image bu6img = bu6.getImage();
        Image bu6img_scale = bu6img.getScaledInstance(jButton6.getWidth(), jButton6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu6img_scaled = new ImageIcon(bu6img_scale);
        jButton6.setIcon(bu6img_scaled);
        
        ImageIcon bu7 = new ImageIcon("src/main/java/images/entry.png");
        Image bu7img = bu7.getImage();
        Image bu7img_scale = bu7img.getScaledInstance(jButton7.getWidth(), jButton7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu7img_scaled = new ImageIcon(bu7img_scale);
        jButton7.setIcon(bu7img_scaled);
        
        ImageIcon bu8 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu8img = bu8.getImage();
        Image bu8img_scale = bu8img.getScaledInstance(jButton8.getWidth(), jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu8img_scaled = new ImageIcon(bu8img_scale);
        jButton8.setIcon(bu8img_scaled);
        
        ImageIcon bu9 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu9img = bu9.getImage();
        Image bu9img_scale = bu9img.getScaledInstance(jButton9.getWidth(), jButton9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu9img_scaled = new ImageIcon(bu9img_scale);
        jButton9.setIcon(bu9img_scaled);
        
        ImageIcon bu10 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu10img = bu10.getImage();
        Image bu10img_scale = bu10img.getScaledInstance(jButton10.getWidth(), jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu10img_scaled = new ImageIcon(bu10img_scale);
        jButton10.setIcon(bu10img_scaled);
        
        ImageIcon bu11 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu11img = bu11.getImage();
        Image bu11img_scale = bu11img.getScaledInstance(jButton11.getWidth(), jButton11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu11img_scaled = new ImageIcon(bu11img_scale);
        jButton11.setIcon(bu11img_scaled);
        
        ImageIcon bu12 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu12img = bu12.getImage();
        Image bu12img_scale = bu12img.getScaledInstance(jButton12.getWidth(), jButton12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu12img_scaled = new ImageIcon(bu12img_scale);
        jButton12.setIcon(bu12img_scaled);
        
        ImageIcon bu13 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bu13img = bu13.getImage();
        Image bu13img_scale = bu13img.getScaledInstance(jButton13.getWidth(), jButton13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu13img_scaled = new ImageIcon(bu13img_scale);
        jButton13.setIcon(bu13img_scaled);
        
        ImageIcon bu14 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu14img = bu14.getImage();
        Image bu14img_scale = bu14img.getScaledInstance(jButton14.getWidth(), jButton14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu14img_scaled = new ImageIcon(bu14img_scale);
        jButton14.setIcon(bu14img_scaled);
        
        ImageIcon bu15 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu15img = bu15.getImage();
        Image bu15img_scale = bu15img.getScaledInstance(jButton15.getWidth(), jButton15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu15img_scaled = new ImageIcon(bu15img_scale);
        jButton15.setIcon(bu15img_scaled);
        
        ImageIcon bu16 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu16img = bu16.getImage();
        Image bu16img_scale = bu16img.getScaledInstance(jButton16.getWidth(), jButton16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu16img_scaled = new ImageIcon(bu16img_scale);
        jButton16.setIcon(bu16img_scaled);
        
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        
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
            Logger.getLogger(MC_groundfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MC_groundfloor.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
        private void poiList() throws FileNotFoundException, IOException, ParseException{
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/MC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Ground Floor");
        JSONObject floorObject = (JSONObject) jsonFloor.get(0);
        pList = new String[floorObject.size()][];
        int i = 0;
        for (Object currentKey: floorObject.keySet()){  
            jComboBox1.addItem((String)currentKey); 
            JSONArray cat = (JSONArray) floorObject.get(currentKey);
            pList[i] = new String[cat.size()];
            for (int j = 0; j<cat.size(); j++){
                JSONObject poi = (JSONObject)cat.get(j);
                GUIPoi temp = new GUIPoi("MC", "Ground Floor", (String)poi.get("category"), (String)poi.get("roomNumber"), (String)poi.get("name"),0,0);
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
    
    private void favFind() throws FileNotFoundException, IOException, ParseException{
        favList.removeAll(favList);
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/MC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("Ground Floor");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton17 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton19 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setToolTipText("17 CLASSROOM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(370, 400, 60, 50);

        jButton2.setToolTipText("6 Classroom");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(530, 440, 60, 50);

        jButton4.setToolTipText("EX. 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(370, 290, 60, 50);

        jButton3.setToolTipText("EX. 5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(490, 270, 60, 40);

        jButton5.setToolTipText("EX. 6");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(590, 180, 60, 50);

        jButton6.setToolTipText("EX. 7");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6);
        jButton6.setBounds(730, 160, 72, 40);

        jButton7.setToolTipText("EX. 8");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7);
        jButton7.setBounds(870, 173, 72, 50);

        jButton8.setToolTipText("ST. 1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8);
        jButton8.setBounds(70, 630, 60, 40);

        jButton9.setToolTipText("ST. 2");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9);
        jButton9.setBounds(280, 560, 60, 40);

        jButton10.setToolTipText("ST. 6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10);
        jButton10.setBounds(430, 300, 60, 50);

        jButton11.setToolTipText("ST. 3");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton11);
        jButton11.setBounds(880, 420, 60, 50);

        jButton12.setToolTipText("ST. 5");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12);
        jButton12.setBounds(1310, 650, 60, 40);

        jButton13.setToolTipText("5b man washroom");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton13);
        jButton13.setBounds(600, 430, 40, 60);

        jButton14.setToolTipText("4b woman washroom");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton14);
        jButton14.setBounds(650, 430, 40, 50);

        jButton15.setToolTipText("ELEV. A");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton15);
        jButton15.setBounds(810, 393, 60, 40);

        jButton16.setToolTipText("ELEV. C");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton16);
        jButton16.setBounds(1165, 563, 50, 40);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1409, 933);

        jScrollPane1.setViewportView(jLayeredPane1);

        jPanel1.setBackground(new java.awt.Color(102, 0, 255));

        jCheckBox1.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Classroom");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Stairwell");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Man washroom");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Woman washroom");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Laboratory");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Mech.room");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Elevator");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Entry/Exit");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(153, 102, 255));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("User-Created");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox5)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox8)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jCheckBox9)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(13, 13, 13))
        );

        jButton17.setBackground(new java.awt.Color(153, 51, 255));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Exit");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 51, 255));

        jButton18.setBackground(new java.awt.Color(153, 51, 255));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("confirm");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(153, 51, 255));

        jButton19.setBackground(new java.awt.Color(153, 51, 255));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("search");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
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
        jScrollPane2.setViewportView(jTable1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox2, 0, 115, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()){
            jButton8.setVisible(true);
            jButton9.setVisible(true);
            jButton10.setVisible(true);
            jButton11.setVisible(true);
            jButton12.setVisible(true);
        }
        else{
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton10.setVisible(false);
            jButton11.setVisible(false);
            jButton12.setVisible(false);  
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "entry/exit","5","EX. 5",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
            jButton1.setVisible(true);
            jButton2.setVisible(true);
        }
        else{
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected()) jButton13.setVisible(true);
        else jButton13.setVisible(false);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected()) jButton14.setVisible(true);
        else jButton14.setVisible(false);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if (jCheckBox9.isSelected()){
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(true);
        }
        else{
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);  
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()){
            jButton15.setVisible(true);
            jButton16.setVisible(true);
        }
        else{
            jButton15.setVisible(false);
            jButton16.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "classroom", "17", "17 CLASSROOM",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            System.out.println(userPOI.size());
            for (int i = 0; i < userPOI.size(); i++){
                userPOI.get(i).setVisible(true);
            }
        } else {
            for (int i = 0; i < userPOI.size(); i++){
                userPOI.get(i).setVisible(false);
            }
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "classroom", "6","6 Classroom",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "entry/exit", "4", "EX. 4",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "entry/exit", "6", "EX. 6",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "entry/exit", "7", "EX. 7",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "entry/exit", "8", "EX. 8",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "stairwell", "1", "ST. 1" ,0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "stairwell", "2", "ST. 2",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "stairwell", "3", "ST. 3",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "elevator", "C", "ELEV. C",0,0 );
        test.setGUI();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "stairwell", "6", "ST. 6",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "man washroom", "5b","5b man washroom",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "woman washroom", "4b","4b woman washroom",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        GUIPoi test = new GUIPoi("MC", "Ground Floor", "elevator", "A", "ELEV. A",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       GUIPoi test = new GUIPoi("MC", "Ground Floor", "stairwell", "5", "ST. 5",0,0);
        test.setGUI();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jComboBox2.removeAllItems();
        try {
            this.favFind();
        } catch (IOException ex) {
            Logger.getLogger(MC_groundfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MC_groundfloor.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
            JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
            if (jComboBox2.getSelectedItem().equals(poiButton.getToolTipText())){
                poiButton.doClick();
                jComboBox2.removeAllItems();
            }
        } 
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(MC_groundfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MC_groundfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MC_groundfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MC_groundfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MC_groundfloor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private final Map<String, ImageIcon> poiIcons;
    private final ArrayList<JLabel> userPOI = new ArrayList<>();
    private String[][] pList;
    private ArrayList<GUIPoi> sList = new ArrayList<>();
    private ArrayList<String> favList = new ArrayList<>();

}
