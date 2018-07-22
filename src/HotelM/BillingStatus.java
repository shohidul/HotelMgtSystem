
package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BillingStatus extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public BillingStatus() {
        initComponents();

        setLocationRelativeTo(null);
        con = JDBC.abc();
        bookingNoForeignTF.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        billNoTF = new javax.swing.JTextField();
        billNoLabel = new javax.swing.JLabel();
        bookingNoLabel = new javax.swing.JLabel();
        bookingNoForeignTF = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        roomNoTF = new javax.swing.JTextField();
        serviceChargesLabel = new javax.swing.JLabel();
        serviceChargesTF = new javax.swing.JTextField();
        amountRecivedTF = new javax.swing.JTextField();
        outstandingAmountTF = new javax.swing.JTextField();
        amountRecivedLabel = new javax.swing.JLabel();
        outstandingAmountLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        netBillAmountLabel = new javax.swing.JLabel();
        netBillAmountTF = new javax.swing.JTextField();
        serviceTaxTF = new javax.swing.JTextField();
        serviceTaxLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        billingStatusjButton = new javax.swing.JButton();
        dateTF = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(756, 509));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billNoTF.setEditable(false);
        jPanel1.add(billNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 90, -1));

        billNoLabel.setText("Bill No.");
        jPanel1.add(billNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 109, -1));

        bookingNoLabel.setText("Booking No");
        jPanel1.add(bookingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 109, -1));

        bookingNoForeignTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingNoForeignTFActionPerformed(evt);
            }
        });
        jPanel1.add(bookingNoForeignTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 201, -1));

        roomNoLabel.setText("Room No.");
        jPanel1.add(roomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 109, -1));

        roomNoTF.setEditable(false);
        jPanel1.add(roomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 201, -1));

        serviceChargesLabel.setText("New Service Charges");
        jPanel1.add(serviceChargesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 152, -1));

        serviceChargesTF.setEditable(false);
        serviceChargesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceChargesTFActionPerformed(evt);
            }
        });
        jPanel1.add(serviceChargesTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 201, -1));

        amountRecivedTF.setText("0");
        amountRecivedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountRecivedTFActionPerformed(evt);
            }
        });
        jPanel1.add(amountRecivedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 201, -1));

        outstandingAmountTF.setEditable(false);
        jPanel1.add(outstandingAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 201, -1));

        amountRecivedLabel.setText("New Amount Recived");
        jPanel1.add(amountRecivedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 156, -1));

        outstandingAmountLabel.setText("Outstanding Amount");
        jPanel1.add(outstandingAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Billing Status & Update");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 219, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 130, -1));

        netBillAmountLabel.setText("New Net Bill Amount");
        jPanel1.add(netBillAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 152, -1));

        netBillAmountTF.setEditable(false);
        jPanel1.add(netBillAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 201, -1));

        serviceTaxTF.setEditable(false);
        jPanel1.add(serviceTaxTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 201, -1));

        serviceTaxLabel.setText("New Service Tax in %");
        jPanel1.add(serviceTaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 158, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        billingStatusjButton.setText("Billing Status");
        billingStatusjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingStatusjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(billingStatusjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));
        jPanel1.add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 93, -1));

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel1.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 772, 506));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingNoForeignTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingNoForeignTFActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select * from billing where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            billNoTF.setText(rs.getString(1));

            outstandingAmountTF.setText(rs.getString(15));

            ps = con.prepareStatement("Select * from booking where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            roomNoTF.setText(rs.getString(4));

            ps = con.prepareStatement("Select * from billing where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            int old = rs.getInt(7);

            ps = con.prepareStatement("Select sum(TotalServiceCharge) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            int neww = rs.getInt(1);
            int updatedServiceCharge = neww - old;

            serviceChargesTF.setText(String.valueOf(updatedServiceCharge));

            int amt, st;
            amt = Integer.parseInt(serviceChargesTF.getText());

            st = amt * 10 / 100;
            serviceTaxTF.setText(String.valueOf(st));

            amt = amt + st;
            int damt = amt;
            netBillAmountTF.setText(String.valueOf(amt));

            int os;
            os = Integer.parseInt(outstandingAmountTF.getText());
            damt = damt + os;
            amountRecivedTF.setText(String.valueOf(damt));

        } catch (Exception ex) {
            bookingNoForeignTF.setText("BookingNo doesn't exist!");
        }
    }//GEN-LAST:event_bookingNoForeignTFActionPerformed

    private void serviceChargesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceChargesTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_serviceChargesTFActionPerformed

    private void amountRecivedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountRecivedTFActionPerformed
        // TODO add your handling code here:

        outstandingAmountTF.setText("0");
    }//GEN-LAST:event_amountRecivedTFActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to update?", "Update", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            try {
                if (amountRecivedTF.getText().equals("0")) {

                    amountRecivedTF.setText("Enter amount recived!");

                } else {
                    ps = con.prepareStatement("UPDATE billing SET BillEntryDate =? , ServiceCharge = ServiceCharge + ?, GrossBillAmount = GrossBillAmount + ?,  ServiceTax = ServiceTax + ?, NetBillAmount=NetBillAmount+?, AmountRecived=AmountRecived+?, OutstandingAmount=? WHERE BillNo =?");
                    ps.setString(1, dateTF.getText());
                    ps.setInt(2, Integer.parseInt(serviceChargesTF.getText()));
                    ps.setInt(3, Integer.parseInt(serviceChargesTF.getText()));
                    ps.setInt(4, Integer.parseInt(serviceTaxTF.getText()));
                    ps.setInt(5, Integer.parseInt(netBillAmountTF.getText()));
                    ps.setInt(6, Integer.parseInt(amountRecivedTF.getText()));
                    ps.setInt(7, Integer.parseInt("0"));
                    ps.setString(8, billNoTF.getText());
                    ps.executeUpdate();

                    billNoTF.setText("Done");
                    

                }

            } catch (Exception e) {
                billNoTF.setText("Error in Billing");

            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void billingStatusjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingStatusjButtonActionPerformed
        // TODO add your handling code here:
        BillingStatusTables bst = new BillingStatusTables();
        bst.show();
    }//GEN-LAST:event_billingStatusjButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ps = con.prepareStatement("Select * from booking where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String bookingNo = rs.getString(1);
            String cc = rs.getString(2);
            String name = rs.getString(3);
            String roomNo = rs.getString(4);
            String bookingDate = rs.getString(5);
            String dateOfArival = rs.getString(6);
            String departureDate = rs.getString(7);
            String days = rs.getString(8);
            String noOfPerson = String.valueOf(rs.getInt(9));
            
            ps = con.prepareStatement("Select * from customer where CCode=?");
            ps.setString(1, cc);
            rs = ps.executeQuery();
            rs.next();
            String country = rs.getString(8);
            String address = rs.getString(11);
            
            ps = con.prepareStatement("Select * from billing where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String billNo = rs.getString(1);
            String billDate = rs.getString(2);
            String totalRoomRent = rs.getString(6);
            String grossBillAmount = String.valueOf(rs.getInt(8));
            String ServiceTax = String.valueOf(rs.getInt(9));
            String discount = String.valueOf(rs.getInt(10));
            String netBillAmount = String.valueOf(rs.getInt(11));
            String billMode = rs.getString(12);
            String amountReceived = String.valueOf(rs.getInt(14));
            String outstanding = String.valueOf(rs.getInt(15));
            
            ps = con.prepareStatement("Select * from rooms where RoomNo=?");
            ps.setString(1, roomNo);
            rs = ps.executeQuery();
            rs.next();
            String roomType = rs.getString(2);
            String roomRent = rs.getString(3);
            
            ps = con.prepareStatement("Select * from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String telephone = rs.getString(6);
            String gym = rs.getString(7);
            String swimmingPool = rs.getString(8);
            
            ps = con.prepareStatement("Select sum(TotalServiceCharge) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String totalServiceCharge = String.valueOf(rs.getInt(1));
            
            ps = con.prepareStatement("Select sum(Breakfast) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String breakfast = String.valueOf(rs.getInt(1));
            
            ps = con.prepareStatement("Select sum(Lunch) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String lunch = String.valueOf(rs.getInt(1));
            
            ps = con.prepareStatement("Select sum(Dinner) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String dinner = String.valueOf(rs.getInt(1));
            
            ps = con.prepareStatement("Select sum(Laundary) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            String laundary = String.valueOf(rs.getInt(1));
            
            PrintPreview pp = new PrintPreview();
            pp.jTextArea.append("\n"+name
                    +"\n"+address
                    +"\n"+country
                    +"\n"
                    +"\nRoom No. \t: "+roomNo+"\t\t\tBooking Date \t: "+bookingDate
                    +"\nCustomer Code \t: "+cc+"\t\t\tArival \t\t: "+dateOfArival
                    +"\nBooking No. \t: "+bookingNo+"\t\t\tDeparture \t: "+departureDate
                    +"\nBill No. \t\t: "+billNo +" (Full Bill)"+"\t\tBooked For Days \t: "+days
                    +"\nBill Entry Date \t: "+billDate+"\t\tNo. Of Person \t: "+noOfPerson
                    +"\n"
                    +"\n========================================================================="
                    +"\nDescription\t\t\t\tCharges"
                    +"\n========================================================================="
                    +"\n"+roomType+" "+roomRent+" x "+days +"\t\t\t\t"+totalRoomRent
                    +"\nService Charges:"
                    +"\n  Breakfast\t "+breakfast
                    +"\n  Lunch\t\t "+lunch
                    +"\n  Dinner\t\t "+dinner
                    +"\n  Laundary\t "+laundary
                    +"\n  Telephone\t "+telephone
                    +"\n  Gym\t\t "+gym
                    +"\n  Swimming Pool\t "+swimmingPool
                    +"\n  Total\t\t "+totalServiceCharge+"\t\t\t"+totalServiceCharge
                    +"\n  ----------------------------------"
                    +"\nGross Bill Amount\t\t\t\t"+grossBillAmount
                    +"\nService Tax\t\t\t\t"+ServiceTax
                    +"\nDiscount Allowed\t\t\t\t("+discount+")"
                    +"\nNet Bill Amount\t\t\t\t"+netBillAmount
                    +"\nAmount Recived "+billMode+"\t\t\t"+amountReceived
                    +"\n-------------------------------------------------------------------------------"
                    +"\nOutstanding\t\t\t\t("+outstanding+")"
                    +"\n========================================================================="
                    +"\n"
                    +"\nThank you for taking our service. We hope you have enjoyed being here."
                    +"\nFor Room Service Call: 6969"
                    +"\nWebsite: www.hoteljava.com"
                    );
            pp.show();
        } catch (SQLException ex) {
            bookingNoForeignTF.setText("Fill it!");
        }
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BillingStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountRecivedLabel;
    private javax.swing.JTextField amountRecivedTF;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel billNoLabel;
    public javax.swing.JTextField billNoTF;
    private javax.swing.JButton billingStatusjButton;
    public javax.swing.JTextField bookingNoForeignTF;
    private javax.swing.JLabel bookingNoLabel;
    public javax.swing.JTextField dateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel netBillAmountLabel;
    private javax.swing.JTextField netBillAmountTF;
    private javax.swing.JLabel outstandingAmountLabel;
    private javax.swing.JTextField outstandingAmountTF;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JTextField roomNoTF;
    private javax.swing.JLabel serviceChargesLabel;
    public javax.swing.JTextField serviceChargesTF;
    private javax.swing.JLabel serviceTaxLabel;
    private javax.swing.JTextField serviceTaxTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
