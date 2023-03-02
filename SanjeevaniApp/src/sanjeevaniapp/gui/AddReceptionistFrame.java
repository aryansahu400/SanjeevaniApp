/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sanjeevaniapp.gui;

import java.util.Map;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dao.ReceptionistDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.util.EncryptData;
import sanjeevaniapp.pojo.ReceptionistPojo;
import sanjeevaniapp.pojo.UserPojo;

/**
 *
 * @author LENOVO
 */
public class AddReceptionistFrame extends javax.swing.JFrame {
    Map<String,String> unRegisteredReceptionistList;
    String loginId,password;
    public AddReceptionistFrame() {
        initComponents();
        loadIds();       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        baseImage1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblEmployeeId2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcbEmployeeId1 = new javax.swing.JComboBox<>();
        jcbGender1 = new javax.swing.JComboBox<>();
        txtReceptionistId = new javax.swing.JTextField();
        txtReceptionistName = new javax.swing.JTextField();
        txtLoginId1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        txtpwd2 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        baseImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/gui/Frame extra streached.jpg"))); // NOI18N
        baseImage1.setText("jLabel1");

        jPanel4.setBackground(new java.awt.Color(235, 243, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblEmployeeId2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmployeeId2.setText("Employee ID");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Login ID");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Password");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Retype Password");

        jcbEmployeeId1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbEmployeeId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEmployeeId1ActionPerformed(evt);
            }
        });

        jcbGender1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbGender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        txtReceptionistId.setEditable(false);
        txtReceptionistId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtReceptionistId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceptionistIdActionPerformed(evt);
            }
        });

        txtReceptionistName.setEditable(false);
        txtReceptionistName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLoginId1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Receptionist Id");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmployeeId2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLoginId1)
                    .addComponent(txtReceptionistName)
                    .addComponent(txtReceptionistId)
                    .addComponent(jcbGender1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbEmployeeId1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeId2)
                    .addComponent(jcbEmployeeId1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceptionistId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceptionistName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtLoginId1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtpwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jcbGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/gui/doctor checking patient.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addContainerGap())
        );

        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(baseImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 1530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(baseImage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(btnBack)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEmployeeId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEmployeeId1ActionPerformed
        if(jcbEmployeeId1.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "All receptionists added");
//            new ManageReceptionistsFrame().setVisible(true);
//            this.dispose();
            return;
        }
        String id=jcbEmployeeId1.getSelectedItem().toString();
        txtReceptionistName.setText(unRegisteredReceptionistList.get(id));
        
        try {
            txtReceptionistId.setText(ReceptionistDao.getNewReceptionistId());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Data base error in add receptionist frame: "+ex.getMessage());
        }
    }//GEN-LAST:event_jcbEmployeeId1ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null, "Please enter all the values");
            return;
        }
        String result=validatePassword();
        if(result!=null){
            JOptionPane.showMessageDialog(null, result);
            return;
        }
        UserPojo user=new UserPojo();
        ReceptionistPojo receptionist= new ReceptionistPojo();
        user.setLoginId(loginId);
        user.setPassword(password);
        user.setUserName(txtReceptionistName.getText());
        user.setUserType("RECEPTIONIST");
        
        receptionist.setGender(jcbGender1.getSelectedItem().toString());
        receptionist.setReceptionistId(txtReceptionistId.getText());
        receptionist.setReceptionistName(txtReceptionistName.getText());
        
        boolean response1=false,response2=false;
        try{
            response1=UserDao.addUser(user);
            response2=ReceptionistDao.addReceptionist(receptionist);
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error in Add Receptionist frame: "+e.getMessage());
            return;
        }
        if(response1 && response2){
            JOptionPane.showMessageDialog(null, "Receptionist added successfully");
            clearInputs();
        }else{
            JOptionPane.showMessageDialog(null, "Receptionist added successfully");
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ManageReceptionistsFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtReceptionistIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceptionistIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceptionistIdActionPerformed

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
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baseImage1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jcbEmployeeId1;
    private javax.swing.JComboBox<String> jcbGender1;
    private javax.swing.JLabel lblEmployeeId2;
    private javax.swing.JTextField txtLoginId1;
    private javax.swing.JTextField txtReceptionistId;
    private javax.swing.JTextField txtReceptionistName;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JPasswordField txtpwd2;
    // End of variables declaration//GEN-END:variables

    private void loadIds() {
        try{
            unRegisteredReceptionistList=EmpDao.getUnregisteredReceptionists();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Database in Add receptionist Frame: "+e.getMessage());
            e.printStackTrace();
        }
        for(String id:unRegisteredReceptionistList.keySet()){
            jcbEmployeeId1.addItem(id);
        }
    }

    private boolean validateInputs() {
        if((txtLoginId1.getText().trim().isEmpty())|| txtpwd.getPassword().length==0 || txtpwd2.getPassword().length==0)return false;
        loginId=txtLoginId1.getText().trim();
        return true;
    }

    private String validatePassword() {
        char[] p1=txtpwd.getPassword();
        char[] p2=txtpwd2.getPassword();
        if(p1.length<3){
            return "Passwords can not be smaller than 3";
        }
        if(p1.length!=p2.length){
            return "Passwords do not match!";
        }
        for(int i=0;i<p1.length;i++){
            if(p1[i]!=p2[i])return "Passwords do not match!";
        }
        password=EncryptData.encryptString(new String(p1));
        return null;
        
    }

    private void clearInputs() {
        txtpwd.setText("");
        txtpwd2.setText("");
        txtLoginId1.setText("");
        unRegisteredReceptionistList.remove(jcbEmployeeId1.getSelectedItem().toString());
        jcbEmployeeId1.removeItem(jcbEmployeeId1.getSelectedItem());
        
    }

    
}
