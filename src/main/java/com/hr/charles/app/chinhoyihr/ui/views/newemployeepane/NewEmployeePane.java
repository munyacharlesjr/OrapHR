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
package com.hr.charles.app.chinhoyihr.ui.views.newemployeepane;

import com.hr.charles.app.chinhoyihr.domain.PersonalHandling;
import com.hr.charles.app.chinhoyihr.model.PersonalInfo;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class NewEmployeePane extends javax.swing.JPanel {

    JFileChooser fileChooser = null;
    FileNameExtensionFilter filter = null;
    ByteArrayOutputStream img;
    BufferedImage im;
    
    public NewEmployeePane() {
        PersonalHandling.Load();
        initComponents();
        idTextField.setText(PersonalHandling.emplyeeID()+"");
        
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        fullnameTextField = new javax.swing.JTextField();
        cnicTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dobDayCombo = new javax.swing.JComboBox<>();
        dobMonthCombo = new javax.swing.JComboBox<>();
        dobYearCombo = new javax.swing.JComboBox<>();
        postlTextField = new javax.swing.JTextField();
        salarylTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        emergenceNamelTextField = new javax.swing.JTextField();
        emergencePhonelTextField1 = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        dobYearCombo1 = new javax.swing.JComboBox<>();
        dobMonthCombo1 = new javax.swing.JComboBox<>();
        dobDayCombo1 = new javax.swing.JComboBox<>();
        pictureLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(860, 694));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("New Employee");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CNIC:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Emal:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Emergence Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Emergence Phone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Post:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Salary:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Date of Hiring:");

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fullnameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullnameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTextFieldActionPerformed(evt);
            }
        });

        cnicTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnicTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        phoneTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Address:");

        dobDayCombo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobDayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dobDayCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dobMonthCombo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobMonthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Jan", "Feb", "Mar", "Aprl", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        dobYearCombo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobYearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1985", "1987", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        dobYearCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        postlTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postlTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        postlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postlTextFieldActionPerformed(evt);
            }
        });

        salarylTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salarylTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jScrollPane1.setViewportView(jTextPane1);

        emergenceNamelTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emergenceNamelTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emergenceNamelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergenceNamelTextFieldActionPerformed(evt);
            }
        });

        emergencePhonelTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emergencePhonelTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        browseButton.setBackground(new java.awt.Color(255, 255, 255));
        browseButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        browseButton.setText("Browse");
        browseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 153, 0));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        dobYearCombo1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobYearCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1985", "1987", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        dobYearCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dobMonthCombo1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobMonthCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Jan", "Feb", "Mar", "Aprl", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        dobDayCombo1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dobDayCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dobDayCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile-head-hi.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(salarylTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(postlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addComponent(dobDayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(dobMonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(22, 22, 22)
                                        .addComponent(dobYearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8))
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emergencePhonelTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                    .addComponent(emergenceNamelTextField))))
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dobDayCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dobMonthCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(dobYearCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dobYearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dobDayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobMonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(postlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(salarylTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emergencePhonelTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emergenceNamelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dobYearCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobDayCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobMonthCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
           
        PersonalHandling.save(getData());
        JOptionPane.showMessageDialog(null,"Record Saved.");
        }catch (HeadlessException | SQLException e)
        {
           
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed

        fileChooser.addChoosableFileFilter(filter);
        fileChooser.showOpenDialog(null);

        try {
            im = ImageIO.read(fileChooser.getSelectedFile());
            pictureLabel.setIcon(new ImageIcon(im.getScaledInstance(pictureLabel.getWidth(), pictureLabel.getHeight(), 1)));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No File Selected");
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void emergenceNamelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergenceNamelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergenceNamelTextFieldActionPerformed

    private void fullnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameTextFieldActionPerformed

    private void postlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postlTextFieldActionPerformed
    
    public PersonalInfo getData()
    {
        
        int id = -1;
        try
        {
            id = Integer.parseInt(idTextField.getText());
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Wrong input against ' ID '" + id);
        }
        String name = fullnameTextField.getText();
        String  addrss = jTextPane1.getText();
        String Ename =  emergenceNamelTextField.getText();
        String email = emailTextField.getText();
        String dob = String.valueOf(dobDayCombo.getSelectedItem().toString() + " / " + dobMonthCombo.getSelectedItem().toString()
                + " / " + dobYearCombo.getSelectedItem().toString());
        String pst = postlTextField.getText();
        double sal = Double.parseDouble(salarylTextField.getText());
        String time = String.valueOf(dobDayCombo1.getSelectedItem().toString() + " / " + dobMonthCombo1.getSelectedItem().toString()
                + " / " + dobYearCombo1.getSelectedItem().toString());
        
        String phone = "";
        try
        {
            phone = phoneTextField.getText();
        } catch(IllegalArgumentException e) {
           JOptionPane.showMessageDialog(null, "Wrong input against ' Phone '" + phone);
        }
        String ephone= "";
        try
        {
            ephone = emergencePhonelTextField1.getText();
        } catch(IllegalArgumentException e) {
           JOptionPane.showMessageDialog(null, "Wrong input against ' Phone '" + ephone);
        }
        String cnic= "";
        try
        {
            cnic = cnicTextField.getText();
        } catch(IllegalArgumentException e) {
           JOptionPane.showMessageDialog(null, "Wrong input against ' CNIC '" + cnic);
        }
        
        img = new ByteArrayOutputStream();
        
        try {
            ImageIO.write(im, "jpg", img);
        }catch(IOException e)
        {
            
        }
        
        return new PersonalInfo(id, name, phone, cnic, Ename, ephone,addrss, dob, email, img.toByteArray(),pst, sal, time);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton browseButton;
    private javax.swing.JTextField cnicTextField;
    private javax.swing.JComboBox<String> dobDayCombo;
    private javax.swing.JComboBox<String> dobDayCombo1;
    private javax.swing.JComboBox<String> dobMonthCombo;
    private javax.swing.JComboBox<String> dobMonthCombo1;
    private javax.swing.JComboBox<String> dobYearCombo;
    private javax.swing.JComboBox<String> dobYearCombo1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emergenceNamelTextField;
    private javax.swing.JTextField emergencePhonelTextField1;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextField postlTextField;
    private javax.swing.JTextField salarylTextField;
    // End of variables declaration//GEN-END:variables
}
