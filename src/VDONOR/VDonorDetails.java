/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package VDONOR;

import DBUTIL.DBUTIL;
import MODEL.Donor;
import MODEL.Validations;
import UI.VDonorRegForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Krupali
 */
public class VDonorDetails extends javax.swing.JFrame {

    /**
     * Creates new form VDonorDetails
     */
    Validations validations;
    
    DBUTIL dbconn= new DBUTIL();
    ResultSet resultSet1, resultSet2 = null;
    public static int donor_id = Donor.getDonor_id();
    public VDonorDetails() {
        initComponents();
        validations = new Validations();
        System.out.println("test and try donor details");
        setPersonalDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        valEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        ComboBlood = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        valName = new javax.swing.JLabel();
        valAge = new javax.swing.JLabel();
        valGender = new javax.swing.JLabel();
        valBlood = new javax.swing.JLabel();
        valPhone = new javax.swing.JLabel();
        valAddress = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("YOUR DETAILS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 10, 220, 39);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 120, 80, 18);

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel12.setText("EMAIL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 330, 70, 18);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(250, 320, 130, 30);

        valEmail.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valEmail);
        valEmail.setBounds(410, 310, 200, 20);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(270, 120, 112, 31);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(270, 160, 112, 31);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel6.setText("AGE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 170, 90, 18);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 210, 90, 18);

        btnGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMale);
        btnMale.setBounds(260, 210, 100, 29);

        btnGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnFemale);
        btnFemale.setBounds(320, 210, 150, 29);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel2.setText("BLOOD GROUP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 270, 120, 18);

        ComboBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "AB+", "AB-", "A+", "A-", "B+", "B-" }));
        ComboBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBloodActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBlood);
        ComboBlood.setBounds(290, 270, 77, 31);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel7.setText("CONTACT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 380, 130, 18);

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });
        getContentPane().add(txtContact);
        txtContact.setBounds(230, 370, 100, 31);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtAddress);
        txtAddress.setBounds(230, 410, 110, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 410, 100, 18);

        btnUpdate.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(200, 490, 200, 24);

        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(490, 20, 100, 24);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(410, 120, 180, 20);

        valAge.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAge);
        valAge.setBounds(410, 160, 160, 20);

        valGender.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valGender);
        valGender.setBounds(420, 210, 170, 20);

        valBlood.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valBlood);
        valBlood.setBounds(400, 270, 160, 20);

        valPhone.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPhone);
        valPhone.setBounds(360, 370, 160, 20);

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAddress);
        valAddress.setBounds(370, 410, 190, 20);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VDONOR/VDONOR.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 600, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
        }
        else {
            valAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void ComboBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBloodActionPerformed
        // TODO add your handling code here:
        Object blood_group = ComboBlood.getSelectedItem();

        if (blood_group == null || blood_group.toString().equals("")) {
            valBlood.setText("Please Select Blood Group");
            ComboBlood.removeAllItems();
            valBlood.setText(null);
        } else {
            ComboBlood.setSelectedItem("");
        }
    }//GEN-LAST:event_ComboBloodActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Contact is Invalid");
        }

        else {
            valPhone.setText(null);
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
        }
        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        var valid = true;

        if (ComboBlood.getSelectedItem() == null || ComboBlood.getSelectedItem().toString().isEmpty()) {
            valBlood.setText("Please Select Blood Group");
            valid = false;
        }

        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }

        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
        }

        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
            valid = false;
        }
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
        }

        //
        if (valid) {

            String gender = null;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }

            String name = txtName.getText();
            int age = Integer.valueOf(txtAge.getText());

            //String gender = (String) btngender.getSelectedItem();
            String bloodgroup = (String) ComboBlood.getSelectedItem();
            String contact = txtAddress.getText();
            String Address = txtContact.getText();

            Connection conn = dbconn.getConnection();

            //        String countDonors = "select count(*) from vdonor";
            //
            //        String addDonor = "insert into vdonor(vdonor_id, user_id, vname, age, gender, "
            //                + "contact, address, blood_group) values (?,?,?,?,?,?,?,?)";
            //
            //        String adduser = "insert into logins(user_id, pass_word, role_id) values(?,?,?)";

            String updateDonor = "update vdonor set vname=? ,age =?,gender=?,contact=? , address=?, blood_group=? where vdonor_id=? ";

            PreparedStatement stmt;
            try
            {
                stmt = conn.prepareStatement(updateDonor );

                stmt.setString(1,name);
                stmt.setInt(2,age);
                stmt.setString(3,gender);
                stmt.setString(4,contact);
                stmt.setString(5,Address);
                stmt.setString(6,bloodgroup);
                stmt.setInt(7,donor_id);

                stmt.executeUpdate();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(VDonorWA.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this,"Details Updated");

            //stop

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        VDonorWA frame = new  VDonorWA();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:

        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email is Invalid");
        }

        else {
            valEmail.setText(null);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

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
            java.util.logging.Logger.getLogger(VDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDonorDetails().setVisible(true);
            }
        });
    }
    private void setPersonalDetails() {
       System.out.println("test and try");
        String getdonor_details = "select vname,age, gender,contact, address, blood_group,email from vdonor where vdonor_id =? ";
        
        Connection conn = dbconn.getConnection();
        PreparedStatement stmt1 ; 
        try
        {
            stmt1 = conn.prepareStatement(getdonor_details);
            stmt1. setInt(1,donor_id); // this is now set to 2, later change to random number of req id
            
            resultSet1 = stmt1.executeQuery();
            resultSet1.next();
            txtName.setText(resultSet1.getString(1));
            txtAge.setText(resultSet1.getString(2));
            String gender = resultSet1.getString(3);
            String blood_group = resultSet1.getString(6);
            ComboBlood.setSelectedItem(blood_group);
            if("Male".equals(gender))
            {
                btnMale.setSelected(true);
            }
            else if("Female".equals(gender))
            {
                btnFemale.setSelected(true);
            }
//            else
//            {
//                System.out.println("Some discrepancy here!");
//            }
//            if(null == gender)
//            {
//                System.out.println("Some discrepancy here!");
//            }
//            else switch (gender) {
//                case "M":
//                    btnMale.setSelected(true);
//                    break;
//                case "F":
//                    btnFemale.setSelected(true);
//                    break;
//                default:
//                    System.out.println("Some discrepancy here!");
//                    break;
//            }
            txtContact.setText(resultSet1.getString(4));
            txtAddress.setText(resultSet1.getString(5));
            
            
            
            }
        catch (SQLException ex)
        {
            Logger.getLogger(VDonorRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBlood;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valAge;
    private javax.swing.JLabel valBlood;
    private javax.swing.JLabel valEmail;
    private javax.swing.JLabel valGender;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPhone;
    // End of variables declaration//GEN-END:variables
}
