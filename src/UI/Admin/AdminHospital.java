/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import UI.LoginScreen;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Teja
 */
public class AdminHospital extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminHospital
     */
     Vector originalTableModel;
     
     Random rand = new Random();
   
    ResultSet resultSet = null;
    DBUTIL dbconn= new DBUTIL();
    Validations validations;
    public AdminHospital() {
        initComponents();
        
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblHospital.getModel()).getDataVector().clone();
        validations= new Validations();
        

    
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT * FROM HOSPITAL";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getString(3);
            row[3]=resultSet.getInt(4);
            row[4]=resultSet.getString(5);  
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSelectOrgType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtzipCode = new javax.swing.JTextField();
        valAddress = new javax.swing.JLabel();
        valZipCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txthos_id = new javax.swing.JTextField();
        valContact = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        txtid.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 370, 70, 18);

        lblTitle.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblTitle.setText("HOSPITALS ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(220, 0, 210, 50);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        jLabel2.setText("ADDRESS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 410, 80, 18);

        lblSelectOrgType.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        lblSelectOrgType.setText("ID");
        getContentPane().add(lblSelectOrgType);
        lblSelectOrgType.setBounds(250, 320, 13, 18);

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        jLabel5.setText("ZIP CODE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 440, 100, 40);

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Zipcode", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospital);
        if (tblHospital.getColumnModel().getColumnCount() > 0) {
            tblHospital.getColumnModel().getColumn(3).setMinWidth(0);
            tblHospital.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblHospital.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 650, 92);

        btnAdd.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(270, 530, 87, 25);

        btnUpdate.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(250, 240, 100, 25);

        btnDelete.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(370, 240, 100, 25);

        btnBack.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(550, 10, 100, 25);

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 13)); // NOI18N
        jLabel6.setText("MOBILE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 480, 100, 40);

        lbSearch.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        lbSearch.setText("SEARCH");
        getContentPane().add(lbSearch);
        lbSearch.setBounds(90, 70, 90, 30);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch);
        txtSearch.setBounds(170, 70, 430, 30);

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });
        getContentPane().add(txtContact);
        txtContact.setBounds(340, 490, 140, 22);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(500, 360, 150, 20);

        txtaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtaddress);
        txtaddress.setBounds(340, 410, 140, 30);

        txtzipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtzipCodeKeyReleased(evt);
            }
        });
        getContentPane().add(txtzipCode);
        txtzipCode.setBounds(340, 450, 140, 30);

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAddress);
        valAddress.setBounds(510, 410, 150, 30);

        valZipCode.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valZipCode);
        valZipCode.setBounds(510, 450, 140, 20);

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(340, 360, 140, 30);

        txthos_id.setEditable(false);
        txthos_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthos_idKeyReleased(evt);
            }
        });
        getContentPane().add(txthos_id);
        txthos_id.setBounds(340, 310, 140, 30);

        valContact.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valContact);
        valContact.setBounds(510, 490, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/ADMIN BG.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 740, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       var valid = true;
       
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Hospital Name is Invalid");
            valid = false;
      
        }
        
        if (!this.validations.ValidateAddress(txtaddress.getText()) ) {
            valAddress.setText("Address is required");
            valid = false;
        }
        
        if (!this.validations.ValidateZip(txtzipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
            valid = false;
        }
        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valContact.setText("Phone Number is Invalid");
            valid = false;
        }
        
       //int hos_id = Integer.valueOf(txthos_id.getText());
       int hos_id = rand.nextInt(1, 100);
       String hospital_name = txtName.getText();
       String address = txtaddress.getText();
       Integer zipcode = Integer.valueOf(txtzipCode.getText());
       String mobile = txtContact.getText();
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
                
        
        //check if the id already exists
                String INSERTHOSSQL = "insert into hospital(hos_id,hos_name,address,zipcode,mobile) values (?,?,?,?,?) ";

        PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(INSERTHOSSQL);
       
             
            stmt.setInt(1,hos_id); 
            stmt.setString(2,hospital_name);
            stmt.setString(3,address);
            stmt.setInt(4,zipcode);
            stmt.setString(5,mobile);
            
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(this,"Hospital Added");

       populateTable(); 
      setTextNull();
            setValidationNull();
  //stop
 
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        var valid = true;
       
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Hospital Name is Invalid");
            valid = false;
      
        }
        
        if (!this.validations.ValidateAddress(txtaddress.getText()) ) {
            valAddress.setText("Address is required");
            valid = false;
        }
        
        if (!this.validations.ValidateZip(txtzipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
            valid = false;
        }
        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valContact.setText("Phone Number is Invalid");
            valid = false;
        }
        
        int hos_id = Integer.valueOf(txthos_id.getText());
       String hospital_name = txtName.getText();
       String address = txtaddress.getText();
       Integer zipcode = Integer.valueOf(txtzipCode.getText());
       String mobile = txtContact.getText();
    
       
            // validate the text from text boxes 
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
                String SELECTHOSSQL = "update hospital set hos_name=? ,address =?,zipcode=?,mobile=? where hos_id=? ";
                PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(SELECTHOSSQL);
       
             
            stmt.setInt(5,hos_id); 
            stmt.setString(1,hospital_name);
            stmt.setString(2,address);
            stmt.setInt(3,zipcode);
            stmt.setString(4,mobile);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
        int SelectedRowIndex=tblHospital.getSelectedRow();
       System.out.println("SelectedRowIndex "+SelectedRowIndex);
                  if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to Update");
            
        return;
        }
        // to display in the text boxes          
        DefaultTableModel tblModel = (DefaultTableModel) tblHospital.getModel();
              
       tblModel.setValueAt(hos_id,tblHospital.getSelectedRow(), 0);
       tblModel.setValueAt(hospital_name,tblHospital.getSelectedRow(), 1);
       tblModel.setValueAt(address,tblHospital.getSelectedRow(), 2);
       tblModel.setValueAt(zipcode,tblHospital.getSelectedRow(), 3);
       tblModel.setValueAt(mobile,tblHospital.getSelectedRow(), 4);
       
       
      JOptionPane.showMessageDialog(this,"Hospital data Updated");

  
      
     populateTable(); 
     
     
      setValidationNull();
       setTextNull(); 
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                                               
        // TODO add your handling code here:
        Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblHospital.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblHospital.getModel();
         int hos_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from hospital where hos_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, hos_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Hospital Deleted");
        populateTable();
        setTextNull();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblHospital.getModel();

        // set data to textfield when raw is selected

        String hos_id = tblModel.getValueAt(tblHospital.getSelectedRow(),0).toString();
        String hospital_name = tblModel.getValueAt(tblHospital.getSelectedRow(),1).toString();
        String address = tblModel.getValueAt(tblHospital.getSelectedRow(),2).toString();
        String zipcode = tblModel.getValueAt(tblHospital.getSelectedRow(),3).toString();
        String mobile = tblModel.getValueAt(tblHospital.getSelectedRow(),4).toString();
      
        

        txthos_id.setText(String.valueOf(hos_id));
        txtName.setText(hospital_name);
        txtaddress.setText(address);
        txtzipCode.setText(String.valueOf(zipcode));
        txtContact.setText(mobile);
        
       
            setValidationNull();
    }//GEN-LAST:event_tblHospitalMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();

        model.setRowCount(0);
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(txtSearch.getText())) {
                    //content found so adding to table
                    model.addRow(rowVector);
                    break;
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valContact.setText(" Contact is required");
        }
        else {
            valContact.setText(null);
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtaddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddressKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAddress(txtaddress.getText()) ) {
            valAddress.setText("Address is required");
        }
        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtaddressKeyReleased

    private void txtzipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtzipCodeKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateZip(txtzipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
        }
        else {
            valZipCode.setText(null);
        }
    }//GEN-LAST:event_txtzipCodeKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is required");
        }
        else {
            valName.setText(null);
        }
    
    }//GEN-LAST:event_txtNameKeyReleased

    private void txthos_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthos_idKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txthos_idKeyReleased

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
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHospital().setVisible(true);
            }
        });
    }
    
    private void setTextNull() {
     txthos_id.setText(null);
  txtName.setText(null);
  txtaddress.setText(null);
  txtzipCode.setText(null);
   txtContact.setText(null);
    }
    private void setValidationNull() {
        valName.setText(null);
         valAddress.setText(null);
        valZipCode.setText(null);
        valContact.setText(null);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txthos_id;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtzipCode;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valContact;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valZipCode;
    // End of variables declaration//GEN-END:variables
}
