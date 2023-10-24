/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.team29.westernmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Tristan
 */
public class GUIPoi extends javax.swing.JFrame {

    private String cat;
    private String rm;
    private String build;
    private String floor;
    private String name;
    private int x;
    private int y;
 
    public GUIPoi(String build, String floor, String cat, String rm, String name, int x, int y) {
        this.build = build;
        this.cat = cat;
        this.rm = rm;
        this.floor = floor;
        this.name = name;
        this.x = x;
        this.y = y;
        
        initComponents();
    }
    public String getCat(){
        return this.cat;
    }
    public String getRm(){
        return this.rm;
    }
    public String getBuild(){
        return this.build;
    }
    public String getFloor(){
        return this.floor;
    }
    public String getNames(){
        return this.name;
    } 
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    
    public JSONObject jsonRead(){
        JSONObject jFinal = new JSONObject();
        if(gety() != 0){
            try {
                String file = "src/main/java/JSONmetadata/userCreated.json";
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader(file));
                JSONObject jsonFile = (JSONObject) obj;
                JSONArray jsonType = (JSONArray) jsonFile.get("UserCreated");
                for(int i = 0; i < jsonType.size(); i++){
                    JSONObject temp = (JSONObject) jsonType.get(i);
                        if((getx() == (long) temp.get("x")) && (gety() == (long) temp.get("y"))){
                            jFinal = temp;
                        }
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIPoi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GUIPoi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(GUIPoi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            String file = "src/main/java/JSONmetadata/";
            if(getBuild().equals("MC")){
                file = file + "MC.json";
            } else if(getBuild().equals("AHB")){
                file = file + "AHB.json";
            } else if(getBuild().equals("EC")){
                file = file + "EC.json";
            }

            JSONParser parser = new JSONParser();
            try{
                Object obj = parser.parse(new FileReader(file));
                JSONObject jsonFile = (JSONObject) obj;
                JSONArray jsonFloor = (JSONArray) jsonFile.get(getFloor());
                JSONObject jsonFloor2 = (JSONObject) jsonFloor.get(0);
                JSONArray catArray = (JSONArray) jsonFloor2.get(getCat());
                if((this.cat.equals("elevator")) || this.cat.equals("stairwell") || this.cat.equals("entry/exit")){
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("name").equals(getNames()))){
                            jFinal = temp;
                        }
                    } 
                }else{
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("roomNumber").equals(getRm()))){
                            jFinal = temp;
                        }
                    }
                }  
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return jFinal;
    }
    
    public void setGUI(){
        JSONObject info = jsonRead();
        String tname = (String) info.get("name");
        String roomN = (String) info.get("roomNumber");
        String tcat = (String) info.get("category");
        String descrip = (String) info.get("description");
        String hl = valueOf(info.get("highlighted"));
        roomname.setText(tname);
        roomnumber.setText(roomN);
        building.setText(getBuild());
        category.setText(tcat);
        description.setText(descrip);
        jLabel7.setText(hl);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        building = new javax.swing.JLabel();
        roomname = new javax.swing.JLabel();
        roomnumber = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Building:");

        jLabel2.setText("Name:");

        jLabel3.setText("Room Number:");

        jLabel4.setText("Description:");

        building.setText("jLabel5");

        roomname.setText("jLabel5");

        roomnumber.setText("jLabel5");

        description.setText("jLabel5");

        jLabel5.setText("Category:");

        category.setText("jLabel6");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit POI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Favourited:");

        jLabel7.setText("jLabel7");

        jButton3.setText("Favourite");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Unfavourite");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(category)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roomnumber)
                                        .addGap(340, 340, 340)
                                        .addComponent(jButton3)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton4))))
                            .addComponent(jButton1)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(roomname))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(51, 51, 51)
                                        .addComponent(building)))
                                .addGap(398, 398, 398)
                                .addComponent(jButton2)))
                        .addGap(237, 460, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(building)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(roomname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(roomnumber)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EditingLogin login = new EditingLogin(new GUIPoi(this.build, this.floor, this.cat, this.rm, this.name, this.x, this.y));
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String file = "src/main/java/JSONmetadata/";
            if(getBuild().equals("MC")){
                file = file + "MC.json";
            } else if(getBuild().equals("AHB")){
                file = file + "AHB.json";
            } else if(getBuild().equals("EC")){
                file = file + "EC.json";
            }
            JSONParser parser = new JSONParser();
            try{
                Object obj = parser.parse(new FileReader(file));
                JSONObject jsonFile = (JSONObject) obj;
                JSONArray jsonFloor = (JSONArray) jsonFile.get(getFloor());
                JSONObject jsonFloor2 = (JSONObject) jsonFloor.get(0);
                JSONArray catArray = (JSONArray) jsonFloor2.get(getCat());
                if((this.cat.equals("elevator")) || this.cat.equals("stairwell") || this.cat.equals("entry/exit")){
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("name").equals(getNames()))){
                                temp.put("highlighted", true);
                        }
                    } 
                }else{
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("roomNumber").equals(getRm()))){
                                temp.put("highlighted", true);
                        }
                    }
                }
                try (FileWriter files = new FileWriter(file)) {
                    files.write(jsonFile.toJSONString());
                    files.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            } catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String file = "src/main/java/JSONmetadata/";
            if(getBuild().equals("MC")){
                file = file + "MC.json";
            } else if(getBuild().equals("AHB")){
                file = file + "AHB.json";
            } else if(getBuild().equals("EC")){
                file = file + "EC.json";
            }
            JSONParser parser = new JSONParser();
            try{
                Object obj = parser.parse(new FileReader(file));
                JSONObject jsonFile = (JSONObject) obj;
                JSONArray jsonFloor = (JSONArray) jsonFile.get(getFloor());
                JSONObject jsonFloor2 = (JSONObject) jsonFloor.get(0);
                JSONArray catArray = (JSONArray) jsonFloor2.get(getCat());
                if((this.cat.equals("elevator")) || this.cat.equals("stairwell") || this.cat.equals("entry/exit")){
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("name").equals(getNames()))){
                                temp.put("highlighted", false);
                        }
                    } 
                }else{
                    for(int i = 0; i < catArray.size(); i++){
                    JSONObject temp = (JSONObject) catArray.get(i);
                        if((temp.get("roomNumber").equals(getRm()))){
                                temp.put("highlighted", false);
                        }
                    }
                }
                try (FileWriter files = new FileWriter(file)) {
                    files.write(jsonFile.toJSONString());
                    files.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            } catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel building;
    private javax.swing.JLabel category;
    private javax.swing.JLabel description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel roomname;
    private javax.swing.JLabel roomnumber;
    // End of variables declaration//GEN-END:variables
}
