/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package UI;

import DBUTIL.DBUTIL;
import MODEL.Donor;
import MODEL.Login;
import MAILER.MailerWorkArea;
import MODEL.Validations;
import UI.Admin.AdminWorkArea;
import UI.Hospital.HospitalWorkArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import UI.Hospital.HospitalWorkArea;
import UI.NGO.NGOWorkArea;
import UI.DOC.DoctorWorkArea;
import UI.PlasmaCenter.PCWorkArea;
import VDONOR.VDonorWA;
import MODEL.HOSPITAL;
import MODEL.PlasmaCenter;
import MODEL.Doctor;
import MODEL.NGO; 
import UI.Laboratory.UpdateTest;
import javax.swing.SwingUtilities;

/**
 *
 * @author Krupali
 */
public class LoginScreen extends javax.swing.JFrame {
 
    /**
     * Creates new form LoginScreen
     */
    Validations validations;


    public static int doc_id; 
    public static int ngo_id; 
    public static int vdon_id; 
    
    public static int donor_id = Donor.getDonor_id(); 
    
    public static Login login = new Login();

    public LoginScreen() {
        initComponents();
        validations = new Validations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valPassword = new javax.swing.JLabel();
        valUsername = new javax.swing.JLabel();
        btndonar = new javax.swing.JButton();
        btnngo = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);
        getContentPane().add(valPassword);
        valPassword.setBounds(490, 230, 270, 20);
        getContentPane().add(valUsername);
        valUsername.setBounds(500, 150, 260, 20);

