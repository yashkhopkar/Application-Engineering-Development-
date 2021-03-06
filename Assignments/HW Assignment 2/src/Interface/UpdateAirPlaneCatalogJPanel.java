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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author Yash
 */
public class UpdateAirPlaneCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateAirPlaneCatalogJPanel
     */
private AirplaneCatalog aircat;
UpdateAirPlaneCatalogJPanel(AirplaneCatalog aircat) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlightCatalog = new javax.swing.JTable();
        btnUpdateFlightCatalog = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDateTime = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUpdateSrNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUpdateModelNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUpdateManufacturer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUpdateManYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUpdateAirLineName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUpdateAvailable = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtUpdateNoOfSeats = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUpdateAirport = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUpdateCertificateExpired = new javax.swing.JTextField();
        btnUpdateRecords = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE AIRPLANE CATALOG:");

        tblFlightCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Model Number", "Manufacturer", "Manufacture Year", "Number Of Seats", "Airline Name", "Airport", "Availability", "Maintanence Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlightCatalog);

        btnUpdateFlightCatalog.setText("UPDATE FLIGHT CATALOG");
        btnUpdateFlightCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFlightCatalogActionPerformed(evt);
            }
        });

        jLabel2.setText("Date & Time:");

        txtDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateTimeActionPerformed(evt);
            }
        });

        jLabel4.setText("Serial Number:");

        txtUpdateSrNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateSrNoKeyPressed(evt);
            }
        });

        jLabel5.setText("Model Number:");

        jLabel6.setText("Manufacturer:");

        jLabel7.setText("Manufacture Year:");

        txtUpdateManYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateManYearKeyPressed(evt);
            }
        });

        jLabel9.setText("Air Line Name:");

        jLabel11.setText("Availabe (Y/N):");

        txtUpdateAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateAvailableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateAvailableKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUpdateModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtUpdateSrNo)
                    .addComponent(txtUpdateManufacturer)
                    .addComponent(txtUpdateManYear)
                    .addComponent(txtUpdateAirLineName)
                    .addComponent(txtUpdateAvailable))
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateSrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUpdateModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUpdateManYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUpdateAirLineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUpdateAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        btnView.setText("View Records");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtUpdateNoOfSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateNoOfSeatsKeyPressed(evt);
            }
        });

        jLabel8.setText("Number Of Seats:");

        jLabel10.setText("Air Port Name:");

        txtUpdateAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateAirportActionPerformed(evt);
            }
        });

        jLabel12.setText("Maintanence Certificate (Y/N):");

        txtUpdateCertificateExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateCertificateExpiredActionPerformed(evt);
            }
        });
        txtUpdateCertificateExpired.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateCertificateExpiredKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateCertificateExpiredKeyTyped(evt);
            }
        });

        btnUpdateRecords.setText("Update Records");
        btnUpdateRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnView)
                        .addGap(53, 53, 53)
                        .addComponent(btnDelete)
                        .addGap(145, 145, 145)
                        .addComponent(btnUpdateFlightCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUpdateAirport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtUpdateNoOfSeats, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUpdateCertificateExpired)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(btnUpdateRecords)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateFlightCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpdateNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtUpdateAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpdateCertificateExpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnUpdateRecords)
                        .addGap(215, 215, 215))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateFlightCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFlightCatalogActionPerformed
        // TODO add your handling code here:
        Qt9JPanel qt9 = new Qt9JPanel(aircat);
        DefaultTableModel dtm = (DefaultTableModel)tblFlightCatalog.getModel();
            dtm.setRowCount(0);
            for(Airplane p :aircat.getAirplaneCatalog())
            {
                Object[] col = new Object[9];
                //col[0] = p.getSerialNo();
                col[0] = p.getSerialNo();
                col[1] = p;
                col[2] = p.getManufacturedBy();
                col[3] = p.getManifactureYear();
                col[4] = p.getNumberOfSeats();
                col[5] = p.getAirlineName();
                col[6] = p.getAirport();
                col[7] = p.getAvailabe();
                col[8] = p.getCertificateExpired();
                dtm.addRow(col);  
            }
        JOptionPane.showMessageDialog(null, "Flight Catalog Update Successful");
       
       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
       Date dateobj = new Date();
       //System.out.println(df.format(dateobj));
        String date = df.format(dateobj);
        txtDateTime.setText(date);
         String dateTime = txtDateTime.getText();
         aircat.setDateTime(dateTime);
     
    }//GEN-LAST:event_btnUpdateFlightCatalogActionPerformed

    private void txtUpdateCertificateExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateCertificateExpiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateCertificateExpiredActionPerformed

    private void txtUpdateAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateAirportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateAirportActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblFlightCatalog.getSelectedRow();
        
        if (selectedrow >=0)
        {
            Airplane p = (Airplane)tblFlightCatalog.getValueAt(selectedrow, 1);
                txtUpdateSrNo.setText(String.valueOf(p.getSerialNo()));
                txtUpdateModelNo.setText(p.getModelNo());
                txtUpdateManufacturer.setText(p.getManufacturedBy());
                txtUpdateManYear.setText(String.valueOf(p.getManifactureYear()));
                txtUpdateNoOfSeats.setText(String.valueOf(p.getNumberOfSeats()));
                txtUpdateAirLineName.setText(p.getAirlineName());
                txtUpdateAirport.setText(p.getAirport());
                txtUpdateAvailable.setText(p.getAvailabe());
                txtUpdateCertificateExpired.setText(p.getCertificateExpired());
                
        }
        else 
            JOptionPane.showMessageDialog(null, "Please select any row");
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblFlightCatalog.getSelectedRow();
        
        if (selectedrow >=0)
        {
            Airplane p = (Airplane)tblFlightCatalog.getValueAt(selectedrow, 1);
                aircat.deleteAirplane(p);
                JOptionPane.showMessageDialog(null, "Airplane Deleted");
                DefaultTableModel dtm = (DefaultTableModel)tblFlightCatalog.getModel();
            dtm.setRowCount(0);
            for(Airplane pa :aircat.getAirplaneCatalog())
            {
                Object[] col = new Object[9];
                //col[0] = p.getSerialNo();
                col[0] = pa.getSerialNo();
                col[1] = pa;
                col[2] = pa.getManufacturedBy();
                col[3] = pa.getManifactureYear();
                col[4] = pa.getNumberOfSeats();
                col[5] = pa.getAirlineName();
                col[6] = pa.getAirport();
                col[7] = pa.getAvailabe();
                col[8] = pa.getCertificateExpired();
                dtm.addRow(col);  
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "Please select any row");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordsActionPerformed
        // TODO add your handling code here:
        int serialNo = Integer.parseInt(txtUpdateSrNo.getText());
        String modelNo = txtUpdateModelNo.getText();
        String manufact = txtUpdateManufacturer.getText();
        int manyear = Integer.parseInt(txtUpdateManYear.getText());
        int seats = Integer.parseInt(txtUpdateNoOfSeats.getText());
        String airline = txtUpdateAirLineName.getText();
        String airport = txtUpdateAirport.getText();
        String availabe = txtUpdateAvailable.getText();
        String maintCert = txtUpdateCertificateExpired.getText();
        
        Airplane u =  aircat.updateAirplane();
        u.setSerialNo(serialNo);
        u.setModelNo(modelNo);
        u.setManufacturedBy(manufact);
        u.setManifactureYear(manyear);
        u.setNumberOfSeats(seats);
        u.setAirlineName(airline);
        u.setAirport(airport);
        u.setAvailabe(availabe);
        u.setCertificateExpired(maintCert);
        JOptionPane.showMessageDialog(null, "Airplane Updated Successfully");
        
        DefaultTableModel dtm = (DefaultTableModel)tblFlightCatalog.getModel();
            dtm.setRowCount(0);
            for(Airplane p :aircat.getAirplaneCatalog())
            {
                Object[] col = new Object[9];
                //col[0] = p.getSerialNo();
                col[0] = p.getSerialNo();
                col[1] = p;
                col[2] = p.getManufacturedBy();
                col[3] = p.getManifactureYear();
                col[4] = p.getNumberOfSeats();
                col[5] = p.getAirlineName();
                col[6] = p.getAirport();
                col[7] = p.getAvailabe();
                col[8] = p.getCertificateExpired();
                dtm.addRow(col);  
            }
    }//GEN-LAST:event_btnUpdateRecordsActionPerformed

    private void txtUpdateSrNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSrNoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtUpdateSrNo.setEditable(true);
       }
       else
       {
       txtUpdateSrNo.setEditable(false);
       }
    }//GEN-LAST:event_txtUpdateSrNoKeyPressed

    private void txtUpdateManYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateManYearKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtUpdateManYear.setEditable(true);
       }
       else
       {
       txtUpdateManYear.setEditable(false);
       }
    }//GEN-LAST:event_txtUpdateManYearKeyPressed

    private void txtUpdateAvailableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateAvailableKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       if((key==KeyEvent.VK_Y)||(key==KeyEvent.VK_N)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtUpdateAvailable.setEditable(true);
       }
       else
       {
       txtUpdateAvailable.setEditable(false);
       }
    }//GEN-LAST:event_txtUpdateAvailableKeyPressed

    private void txtUpdateAvailableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateAvailableKeyTyped
        // TODO add your handling code here:
         if (txtUpdateAvailable.getText().length() >= 1 ) // limit textfield to 1 character
            txtUpdateAvailable.setEditable(false);
        else
        txtUpdateAvailable.setEditable(true);
    }//GEN-LAST:event_txtUpdateAvailableKeyTyped

    private void txtUpdateCertificateExpiredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateCertificateExpiredKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       if((key==KeyEvent.VK_Y)||(key==KeyEvent.VK_N)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtUpdateCertificateExpired.setEditable(true);
       }
       else
       {
       txtUpdateCertificateExpired.setEditable(false);
       }
    }//GEN-LAST:event_txtUpdateCertificateExpiredKeyPressed

    private void txtUpdateCertificateExpiredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateCertificateExpiredKeyTyped
        // TODO add your handling code here:
        if (txtUpdateCertificateExpired.getText().length() >= 1 ) // limit textfield to 1 character
            txtUpdateCertificateExpired.setEditable(false);
        else
        txtUpdateCertificateExpired.setEditable(true);
    }//GEN-LAST:event_txtUpdateCertificateExpiredKeyTyped

    private void txtDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTimeActionPerformed

    private void txtUpdateNoOfSeatsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateNoOfSeatsKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
       if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))
       {
       txtUpdateNoOfSeats.setEditable(true);
       }
       else
       {
       txtUpdateNoOfSeats.setEditable(false);
       }
    }//GEN-LAST:event_txtUpdateNoOfSeatsKeyPressed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateFlightCatalog;
    private javax.swing.JButton btnUpdateRecords;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlightCatalog;
    private javax.swing.JTextField txtDateTime;
    private javax.swing.JTextField txtUpdateAirLineName;
    private javax.swing.JTextField txtUpdateAirport;
    private javax.swing.JTextField txtUpdateAvailable;
    private javax.swing.JTextField txtUpdateCertificateExpired;
    private javax.swing.JTextField txtUpdateManYear;
    private javax.swing.JTextField txtUpdateManufacturer;
    private javax.swing.JTextField txtUpdateModelNo;
    private javax.swing.JTextField txtUpdateNoOfSeats;
    private javax.swing.JTextField txtUpdateSrNo;
    // End of variables declaration//GEN-END:variables
}
