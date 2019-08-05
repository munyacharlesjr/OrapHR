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
package com.hr.charles.app.chinhoyihr.ui.views.mainframe;


import com.hr.charles.app.chinhoyihr.ui.views.dailywork.DailyWorkPanel;
import com.hr.charles.app.chinhoyihr.ui.views.login.AddNewLogin;
import com.hr.charles.app.chinhoyihr.ui.views.login.Login;
import com.hr.charles.app.chinhoyihr.ui.views.newemployeepane.NewEmployeePane;
import com.hr.charles.app.chinhoyihr.ui.views.salaryslips.SalarySlip;
import com.hr.charles.app.chinhoyihr.ui.views.searchemployee.SearchEmployee;
import com.hr.charles.app.chinhoyihr.ui.views.update.UpdatePanel;

/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class MainOfficeManagement extends javax.swing.JFrame {

    Login login=null;
    FontPanel fontPanel = null;
    NewEmployeePane newEmployee = null;
    SearchEmployee searchEmployee = null;
    DailyWorkPanel dailyWork = null;
    SalarySlip salarySlip = null;
    UpdatePanel updatePanel = null;
    AddNewLogin loginPanel = null;
    
    public MainOfficeManagement(Login login, String userName) {
        this.login = login;
        initComponents();
        loadPanels();
        usernameLabel.setText("Username: "+userName);
        fontPanel.setVisible(true);
    }

    
    
    private void loadPanels()
    {
        // Add New Login        
        loginPanel = new AddNewLogin();
        backbonePanel.add(loginPanel);
        loginPanel.setSize(1349, 675);
        
        //font_panel
        fontPanel = new FontPanel();
        backbonePanel.add(fontPanel);
        fontPanel.setSize(1349, 675);
        
        //new_employee
        newEmployee = new NewEmployeePane();
        backbonePanel.add(newEmployee);
        newEmployee.setSize(1359, 675);
        
        //search_employee
        searchEmployee = new SearchEmployee();
        backbonePanel.add(searchEmployee);
        searchEmployee.setSize(1349, 675);
        
        //dailyWork_panel
        dailyWork = new DailyWorkPanel();
        backbonePanel.add(dailyWork);
        dailyWork.setSize(1349, 675);
        
        //salary_Slip
        salarySlip = new SalarySlip();
        backbonePanel.add(salarySlip);
        salarySlip.setSize(1349, 675);
        
        //update_panel
        updatePanel = new UpdatePanel();
        backbonePanel.add(updatePanel);
        updatePanel.setSize(1349, 675);
        
        hidePanels();
    }
    
    private void hidePanels()
    {
        newEmployee.setVisible(false);
        searchEmployee.setVisible(false);
        dailyWork.setVisible(false);
        salarySlip.setVisible(false);
        updatePanel.setVisible(false);
        fontPanel.setVisible(false);
        loginPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchEmployeeButton = new javax.swing.JButton();
        workButton = new javax.swing.JButton();
        salarySlipsButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        newEmployeeButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        backbonePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("Username_Here");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        searchEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        searchEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchEmployeeButton.setText("Search Employee");
        searchEmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeButtonActionPerformed(evt);
            }
        });

        workButton.setBackground(new java.awt.Color(255, 255, 255));
        workButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workButton.setText("Daily Work");
        workButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workButtonActionPerformed(evt);
            }
        });

        salarySlipsButton.setBackground(new java.awt.Color(255, 255, 255));
        salarySlipsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salarySlipsButton.setText("Salary Slips");
        salarySlipsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salarySlipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarySlipsButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        goBackButton.setBackground(new java.awt.Color(255, 255, 255));
        goBackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(102, 0, 0));
        goBackButton.setText("Logout");
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        newEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        newEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newEmployeeButton.setText("New Employee");
        newEmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarySlipsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmployeeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(searchEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(salarySlipsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        backbonePanel.setBackground(new java.awt.Color(255, 255, 255));
        backbonePanel.setName(""); // NOI18N

        javax.swing.GroupLayout backbonePanelLayout = new javax.swing.GroupLayout(backbonePanel);
        backbonePanel.setLayout(backbonePanelLayout);
        backbonePanelLayout.setHorizontalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        backbonePanelLayout.setVerticalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("HR MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backbonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeButtonActionPerformed
        hidePanels();
        searchEmployee.setVisible(true);
    }//GEN-LAST:event_searchEmployeeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        hidePanels();
        updatePanel.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void newEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeButtonActionPerformed
        hidePanels();
        newEmployee.setVisible(true);
    }//GEN-LAST:event_newEmployeeButtonActionPerformed

    private void workButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workButtonActionPerformed
        hidePanels();
        dailyWork.setVisible(true);
    }//GEN-LAST:event_workButtonActionPerformed

    private void salarySlipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarySlipsButtonActionPerformed
        hidePanels();
        salarySlip.setVisible(true);
        
    }//GEN-LAST:event_salarySlipsButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       hidePanels();
       loginPanel.setVisible(true);
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel backbonePanel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton newEmployeeButton;
    private javax.swing.JButton salarySlipsButton;
    private javax.swing.JButton searchEmployeeButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton workButton;
    // End of variables declaration//GEN-END:variables
}
