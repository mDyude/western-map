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
 * @author adria
 */
public class EC_firstfloor extends javax.swing.JFrame {

    /**
     * Creates new form EC_firstfloor
     */
    public EC_firstfloor(){
        initComponents();
        
        ImageIcon EC_1 = new ImageIcon("src/main/java/images/ElbornCollegeLevel1.png");
        Image EC_1img = EC_1.getImage();
        Image EC_1_scale = EC_1img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon EC_1_scaled = new ImageIcon(EC_1_scale);
        jLabel1.setIcon(EC_1_scaled);
        
        ImageIcon bu1 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu1img = bu1.getImage();
        Image bu1_scale = bu1img.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu1_scaled = new ImageIcon(bu1_scale);
        jButton1.setIcon(bu1_scaled);
        
        ImageIcon bu2 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu2img = bu2.getImage();
        Image bu2_scale = bu2img.getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu2_scaled = new ImageIcon(bu2_scale);
        jButton2.setIcon(bu2_scaled);
        
        ImageIcon bu3 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu3img = bu3.getImage();
        Image bu3_scale = bu3img.getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu3_scaled = new ImageIcon(bu3_scale);
        jButton3.setIcon(bu3_scaled);
        
        ImageIcon bu4 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu4img = bu4.getImage();
        Image bu4_scale = bu4img.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu4_scaled = new ImageIcon(bu4_scale);
        jButton4.setIcon(bu4_scaled);
        
        ImageIcon bu5 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu5img = bu5.getImage();
        Image bu5_scale = bu5img.getScaledInstance(jButton5.getWidth(), jButton5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu5_scaled = new ImageIcon(bu5_scale);
        jButton5.setIcon(bu5_scaled);
        
        ImageIcon bu6 = new ImageIcon("src/main/java/images/classroom.png");
        Image bu6img = bu6.getImage();
        Image bu6_scale = bu6img.getScaledInstance(jButton6.getWidth(), jButton6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu6_scaled = new ImageIcon(bu6_scale);
        jButton6.setIcon(bu6_scaled);
        
        ImageIcon bu7 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bu7img = bu7.getImage();
        Image bu7_scale = bu7img.getScaledInstance(jButton7.getWidth(), jButton7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu7_scaled = new ImageIcon(bu7_scale);
        jButton7.setIcon(bu7_scaled);
        
        ImageIcon bu8 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bu8img = bu8.getImage();
        Image bu8_scale = bu8img.getScaledInstance(jButton8.getWidth(), jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu8_scaled = new ImageIcon(bu8_scale);
        jButton8.setIcon(bu8_scaled);
        
        ImageIcon bu9 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bu9img = bu9.getImage();
        Image bu9_scale = bu9img.getScaledInstance(jButton9.getWidth(), jButton9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu9_scaled = new ImageIcon(bu9_scale);
        jButton9.setIcon(bu9_scaled);
        
        ImageIcon bu10 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu10img = bu10.getImage();
        Image bu10_scale = bu10img.getScaledInstance(jButton10.getWidth(), jButton10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu10_scaled = new ImageIcon(bu10_scale);
        jButton10.setIcon(bu10_scaled);
        
        ImageIcon bu11 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu11img = bu11.getImage();
        Image bu11_scale = bu11img.getScaledInstance(jButton11.getWidth(), jButton11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu11_scaled = new ImageIcon(bu11_scale);
        jButton11.setIcon(bu11_scaled);
        
        ImageIcon bu12 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu12img = bu12.getImage();
        Image bu12_scale = bu12img.getScaledInstance(jButton12.getWidth(), jButton12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu12_scaled = new ImageIcon(bu12_scale);
        jButton12.setIcon(bu12_scaled);
        
        ImageIcon bu13 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bu13img = bu13.getImage();
        Image bu13_scale = bu13img.getScaledInstance(jButton13.getWidth(), jButton13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu13_scaled = new ImageIcon(bu13_scale);
        jButton13.setIcon(bu13_scaled);
        
        ImageIcon bu14 = new ImageIcon("src/main/java/images/mech.room.png");
        Image bu14img = bu14.getImage();
        Image bu14_scale = bu14img.getScaledInstance(jButton14.getWidth(), jButton14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu14_scaled = new ImageIcon(bu14_scale);
        jButton14.setIcon(bu14_scaled);
        
        ImageIcon bu15 = new ImageIcon("src/main/java/images/mech.room.png");
        Image bu15img = bu15.getImage();
        Image bu15_scale = bu15img.getScaledInstance(jButton15.getWidth(), jButton15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu15_scaled = new ImageIcon(bu15_scale);
        jButton15.setIcon(bu15_scaled);
        
        ImageIcon bu16 = new ImageIcon("src/main/java/images/entry.png");
        Image bu16img = bu16.getImage();
        Image bu16_scale = bu16img.getScaledInstance(jButton16.getWidth(), jButton16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu16_scaled = new ImageIcon(bu16_scale);
        jButton16.setIcon(bu16_scaled);
        
        ImageIcon bu17 = new ImageIcon("src/main/java/images/entry.png");
        Image bu17img = bu17.getImage();
        Image bu17_scale = bu17img.getScaledInstance(jButton17.getWidth(), jButton17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu17_scaled = new ImageIcon(bu17_scale);
        jButton17.setIcon(bu17_scaled);
        
        ImageIcon bu18 = new ImageIcon("src/main/java/images/entry.png");
        Image bu18img = bu18.getImage();
        Image bu18_scale = bu18img.getScaledInstance(jButton18.getWidth(), jButton18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu18_scaled = new ImageIcon(bu18_scale);
        jButton18.setIcon(bu18_scaled);
        
        ImageIcon bu19 = new ImageIcon("src/main/java/images/entry.png");
        Image bu19img = bu19.getImage();
        Image bu19_scale = bu19img.getScaledInstance(jButton19.getWidth(), jButton19.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu19_scaled = new ImageIcon(bu19_scale);
        jButton19.setIcon(bu19_scaled);
        
        ImageIcon bu20 = new ImageIcon("src/main/java/images/entry.png");
        Image bu20img = bu20.getImage();
        Image bu20_scale = bu20img.getScaledInstance(jButton20.getWidth(), jButton20.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu20_scaled = new ImageIcon(bu20_scale);
        jButton20.setIcon(bu20_scaled);
        
        ImageIcon bu21 = new ImageIcon("src/main/java/images/entry.png");
        Image bu21img = bu21.getImage();
        Image bu21_scale = bu21img.getScaledInstance(jButton21.getWidth(), jButton21.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu21_scaled = new ImageIcon(bu21_scale);
        jButton21.setIcon(bu21_scaled);
        
        ImageIcon bu22 = new ImageIcon("src/main/java/images/entry.png");
        Image bu22img = bu22.getImage();
        Image bu22_scale = bu22img.getScaledInstance(jButton22.getWidth(), jButton22.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu22_scaled = new ImageIcon(bu22_scale);
        jButton22.setIcon(bu22_scaled);
        
        ImageIcon bu23 = new ImageIcon("src/main/java/images/entry.png");
        Image bu23img = bu23.getImage();
        Image bu23_scale = bu23img.getScaledInstance(jButton23.getWidth(), jButton23.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu23_scaled = new ImageIcon(bu23_scale);
        jButton23.setIcon(bu23_scaled);
        
        ImageIcon bu24 = new ImageIcon("src/main/java/images/entry.png");
        Image bu24img = bu24.getImage();
        Image bu24_scale = bu24img.getScaledInstance(jButton24.getWidth(), jButton24.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu24_scaled = new ImageIcon(bu24_scale);
        jButton24.setIcon(bu24_scaled);
        
        ImageIcon bu25 = new ImageIcon("src/main/java/images/entry.png");
        Image bu25img = bu25.getImage();
        Image bu25_scale = bu25img.getScaledInstance(jButton25.getWidth(), jButton25.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu25_scaled = new ImageIcon(bu25_scale);
        jButton25.setIcon(bu25_scaled);
        
        ImageIcon bu26 = new ImageIcon("src/main/java/images/entry.png");
        Image bu26img = bu26.getImage();
        Image bu26_scale = bu26img.getScaledInstance(jButton26.getWidth(), jButton26.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu26_scaled = new ImageIcon(bu26_scale);
        jButton26.setIcon(bu26_scaled);
        
        ImageIcon bu27 = new ImageIcon("src/main/java/images/entry.png");
        Image bu27img = bu27.getImage();
        Image bu27_scale = bu27img.getScaledInstance(jButton27.getWidth(), jButton27.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu27_scaled = new ImageIcon(bu27_scale);
        jButton27.setIcon(bu27_scaled);
        
        ImageIcon bu28 = new ImageIcon("src/main/java/images/entry.png");
        Image bu28img = bu28.getImage();
        Image bu28_scale = bu28img.getScaledInstance(jButton28.getWidth(), jButton28.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu28_scaled = new ImageIcon(bu28_scale);
        jButton28.setIcon(bu28_scaled);
        
        ImageIcon bu29 = new ImageIcon("src/main/java/images/entry.png");
        Image bu29img = bu29.getImage();
        Image bu29_scale = bu29img.getScaledInstance(jButton29.getWidth(), jButton29.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu29_scaled = new ImageIcon(bu29_scale);
        jButton29.setIcon(bu29_scaled);
        
        ImageIcon bu30 = new ImageIcon("src/main/java/images/entry.png");
        Image bu30img = bu30.getImage();
        Image bu30_scale = bu30img.getScaledInstance(jButton30.getWidth(), jButton30.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu30_scaled = new ImageIcon(bu30_scale);
        jButton30.setIcon(bu30_scaled);
        
        ImageIcon bu31 = new ImageIcon("src/main/java/images/entry.png");
        Image bu31img = bu31.getImage();
        Image bu31_scale = bu31img.getScaledInstance(jButton31.getWidth(), jButton31.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu31_scaled = new ImageIcon(bu31_scale);
        jButton31.setIcon(bu31_scaled);
        
        ImageIcon bu32 = new ImageIcon("src/main/java/images/entry.png");
        Image bu32img = bu32.getImage();
        Image bu32_scale = bu32img.getScaledInstance(jButton32.getWidth(), jButton32.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu32_scaled = new ImageIcon(bu32_scale);
        jButton32.setIcon(bu32_scaled);
        
        ImageIcon bu33 = new ImageIcon("src/main/java/images/entry.png");
        Image bu33img = bu33.getImage();
        Image bu33_scale = bu33img.getScaledInstance(jButton33.getWidth(), jButton33.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu33_scaled = new ImageIcon(bu33_scale);
        jButton33.setIcon(bu33_scaled);
        
        ImageIcon bu34 = new ImageIcon("src/main/java/images/entry.png");
        Image bu34img = bu34.getImage();
        Image bu34_scale = bu34img.getScaledInstance(jButton34.getWidth(), jButton34.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu34_scaled = new ImageIcon(bu34_scale);
        jButton34.setIcon(bu34_scaled);
        
        ImageIcon bu35 = new ImageIcon("src/main/java/images/entry.png");
        Image bu35img = bu35.getImage();
        Image bu35_scale = bu35img.getScaledInstance(jButton35.getWidth(), jButton35.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu35_scaled = new ImageIcon(bu35_scale);
        jButton35.setIcon(bu35_scaled);
        
        ImageIcon bu36 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu36img = bu36.getImage();
        Image bu36_scale = bu36img.getScaledInstance(jButton36.getWidth(), jButton36.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu36_scaled = new ImageIcon(bu36_scale);
        jButton36.setIcon(bu36_scaled);
        
        ImageIcon bu37 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu37img = bu37.getImage();
        Image bu37_scale = bu37img.getScaledInstance(jButton37.getWidth(), jButton37.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu37_scaled = new ImageIcon(bu37_scale);
        jButton37.setIcon(bu37_scaled);
        
        ImageIcon bu38 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu38img = bu38.getImage();
        Image bu38_scale = bu38img.getScaledInstance(jButton38.getWidth(), jButton38.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu38_scaled = new ImageIcon(bu38_scale);
        jButton38.setIcon(bu38_scaled);
        
        ImageIcon bu39 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu39img = bu39.getImage();
        Image bu39_scale = bu39img.getScaledInstance(jButton39.getWidth(), jButton39.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu39_scaled = new ImageIcon(bu39_scale);
        jButton39.setIcon(bu39_scaled);
        
        ImageIcon bu40 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu40img = bu40.getImage();
        Image bu40_scale = bu40img.getScaledInstance(jButton40.getWidth(), jButton40.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu40_scaled = new ImageIcon(bu40_scale);
        jButton40.setIcon(bu40_scaled);
        
        ImageIcon bu41 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu41img = bu41.getImage();
        Image bu41_scale = bu41img.getScaledInstance(jButton41.getWidth(), jButton41.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu41_scaled = new ImageIcon(bu41_scale);
        jButton41.setIcon(bu41_scaled);
        
        ImageIcon bu42 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu42img = bu42.getImage();
        Image bu42_scale = bu42img.getScaledInstance(jButton42.getWidth(), jButton42.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu42_scaled = new ImageIcon(bu42_scale);
        jButton42.setIcon(bu42_scaled);
        
        ImageIcon bu43 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu43img = bu43.getImage();
        Image bu43_scale = bu43img.getScaledInstance(jButton43.getWidth(), jButton43.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu43_scaled = new ImageIcon(bu43_scale);
        jButton43.setIcon(bu43_scaled);
        
        ImageIcon bu44 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu44img = bu44.getImage();
        Image bu44_scale = bu44img.getScaledInstance(jButton44.getWidth(), jButton44.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu44_scaled = new ImageIcon(bu44_scale);
        jButton44.setIcon(bu44_scaled);
        
        ImageIcon bu45 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu45img = bu45.getImage();
        Image bu45_scale = bu45img.getScaledInstance(jButton45.getWidth(), jButton45.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu45_scaled = new ImageIcon(bu45_scale);
        jButton45.setIcon(bu45_scaled);
        
        ImageIcon bu46 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu46img = bu46.getImage();
        Image bu46_scale = bu46img.getScaledInstance(jButton46.getWidth(), jButton46.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu46_scaled = new ImageIcon(bu46_scale);
        jButton46.setIcon(bu46_scaled);
        
        ImageIcon bu47 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bu47img = bu47.getImage();
        Image bu47_scale = bu40img.getScaledInstance(jButton47.getWidth(), jButton47.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu47_scaled = new ImageIcon(bu47_scale);
        jButton47.setIcon(bu47_scaled);
        
        ImageIcon bu48 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu48img = bu48.getImage();
        Image bu48_scale = bu48img.getScaledInstance(jButton48.getWidth(), jButton48.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu48_scaled = new ImageIcon(bu48_scale);
        jButton48.setIcon(bu48_scaled);
        
        ImageIcon bu49 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu49img = bu49.getImage();
        Image bu49_scale = bu49img.getScaledInstance(jButton49.getWidth(), jButton49.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu49_scaled = new ImageIcon(bu49_scale);
        jButton49.setIcon(bu49_scaled);
        
        ImageIcon bu50 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu50img = bu50.getImage();
        Image bu50_scale = bu50img.getScaledInstance(jButton50.getWidth(), jButton50.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu50_scaled = new ImageIcon(bu50_scale);
        jButton50.setIcon(bu50_scaled);
        
        ImageIcon bu51 = new ImageIcon("src/main/java/images/elevator.png");
        Image bu51img = bu51.getImage();
        Image bu51_scale = bu51img.getScaledInstance(jButton51.getWidth(), jButton51.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu51_scaled = new ImageIcon(bu51_scale);
        jButton51.setIcon(bu51_scaled);
        
        ImageIcon bu52 = new ImageIcon("src/main/java/images/lab.png");
        Image bu52img = bu52.getImage();
        Image bu52_scale = bu52img.getScaledInstance(jButton52.getWidth(), jButton52.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bu52_scaled = new ImageIcon(bu52_scale);
        jButton52.setIcon(bu52_scaled);
        
          
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
        
        setPersist();
        try {
            this.poiList();
        } catch (IOException ex) {
            Logger.getLogger(EC_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EC_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.addRowToJTable();
        this.rowClick();
        
    }
    
    private void poiList() throws FileNotFoundException, IOException, ParseException{
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/EC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("First Floor");
        JSONObject floorObject = (JSONObject) jsonFloor.get(0);
        pList = new String[floorObject.size()][];
        int i = 0;
        for (Object currentKey: floorObject.keySet()){  
            jComboBox1.addItem((String)currentKey); 
            JSONArray cat = (JSONArray) floorObject.get(currentKey);
            pList[i] = new String[cat.size()];
            for (int j = 0; j<cat.size(); j++){
                JSONObject poi = (JSONObject)cat.get(j);
                GUIPoi temp = new GUIPoi("EC", "First Floor", (String)poi.get("category"), (String)poi.get("roomNumber"), (String)poi.get("name"),0,0);
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
        FileReader reader = new FileReader("src/main/java/JSONmetadata/EC.json");
        Object obj = jsonparser.parse(reader);  
        JSONObject jsonFile = (JSONObject) obj;
        JSONArray jsonFloor = (JSONArray) jsonFile.get("First Floor");
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
                if(temp.get("building").equals("EC") && temp.get("floor").equals("First Floor")){
                    Long x = (Long) temp.get("x");
                    Long y = (Long) temp.get("y");
                    persistData(x.intValue(), y.intValue());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EC_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EC_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EC_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex){
            
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
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton53 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setToolTipText("1548 CLASSROOM");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(210, 93, 40, 30);

        jButton2.setToolTipText("1576 CLASSROOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(260, 93, 40, 30);

        jButton3.setToolTipText("1547 CLASSROOM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(130, 163, 50, 40);

        jButton4.setToolTipText("1543 CLASSROOM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(210, 213, 50, 40);

        jButton5.setToolTipText("1520C CLASSROOM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(360, 213, 50, 40);

        jButton6.setToolTipText("1330 CLASSROOM");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6);
        jButton6.setBounds(550, 53, 60, 40);

        jButton7.setToolTipText("1200 MEN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7);
        jButton7.setBounds(610, 363, 20, 40);

        jButton8.setToolTipText("1515 MEN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8);
        jButton8.setBounds(450, 250, 20, 20);

        jButton9.setToolTipText("MEN 1577");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9);
        jButton9.setBounds(310, 110, 20, 30);

        jButton10.setToolTipText("1204 WOMEN");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10);
        jButton10.setBounds(610, 323, 20, 40);

        jButton11.setToolTipText("WOMEN 1514");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton11);
        jButton11.setBounds(430, 250, 20, 20);

        jButton12.setToolTipText("WOMEN 1579");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12);
        jButton12.setBounds(330, 113, 20, 30);

        jButton13.setToolTipText("1550 WOMEN");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton13);
        jButton13.setBounds(190, 100, 20, 40);

        jButton14.setToolTipText("1405 MECH. ROOM");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton14);
        jButton14.setBounds(740, 100, 30, 20);

        jButton15.setToolTipText("1410 MECH. ROOM");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton15);
        jButton15.setBounds(670, 50, 20, 20);

        jButton16.setToolTipText("EX. 1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton16);
        jButton16.setBounds(680, 280, 20, 20);

        jButton17.setToolTipText("EX. 2");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton17);
        jButton17.setBounds(800, 600, 30, 30);

        jButton18.setToolTipText("EX. 3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton18);
        jButton18.setBounds(510, 620, 30, 20);

        jButton19.setToolTipText("EX. 4");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton19);
        jButton19.setBounds(440, 470, 30, 30);

        jButton20.setToolTipText("EX. 5");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton20);
        jButton20.setBounds(470, 430, 20, 20);

        jButton21.setToolTipText("EX. 6");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton21);
        jButton21.setBounds(460, 320, 20, 20);

        jButton22.setToolTipText("7");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton22);
        jButton22.setBounds(460, 340, 20, 20);

        jButton23.setToolTipText("EX. 8");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton23);
        jButton23.setBounds(410, 390, 20, 20);

        jButton24.setToolTipText("EX. 9");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton24);
        jButton24.setBounds(351, 260, 20, 20);

        jButton25.setToolTipText("EX. 10");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton25);
        jButton25.setBounds(161, 260, 20, 20);

        jButton26.setToolTipText("EX. 12");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton26);
        jButton26.setBounds(320, 70, 30, 20);

        jButton27.setToolTipText("EX. 13");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton27);
        jButton27.setBounds(410, 70, 20, 20);

        jButton28.setToolTipText("EX. 14");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton28);
        jButton28.setBounds(450, 80, 20, 20);

        jButton29.setToolTipText("EX. 15");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton29);
        jButton29.setBounds(470, 10, 20, 20);

        jButton30.setToolTipText("EX. 16");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton30);
        jButton30.setBounds(540, 10, 20, 20);

        jButton31.setToolTipText("EX. 17");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton31);
        jButton31.setBounds(610, 10, 20, 20);

        jButton32.setToolTipText("EX. 18");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton32);
        jButton32.setBounds(630, 73, 20, 20);

        jButton33.setToolTipText("EX. 19");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton33);
        jButton33.setBounds(690, 50, 20, 20);

        jButton34.setToolTipText("EX. 20");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton34);
        jButton34.setBounds(771, 13, 20, 20);

        jButton35.setToolTipText("EX. 21");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton35);
        jButton35.setBounds(730, 223, 20, 20);

        jButton36.setToolTipText("ST. 1");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton36);
        jButton36.setBounds(630, 493, 20, 20);

        jButton37.setToolTipText("ST. 2");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton37);
        jButton37.setBounds(810, 560, 20, 20);

        jButton38.setToolTipText("ST. 3");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton38);
        jButton38.setBounds(440, 520, 20, 20);

        jButton39.setToolTipText("ST. 4");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton39);
        jButton39.setBounds(470, 290, 20, 20);

        jButton40.setToolTipText("ST. 5");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton40);
        jButton40.setBounds(520, 170, 20, 20);

        jButton41.setToolTipText("ST. 6");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton41);
        jButton41.setBounds(560, 170, 20, 20);

        jButton42.setToolTipText("ST. 7");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton42);
        jButton42.setBounds(531, 33, 20, 20);

        jButton43.setToolTipText("ST. 8");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton43);
        jButton43.setBounds(440, 320, 20, 20);

        jButton44.setToolTipText("ST. 9");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton44);
        jButton44.setBounds(410, 90, 20, 20);

        jButton45.setToolTipText("ST. 10");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton45);
        jButton45.setBounds(270, 153, 20, 20);

        jButton46.setToolTipText("ST. 11");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton46);
        jButton46.setBounds(190, 240, 20, 20);

        jButton47.setToolTipText("ST. 12");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton47);
        jButton47.setBounds(470, 413, 20, 20);

        jButton48.setToolTipText("ELEV. A");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton48);
        jButton48.setBounds(610, 243, 20, 20);

        jButton49.setToolTipText("ELEV. B");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton49);
        jButton49.setBounds(620, 520, 20, 20);

        jButton50.setToolTipText("ELEV. C");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton50);
        jButton50.setBounds(440, 233, 20, 20);

        jButton51.setToolTipText("ELEV. D");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton51);
        jButton51.setBounds(400, 110, 20, 20);

        jButton52.setToolTipText("1423 LAB");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton52);
        jButton52.setBounds(730, 130, 30, 30);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 906, 700);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(488, 684));

        jCheckBox1.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Classroom");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Entry/Exit");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Stairwell");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Men Washroom");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Women Washroom");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Laboratory");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Mech. room");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Elevator");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(153, 51, 255));
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setSelected(true);
        jCheckBox9.setText("User-created");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Search: ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name ", "room number", "category"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton53.setBackground(new java.awt.Color(153, 51, 255));
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("Close");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox2.setBackground(new java.awt.Color(153, 51, 255));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));

        jButton54.setBackground(new java.awt.Color(153, 51, 255));
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("Confirm");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(153, 51, 255));
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setText("Enter");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton55))
                            .addComponent(jButton53))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55))
                .addGap(18, 18, 18)
                .addComponent(jButton53)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            jButton6.setVisible(true);
        }else {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jButton16.setVisible(true);
            jButton17.setVisible(true);
            jButton18.setVisible(true);
            jButton19.setVisible(true);
            jButton20.setVisible(true);
            jButton21.setVisible(true);
            jButton22.setVisible(true);
            jButton23.setVisible(true);
            jButton24.setVisible(true);
            jButton25.setVisible(true);
            jButton26.setVisible(true);
            jButton27.setVisible(true);
            jButton28.setVisible(true);
            jButton29.setVisible(true);
            jButton30.setVisible(true);
            jButton31.setVisible(true);
            jButton32.setVisible(true);
            jButton33.setVisible(true);
            jButton34.setVisible(true);
            jButton35.setVisible(true);
        }else {
            jButton16.setVisible(false);
            jButton17.setVisible(false);
            jButton18.setVisible(false);
            jButton19.setVisible(false);
            jButton20.setVisible(false);
            jButton21.setVisible(false);
            jButton22.setVisible(false);
            jButton23.setVisible(false);
            jButton24.setVisible(false);
            jButton25.setVisible(false);
            jButton26.setVisible(false);
            jButton27.setVisible(false);
            jButton28.setVisible(false);
            jButton29.setVisible(false);
            jButton30.setVisible(false);
            jButton31.setVisible(false);
            jButton32.setVisible(false);
            jButton33.setVisible(false);
            jButton34.setVisible(false);
            jButton35.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            jButton36.setVisible(true);
            jButton37.setVisible(true);
            jButton38.setVisible(true);
            jButton39.setVisible(true);
            jButton40.setVisible(true);
            jButton41.setVisible(true);
            jButton42.setVisible(true);
            jButton43.setVisible(true);
            jButton44.setVisible(true);
            jButton45.setVisible(true);
            jButton46.setVisible(true);
            jButton47.setVisible(true);      
        }else {
            jButton36.setVisible(false);
            jButton37.setVisible(false);
            jButton38.setVisible(false);
            jButton39.setVisible(false);
            jButton40.setVisible(false);
            jButton41.setVisible(false);
            jButton42.setVisible(false);
            jButton43.setVisible(false);
            jButton44.setVisible(false);
            jButton45.setVisible(false);
            jButton46.setVisible(false);
            jButton47.setVisible(false);  
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            jButton7.setVisible(true);
            jButton8.setVisible(true);
            jButton9.setVisible(true);
        }else {
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()) {
            jButton10.setVisible(true);
            jButton11.setVisible(true);
            jButton12.setVisible(true);
            jButton13.setVisible(true);
        }else {
            jButton10.setVisible(false);
            jButton11.setVisible(false);
            jButton12.setVisible(false);
            jButton13.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            jButton52.setVisible(true);
        }else {
            jButton52.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (jCheckBox7.isSelected()) {
            jButton14.setVisible(true);
            jButton15.setVisible(true);
        }else {
            jButton14.setVisible(false);
            jButton15.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()) {
            jButton48.setVisible(true);
            jButton49.setVisible(true);
            jButton50.setVisible(true);
            jButton51.setVisible(true);
        }else {
            jButton48.setVisible(false);
            jButton49.setVisible(false);
            jButton50.setVisible(false);
            jButton51.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if (jCheckBox9.isSelected()) {
            for (int i = 0; i < userPOI.size(); i++){
                userPOI.get(i).setVisible(true);
            }
        } else {
            for (int i = 0; i < userPOI.size(); i++){
                userPOI.get(i).setVisible(false);
            }
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1548", "1548 CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1576", "1576 CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1547", "1547 CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1543", "1543 CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1520C", "1520C CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "classroom", "1330", "1330 CLASSROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "men washroom", "1200", "1200 MEN",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "men washroom", "1515", "1515 MEN",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "men washroom", "1577", "MEN 1577",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "women washroom", "1204", "1204 WOMEN",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "women washroom", "1514", "WOMEN 1514",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "women washroom", "1579", "WOMEN 1579",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "women washroom", "1550", "1550 WOMEN",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "mech.room", "1405", "1405 MECH. ROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "mech.room", "1410", "1410 MECH. ROOM",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 1",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 2",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 3",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 4",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 5",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 6",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 7",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 8",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 9",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 10",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 12",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 13",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 14",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 15",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 16",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 17",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 18",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 19",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 20",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "entry/exit", "NA", "EX. 21",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 1",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 2",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 3",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 4",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 5",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 6",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 7",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 8",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 9",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 10",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 11",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "stairwell", "NA", "ST. 12",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "elevator", "NA", "ELEV. A",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "elevator", "NA", "ELEV. B",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "elevator", "NA", "ELEV. C",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "elevator", "NA", "ELEV. D",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        GUIPoi temp = new GUIPoi("EC", "First Floor", "laboratory", "1423", "1423 LAB",0,0);
        temp.setGUI();
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        jComboBox2.removeAllItems();
        try {
            this.favFind();
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
        } catch (IOException ex) {
            Logger.getLogger(EC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EC_secondfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArrayIndexOutOfBoundsException ex){
            
        }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        try{
            for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
                JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
                if (jComboBox2.getSelectedItem().equals(poiButton.getToolTipText())){
                    poiButton.doClick();
                    jComboBox2.removeAllItems();
                }
            }
        } catch (NullPointerException ex){
            
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String searchString = jTextField1.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EC_firstfloor().setVisible(true);
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
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private final Map<String, ImageIcon> poiIcons;
    private final ArrayList<JLabel> userPOI = new ArrayList<>();
    private String[][] pList;
    private ArrayList<GUIPoi> sList = new ArrayList<>();
    private ArrayList<String> favList = new ArrayList<>();
}
