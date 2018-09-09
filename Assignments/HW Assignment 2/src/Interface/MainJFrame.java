/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneCatalog;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yash
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AirplaneCatalog aircat;
    private Airplane plane;
    public MainJFrame() {
        initComponents();
        aircat = new AirplaneCatalog();
        
        //call from here
        //loadData();
        String filename = "src\\Business\\AirCat.csv";
         File file = new File(filename);
        try {
//             int serialNo;
//             String modelNo;
//             String manufacturedBy;
//             int manifactureYear;
//             int numberOfSeats;
//             String airlineName;
//             String airport;
//             String availabe;
//             String certificateExpired; 
             
             

            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                String[] values = data.split(",");
                
                //System.out.println(data);
                plane = aircat.addAirplane();
                
                //System.out.println(values[0]);
                plane.setSerialNo(Integer.parseInt(values[0]));
                plane. setModelNo(values[1]);
                plane.setManufacturedBy(values[2]);
                plane.setManifactureYear(Integer.parseInt(values[3]));
                plane.setNumberOfSeats(Integer.parseInt(values[4]));
                plane.setAirlineName(values[5]);
                plane.setAirport(values[6]);
                plane.setAvailabe(values[7]);
                plane.setCertificateExpired(values[8]);
                
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Qt1JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   //CREATE METHOD OUTSIDE AND THEN CALL
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnQt1 = new javax.swing.JButton();
        btnQt2 = new javax.swing.JButton();
        btnQt3 = new javax.swing.JButton();
        btnQt4 = new javax.swing.JButton();
        btnQt5 = new javax.swing.JButton();
        btnQt6 = new javax.swing.JButton();
        btnQt7 = new javax.swing.JButton();
        btnQt8 = new javax.swing.JButton();
        btnQt9 = new javax.swing.JButton();
        btnQt10 = new javax.swing.JButton();
        btnQt12 = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQt1.setText("Qt 1 ");
        btnQt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt1ActionPerformed(evt);
            }
        });

        btnQt2.setText("Qt 2");
        btnQt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt2ActionPerformed(evt);
            }
        });

        btnQt3.setText("Qt 3");
        btnQt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt3ActionPerformed(evt);
            }
        });

        btnQt4.setText("Qt 4");
        btnQt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt4ActionPerformed(evt);
            }
        });

        btnQt5.setText("Qt 5");
        btnQt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt5ActionPerformed(evt);
            }
        });

        btnQt6.setText("Qt 6");
        btnQt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt6ActionPerformed(evt);
            }
        });

        btnQt7.setText("Qt 7");
        btnQt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt7ActionPerformed(evt);
            }
        });

        btnQt8.setText("Qt 8");
        btnQt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt8ActionPerformed(evt);
            }
        });

        btnQt9.setText("Qt 9");
        btnQt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt9ActionPerformed(evt);
            }
        });

        btnQt10.setText("Qt 10");
        btnQt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt10ActionPerformed(evt);
            }
        });

        btnQt12.setText("Qt 11");
        btnQt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQt12ActionPerformed(evt);
            }
        });

        btnCreate.setForeground(new java.awt.Color(255, 0, 51));
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setForeground(new java.awt.Color(51, 51, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQt12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQt1)
                .addGap(18, 18, 18)
                .addComponent(btnQt2)
                .addGap(18, 18, 18)
                .addComponent(btnQt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQt5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQt6)
                .addGap(18, 18, 18)
                .addComponent(btnQt7)
                .addGap(18, 18, 18)
                .addComponent(btnQt8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQt9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQt10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQt12)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt1ActionPerformed
        // TODO add your handling code here:
        Qt1JPanel qt1 = new Qt1JPanel(aircat);
        SplitPane.setRightComponent(qt1);
        
    }//GEN-LAST:event_btnQt1ActionPerformed

    private void btnQt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt2ActionPerformed
        // TODO add your handling code here:
        Qt2JPanel qt2 = new Qt2JPanel(aircat);
        SplitPane.setRightComponent(qt2);
    }//GEN-LAST:event_btnQt2ActionPerformed

    private void btnQt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt3ActionPerformed
        // TODO add your handling code here:
        Qt3JPanel qt3 = new Qt3JPanel(aircat);
        SplitPane.setRightComponent(qt3);
    }//GEN-LAST:event_btnQt3ActionPerformed

    private void btnQt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt4ActionPerformed
        // TODO add your handling code here:
        Qt4JPanel qt4 = new Qt4JPanel(aircat);
        SplitPane.setRightComponent(qt4);
    }//GEN-LAST:event_btnQt4ActionPerformed

    private void btnQt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt5ActionPerformed
        // TODO add your handling code here:
        Qt5JPanel qt5 = new Qt5JPanel(aircat);
        SplitPane.setRightComponent(qt5);
    }//GEN-LAST:event_btnQt5ActionPerformed

    private void btnQt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt6ActionPerformed
        // TODO add your handling code here:
        Qt6JPanel qt6 = new Qt6JPanel(aircat);
        SplitPane.setRightComponent(qt6);
    }//GEN-LAST:event_btnQt6ActionPerformed

    private void btnQt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt7ActionPerformed
        // TODO add your handling code here:
        Qt7JPanel qt7 = new Qt7JPanel(aircat);
        SplitPane.setRightComponent(qt7);
    }//GEN-LAST:event_btnQt7ActionPerformed

    private void btnQt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt8ActionPerformed
        // TODO add your handling code here:
        Qt8JPanel qt8 = new Qt8JPanel(aircat);
        SplitPane.setRightComponent(qt8);
    }//GEN-LAST:event_btnQt8ActionPerformed

    private void btnQt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt9ActionPerformed
        // TODO add your handling code here:
        Qt9JPanel qt9 = new Qt9JPanel(aircat);
        SplitPane.setRightComponent(qt9);
    }//GEN-LAST:event_btnQt9ActionPerformed

    private void btnQt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt10ActionPerformed
        // TODO add your handling code here:
        Qt10JPanel qt10 = new Qt10JPanel(aircat);
        SplitPane.setRightComponent(qt10);
    }//GEN-LAST:event_btnQt10ActionPerformed

    private void btnQt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQt12ActionPerformed
        // TODO add your handling code here:
        Qt11JPanel qt11 = new Qt11JPanel(aircat);
        SplitPane.setRightComponent(qt11);
    }//GEN-LAST:event_btnQt12ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateAirplaneJPanel createPlane = new CreateAirplaneJPanel(aircat);
        SplitPane.setRightComponent(createPlane);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UpdateAirPlaneCatalogJPanel updatePlane = new UpdateAirPlaneCatalogJPanel(aircat);
        SplitPane.setRightComponent(updatePlane);
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnQt1;
    private javax.swing.JButton btnQt10;
    private javax.swing.JButton btnQt12;
    private javax.swing.JButton btnQt2;
    private javax.swing.JButton btnQt3;
    private javax.swing.JButton btnQt4;
    private javax.swing.JButton btnQt5;
    private javax.swing.JButton btnQt6;
    private javax.swing.JButton btnQt7;
    private javax.swing.JButton btnQt8;
    private javax.swing.JButton btnQt9;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
