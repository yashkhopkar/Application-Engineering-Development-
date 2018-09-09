/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.AirlineDirectory;
import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class ManageTravelAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlineDirectory aircat;
    private Airliner air;

    public ManageTravelAgencyJPanel(JPanel CardSequenceJPanel, AirlineDirectory aircat, Airliner air) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.aircat = aircat;
        this.air = air;
        DefaultTableModel dtm = (DefaultTableModel)tblMngTravelAgency.getModel();
        dtm.setRowCount(0);
        for(Airliner a:aircat.getAirlinerList())
            
        {
            for(Flight f:a.getFlightList())
            {
            Object [] row = new Object[7];
            row[0] = f.getSerialNo();
            row[1] = f.getFlightNo();
            row[2] = f.getDate();
            row[3] = f.getTime();
            row[4] = f.getNumberOfSeats();
            row[5] = f.getSourceAirport();
            row[6] = f.getDestinationAirport();
            dtm.addRow(row);
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
        tblMngTravelAgency = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSourceAirport = new javax.swing.JTextField();
        txtDestinationAirport = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRAVEL AGENCY MANAGER");

        tblMngTravelAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Airline Number", "Date", "Time", "Number Of Seats", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMngTravelAgency);
        if (tblMngTravelAgency.getColumnModel().getColumnCount() > 0) {
            tblMngTravelAgency.getColumnModel().getColumn(0).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(1).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(2).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(3).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(4).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(5).setResizable(false);
            tblMngTravelAgency.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setText("SEARCH FLIGHTS:");

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("From Airport:");

        jLabel5.setText("To Airport:");

        btnBack.setText("BACK<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSourceAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDestinationAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtSourceAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestinationAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSearch)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
      
       if(txtSourceAirport.getText().equals("")||txtDestinationAirport.getText().equals(""))
       {
       JOptionPane.showMessageDialog(null, "All feilds are manadatory");
       }
       else
       {
       String srcApt = txtSourceAirport.getText();
       String dstApt = txtDestinationAirport.getText();
       boolean record = false;
           DefaultTableModel dtm = (DefaultTableModel)tblMngTravelAgency.getModel();
           dtm.setRowCount(0);
           for(Airliner a : aircat.getAirlinerList())
           {
               for(Flight f:a.getFlightList())    
               {
                  if((f.getSourceAirport().equalsIgnoreCase(srcApt))&& f.getDestinationAirport().equalsIgnoreCase(dstApt))
                  {
                   Object [] row = new Object[7];
                   row[0] = f.getSerialNo();
                   row[1] = f.getFlightNo();
                   row[2] = f.getDate();
                   row[3] = f.getTime();
                   row[4] = f.getNumberOfSeats();
                   row[5] = f.getSourceAirport();
                   row[6] = f.getDestinationAirport();
                   dtm.addRow(row);
                   record = true;
                  }
               }
           }
           if(!record)
           {
           JOptionPane.showMessageDialog(null, "Record not found");
           }
           
       }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMngTravelAgency;
    private javax.swing.JTextField txtDestinationAirport;
    private javax.swing.JTextField txtSourceAirport;
    // End of variables declaration//GEN-END:variables
}
