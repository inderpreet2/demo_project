/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pranavo7.demo_project.screens;

import com.pranavo7.demo_project.database_connectivity.ConnectionClass;

/**
 *
 * @author macbookpro2014
 */
public class SplashScreen extends javax.swing.JFrame {

    static SplashScreen sc = new SplashScreen();
    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        //ConnectionClass.getInstance();
    }
    
     void showProgress() {
        
                     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        progressLabel = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(progressBar);
        progressBar.setBounds(80, 130, 240, 40);

        progressLabel.setText("0%");
        getContentPane().add(progressLabel);
        progressLabel.setBounds(180, 200, 30, 17);

        loginLabel1.setText("Login");
        getContentPane().add(loginLabel1);
        loginLabel1.setBounds(180, 40, 31, 17);

        pack();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }
            
        });
        
        try {
            for(int i=0;i<=100;i++) {
                Thread.sleep(70);
                sc.progressBar.setValue(i);
                if(i==5) {
                   sc.progressLabel.setText("Loading,Please wait.....");
                }
                if(i == 50){
                   sc.progressLabel.setText("Almost there....");
                }
                if(i==100){
                    LoginScreen login=new LoginScreen();
                     login.setVisible(true);
                    sc.dispose();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Error in Splash Screen = " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    // End of variables declaration//GEN-END:variables
}