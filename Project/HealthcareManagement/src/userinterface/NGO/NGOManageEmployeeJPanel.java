/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author Yash
 */
public class NGOManageEmployeeJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDir;
    /**
     * Creates new form CDCManageEmployeeJPanel
     */
    
   public NGOManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
    }
   
   public void populateTable(Organization organization)
   {
   
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Manage Employee");

        jLabel1.setBackground(new java.awt.Color(102, 217, 255));
        jLabel1.setText("Organization");

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        jLabel3.setBackground(new java.awt.Color(102, 217, 255));
        jLabel3.setText("Organization");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setText("Name");

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyPressed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(102, 217, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(102, 217, 255));
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organizationEmpJComboBox, 0, 125, Short.MAX_VALUE)
                            .addComponent(nameJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(addJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();

        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);

    }//GEN-LAST:event_addJButtonActionPerformed

    private void nameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, nameJTextField);
    }//GEN-LAST:event_nameJTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
