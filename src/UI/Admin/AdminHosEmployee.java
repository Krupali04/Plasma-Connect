/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import UI.LoginScreen;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Teja
 */
public class AdminHosEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AdminHosEmployee
     */
     DBUTIL dbconn= new DBUTIL();
     Random rand = new Random();
    Validations validations;
    ResultSet resultSet1, resultSet2,resultSet3 = null;
    public AdminHosEmployee() {
        initComponents();
       populateTable();
        validations= new Validations();
         UpdateComboxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhos = new javax.swing.JLabel();
        ComboHospital = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        lblEmployeeName1 = new javax.swing.JLabel();
        lblEmployeeName2 = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtEmpName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblEmployeeName3 = new javax.swing.JLabel();
        lblhos1 = new javax.swing.JLabel();
        ComboDepts = new javax.swing.JComboBox<>();
        valDept = new javax.swing.JLabel();
        valHosp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHosEmployee = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        lblhos.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblhos.setText("HOSPITAL");
        getContentPane().add(lblhos);
        lblhos.setBounds(180, 370, 110, 24);

        ComboHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(ComboHospital);
        ComboHospital.setBounds(300, 360, 140, 22);

        btnAdd.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAdd.setText("CREATE EMPLOYEE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(80, 520, 210, 31);

        lblEmployeeName1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName1.setText("PASSWORD");
        getContentPane().add(lblEmployeeName1);
        lblEmployeeName1.setBounds(170, 480, 120, 24);

        lblEmployeeName2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName2.setText("EMPLOYEE ID");
        getContentPane().add(lblEmployeeName2);
        lblEmployeeName2.setBounds(140, 240, 150, 24);

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPassword);
        valPassword.setBounds(510, 470, 170, 20);

        txtEmpID.setEditable(false);
        getContentPane().add(txtEmpID);
        txtEmpID.setBounds(290, 230, 160, 22);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("HOSPITAL EMPLOYEES ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(40, 10, 410, 29);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(490, 290, 180, 20);

        btnBack.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(480, 10, 100, 31);
        getContentPane().add(txtEmpName);
        txtEmpName.setBounds(300, 290, 160, 22);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(310, 470, 140, 22);

        lblEmployeeName3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName3.setText("NAME");
        getContentPane().add(lblEmployeeName3);
        lblEmployeeName3.setBounds(200, 300, 110, 24);

        lblhos1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblhos1.setText("DEPARTMENT");
        getContentPane().add(lblhos1);
        lblhos1.setBounds(140, 420, 150, 24);

        ComboDepts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Laboratory", "Accountant" }));
        ComboDepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDeptsActionPerformed(evt);
            }
        });
        getContentPane().add(ComboDepts);
        ComboDepts.setBounds(310, 410, 140, 22);

        valDept.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valDept);
        valDept.setBounds(480, 420, 180, 20);

        valHosp.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valHosp);
        valHosp.setBounds(460, 360, 180, 20);

        tblHosEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Hospital Name", "Hospital ", "Department", "User ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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
        tblHosEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHosEmployeeMouseClicked(evt);
            }
        });
        tblHosEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblHosEmployeeKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblHosEmployee);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 50, 452, 170);

        btnDel.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnDel.setText("DELETE");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel);
        btnDel.setBounds(440, 530, 180, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/ADMIN BG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHospitalActionPerformed
        // TODO add your handling code here:
        Object hosp = ComboHospital.getSelectedItem();
        

        if (hosp  == null || hosp .toString().equals("")) {
            valHosp.setText("Please Select Blood Group");
            ComboHospital.removeAllItems();
           valHosp.setText(null);
        } else {
            ComboHospital.setSelectedItem("");
        }
        // ComboHospital.addItem("abcd");
        //ComboHospital.addItem("efgh");

    }//GEN-LAST:event_ComboHospitalActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        var valid = true;

        if (!this.validations.ValidateName(txtEmpName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }

//        if (!this.validations.ValidateUsername(txtUsername.getText()) ) {
//            valUsername.setText("Username is Invalid");
//            valid = false;
//        }

        String pass_word = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(pass_word) ) {
            valPassword.setText("Should be 4-12 character long");
            valid = false;
        }

        String emp_name = txtEmpName.getText();
        //int user_id = Integer.valueOf(txtUsername.getText());
        String password = txtPassword.getText();

        //int emp_id = Integer.valueOf(txtEmpID.getText());
        int emp_id = rand.nextInt(1,1000);

        String shos_id = (String) ComboHospital.getSelectedItem();
        int hos_id = Integer.valueOf(shos_id);
        
        int role_id=100; 
        String role_name =(String) ComboDepts.getSelectedItem(); 
        
        System.out.println(role_name);
        
        if(role_name.equals("Administrator"))
        {
            role_id = 2; 
        }
        if(ComboDepts.getSelectedItem().equals("Accountant"))
        {
            role_id = 8; 
        }
        if(ComboDepts.getSelectedItem().equals("Laboratory"))
        {
            role_id = 9; 
        }
        if(role_id ==100)
        {
           JOptionPane.showMessageDialog(this,"Role not selected");
        }


        int user_id = rand.nextInt(1000,2000);
        
        Connection conn = dbconn.getConnection();
        
        String INSERLOGINSSQL = "insert into logins(user_id, pass_word,role_id) values(?,?,?) ";
        String INSERTEMPLOYEESQL = "insert into emphos(emp_id, hos_id,employee_name, user_id) values(?,?,?,?)";

        PreparedStatement stmt1, stmt2;
        try
        {
            stmt1 = conn.prepareStatement(INSERLOGINSSQL);
            stmt2 = conn.prepareStatement(INSERTEMPLOYEESQL);

            stmt1.setInt(1,user_id);
            stmt1.setString(2,password);
            stmt1.setInt(3,role_id);
            
            System.out.println("inserted into logins!");

            stmt2.setInt(1,emp_id);
            stmt2.setInt(2,hos_id);
            
            stmt2.setString(3, emp_name);
            stmt2.setInt(4,user_id);

            stmt1.executeUpdate();
            stmt2.executeUpdate();

        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHosEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this,"Employee Created");

        //stop
        txtEmpName.setText("");
        txtEmpID.setText("");
       // txtUsername.setText("");
        txtPassword.setText("");
        ComboDepts.setSelectedItem("");

        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ComboDeptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDeptsActionPerformed
         //TODO add your handling code here:
        Object hosp_department = ComboDepts.getSelectedItem();
        

        if (hosp_department  == null || hosp_department .toString().equals("")) {
            valDept.setText("Please Select ");
            ComboDepts.removeAllItems();
           valDept.setText(null);
        } else {
            ComboDepts.setSelectedItem("");
        }
    }//GEN-LAST:event_ComboDeptsActionPerformed

    private void tblHosEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHosEmployeeMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblHosEmployee.getModel();

        // set data to textfield when raw is selected

        String emp_id = tblModel.getValueAt(tblHosEmployee.getSelectedRow(),0).toString();
                String emp_name = tblModel.getValueAt(tblHosEmployee.getSelectedRow(),1).toString();

     String ComboHospital = tblModel.getValueAt(tblHosEmployee.getSelectedRow(),2).toString();
        String ComboDepts = tblModel.getValueAt(tblHosEmployee.getSelectedRow(),3).toString();
        //String user_id = tblModel.getValueAt(tblHosEmployee.getSelectedRow(),3).toString();

        txtEmpID.setText(String.valueOf(emp_id));
        txtEmpName.setText(emp_name);
       // ComboDepts.setSelectedItem("");
        //ComboDepts.setSelectedItem("");
        //ComboHospital.getSelectedItem();

        setValidationNull();
    }//GEN-LAST:event_tblHosEmployeeMouseClicked

    private void tblHosEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHosEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHosEmployeeKeyPressed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        Connection conn = dbconn.getConnection();
        int emp_id=(int) Integer.valueOf(txtEmpID.getText());

        conn = dbconn.getConnection();
        String selectSql = "Delete from emphos where emp_id=?";
        PreparedStatement stmt;
        try {

            stmt=conn.prepareStatement(selectSql);

            stmt.setInt(1, emp_id);

            stmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminHosEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Employee Deleted");
        
        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHosEmployee().setVisible(true);
            }
        });
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHosEmployee.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         /**
                  String selectSql = "select e.emp_id, e.employee_name,e.hos_id,r.role_name, l.user_id \n" +
"from emphos e join logins l on e.user_id = l.user_id \n" +
"join roles r on l.role_id = r.role_id";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet3 = stmt.executeQuery(selectSql);

             while (resultSet3.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet3.getInt(1);
             row[1]=resultSet3.getString(2);
            row[2]=resultSet3.getInt(3);
            
            row[3]=resultSet3.getString(4);
          row[4] = resultSet3.getString(5);
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       */
         String selectSql = "select e.emp_id, e.employee_name, e.hos_id, l.user_id " +
