/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package VDONOR;

import MODEL.Donor;
import UI.LoginScreen;

/**
 *
 * @author Krupali
 */
public class VDonorWA extends javax.swing.JFrame {

    /**
     * Creates new form VDonorWA
     */
    public static int donor_id = Donor.getDonor_id();
    public VDonorWA() {
        initComponents();
        
        String don = String.valueOf(donor_id); 
        txtdonor_id.setText(don);
        System.out.println("test and try donor work area");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnDonations = new javax.swing.JButton();
        btnDetails1 = new javax.swing.JButton();
        btn_back_admin1 = new javax.swing.JButton();
        txtdonor_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("HELLO DONOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 30, 260, 39);

        btnDonations.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnDonations.setForeground(new java.awt.Color(204, 0, 0));
        btnDonations.setText("DONATIONS");
        btnDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationsActionPerformed(evt);
            }
        });
        getContentPane().add(btnDonations);
        btnDonations.setBounds(230, 280, 116, 51);

        btnDetails1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnDetails1.setForeground(new java.awt.Color(204, 0, 0));
        btnDetails1.setText("DETAILS");
        btnDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetails1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetails1);
        btnDetails1.setBounds(230, 170, 116, 39);

        btn_back_admin1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btn_back_admin1.setForeground(new java.awt.Color(204, 0, 0));
        btn_back_admin1.setText(" LOGOUT");
        btn_back_admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_admin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back_admin1);
        btn_back_admin1.setBounds(450, 70, 88, 42);

        txtdonor_id.setEditable(false);
        getContentPane().add(txtdonor_id);
        txtdonor_id.setBounds(440, 30, 121, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VDONOR/VDONOR.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationsActionPerformed
         VDonorDonations VD= new  VDonorDonations();
      VD.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnDonationsActionPerformed

    private void btnDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetails1ActionPerformed
        VDonorDetails VDD= new VDonorDetails();
      VDD.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnDetails1ActionPerformed

    private void btn_back_admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_admin1ActionPerformed
        this.hide();
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
    }//GEN-LAST:event_btn_back_admin1ActionPerformed

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
            java.util.logging.Logger.getLogger(VDonorWA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDonorWA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDonorWA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDonorWA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDonorWA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails1;
    private javax.swing.JButton btnDonations;
    private javax.swing.JButton btn_back_admin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtdonor_id;
    // End of variables declaration//GEN-END:variables
}
