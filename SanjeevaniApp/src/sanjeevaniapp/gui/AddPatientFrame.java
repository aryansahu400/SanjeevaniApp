/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.DoctorsDao;
import sanjeevaniapp.dao.PatientDao;
import sanjeevaniapp.pojo.PatientPojo;

/**
 *
 * @author LENOVO
 */
public class AddPatientFrame extends javax.swing.JFrame {
    PatientPojo patient;
    Date date;
    public AddPatientFrame() {
        initComponents();
        loadDoctorIds();
        LoadNewPatientId();
        loadDate();
        patient=new PatientPojo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jcbDoctorId = new javax.swing.JComboBox<>();
        txtOpd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcbMartialStatus = new javax.swing.JComboBox<>();
        jcbGender = new javax.swing.JComboBox<>();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 52)); // NOI18N
        jLabel2.setText("Sanjeevani App");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/gui/Frame extra streached.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, -1));

        jPanel2.setBackground(new java.awt.Color(235, 243, 254));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("OPD");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Doctor Id");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Age");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("City");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Patient Id");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Address");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jcbDoctorId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDoctorIdActionPerformed(evt);
            }
        });

        txtOpd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("First Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Last Name");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Gender");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Date");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Phone Number");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Martial Status");

        jcbMartialStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbMartialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unmarried", "Married" }));

        jcbGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setText("+91");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOpd, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(jcbDoctorId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCity)
                    .addComponent(txtAddress))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(txtFirstName))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(txtDate))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbMartialStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLastName)))))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMartialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1170, 410));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel3.setText("Add Patient");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/gui/Reception_Image.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 450, 230, -1));

        btnLogout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 720, -1, -1));

        btnHome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 390, 170, -1));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 680, 170, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1262, 720, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDoctorIdActionPerformed
        
    }//GEN-LAST:event_jcbDoctorIdActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       new ReceptionistOptionFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new ReceptionistOptionFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       String valid=validateInputs();
       if(valid!=null){
           JOptionPane.showMessageDialog(null, valid);
           return;
       }
       patient.setAddress(this.txtAddress.getText());
       patient.setAge(Integer.parseInt(this.txtAge.getText()));
       patient.setCity(this.txtCity.getText());
       patient.setDate(new java.sql.Date(date.getTime()));
       patient.setDoctorId(this.jcbDoctorId.getSelectedItem().toString());
       patient.setFirstName(this.txtFirstName.getText());
       patient.setGender(this.jcbGender.getSelectedItem().toString());
       patient.setLastname(this.txtLastName.getText());
       patient.setMobileNo(this.txtPhoneNumber.getText());
       patient.setOpd(this.txtOpd.getText());
       patient.setPatientId(this.txtPatientId.getText());
       patient.setmStatus(this.jcbMartialStatus.getSelectedItem().toString());
       
       new VerifyOtpFrame(patient).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbDoctorId;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JComboBox<String> jcbMartialStatus;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorIds() {
        List<String> list=null;
        try {
            list=DoctorsDao.getAllDoctorIds();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Databsae error in Add Patient Frame: "+ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        for(String id:list){
            this.jcbDoctorId.addItem(id);
        }
    }

    private void LoadNewPatientId() {
        try {
            this.txtPatientId.setText(PatientDao.getNextId());
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Databsae error in Add Patient Frame: "+ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void loadDate() {
        date=new Date();
        this.txtDate.setText(date.toString());
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
        this.txtDate.setText(sdf.format(date));
    }
    
    public String validateInputs(){
        if(txtAddress.getText().trim().isEmpty() ||txtAge.getText().trim().isEmpty() || txtCity.getText().trim().isEmpty() || txtFirstName.getText().trim().isEmpty() || txtLastName.getText().trim().isEmpty()||txtOpd.getText().trim().isEmpty()||txtPatientId.getText().trim().isEmpty()||txtPhoneNumber.getText().trim().isEmpty()){ 
            return "Please fill all the fields";
        }
        String number=txtPhoneNumber.getText().trim();
        if(number.length()!=10)return "Phone number can only be of 10 digits";
        else{
            for(int i=0;i<number.length();i++){
                if( number.charAt(i)>'9' ||number.charAt(i)<'0'){
                    return "Phone number can not contain alphabets";
                }
            }
        }
        return null;
    }
}
