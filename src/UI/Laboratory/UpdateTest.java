/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Laboratory;
import DBUTIL.DBUTIL;
import MODEL.HOSPITAL; 
import UI.LoginScreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nitish
 */
public class UpdateTest extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTest
     */
     ResultSet resultSet1, resultSet2= null;
    DBUTIL dbconn= new DBUTIL();
    public static int thishos_id = HOSPITAL.getHos_id();
    Random rand = new Random(); 
    public UpdateTest() {
        initComponents();
        populateTable();
        updateCombox(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        comboxStatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        comboxReq_id = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttest_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TEST ID", "REQ ID", "BLOOD GROUP", "QTY", "PLATELET RICH PLASMA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tblLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 690, 150);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel1.setText("REQ ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 80, 70, 18);

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel3.setText("PLATELET RICH PLASMA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 420, 180, 18);

        btnCreate.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnCreate.setText("CREATE TEST ");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(270, 130, 170, 30);

        comboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        comboxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxStatusActionPerformed(evt);
            }
        });
        getContentPane().add(comboxStatus);
        comboxStatus.setBounds(340, 420, 110, 22);

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel4.setText("LABORATORY");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 10, 330, 40);

        jButton2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 40, 130, 25);

        getContentPane().add(comboxReq_id);
        comboxReq_id.setBounds(390, 80, 72, 22);

        btnUpdate.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(300, 470, 120, 30);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel2.setText("TEST ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 370, 55, 18);

        txttest_id.setEditable(false);
        txttest_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttest_idActionPerformed(evt);
            }
        });
        getContentPane().add(txttest_id);
        txttest_id.setBounds(340, 370, 98, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Laboratory/labtests.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1000, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.hide();
     LoginScreen frame = new LoginScreen();
     frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLab.getModel();
        int SelectedRowIndex=tblLab.getSelectedRow();
        
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to generate a lab test ");
            
        return;
        }
        String strtest_id = txttest_id.getText(); 
        int test_id = Integer.valueOf(strtest_id); 
        
        Connection conn = dbconn.getConnection();
        
        String updateSQL = "update labtest set inf_status=? where test_id =?";
        String inf_status =(String) comboxStatus.getSelectedItem(); 
        
        
        PreparedStatement stmt1; 
        try
        {
            stmt1 = conn.prepareStatement(updateSQL);
            stmt1.setString(1,inf_status);
            stmt1.setInt(2,test_id);
            stmt1.executeQuery();
           
//            while(resultSet2.next())
//            {
//                comboxReq_id.addItem(resultSet2.getString(1));
//            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(UpdateTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        populateTable(); 
        txttest_id.setText("");
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String sreq_id = (String) comboxReq_id.getSelectedItem(); 
        int req_id = Integer.valueOf(sreq_id); 
        
        String checksql = "select count(*) test_id from labtest where request_id = ?"; 
        PreparedStatement stmt1, stmt2;
        Connection conn = dbconn.getConnection();
        try
        {
            stmt1 = conn.prepareStatement(checksql);
            stmt1.setInt(1,req_id); 
            resultSet1 = stmt1.executeQuery(); 
            int count = 0; 
            resultSet1.next(); 
            if(resultSet1.getInt(1)!=0)
            {
               JOptionPane.showMessageDialog(this , "A test has already been generated for that Request ID. ");
               return; 
            }
            else
            {
                String createTest = "insert into labtest values(?,?,?)"; 
                int test_id = rand.nextInt(); 
                String inf_status = "Testing"; 
                
                stmt2 = conn.prepareStatement(createTest);
                stmt2.setInt(1, test_id);
                stmt2.setInt(2,req_id); 
                stmt2.setString(3, inf_status);
                
                stmt2.executeQuery();
                JOptionPane.showMessageDialog(this , "Test generated ");
                
            }
            
        }
        catch (SQLException ex)
         {
             Logger.getLogger(UpdateTest.class.getName()).log(Level.SEVERE, null, ex);       
         }
        
        populateTable(); 
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxStatusActionPerformed

    private void tblLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLabMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblLab.getModel();

        // set data to textfield when raw is selected

        String test_idid = tblModel.getValueAt(tblLab.getSelectedRow(),0).toString();
        
        txttest_id.setText(test_idid);
        
    }//GEN-LAST:event_tblLabMouseClicked

    private void txttest_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttest_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttest_idActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboxReq_id;
    private javax.swing.JComboBox<String> comboxStatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLab;
    private javax.swing.JTextField txttest_id;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblLab.getModel();
        int SelectedRowIndex=tblLab.getSelectedRow();
        
        Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
        
         
        String selectSql = "select t.test_id, r.request_id ,r.blood_group, r.qty, t.inf_status from labtest t join hpcrequest r on t.request_id = r.request_id";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet1 = stmt.executeQuery(selectSql);

             while (resultSet1.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet1.getInt(1);
            row[1]=resultSet1.getInt(2);
            row[2] = resultSet1.getString(3);
            row[3] = resultSet1.getInt(4);
            row[4]=resultSet1.getString(5);
            
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(UpdateTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateCombox() {
        Connection conn = dbconn.getConnection();
        String SELECTSQL1 = "select r.request_id from hpcrequest r join patients p on p.pat_id = r.pat_id join doctors d on d.doc_id =p.doc_id where d.hos_id=? and r.status='Recieved' ";
       
        PreparedStatement stmt1; 
        try
        {
            stmt1 = conn.prepareStatement(SELECTSQL1);
            stmt1.setInt(1,thishos_id); 
             resultSet2 = stmt1.executeQuery();
           
            while(resultSet2.next())
            {
                comboxReq_id.addItem(resultSet2.getString(1));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(UpdateTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
