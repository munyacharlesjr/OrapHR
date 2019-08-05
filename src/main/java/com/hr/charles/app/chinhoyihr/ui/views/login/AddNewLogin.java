/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */
package com.hr.charles.app.chinhoyihr.ui.views.login;

import com.hr.charles.app.chinhoyihr.domain.LoginHandling;
import com.hr.charles.app.chinhoyihr.model.LoginEntity;

import java.awt.*;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class AddNewLogin extends javax.swing.JPanel {

    /**
     * Creates new form AddNewLogin
     */
    
    public AddNewLogin() {
        initComponents();
        setBackground(Color.white);
        LoginHandling.load();
        idTextField.setText(LoginHandling.loginID()+"");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Sihle Manqele
    private void initComponents() {
        idTextField = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        username = new JTextField();
        jLabel4 = new JLabel();
        jLabel7 = new JLabel();
        questincombo = new JComboBox<>();
        answertf = new JTextField();
        passwordtf = new JTextField();
        fullnametf = new JTextField();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel12 = new JLabel();
        jLabel1 = new JLabel();
        Save = new JButton();
        statusComboBox = new JComboBox<>();

        //======== this ========
        setPreferredSize(new Dimension(689, 675));
        setRequestFocusEnabled(false);
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
        border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER
        ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
        .BOLD,12),java.awt.Color.red), getBorder())); addPropertyChangeListener(
        new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r"
        .equals(e.getPropertyName()))throw new RuntimeException();}});

        //---- idTextField ----
        idTextField.setEditable(false);
        idTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        idTextField.setHorizontalAlignment(SwingConstants.CENTER);

        //---- jLabel2 ----
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2.setText("ID: ");

        //---- jLabel3 ----
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3.setText("User Name:");

        //---- username ----
        username.setFont(new Font("Tahoma", Font.PLAIN, 14));
        username.setHorizontalAlignment(SwingConstants.CENTER);

        //---- jLabel4 ----
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setText("Status:");

        //---- jLabel7 ----
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel7.setText("Security Question:");

        //---- questincombo ----
        questincombo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        questincombo.setModel(new DefaultComboBoxModel<>(new String[] {
            "What is your dream?",
            "Whtat's your PET name?",
            "What's your school teacher name?"
        }));
        questincombo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //---- answertf ----
        answertf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        answertf.setHorizontalAlignment(SwingConstants.CENTER);

        //---- passwordtf ----
        passwordtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        passwordtf.setHorizontalAlignment(SwingConstants.CENTER);

        //---- fullnametf ----
        fullnametf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        fullnametf.setHorizontalAlignment(SwingConstants.CENTER);

        //---- jLabel8 ----
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel8.setText("Full Name:");

        //---- jLabel9 ----
        jLabel9.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel9.setText("Password:");

        //---- jLabel12 ----
        jLabel12.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel12.setText("Security Answer:");

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 20));
        jLabel1.setText("Add New Login");
        jLabel1.setToolTipText("");

        //---- Save ----
        Save.setBackground(Color.white);
        Save.setFont(new Font("Arial", Font.PLAIN, 18));
        Save.setForeground(new Color(0, 153, 0));
        Save.setText("Save");
        Save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Save.addActionListener(e -> SaveActionPerformed(e));

        //---- statusComboBox ----
        statusComboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
        statusComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
            "Employee",
            "Admin"
        }));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup()
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(questincombo)
                                        .addComponent(answertf, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(username)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup()
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordtf, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullnametf, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusComboBox, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Save, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel1)
                    .addGap(87, 87, 87)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(questincombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(jLabel12)
                        .addComponent(answertf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(fullnametf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(statusComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(Save, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            LoginHandling.save(getData());
            JOptionPane.showMessageDialog(null,"Record Saved.");
        }catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Not Saved something went wrong.");
        }
    }//GEN-LAST:event_SaveActionPerformed
    
    public LoginEntity getData()
    {
        
        int id = Integer.parseInt(idTextField.getText());
        String name = fullnametf.getText();
        String user = username.getText();
        String pass = passwordtf.getText();
        String status = statusComboBox.getSelectedItem().toString();
        String qstn = String.valueOf(questincombo.getSelectedItem());
        String ans = answertf.getText();
        
        java.util.Calendar cal = new java.util.GregorianCalendar();
        return new LoginEntity(id, user, pass, qstn, ans, name, status, cal.getTime().toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sihle Manqele
    private JTextField idTextField;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField username;
    private JLabel jLabel4;
    private JLabel jLabel7;
    private JComboBox<String> questincombo;
    private JTextField answertf;
    private JTextField passwordtf;
    private JTextField fullnametf;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel12;
    private JLabel jLabel1;
    private JButton Save;
    private JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
