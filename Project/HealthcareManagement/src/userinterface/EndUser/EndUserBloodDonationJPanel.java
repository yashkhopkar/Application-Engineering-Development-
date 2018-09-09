/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EndUser;

import Business.Blood.Blood;
import Business.CDC.Disease;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodWorkRequest;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author satvika shetty
 */
public class EndUserBloodDonationJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ClinicOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    /**
     * Creates new form EndUserBloodDonationJPanel
     */
   

    EndUserBloodDonationJPanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization clinicOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = clinicOrganization;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business; 
        populateComboBox();
        populateTable();
        btnCompleteDonation.setEnabled(false);
    }

    public void populateComboBox(){
        for (Network network : business.getNetworkList()) {
            jComboBox1.addItem(network.toString());
        }
    }
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblHospitalBloodDonation.getModel();
        
        model.setRowCount(0);
        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkRequest){ 
            Object[] row = new Object[3];
            //row[0] = ((NGOWorkRequest) work).getNoOfDocRequired();
           
            row[0] = ((NGOWorkRequest) work).getVenue();
            row[1] = ((NGOWorkRequest) work).getRequestedDate();
            row[2] = ((NGOWorkRequest) work).getRequestedTime();
            //row[4] = work;
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalBloodDonation = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCompleteDonation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfBloodPackets = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tblHospitalBloodDonation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitalBloodDonation);
        if (tblHospitalBloodDonation.getColumnModel().getColumnCount() > 0) {
            tblHospitalBloodDonation.getColumnModel().getColumn(0).setResizable(false);
            tblHospitalBloodDonation.getColumnModel().getColumn(1).setResizable(false);
            tblHospitalBloodDonation.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 217, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("                         Blood Donation Panel");

        jLabel2.setText("Blood donation venues:");

        btnCompleteDonation.setBackground(new java.awt.Color(102, 217, 255));
        btnCompleteDonation.setText("Complete Blood Donation");
        btnCompleteDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteDonationActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 217, 255));
        jLabel3.setText("Select State");

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setText("User Blood Group:");

        jLabel5.setBackground(new java.awt.Color(102, 217, 255));
        jLabel5.setText("Number of Blood packets from the user:");

        txtNoOfBloodPackets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoOfBloodPacketsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(67, 67, 67)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNoOfBloodPackets, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnCompleteDonation)))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoOfBloodPackets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnAdd)
                .addGap(38, 38, 38)
                .addComponent(btnCompleteDonation)
                .addGap(42, 42, 42)
                .addComponent(btnBack)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
//        Blood blood= business.getBloodList().getBloodList().addBlood();
//        blood.setBloodGroup(txtBloodGroup.getText());
//        blood.setNoOfPackets(Integer.parseInt(txtNoOfBloodPackets.getText()));
        //populateDiseaseTable();
        
         //JOptionPane.showMessageDialog(null, "You have successfully added Blood details");
        
        if(!txtBloodGroup.getText().equals("")){
            BloodWorkRequest request= new BloodWorkRequest();
            //request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
            
            //System.out.println(Validator.isDateValid(txtBloodGroup.getText()));
            
                request.setNoOfPackets(Integer.parseInt(txtNoOfBloodPackets.getText()));
                request.setBloodGroup(txtBloodGroup.getText());
                //request.setVenue(txtVenueNGOHospital.getText());
                //request.setRequestedDate(txtDateNGOHospital.getText()); 
                //request.setRequestedTime(txtTimeNGOHospital.getText());
                request.setStatus("Requested");
                request.setSender(account);
                account.getWorkQueue().getWorkRequestList().add(request);
                business.getWorkQueue().getWorkRequestList().add(request);
                enterprise.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Venue and Blood Details Added Successfully", "", JOptionPane.INFORMATION_MESSAGE);
            //organization.getWorkQueue().getWorkRequestList().add(request);
            btnCompleteDonation.setEnabled(true);
            //populateWorkQueueTable();
        }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
         
    }//GEN-LAST:event_btnAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCompleteDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteDonationActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHospitalBloodDonation.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Blood Donation Completed Successfully", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCompleteDonationActionPerformed

    private void txtNoOfBloodPacketsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfBloodPacketsKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, txtNoOfBloodPackets);
    }//GEN-LAST:event_txtNoOfBloodPacketsKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteDonation;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospitalBloodDonation;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtNoOfBloodPackets;
    // End of variables declaration//GEN-END:variables
}