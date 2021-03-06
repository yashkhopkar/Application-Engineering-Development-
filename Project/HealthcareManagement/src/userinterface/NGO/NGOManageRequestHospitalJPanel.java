/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author shubhisharma
 */
public class NGOManageRequestHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManageRequestJPanel
     */
    UserAccount account; 
    ClinicOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    JPanel userProcessContainer;
   
    
    public NGOManageRequestHospitalJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise, EcoSystem business, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.enterprise = enterprise;
        this.account= account;
        this.business= business;
        populateWorkQueueTable();
        //this.organization= organization;
    }
    
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) tblNgoManageRequestHospital.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = ((NGOWorkRequest) work).getNoOfDocRequired();
            row[1] = ((NGOWorkRequest) work).getRequestedDate();
            row[2] = ((NGOWorkRequest) work).getRequestedTime();
            row[3] = ((NGOWorkRequest) work).getVenue();
            row[4] = work;
            model.addRow(row);
           }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNgoManageRequestHospital = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtDateNGOHospital = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTimeNGOHospital = new javax.swing.JTextField();
        txtVenueNGOHospital = new javax.swing.JTextField();
        txtDoctorsNGOHospital = new javax.swing.JTextField();
        btnBackNgoHospital = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        btnDeleteReqNgo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("NGO Manage Request");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setText("Purpose :");

        jLabel3.setText("Blood Donation Camp");

        jLabel4.setText("Request for Doctors");

        tblNgoManageRequestHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No of Doctors required", "Date of requirement", "Time of requirement", "Venue", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNgoManageRequestHospital);
        if (tblNgoManageRequestHospital.getColumnModel().getColumnCount() > 0) {
            tblNgoManageRequestHospital.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setBackground(new java.awt.Color(102, 217, 255));
        jLabel5.setText("Date");

        txtDateNGOHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateNGOHospitalActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 217, 255));
        jLabel6.setText("Time ");

        jLabel7.setBackground(new java.awt.Color(102, 217, 255));
        jLabel7.setText("Venue :");

        jLabel8.setBackground(new java.awt.Color(102, 217, 255));
        jLabel8.setText("Number of Doctors Required :");

        txtDoctorsNGOHospital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoctorsNGOHospitalKeyPressed(evt);
            }
        });

        btnBackNgoHospital.setBackground(new java.awt.Color(102, 217, 255));
        btnBackNgoHospital.setText("<< Back");
        btnBackNgoHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNgoHospitalActionPerformed(evt);
            }
        });

        btnCreateHospital.setBackground(new java.awt.Color(102, 217, 255));
        btnCreateHospital.setText("Create Request");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnDeleteReqNgo.setBackground(new java.awt.Color(102, 217, 255));
        btnDeleteReqNgo.setText("Delete Request");
        btnDeleteReqNgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqNgoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 217, 255));
        jLabel9.setText("(MM/DD/YYYY)");

        jLabel10.setBackground(new java.awt.Color(102, 217, 255));
        jLabel10.setText("(HH:MM)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBackNgoHospital)
                        .addGap(440, 440, 440)
                        .addComponent(btnDeleteReqNgo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(btnCreateHospital))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDateNGOHospital)
                                    .addComponent(txtTimeNGOHospital)
                                    .addComponent(txtVenueNGOHospital)
                                    .addComponent(txtDoctorsNGOHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateNGOHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimeNGOHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVenueNGOHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDoctorsNGOHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnCreateHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackNgoHospital)
                    .addComponent(btnDeleteReqNgo))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        if(!txtDateNGOHospital.getText().equals("")){
            NGOWorkRequest request= new NGOWorkRequest();
            //request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
            
            System.out.println(Validator.isDateValid(txtDateNGOHospital.getText()));
            if(Validator.isDateValid(txtDateNGOHospital.getText())){
                request.setNoOfDocRequired(Integer.parseInt(txtDoctorsNGOHospital.getText()));
                request.setVenue(txtVenueNGOHospital.getText());
                request.setRequestedDate(txtDateNGOHospital.getText()); 
                request.setRequestedTime(txtTimeNGOHospital.getText());
                request.setStatus("Requested");
                request.setSender(account);
                account.getWorkQueue().getWorkRequestList().add(request);
                business.getWorkQueue().getWorkRequestList().add(request);
                enterprise.getWorkQueue().getWorkRequestList().add(request);
            }else{
                JOptionPane.showMessageDialog(null, "Enter date in MM/DD/YYYY format", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            //organization.getWorkQueue().getWorkRequestList().add(request);
           
            populateWorkQueueTable();
        }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnBackNgoHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNgoHospitalActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackNgoHospitalActionPerformed

    private void btnDeleteReqNgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqNgoActionPerformed
        // TODO add your handling code here:
                                                 
        // TODO add your handling code here:
        int selectedRow= tblNgoManageRequestHospital.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblNgoManageRequestHospital.getValueAt(selectedRow, 4);

           // s.getWorkQueue().getWorkRequestList().remove(p);
            //organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);
           
            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
             populateWorkQueueTable();
        }
    
    }//GEN-LAST:event_btnDeleteReqNgoActionPerformed

    private void txtDateNGOHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateNGOHospitalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDateNGOHospitalActionPerformed

    private void txtDoctorsNGOHospitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorsNGOHospitalKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, txtDoctorsNGOHospital);
    }//GEN-LAST:event_txtDoctorsNGOHospitalKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackNgoHospital;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnDeleteReqNgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNgoManageRequestHospital;
    private javax.swing.JTextField txtDateNGOHospital;
    private javax.swing.JTextField txtDoctorsNGOHospital;
    private javax.swing.JTextField txtTimeNGOHospital;
    private javax.swing.JTextField txtVenueNGOHospital;
    // End of variables declaration//GEN-END:variables
}
