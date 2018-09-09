/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineCatalog;
import Business.Disease.Disease;
import Business.Disease.DiseaseList;

/**
 *
 * @author Yash
 */
public class CDCAdminRoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CDCAdminRoleJPanel
     */
    
    JPanel userProcessContainer; 
    Enterprise enterprise;
    public CDCAdminRoleJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
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
        btnCreateVaccine = new javax.swing.JButton();
        btnCreateDisease = new javax.swing.JButton();
        btnViewVaccine = new javax.swing.JButton();
        btnViewDisease = new javax.swing.JButton();

        jLabel1.setText("CDC Admin Role");

        btnCreateVaccine.setText("CREATE VACCINE");
        btnCreateVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVaccineActionPerformed(evt);
            }
        });

        btnCreateDisease.setText("CREATE DISEASE");
        btnCreateDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDiseaseActionPerformed(evt);
            }
        });

        btnViewVaccine.setText("VIEW VACCINE LIST");
        btnViewVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVaccineActionPerformed(evt);
            }
        });

        btnViewDisease.setText("VIEW DISEASE LIST");
        btnViewDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDiseaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(btnCreateVaccine)
                .addGap(33, 33, 33)
                .addComponent(btnViewVaccine)
                .addGap(29, 29, 29)
                .addComponent(btnCreateDisease)
                .addGap(35, 35, 35)
                .addComponent(btnViewDisease)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVaccineActionPerformed
        // TODO add your handling code here:
        CreateVaccineJPanel createVaccineJPanel = new CreateVaccineJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("CreateVaccineJPanel", createVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateVaccineActionPerformed

    private void btnViewVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVaccineActionPerformed
        // TODO add your handling code here:
        ViewVaccineJPanel viewVaccineJPanel = new ViewVaccineJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ViewVaccineJPanel", viewVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewVaccineActionPerformed

    private void btnCreateDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDiseaseActionPerformed
        // TODO add your handling code here:
        CreateDiseaseJPanel createDiseaseJPanel = new CreateDiseaseJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("CreateDiseaseJPanel", createDiseaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDiseaseActionPerformed

    private void btnViewDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDiseaseActionPerformed
        // TODO add your handling code here:
        ViewDiseaseJPanel viewDiseaseJPanel = new ViewDiseaseJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ViewDiseaseJPanel", viewDiseaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDiseaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDisease;
    private javax.swing.JButton btnCreateVaccine;
    private javax.swing.JButton btnViewDisease;
    private javax.swing.JButton btnViewVaccine;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
