package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

public class BillingStatusTables extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public BillingStatusTables() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
        showOldBillingTable();
        showNewBillingTable();

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
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        oldBilljTable = new javax.swing.JTable();
        jLabel = new javax.swing.JLabel();
        bookingNoLabel = new javax.swing.JLabel();
        bookingNoForeignTF = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        newBilljTable = new javax.swing.JTable();
        printOldBilljButton = new javax.swing.JButton();
        printNewBilljButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        oldBilljTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(oldBilljTable);

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel.setText("Billing Status Tables");

        bookingNoLabel.setText("Booking No.");

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        newBilljTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(newBilljTable);

        printOldBilljButton.setText("Print Old Bill");
        printOldBilljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOldBilljButtonActionPerformed(evt);
            }
        });

        printNewBilljButton.setText("Print New Bill");
        printNewBilljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printNewBilljButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(printOldBilljButton)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(bookingNoLabel)
                            .addGap(18, 18, 18)
                            .addComponent(bookingNoForeignTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshjButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(printNewBilljButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printOldBilljButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(printNewBilljButton)
                        .addGap(0, 0, 0)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingNoLabel)
                            .addComponent(bookingNoForeignTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchjButton))
                        .addComponent(refreshjButton)))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select * from billingHistory where BookingNo=? ");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            oldBilljTable.setAutoResizeMode(oldBilljTable.AUTO_RESIZE_OFF);
            oldBilljTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

        try {
            ps = con.prepareStatement("Select * from billing where BookingNo=? ");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            newBilljTable.setAutoResizeMode(newBilljTable.AUTO_RESIZE_OFF);
            newBilljTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        showOldBillingTable();
        showNewBillingTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void printNewBilljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printNewBilljButtonActionPerformed
        
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
    }//GEN-LAST:event_printNewBilljButtonActionPerformed

    private void printOldBilljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOldBilljButtonActionPerformed
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
            
            ps = con.prepareStatement("Select * from billingHistory where BookingNo=?");
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
            String totalServiceCharge = String.valueOf(rs.getInt(9));
            
            PrintPreview pp = new PrintPreview();
            pp.jTextArea.append("\n"+name
                    +"\n"+address
                    +"\n"+country
                    +"\n"
                    +"\nRoom No. \t: "+roomNo+"\t\t\tBooking Date \t: "+bookingDate
                    +"\nCustomer Code \t: "+cc+"\t\t\tArival \t\t: "+dateOfArival
                    +"\nBooking No. \t: "+bookingNo+"\t\t\tDeparture \t: "+departureDate
                    +"\nBill No. \t\t: "+billNo +" (Advance Bill)"+"\tBooked For Days \t: "+days
                    +"\nBill Entry Date \t: "+billDate+"\t\tNo. Of Person \t: "+noOfPerson
                    +"\n"
                    +"\n========================================================================="
                    +"\nDescription\t\t\t\tCharges"
                    +"\n========================================================================="
                    +"\n"+roomType+" "+roomRent+" x "+days +"\t\t\t\t"+totalRoomRent
                    +"\nService Charges:"
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
                    +"\nThank you for taking our service. We hope you will enjoy being here."
                    +"\nFor Room Service Call: 6969"
                    +"\nWebsite: www.hoteljava.com"
                    );
            pp.show();
        } catch (SQLException ex) {
            bookingNoForeignTF.setText("Fill it!");
        }
    }//GEN-LAST:event_printOldBilljButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BillingStatusTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingStatusTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingStatusTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingStatusTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingStatusTables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookingNoForeignTF;
    private javax.swing.JLabel bookingNoLabel;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable newBilljTable;
    private javax.swing.JTable oldBilljTable;
    private javax.swing.JButton printNewBilljButton;
    private javax.swing.JButton printOldBilljButton;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton searchjButton;
    // End of variables declaration//GEN-END:variables

    private void showOldBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billingHistory ");
            rs = ps.executeQuery();
            oldBilljTable.setAutoResizeMode(oldBilljTable.AUTO_RESIZE_OFF);
            oldBilljTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showNewBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billing ");
            rs = ps.executeQuery();
            newBilljTable.setAutoResizeMode(newBilljTable.AUTO_RESIZE_OFF);
            newBilljTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
}
