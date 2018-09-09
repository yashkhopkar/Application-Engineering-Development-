/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneCatalog;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class Qt4JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Qt4JPanel
     */
   AirplaneCatalog aircat;
    Qt4JPanel(AirplaneCatalog aircat) {
        initComponents();
        this.aircat = aircat;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQt4 = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        btnSearchByYear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQt4 = new javax.swing.JTable();

        lblQt4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQt4.setText("Available Airplanes by Year :");

        lblYear.setText("Enter Year:");

        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearKeyPressed(evt);
            }
        });

        btnSearchByYear.setText("Search");
        btnSearchByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByYearActionPerformed(evt);
            }
        });

        tblQt4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Air Line Name", "Model Number", "Manufacturer", "Airport"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQt4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblYear)
                        .addGap(56, 56, 56)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnSearchByYear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblQt4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblQt4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchByYear)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByYearActionPerformed
        // TODO add your handling code here:
        
        //Airplane plane =aircat.addAirplane();
        boolean record = false;
        int year = Integer.parseInt(txtYear.getText());
        DefaultTableModel dtm = (DefaultTableModel)tblQt4.getModel();
            dtm.setRowCount(0);
            for(Airplane p:aircat.getAirplaneCatalog())
            {
                if((p.getManifactureYear()==year))
                {
                Object[] col = new Object[4];
                col[0] = p.getAirlineName();
                col[1] = p.getModelNo();
                col[2] = p.getManufacturedBy();
                col[3] = p.getAirport();
                dtm.addRow(col);
                record = true;
                }
                
            }
            if(!record)
            {
            JOptionPane.showMessageDialog(null, "Record not found");
            }
    }//GEN-LAST:event_btnSearchByYearActionPerformed

    private void txtYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtYear.setEditable(true);
       }
       else
       {
       txtYear.setEditable(false);
       }
    }//GEN-LAST:event_txtYearKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchByYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQt4;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblQt4;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
