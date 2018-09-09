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
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.SponsorWorkRequest;
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
public class NGOManageRequestSponsorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManageRequestSponsorJPanel
     */

    UserAccount account; 
    ClinicOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    JPanel userProcessContainer;
    
    public NGOManageRequestSponsorJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise, EcoSystem business, UserAccount account) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business =business;
        populateWorkQueueTable();
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDateNGOSponsor = new javax.swing.JTextField();
        txtTimeNGOSponsor = new javax.swing.JTextField();
        txtVenueNGOSponsor = new javax.swing.JTextField();
        txtAmountNGOSponsor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNgoManageRequestSponsor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteRequestSponser = new javax.swing.JButton();
        btnBackNgoSponsor = new javax.swing.JButton();
        btnCreateSponsor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("NGO Manage Request ");

        jLabel3.setText("Blood Donation Camp");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setText("Purpose :");

        jLabel5.setBackground(new java.awt.Color(102, 217, 255));
        jLabel5.setText("Date ");

        jLabel6.setBackground(new java.awt.Color(102, 217, 255));
        jLabel6.setText("Time ");

        jLabel7.setBackground(new java.awt.Color(102, 217, 255));
        jLabel7.setText("Venue :");

        jLabel8.setBackground(new java.awt.Color(102, 217, 255));
        jLabel8.setText("Requested Amount :");

        txtAmountNGOSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountNGOSponsorActionPerformed(evt);
            }
        });
        txtAmountNGOSponsor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountNGOSponsorKeyPressed(evt);
            }
        });

        tblNgoManageRequestSponsor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Amount", "Date of requirement", "Time of requirement", "Venue", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNgoManageRequestSponsor);
        if (tblNgoManageRequestSponsor.getColumnModel().getColumnCount() > 0) {
            tblNgoManageRequestSponsor.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel4.setText("Request for Sponsorship");

        btnDeleteRequestSponser.setBackground(new java.awt.Color(102, 217, 255));
        btnDeleteRequestSponser.setText("Delete Request");
        btnDeleteRequestSponser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRequestSponserActionPerformed(evt);
            }
        });

        btnBackNgoSponsor.setBackground(new java.awt.Color(102, 217, 255));
        btnBackNgoSponsor.setText("<< Back");
        btnBackNgoSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNgoSponsorActionPerformed(evt);
            }
        });

        btnCreateSponsor.setBackground(new java.awt.Color(102, 217, 255));
        btnCreateSponsor.setText("Create Request");
        btnCreateSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSponsorActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(btnBackNgoSponsor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteRequestSponser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDateNGOSponsor)
                                .addComponent(txtTimeNGOSponsor)
                                .addComponent(txtVenueNGOSponsor)
                                .addComponent(txtAmountNGOSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnCreateSponsor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateNGOSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimeNGOSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVenueNGOSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmountNGOSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(btnCreateSponsor)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackNgoSponsor)
                    .addComponent(btnDeleteRequestSponser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) tblNgoManageRequestSponsor.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof SponsorWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = ((SponsorWorkRequest) work).getRequestedAmount();
            row[1] = ((SponsorWorkRequest) work).getRequestedDate();
            row[2] = ((SponsorWorkRequest) work).getRequestedTime();
            row[3] = ((SponsorWorkRequest) work).getVenue();
            row[4] = work;
            model.addRow(row);
           }
        }
    }
    
    private void btnCreateSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSponsorActionPerformed
        // TODO add your handling code here:
           if(!txtDateNGOSponsor.getText().equals("")){
            SponsorWorkRequest request= new SponsorWorkRequest();
            if(Validator.isDateValid(txtDateNGOSponsor.getText())){
                //request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
                request.setRequestedAmount(Double.parseDouble(txtAmountNGOSponsor.getText()));
                request.setVenue(txtVenueNGOSponsor.getText());
                request.setRequestedDate(txtDateNGOSponsor.getText());
                request.setRequestedTime(txtTimeNGOSponsor.getText());
                request.setStatus("Requested");
                request.setSender(account);
                account.getWorkQueue().getWorkRequestList().add(request);
            business.getWorkQueue().getWorkRequestList().add(request);
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            }
             else{
              JOptionPane.showMessageDialog(null, "Enter date in MM/DD/YYYY format", "Warning", JOptionPane.WARNING_MESSAGE);          
             }
            
            //organization.getWorkQueue().getWorkRequestList().add(request);
            
            populateWorkQueueTable();
        }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateSponsorActionPerformed

    private void txtAmountNGOSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountNGOSponsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountNGOSponsorActionPerformed

    private void btnDeleteRequestSponserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRequestSponserActionPerformed
        // TODO add your handling code here:
         int selectedRow= tblNgoManageRequestSponsor.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblNgoManageRequestSponsor.getValueAt(selectedRow, 4);

           // s.getWorkQueue().getWorkRequestList().remove(p);
            //organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);
           
            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
             populateWorkQueueTable();
        }
    
    }//GEN-LAST:event_btnDeleteRequestSponserActionPerformed

    private void btnBackNgoSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNgoSponsorActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackNgoSponsorActionPerformed

    private void txtAmountNGOSponsorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountNGOSponsorKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, txtAmountNGOSponsor);
    }//GEN-LAST:event_txtAmountNGOSponsorKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackNgoSponsor;
    private javax.swing.JButton btnCreateSponsor;
    private javax.swing.JButton btnDeleteRequestSponser;
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
    private javax.swing.JTable tblNgoManageRequestSponsor;
    private javax.swing.JTextField txtAmountNGOSponsor;
    private javax.swing.JTextField txtDateNGOSponsor;
    private javax.swing.JTextField txtTimeNGOSponsor;
    private javax.swing.JTextField txtVenueNGOSponsor;
    // End of variables declaration//GEN-END:variables
}