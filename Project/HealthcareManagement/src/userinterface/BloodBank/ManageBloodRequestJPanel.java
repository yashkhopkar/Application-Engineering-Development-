/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBank;

import Business.Blood.Blood;
import Business.Clinic.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodPurchaseWorkRequest;
import Business.WorkQueue.BloodWorkRequest;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.SponsorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shubhisharma
 */
public class ManageBloodRequestJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    //private ClinicOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    /**
     * Creates new form ManageBloodRequestJPanel
     */
   
    public ManageBloodRequestJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise, UserAccount account, EcoSystem business) {
      initComponents();
      this.userProcessContainer = userProcessContainer;
        //this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        populateTable();
    }

     public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblReqBloodBank.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof BloodPurchaseWorkRequest){ 
            Object[] row = new Object[3];
            row[0] = ((BloodPurchaseWorkRequest) work).getBloodGroup();
            row[1] = ((BloodPurchaseWorkRequest) work).getNoOfPackets();
            /*row[2] = ((NGOWorkRequest) work).getRequestedTime();
            row[3] = ((NGOWorkRequest) work).getVenue();*/
            row[2] = work;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReqBloodBank = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Manage Blood Request");

        tblReqBloodBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Group", "Number of Blood Packets", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReqBloodBank);
        if (tblReqBloodBank.getColumnModel().getColumnCount() > 0) {
            tblReqBloodBank.getColumnModel().getColumn(0).setResizable(false);
            tblReqBloodBank.getColumnModel().getColumn(1).setResizable(false);
            tblReqBloodBank.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Request from End user");

        jButton1.setBackground(new java.awt.Color(102, 217, 255));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(102, 217, 255));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(102, 217, 255));
        btnApprove.setText("Approve Request");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(102, 217, 255));
        btnReject.setText("Reject Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 217, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAssign)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnApprove)
                            .addGap(18, 18, 18)
                            .addComponent(btnReject)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnReject)
                    .addComponent(btnApprove)
                    .addComponent(btnAssign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
           int selectedRow= tblReqBloodBank.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         BloodPurchaseWorkRequest p=(BloodPurchaseWorkRequest) tblReqBloodBank.getValueAt(selectedRow, 2);

         p.setStatus("Pending");
         p.setReceiver(account);
         
       populateTable();
       
         }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblReqBloodBank.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to approve the Request", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
             BloodPurchaseWorkRequest p=(BloodPurchaseWorkRequest) tblReqBloodBank.getValueAt(selectedRow, 2);
             //if (p.getStatus().equalsIgnoreCase("Pending")) {
                if(p.getStatus().equalsIgnoreCase("Rejected")){
                 JOptionPane.showMessageDialog(null, "Cannot Approve the Rejected request", "Warning", JOptionPane.WARNING_MESSAGE);    
                 }else if(p.getStatus().equalsIgnoreCase("Approved")){
                  JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);   
                 }else {
                    if (p.getStatus().equalsIgnoreCase("Pending")) {
                        p.setStatus("Approved");
                        p.setReceiver(account);
                }else{
                 JOptionPane.showMessageDialog(null, "Please assign first");
                }
           
                }
                 populateTable();
         }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblReqBloodBank.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         BloodPurchaseWorkRequest p=(BloodPurchaseWorkRequest) tblReqBloodBank.getValueAt(selectedRow, 2);
            if(p.getStatus().equalsIgnoreCase("Approved")){
                 JOptionPane.showMessageDialog(null, "Cannot Reject the Approved request", "Warning", JOptionPane.WARNING_MESSAGE);
             }else if(p.getStatus().equalsIgnoreCase("Rejected")){
                 
                 JOptionPane.showMessageDialog(null, "Cannot Reject the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
             }else{
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    p.setStatus("Rejected");
                    p.setReceiver(account);
                 }else{
                 JOptionPane.showMessageDialog(null, "Please assign first");
              }
            }
            populateTable();
         }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow= tblReqBloodBank.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            BloodPurchaseWorkRequest p=(BloodPurchaseWorkRequest) tblReqBloodBank.getValueAt(selectedRow, 2);

           // s.getWorkQueue().getWorkRequestList().remove(p);
            //organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);
            
            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReqBloodBank;
    // End of variables declaration//GEN-END:variables
}
