/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchLab;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.ResearchLabOrganization;
import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.ResearchLabWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Yash
 */
public class ManageVaccineListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVaccineListJPanel
     */
    JPanel userProcessContainer; 
    EcoSystem business;
    UserAccount account;
    Enterprise enterprise;
    ResearchLabOrganization organization;
    ManageVaccineListJPanel(JPanel userProcessContainer, EcoSystem business,UserAccount account, ResearchLabOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        populateCombo();
        //populateVaccineRequestTable();
    }
    
    public void populateCombo()
    {
        cmbVaccineName.removeAllItems();
        for(Vaccine v:business.getVaccineList().getVaccineList())
        {
            cmbVaccineName.addItem(v);
        }
    }
    public void populateVaccineRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblViewVaccine.getModel();
        model.setRowCount(0);
        
        for (WorkRequest work : enterprise.getWorkQueue().getWorkRequestList())
        {
            if(work instanceof ResearchLabWorkRequest)
            {
                Object[] row = new Object[4];
                row[0] = work.getVaccine().getVaccineName();
                row[1] = work.getVaccine().getVaccineId();
                row[2] = work.getVaccine().getDisease();
                row[3] = work;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewVaccine = new javax.swing.JTable();
        btnDeleteVaccine = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCDCApprovalRequest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbVaccineName = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("View Vaccines:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Manage Vaccine List");

        tblViewVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine ID", "Disease", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewVaccine);

        btnDeleteVaccine.setBackground(new java.awt.Color(102, 217, 255));
        btnDeleteVaccine.setText("Delete Vaccine");

        jButton1.setBackground(new java.awt.Color(102, 217, 255));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCDCApprovalRequest.setBackground(new java.awt.Color(102, 217, 255));
        btnCDCApprovalRequest.setText("CDC Approval Request");
        btnCDCApprovalRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDCApprovalRequestActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 217, 255));
        jLabel3.setText("Vaccine Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDeleteVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(236, 236, 236)
                                            .addComponent(jLabel2))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 29, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnCDCApprovalRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteVaccine)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCDCApprovalRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCDCApprovalRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDCApprovalRequestActionPerformed
        // TODO add your handling code here:
        ResearchLabWorkRequest request = new ResearchLabWorkRequest();     
        request.setVaccine((Vaccine)cmbVaccineName.getSelectedItem());
        request.setStatus("Requested");
        //request.setSender(account);
        //organization.getWorkQueue().getWorkRequestList().add(request);
        //account.getWorkQueue().getWorkRequestList().add(request);
        business.getWorkQueue().getWorkRequestList().add(request);
        enterprise.getWorkQueue().getWorkRequestList().add(request);
        populateVaccineRequestTable();
    }//GEN-LAST:event_btnCDCApprovalRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCDCApprovalRequest;
    private javax.swing.JButton btnDeleteVaccine;
    private javax.swing.JComboBox cmbVaccineName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewVaccine;
    // End of variables declaration//GEN-END:variables
}