"from emphos e join logins l on e.user_id = l.user_id";

Statement stmt;
try {
    stmt = conn.createStatement();

    resultSet3 = stmt.executeQuery(selectSql);

    while (resultSet3.next()) {
        Object[] row = new Object[4];  // Update the array size to 4 as only 4 columns are selected
        row[0] = resultSet3.getInt(1);
        row[1] = resultSet3.getString(2);
        row[2] = resultSet3.getInt(3);
        row[3] = resultSet3.getString(4);

        model.addRow(row);
    }

    conn.close();

} 
       catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setTextNull() {
    txtEmpID.setText(null);
        txtEmpName.setText(null);
//       ComboPlasmaCenter.setSelection(null);
         
    }
    private void setValidationNull() {
        valName.setText(null);
         //valPC.setText(null);
        valPassword.setText(null);
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDepts;
    private javax.swing.JComboBox<String> ComboHospital;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeName1;
    private javax.swing.JLabel lblEmployeeName2;
    private javax.swing.JLabel lblEmployeeName3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblhos;
    private javax.swing.JLabel lblhos1;
    private javax.swing.JTable tblHosEmployee;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel valDept;
    private javax.swing.JLabel valHosp;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    // End of variables declaration//GEN-END:variables

    private void UpdateComboxes() {
       Connection conn = dbconn.getConnection();
        
        String SELECTSQL2 = "SELECT HOS_ID FROM HOSPITAL";

        PreparedStatement stmt2; 
        try
        {
            
            stmt2 = conn.prepareStatement(SELECTSQL2);
            
            resultSet2 = stmt2.executeQuery(); 
            
            
            
            while(resultSet2.next())
            {
                ComboHospital.addItem(resultSet2.getString(1));
            }
       
             
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHosEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
