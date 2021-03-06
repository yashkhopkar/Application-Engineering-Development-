
import Business.AirlineDirectory;
import Business.Airliner;
import UserInterface.ManageAirliners.ManageAirlinersJPanel;
import UserInterface.ManageCustomers.SearchBestFlightsJPanel;
import UserInterface.ManageTravelAgency.ManageTravelAgencyJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
public class TravelAgencyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyWorkAreaJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlineDirectory aircat;
    private Airliner air;
    TravelAgencyWorkAreaJPanel(JPanel CardSequenceJPanel, AirlineDirectory aircat,Airliner air) {
    initComponents();
    this.CardSequenceJPanel = CardSequenceJPanel;
    this.aircat = aircat;
    this.air = air;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageTravelAgency = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnManageAirliners = new javax.swing.JButton();

        btnManageTravelAgency.setText("MANAGE TRAVEL AGENCY");
        btnManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTravelAgencyActionPerformed(evt);
            }
        });

        btnManageCustomers.setText("MANAGE CUSTOMERS");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageAirliners.setText("MANAGE AIRLINERS");
        btnManageAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnManageTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnManageAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTravelAgencyActionPerformed
        // TODO add your handling code here:
        ManageTravelAgencyJPanel panel = new ManageTravelAgencyJPanel(CardSequenceJPanel,aircat,air);
        CardSequenceJPanel.add("ManageTravelAgencyJPanel",panel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageTravelAgencyActionPerformed

    private void btnManageAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinersActionPerformed
        // TODO add your handling code here:
         ManageAirlinersJPanel panel = new ManageAirlinersJPanel(CardSequenceJPanel,aircat,air);
        CardSequenceJPanel.add("ManageAirlinersJPanel",panel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageAirlinersActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
        SearchBestFlightsJPanel panel = new SearchBestFlightsJPanel(CardSequenceJPanel,aircat,air);
        CardSequenceJPanel.add("SearchBestFlightsJPanel",panel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageCustomersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirliners;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageTravelAgency;
    // End of variables declaration//GEN-END:variables
}
