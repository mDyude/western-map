/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.team29.westernmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tristan
 */
public class EditingTool extends javax.swing.JFrame {
    private GUIPoi p;
    /**
     * Creates new form EditingTool
     */
    public EditingTool(GUIPoi poi) {
        this.p = poi;
        initComponents();
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
        newname = new javax.swing.JTextField();
        newdesc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("New Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("New Description:");

        newname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newnameActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel2)
                    .addComponent(newdesc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(166, 166, 166)))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_newnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = newname.getText();
        String desc = newdesc.getText();
        if(this.p.gety() != 0){
            try {
                String file = "src/main/java/JSONmetadata/userCreated.json";
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader(file));
                JSONObject jsonFile = (JSONObject) obj;
                JSONArray jsonType = (JSONArray) jsonFile.get("UserCreated");
                for(int i = 0; i < jsonType.size(); i++){
                    JSONObject temp = (JSONObject) jsonType.get(i);
                    if((this.p.getx() == (long) temp.get("x")) && (this.p.gety() == (long) temp.get("y"))){
                        temp.put("name", name);
                        temp.put("description", desc);
                    }
                }
                try (FileWriter files = new FileWriter(file)) {
                    files.write(jsonFile.toJSONString());
                    files.flush();
                } catch (IOException e) {
                    e.printStackTrace();
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
            if(this.p.getBuild().equals("MC")){
                file = file + "MC.json";
            } else if(this.p.getBuild().equals("AHB")){
                file = file + "AHB.json";
            } else if(this.p.getBuild().equals("EC")){
                file = file + "EC.json";
            }
            try {
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader(file));
                    JSONObject jsonFile = (JSONObject) obj;
                    JSONArray jsonType = (JSONArray) jsonFile.get(this.p.getFloor());
                    if((this.p.getCat().equals("elevator")) || this.p.getCat().equals("stairwell") || this.p.getCat().equals("entry/exit")){
                        for(int i = 0; i < jsonType.size(); i++){
                            JSONObject temp = (JSONObject) jsonType.get(i);
                            if((temp.get("name").equals(this.p.getNames()))){
                                temp.put("name", name);
                                temp.put("description", desc);
                            }
                        }
                    }else{
                        for(int i = 0; i < jsonType.size(); i++){
                            JSONObject temp = (JSONObject) jsonType.get(i);
                            if((temp.get("roomNumber").equals(this.p.getRm()))){
                                temp.put("name", name);
                                temp.put("description", desc);
                            }
                        }
                    }
                    try (FileWriter files = new FileWriter(file)) {
                        files.write(jsonFile.toJSONString());
                        files.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } 
                } catch (IOException ex) {
                    Logger.getLogger(EditingTool.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(EditingTool.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newdesc;
    private javax.swing.JTextField newname;
    // End of variables declaration//GEN-END:variables
}
