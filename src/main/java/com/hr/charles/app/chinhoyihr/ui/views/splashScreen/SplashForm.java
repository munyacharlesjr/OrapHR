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
package com.hr.charles.app.chinhoyihr.ui.views.splashScreen;

import com.hr.charles.app.chinhoyihr.repository.ConnectionClass;
import com.hr.charles.app.chinhoyihr.ui.views.login.Login;

import java.awt.*;
import javax.swing.*;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class SplashForm extends javax.swing.JFrame {

    /**
     * Creates new form SplashForm
     */
    public SplashForm() {
        initComponents();
        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i<101; i++)
                {
                    try {
                        sleep(50);
                        jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Login log = new Login();
                log.setVisible(true);
                dispose();
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Sihle Manqele
    private void initComponents() {
        jProgressBar1 = new JProgressBar();
        jLabel1 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(jProgressBar1);
        jProgressBar1.setBounds(250, 350, 300, 10);

        //---- jLabel1 ----
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/splashScreen/SplashGMS.gif")));
        contentPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 400);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SplashForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sihle Manqele
    private JProgressBar jProgressBar1;
    private JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
