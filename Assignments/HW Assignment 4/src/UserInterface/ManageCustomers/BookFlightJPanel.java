/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.AirlineDirectory;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JPanel;
 import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class BookFlightJPanel extends javax.swing.JPanel {
private JPanel CardSequenceJPanel;
private AirlineDirectory aircat;
private Flight f;
    /**
     * Creates new form BookFlightJPanel
     */
    public BookFlightJPanel() {
        
    }

    BookFlightJPanel(JPanel CardSequenceJPanel, Flight f) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.f = f;
        String fn= f.getFlightNo();
        txtFlightNo.setText(fn);
        int noOfSeats = f.getNumberOfSeats();
        txtAvailableSeats.setText(String.valueOf(noOfSeats));
       Random rand = new Random();
       int  n = rand.nextInt(50) + 1;
       txtSeatNumber.setText(String.valueOf(n));
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        txtSeatNumber = new javax.swing.JTextField();
        txtAvailableSeats = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        btnConfirmBooking = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookFlight = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("BOOK FLIGHT:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Available Seats:");

        jLabel4.setText("Seat Number");

        jLabel5.setText("Last Name:");

        jLabel6.setText("Flight Number:");

        txtFlightNo.setEditable(false);

        txtSeatNumber.setEditable(false);

        txtAvailableSeats.setEditable(false);
        txtAvailableSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableSeatsActionPerformed(evt);
            }
        });

        btnConfirmBooking.setText("CONFIRM BOOKING");
        btnConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblBookFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "First Name", "Last Name", "Seat Number", "Availabe Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBookFlight);
        if (tblBookFlight.getColumnModel().getColumnCount() > 0) {
            tblBookFlight.getColumnModel().getColumn(0).setResizable(false);
            tblBookFlight.getColumnModel().getColumn(1).setResizable(false);
            tblBookFlight.getColumnModel().getColumn(2).setResizable(false);
            tblBookFlight.getColumnModel().getColumn(3).setResizable(false);
            tblBookFlight.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel7.setText("BOOKING CONFIRMATION:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnConfirmBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addComponent(txtFirstName)
                                        .addComponent(txtLastName)
                                        .addComponent(txtSeatNumber)
                                        .addComponent(txtAvailableSeats)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAvailableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnConfirmBooking)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
 
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAvailableSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableSeatsActionPerformed

    private void btnConfirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBookingActionPerformed
        // TODO add your handling code here:
       if(txtFirstName.getText().equals("")||(txtLastName.getText().equals("")))
       {
       JOptionPane.showMessageDialog(null, "All feilds are mandatory");
       }
         else
       {
       String fName  = txtFirstName.getText();
       String lName = txtLastName.getText();
       String fNo = txtFlightNo.getText();
       int seatNo = Integer.parseInt(txtSeatNumber.getText());
       int avaiSeats = Integer.parseInt(txtAvailableSeats.getText());
       int nowavaiSeats = avaiSeats-1;
        DefaultTableModel dtm = (DefaultTableModel)tblBookFlight.getModel();
        String [] row  = new String[5];
        row[0] = fName;
        row[1] = lName;
        row[2] = fNo;
        row[3] = String.valueOf(seatNo);
        row[4] = String.valueOf(nowavaiSeats);
        dtm.addRow(row);
        JOptionPane.showMessageDialog(null, "Booking Confirmed");
       }
    }//GEN-LAST:event_btnConfirmBookingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBookFlight;
    private javax.swing.JTextField txtAvailableSeats;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSeatNumber;
    // End of variables declaration//GEN-END:variables
}
