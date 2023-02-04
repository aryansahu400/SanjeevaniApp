/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sanjeevaniapp.gui;

import javax.swing.JOptionPane;
import sanjeevaniapp.dbutil.EncryptData;
import java.sql.SQLException;
import javax.swing.JFrame;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.dbutil.UserProfile;
import sanjeevaniapp.pojo.User;

/**
 *
 * @author LENOVO
 */
public class LoginFrame extends javax.swing.JFrame {

    private String password;
    private String loginId;
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BasePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        utilityPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbDoctor = new javax.swing.JRadioButton();
        jrbReceptionist = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/gui/admin page.jpg"))); // NOI18N

        utilityPanel.setBackground(new java.awt.Color(235, 243, 254));
        utilityPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("login ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("User Type");

        txtLoginId.setBackground(new java.awt.Color(204, 224, 251));
        txtLoginId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPassword.setBackground(new java.awt.Color(204, 224, 251));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbAdmin.setText("Admin");

        buttonGroup1.add(jrbDoctor);
        jrbDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbDoctor.setText("Doctor");

        buttonGroup1.add(jrbReceptionist);
        jrbReceptionist.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbReceptionist.setText("Receptionist");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Credentials");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnQuit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout utilityPanelLayout = new javax.swing.GroupLayout(utilityPanel);
        utilityPanel.setLayout(utilityPanelLayout);
        utilityPanelLayout.setHorizontalGroup(
            utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilityPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utilityPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(jrbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343)
                        .addComponent(jrbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(utilityPanelLayout.createSequentialGroup()
                        .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(utilityPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(utilityPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        utilityPanelLayout.setVerticalGroup(
            utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, utilityPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbAdmin)
                        .addComponent(jrbDoctor)
                        .addComponent(jrbReceptionist)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(utilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnQuit))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(utilityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utilityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null,"Please input login id and password!");
            return;
        }
        String userType=getUserType();
        if(userType==null){
            JOptionPane.showMessageDialog(null,"Please select a USERTYPE!");
            return;
        }
        try{
            User user=new User();
            user.setLoginId(loginId);
            user.setPassword(password);
            user.setUserType(userType);
            String userName=UserDao.validateUser(user);
            if(userName!=null){
                UserProfile pro=new UserProfile();
                pro.setUsername(userName);
                UserProfile.setUserType(userType);
                UserProfile.setLoginId(loginId);
                JFrame optionsFrame=null;
                if(userType.equalsIgnoreCase("admin")){
                   optionsFrame=new AdminOptionFrame();
                 }
                else if(userType.equalsIgnoreCase("receptionist")){
                   optionsFrame=new ReceptionistOptionFrame();
                 }
                else{
                    optionsFrame=new DoctorsOptionFrame();
                }
                
                optionsFrame.setVisible(true);
                this.dispose();
                return;
            }
            JOptionPane.showMessageDialog(null,"INVALID CREDENTAILS");
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"DATABASE ERROR: "+e.getMessage(),"ErrorJ", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        DBConnection.closeConnection();
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbDoctor;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPanel utilityPanel;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        loginId=txtLoginId.getText().trim();
        char[] pwd=txtPassword.getPassword();
        if(loginId.isEmpty()||pwd.length==0){
            return false;
        }else{
            password=new String(EncryptData.encryptString(new String(pwd)));
            System.out.println(password);
            return true;
        }
    }
    private String getUserType() {
        if(jrbAdmin.isSelected())
            return jrbAdmin.getText();
        else if(jrbDoctor.isSelected())
            return jrbDoctor.getText();
        else if(jrbReceptionist.isSelected())
            return jrbReceptionist.getText();
        return null;
    }
}