        btndonar.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btndonar.setText("DONOR REGISTRATION");
        btndonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndonarActionPerformed(evt);
            }
        });
        getContentPane().add(btndonar);
        btndonar.setBounds(20, 170, 210, 40);

        btnngo.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnngo.setText("NGO REGISTRATION");
        btnngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnngoActionPerformed(evt);
            }
        });
        getContentPane().add(btnngo);
        btnngo.setBounds(20, 280, 210, 40);

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtUserName);
        txtUserName.setBounds(560, 100, 160, 30);

        pwdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdFieldKeyReleased(evt);
            }
        });
        getContentPane().add(pwdField);
        pwdField.setBounds(560, 180, 170, 30);

        lblPassword.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("PASSWORD ");
        getContentPane().add(lblPassword);


        lblUser.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("USERNAME ");
        getContentPane().add(lblUser);
        lblUser.setBounds(433, 97, 110, 30);

        lblTitle.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        lblTitle.setText("PlasMain - The Plasma Managery");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(200, 0, 439, 57);

        btnLogin.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(520, 410, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/plasma login1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndonarActionPerformed
        VDonorRegForm VDR= new VDonorRegForm();
        this.dispose();
        VDR.setVisible(true);
// TODO add your handling code here:

    }//GEN-LAST:event_btndonarActionPerformed

    private void btnngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnngoActionPerformed
       NgoRegisterJFrame NGO= new NgoRegisterJFrame();
        this.dispose();
        NGO.setVisible(true);
    }//GEN-LAST:event_btnngoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
     
       String username = txtUserName.getText();
    char[] passwordCharArray = pwdField.getPassword();
    String password = String.valueOf(passwordCharArray);

    boolean flag = false; // Flag to track valid credentials
    DBUTIL dbconn = new DBUTIL();
    Connection conn = dbconn.getConnection();
    ResultSet resultSet1 = null, resultSethos, resultSetpc, resultSetdoc, resultSetvdonor, resultSetngo_id = null;

    System.out.println("Connected to database!");
    String selectSql = "SELECT * FROM logins";
    Statement stmt;
    PreparedStatement stmthos_id, stmtpc_id, stmtdoc_id, stmtvdonor_id, stmtngo_id;

    try {
        stmt = conn.createStatement();
        resultSet1 = stmt.executeQuery(selectSql);

        while (resultSet1.next()) {
            System.out.println("Checking credentials...");
            if (resultSet1.getString(1).equals(username) && resultSet1.getString(2).equals(password)) {
                flag = true;
                int role = Integer.valueOf(resultSet1.getString(3));

                switch (role) {
                    case 1: // Admin
                        System.out.println("Opening Admin Work Area...");
                        AdminWorkArea AWA = new AdminWorkArea();
                        this.dispose();
                        AWA.setVisible(true);
                        break;

                    case 2: // Hospital Admin
                        System.out.println("Opening Hospital Work Area...");
                        String findhos_id = "SELECT hos_id FROM emphos WHERE user_id=?";
                        stmthos_id = conn.prepareStatement(findhos_id);
                        stmthos_id.setInt(1, Integer.valueOf(username));
                        resultSethos = stmthos_id.executeQuery();
                        if (resultSethos.next()) {
                            int hos_id = resultSethos.getInt(1);
                            HOSPITAL.setHos_id(hos_id);
                            HospitalWorkArea HWA = new HospitalWorkArea();
                            this.dispose();
                            HWA.setVisible(true);
                        }
                        break;

                    case 3: // Plasma Center Admin
                        System.out.println("Opening Plasma Center Work Area...");
                        String findpc_id = "SELECT pc_id FROM emppc WHERE user_id=?";
                        stmtpc_id = conn.prepareStatement(findpc_id);
                        stmtpc_id.setInt(1, Integer.valueOf(username));
                        resultSetpc = stmtpc_id.executeQuery();
                        if (resultSetpc.next()) {
                            int pc_id = resultSetpc.getInt(1);
                            PlasmaCenter.setPc_id(pc_id);
                            PCWorkArea PCW = new PCWorkArea();
                            this.dispose();
                            PCW.setVisible(true);
                        }
                        break;

                    case 4: // Doctor
                        System.out.println("Opening Doctor Work Area...");
                        String finddoc_id = "SELECT doc_id FROM doctors WHERE user_id=?";
                        stmtdoc_id = conn.prepareStatement(finddoc_id);
                        stmtdoc_id.setInt(1, Integer.valueOf(username));
                        resultSetdoc = stmtdoc_id.executeQuery();
                        if (resultSetdoc.next()) {
                            int doc_id = resultSetdoc.getInt(1);
                            Doctor.setDoc_id(doc_id);
                            DoctorWorkArea DWA = new DoctorWorkArea();
                            this.dispose();
                            DWA.setVisible(true);
                        }
                        break;

                    case 5: // NGO Admin
                        System.out.println("Opening NGO Work Area...");
            String findngo_id = "SELECT ngo_id FROM ngo WHERE user_id=?";
            stmtngo_id = conn.prepareStatement(findngo_id);
            stmtngo_id.setInt(1, Integer.valueOf(username));
            resultSetngo_id = stmtngo_id.executeQuery();
            if (resultSetngo_id.next()) {
                int ngo_id = resultSetngo_id.getInt(1);
                NGO.setNgo_id(ngo_id);

                try {
                    SwingUtilities.invokeLater(() -> {
                        try {
                            NGOWorkArea NGO = new NGOWorkArea();
                            NGO.setVisible(true);
                        } catch (Exception e) {
                            System.out.println("Error opening NGOWorkArea: " + e.getMessage());
                            e.printStackTrace();
                        }
                    });
                } catch (Exception e) {
                    System.out.println("Error preparing NGOWorkArea: " + e.getMessage());
                    e.printStackTrace();
                }
                this.dispose(); // Close current frame only after successful creation
            }
            break;

                    case 7: // Volunteer Donor
                        System.out.println("Opening Volunteer Donor Work Area...");
                        String findDonor_id = "SELECT vdonor_id FROM vdonor WHERE user_id=?";
                        stmtvdonor_id = conn.prepareStatement(findDonor_id);
                        stmtvdonor_id.setInt(1, Integer.valueOf(username));
                        resultSetvdonor = stmtvdonor_id.executeQuery();
                        if (resultSetvdonor.next()) {
                            int vdonor_id = resultSetvdonor.getInt(1);
                            Donor.setDonor_id(vdonor_id);
                            VDonorWA VDWA = new VDonorWA();
                            this.dispose();
                            VDWA.setVisible(true);
                        }
                        break;

                    case 8: // Hospital Billing Section
                        System.out.println("Opening Hospital Billing Section...");
                        JOptionPane.showMessageDialog(this, "Opening Hospital Billing Section.");
                        // Logic for opening the billing section goes here
                        break;

                    case 9: // Hospital Lab Section
                        System.out.println("Opening Hospital Lab Section...");
                        String findHosLab_id = "SELECT hos_id FROM emphos WHERE user_id=?";
                        stmthos_id = conn.prepareStatement(findHosLab_id);
                        stmthos_id.setInt(1, Integer.valueOf(username));
                        resultSethos = stmthos_id.executeQuery();
                        if (resultSethos.next()) {
                            int hosLab_id = resultSethos.getInt(1);
                            HOSPITAL.setHos_id(hosLab_id);
                            UpdateTest UT = new UpdateTest();
                            this.dispose();
                            UT.setVisible(true);
                        }
                        break;

                    case 10: // Mailer Work Area
                        System.out.println("Opening Mailer Work Area...");
                        MailerWorkArea MA = new MailerWorkArea();
                        this.dispose();
                        MA.setVisible(true);
                        break;

                    default:
                        JOptionPane.showMessageDialog(this, "Invalid role. Please contact support.");
                        break;
                }

                break; // Exit the loop after processing a valid login
            }
        }

        if (!flag) {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    } catch (SQLException ex) {
        System.out.println("SQL Exception: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "Error connecting to the database. Please try again.");
    } finally {
        // Close database resources
        try {
            if (resultSet1 != null) resultSet1.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
            
            
            
       
            
          
         

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
          if (!this.validations.ValidateUsername(txtUserName.getText()) ) {
            valUsername.setText("Username is Invalid");
         }

        else {
            valUsername.setText(null);
         }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void pwdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdFieldKeyReleased
        // TODO add your handling code here:
        String password = String.valueOf(pwdField.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 4-12 character long");
        } else {
            valPassword.setText(null);
        }
    }//GEN-LAST:event_pwdFieldKeyReleased

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btndonar;
    private javax.swing.JButton btnngo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valUsername;
    // End of variables declaration//GEN-END:variables
}
