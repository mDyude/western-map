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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
 * @author Tristan
 */
public class AHB_firstfloor extends javax.swing.JFrame {

    /**
     * Creates new form AHB_firstfloor
     */
    public AHB_firstfloor() {
        initComponents();
        ImageIcon ahb = new ImageIcon("src/main/java/images/ahb1(1).png");
        jLabel1.setIcon(ahb);
        
        ImageIcon b1 = new ImageIcon("src/main/java/images/classroom.png");
        Image bm1 = b1.getImage();
        Image bs1 = bm1.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd1 = new ImageIcon(bs1);
        jButton1.setIcon(bsd1);
        jButton1.setVisible(false);
        
        ImageIcon b2 = new ImageIcon("src/main/java/images/classroom.png");
        Image bm2 = b2.getImage();
        Image bs2 = bm2.getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd2 = new ImageIcon(bs2);
        jButton2.setIcon(bsd2);
        jButton2.setVisible(false);
        
        ImageIcon b3 = new ImageIcon("src/main/java/images/classroom.png");
        Image bm3 = b3.getImage();
        Image bs3 = bm3.getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd3 = new ImageIcon(bs3);
        jButton3.setIcon(bsd3);
        jButton3.setVisible(false);
        
        ImageIcon b4 = new ImageIcon("src/main/java/images/classroom.png");
        Image bm4 = b4.getImage();
        Image bs4 = bm4.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd4 = new ImageIcon(bs4);
        jButton4.setIcon(bsd4);
        jButton4.setVisible(false);
        
        ImageIcon b5 = new ImageIcon("src/main/java/images/classroom.png");
        Image bm5 = b5.getImage();
        Image bs5 = bm5.getScaledInstance(jButton33.getWidth(), jButton33.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd5 = new ImageIcon(bs5);
        jButton33.setIcon(bsd5);
        jButton33.setVisible(false);
        
        ImageIcon b6 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bm6 = b6.getImage();
        Image bs6 = bm6.getScaledInstance(jButton5.getWidth(), jButton5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd6 = new ImageIcon(bs6);
        jButton5.setIcon(bsd6);
        jButton5.setVisible(false);
        
        ImageIcon b7 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bm7 = b7.getImage();
        Image bs7 = bm7.getScaledInstance(jButton11.getWidth(), jButton11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd7 = new ImageIcon(bs7);
        jButton11.setIcon(bsd7);
        jButton11.setVisible(false);
        
        ImageIcon b8 = new ImageIcon("src/main/java/images/rsz_man_wash.png");
        Image bm8 = b8.getImage();
        Image bs8 = bm8.getScaledInstance(jButton13.getWidth(), jButton13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd8 = new ImageIcon(bs8);
        jButton13.setIcon(bsd8);
        jButton13.setVisible(false);
        
        ImageIcon b9 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bm9 = b9.getImage();
        Image bs9 = bm9.getScaledInstance(jButton6.getWidth(), jButton6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd9 = new ImageIcon(bs9);
        jButton6.setIcon(bsd9);
        jButton6.setVisible(false);
        
        ImageIcon b10 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bm10= b10.getImage();
        Image bs10 = bm10.getScaledInstance(jButton12.getWidth(), jButton12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd10 = new ImageIcon(bs10);
        jButton12.setIcon(bsd10);
        jButton12.setVisible(false);
        
        ImageIcon b11 = new ImageIcon("src/main/java/images/woman_wash.png");
        Image bm11= b11.getImage();
        Image bs11 = bm11.getScaledInstance(jButton14.getWidth(), jButton14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd11 = new ImageIcon(bs11);
        jButton14.setIcon(bsd11);
        jButton14.setVisible(false);
        
        ImageIcon b12 = new ImageIcon("src/main/java/images/elevator.png");
        Image bm12= b12.getImage();
        Image bs12 = bm12.getScaledInstance(jButton8.getWidth(), jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd12 = new ImageIcon(bs12);
        jButton8.setIcon(bsd12);
        jButton8.setVisible(false);
        
        ImageIcon b13 = new ImageIcon("src/main/java/images/elevator.png");
        Image bm13= b13.getImage();
        Image bs13 = bm13.getScaledInstance(jButton7.getWidth(), jButton7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd13 = new ImageIcon(bs13);
        jButton7.setIcon(bsd13);
        jButton7.setVisible(false);
        
        ImageIcon b14 = new ImageIcon("src/main/java/images/elevator.png");
        Image bm14= b14.getImage();
        Image bs14 = bm14.getScaledInstance(jButton9.getWidth(), jButton9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd14 = new ImageIcon(bs14);
        jButton9.setIcon(bsd14);
        jButton9.setVisible(false);
        
        ImageIcon b15 = new ImageIcon("src/main/java/images/elevator.png");
        Image bm15= b15.getImage();
        Image bs15 = bm15.getScaledInstance(jButton10.getWidth(), jButton10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd15 = new ImageIcon(bs15);
        jButton10.setIcon(bsd15);
        jButton10.setVisible(false);
        
        ImageIcon b16 = new ImageIcon("src/main/java/images/entry.png");
        Image bm16 = b16.getImage();
        Image bs16 = bm16.getScaledInstance(jButton16.getWidth(), jButton16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd16 = new ImageIcon(bs16);
        jButton16.setIcon(bsd16);
        jButton16.setVisible(false);
        
        ImageIcon b17 = new ImageIcon("src/main/java/images/entry.png");
        Image bm17 = b17.getImage();
        Image bs17 = bm17.getScaledInstance(jButton17.getWidth(), jButton17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd17 = new ImageIcon(bs17);
        jButton17.setIcon(bsd17);
        jButton17.setVisible(false);
        
        ImageIcon b18 = new ImageIcon("src/main/java/images/entry.png");
        Image bm18 = b18.getImage();
        Image bs18 = bm18.getScaledInstance(jButton18.getWidth(), jButton18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd18 = new ImageIcon(bs18);
        jButton18.setIcon(bsd18);
        jButton18.setVisible(false);
        
        ImageIcon b19 = new ImageIcon("src/main/java/images/entry.png");
        Image bm19 = b19.getImage();
        Image bs19 = bm19.getScaledInstance(jButton19.getWidth(), jButton19.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd19 = new ImageIcon(bs19);
        jButton19.setIcon(bsd19);
        jButton19.setVisible(false);
        
        ImageIcon b20 = new ImageIcon("src/main/java/images/entry.png");
        Image bm20 = b20.getImage();
        Image bs20 = bm20.getScaledInstance(jButton20.getWidth(), jButton20.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd20 = new ImageIcon(bs20);
        jButton20.setIcon(bsd20);
        jButton20.setVisible(false);
        
        ImageIcon b21 = new ImageIcon("src/main/java/images/entry.png");
        Image bm21 = b21.getImage();
        Image bs21 = bm21.getScaledInstance(jButton21.getWidth(), jButton21.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd21 = new ImageIcon(bs21);
        jButton21.setIcon(bsd21);
        jButton21.setVisible(false);
        
        ImageIcon b28 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm28 = b28.getImage();
        Image bs28 = bm28.getScaledInstance(jButton28.getWidth(), jButton28.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd28 = new ImageIcon(bs28);
        jButton28.setIcon(bsd28);
        jButton28.setVisible(false);
        
        ImageIcon b23 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm23 = b23.getImage();
        Image bs23 = bm23.getScaledInstance(jButton23.getWidth(), jButton23.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd23 = new ImageIcon(bs23);
        jButton23.setIcon(bsd21);
        jButton23.setVisible(false);
        
        ImageIcon b22 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm22 = b22.getImage();
        Image bs22 = bm22.getScaledInstance(jButton22.getWidth(), jButton22.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd22 = new ImageIcon(bs22);
        jButton22.setIcon(bsd22);
        jButton22.setVisible(false);
        
        ImageIcon b24 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm24 = b24.getImage();
        Image bs24 = bm24.getScaledInstance(jButton24.getWidth(), jButton24.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd24 = new ImageIcon(bs24);
        jButton24.setIcon(bsd24);
        jButton24.setVisible(false);
        
        ImageIcon b25 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm25 = b25.getImage();
        Image bs25 = bm25.getScaledInstance(jButton25.getWidth(), jButton25.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd25 = new ImageIcon(bs25);
        jButton25.setIcon(bsd25);
        jButton25.setVisible(false);
        
        ImageIcon b26 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm26 = b26.getImage();
        Image bs26 = bm26.getScaledInstance(jButton28.getWidth(), jButton28.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd26 = new ImageIcon(bs26);
        jButton26.setIcon(bsd26);
        jButton26.setVisible(false);
        
        ImageIcon b27 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm27 = b27.getImage();
        Image bs27 = bm27.getScaledInstance(jButton27.getWidth(), jButton27.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd27 = new ImageIcon(bs27);
        jButton27.setIcon(bsd27);
        jButton27.setVisible(false);
        
        ImageIcon b29 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm29 = b29.getImage();
        Image bs29 = bm29.getScaledInstance(jButton29.getWidth(), jButton29.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd29 = new ImageIcon(bs29);
        jButton29.setIcon(bsd29);
        jButton29.setVisible(false);
        
        ImageIcon b30 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm30 = b30.getImage();
        Image bs30 = bm30.getScaledInstance(jButton30.getWidth(), jButton30.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd30 = new ImageIcon(bs30);
        jButton30.setIcon(bsd30);
        jButton30.setVisible(false);
        
        ImageIcon b31 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm31 = b31.getImage();
        Image bs31 = bm31.getScaledInstance(jButton31.getWidth(), jButton31.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd31 = new ImageIcon(bs31);
        jButton31.setIcon(bsd31);
        jButton31.setVisible(false);
        
        ImageIcon b32 = new ImageIcon("src/main/java/images/rsz_stair.png");
        Image bm32 = b32.getImage();
        Image bs32 = bm32.getScaledInstance(jButton32.getWidth(), jButton32.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd32 = new ImageIcon(bs32);
        jButton32.setIcon(bsd32);
        jButton32.setVisible(false);
        
        ImageIcon b34 = new ImageIcon("src/main/java/images/uni_wash.png");
        Image bm34 = b34.getImage();
        Image bs34 = bm34.getScaledInstance(jButton15.getWidth(), jButton15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bsd34 = new ImageIcon(bs34);
        jButton15.setIcon(bsd34);
        jButton15.setVisible(false);
        
        try{
            setPersist();
        }catch(Exception e){
        }
        
        jLabel1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the location of the mouse click
                int x = e.getX();
                int y = e.getY();
                // Create a new POI at the mouse click location
                createPOI(x, y);
        }
        });
        
        try {
            this.poiList();
        } catch (IOException ex) {
            Logger.getLogger(AHB_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AHB_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.addRowToJTable();
        this.rowClick();
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
                if(temp.get("building").equals("AHB") && temp.get("floor").equals("First Floor")){
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
     private void poiList() throws FileNotFoundException, IOException, ParseException{
        JSONParser jsonparser = new JSONParser();       
        FileReader reader = new FileReader("src/main/java/JSONmetadata/AHB.json");
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
                GUIPoi temp = new GUIPoi("AHB", "First Floor", (String)poi.get("category"), (String)poi.get("roomNumber"), (String)poi.get("name"),0,0);
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
        FileReader reader = new FileReader("src/main/java/JSONmetadata/AHB.json");
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setToolTipText("1B02 CLASSROOM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(160, 360, 30, 40);

        jButton2.setToolTipText("1B04 CLASSROOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(290, 360, 40, 40);

        jButton3.setToolTipText("1B06 CLASSROOM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(160, 470, 30, 40);

        jButton4.setToolTipText("1B08 CLASSROOM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(290, 470, 40, 40);

        jButton5.setToolTipText("1N02 MEN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(660, 280, 40, 40);

        jButton6.setToolTipText("1N01B WOMEN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6);
        jButton6.setBounds(660, 320, 40, 40);

        jButton7.setToolTipText("ELEV. 2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7);
        jButton7.setBounds(660, 220, 30, 30);

        jButton8.setToolTipText("ELEV. 1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8);
        jButton8.setBounds(680, 380, 30, 30);

        jButton9.setToolTipText("ELEV. B");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9);
        jButton9.setBounds(200, 560, 30, 30);

        jButton10.setToolTipText("ELEV. A");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10);
        jButton10.setBounds(530, 280, 30, 30);

        jButton11.setToolTipText("1G14 MEN");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton11);
        jButton11.setBounds(270, 210, 30, 40);

        jButton12.setToolTipText("1G20 WOMEN");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12);
        jButton12.setBounds(330, 210, 30, 40);

        jButton13.setToolTipText("1R39 MEN");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton13);
        jButton13.setBounds(370, 380, 30, 40);

        jButton14.setToolTipText("1R33 WOMEN");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton14);
        jButton14.setBounds(370, 420, 30, 40);

        jButton15.setToolTipText("1R37 UNIVERSAL WASHROOM");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton15);
        jButton15.setBounds(400, 380, 30, 40);

        jButton16.setToolTipText("EX. 1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton16);
        jButton16.setBounds(520, 70, 40, 40);

        jButton17.setToolTipText("EX. 2");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton17);
        jButton17.setBounds(580, 60, 40, 40);

        jButton18.setToolTipText("EX. 6");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton18);
        jButton18.setBounds(480, 640, 40, 40);

        jButton19.setToolTipText("EX. 7");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton19);
        jButton19.setBounds(420, 630, 40, 40);

        jButton20.setToolTipText("EX. 8");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton20);
        jButton20.setBounds(220, 600, 40, 40);

        jButton21.setToolTipText("EX. 9");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton21);
        jButton21.setBounds(120, 530, 40, 40);

        jButton22.setToolTipText("ST. 4");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton22);
        jButton22.setBounds(700, 220, 30, 30);

        jButton23.setToolTipText("ST. 2");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton23);
        jButton23.setBounds(720, 340, 30, 40);

        jButton24.setToolTipText("ST. 1");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton24);
        jButton24.setBounds(660, 370, 20, 30);

        jButton25.setToolTipText("ST. 6");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton25);
        jButton25.setBounds(530, 390, 30, 30);

        jButton26.setToolTipText("ST. 5");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton26);
        jButton26.setBounds(520, 610, 30, 30);

        jButton27.setToolTipText("ST. 4");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton27);
        jButton27.setBounds(230, 570, 20, 30);

        jButton28.setToolTipText("ST. 3");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton28);
        jButton28.setBounds(160, 300, 20, 30);

        jButton29.setToolTipText("ST. 2");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton29);
        jButton29.setBounds(200, 260, 30, 30);

        jButton30.setToolTipText("ST. 7");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton30);
        jButton30.setBounds(610, 270, 30, 30);

        jButton31.setToolTipText("ST. 5");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton31);
        jButton31.setBounds(560, 120, 30, 30);

        jButton32.setToolTipText("ST. 3");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton32);
        jButton32.setBounds(740, 190, 30, 30);

        jButton33.setToolTipText("1R40 CLASSROOM");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton33);
        jButton33.setBounds(490, 490, 70, 70);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 780);

        jScrollPane1.setViewportView(jLayeredPane1);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Classroom");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Entry/Exit");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Stairwell");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Man Washroom");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Woman Washroom");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Elevator");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("User Created");

        jCheckBox8.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Universal Washroom");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 51, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setToolTipText("");

        jComboBox2.setBackground(new java.awt.Color(255, 51, 255));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));

        jButton35.setBackground(new java.awt.Color(255, 51, 255));
        jButton35.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Confirm");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(255, 51, 255));
        jButton36.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Enter");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(255, 51, 255));
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Close");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
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
                "Name", "Room Number", "Category"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Search:");

        jTextField1.setToolTipText("");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox5)
                                                    .addComponent(jCheckBox2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox3)
                                                    .addComponent(jCheckBox8)))
                                            .addComponent(jCheckBox7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBox2, 0, 126, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton35)
                                            .addComponent(jButton36)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton34)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 6", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jButton33.setVisible(true);
        }else {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton33.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox4.isSelected()) {
            jButton5.setVisible(true);
            jButton11.setVisible(true);
            jButton13.setVisible(true);
        }else {
            jButton5.setVisible(false);
            jButton11.setVisible(false);
            jButton13.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox5.isSelected()) {
            jButton6.setVisible(true);
            jButton12.setVisible(true);
            jButton14.setVisible(true);
        }else {
            jButton6.setVisible(false);
            jButton12.setVisible(false);
            jButton14.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "elevator", "NA", "ELEV. 2", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox6.isSelected()) {
            jButton7.setVisible(true);
            jButton8.setVisible(true);
            jButton9.setVisible(true);
            jButton10.setVisible(true);
        }else {
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton10.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            jButton16.setVisible(true);
            jButton17.setVisible(true);
            jButton18.setVisible(true);
            jButton19.setVisible(true);
            jButton20.setVisible(true);
            jButton21.setVisible(true);
        }else {
            jButton16.setVisible(false);
            jButton17.setVisible(false);
            jButton18.setVisible(false);
            jButton19.setVisible(false);
            jButton20.setVisible(false);
            jButton21.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
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
        }else {
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
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox8.isSelected()) {
            jButton15.setVisible(true);
        }else {
            jButton15.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "classroom", "1B02", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "classroom", "1B04", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "classroom", "1B06", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "classroom", "1B08", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "classroom", "1R40", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "men washroom", "1R39", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "women washroom", "1R33", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "universal washroom", "1R37", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "entry/exit", "NA", "EX. 9", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "entry/exit", "NA", "EX. 8", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "entry/exit", "NA", "EX. 7", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "entry/exit", "NA", "EX. 6", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "entry/exit", "NA", "EX. 1", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "EX. 2", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 5", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "elevator", "NA", "ELEV. A", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 3", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 2", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "men washroom", "1G14", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "women washroom", "1G20", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "elevator", "NA", "ELEV. B", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 4", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 5", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 7", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "men washroom", "1N02", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "women washroom", "1N01B", "", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 1", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "elevator", "NA", "ELEV. 1", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 2", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 4", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        GUIPoi temp = new GUIPoi("AHB", "First Floor", "stairwell", "NA", "ST. 3", 0, 0);
        temp.setGUI();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String searchString = jTextField1.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        jComboBox2.removeAllItems();
        try {
            this.favFind();
        } catch (IOException ex) {
            Logger.getLogger(AHB_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AHB_firstfloor.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        for (int k = 0; k < jLayeredPane1.getComponentCount()-1; k++){
            JButton poiButton = (JButton) jLayeredPane1.getComponent(k);
            if (jComboBox2.getSelectedItem().equals(poiButton.getToolTipText())){
                poiButton.doClick();
                jComboBox2.removeAllItems();
            }
        }
    }//GEN-LAST:event_jButton36ActionPerformed

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
            java.util.logging.Logger.getLogger(AHB_firstfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AHB_firstfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AHB_firstfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AHB_firstfloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AHB_firstfloor().setVisible(true);
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
    private String[][] pList;
    private ArrayList<GUIPoi> sList = new ArrayList<>();
    private ArrayList<String> favList = new ArrayList<>();
}
