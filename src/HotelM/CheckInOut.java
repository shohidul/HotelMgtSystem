
package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CheckInOut extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public CheckInOut() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();        
        showRoomsTabel();
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkInOutPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        checkInOutForm = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("BgForm.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        backLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("custfrmbg.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsjTable = new javax.swing.JTable();
        roomNoTF = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        bookingNoTF = new javax.swing.JTextField();
        bookingNoLabel = new javax.swing.JLabel();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        bookingStatusButton = new javax.swing.JButton();
        billingStatusButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Check In & Out");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        checkInOutPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        checkInOutPanel.setOpaque(false);

        checkInOutForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check In & Out Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomsjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(roomsjTable);

        formPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 30, 810, 320));
        formPanel.add(roomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 100, -1));

        roomNoLabel.setText("Room No.");
        formPanel.add(roomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        formPanel.add(bookingNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, -1));

        bookingNoLabel.setText("Booking No.");
        formPanel.add(bookingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        checkInButton.setText("Check In");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });
        formPanel.add(checkInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 110, -1));

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });
        formPanel.add(checkOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 110, -1));

        bookingStatusButton.setText("Booking Status");
        bookingStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingStatusButtonActionPerformed(evt);
            }
        });
        formPanel.add(bookingStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 230, -1));

        billingStatusButton.setText("Billing Status ");
        billingStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingStatusButtonActionPerformed(evt);
            }
        });
        formPanel.add(billingStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 230, -1));

        javax.swing.GroupLayout checkInOutFormLayout = new javax.swing.GroupLayout(checkInOutForm);
        checkInOutForm.setLayout(checkInOutFormLayout);
        checkInOutFormLayout.setHorizontalGroup(
            checkInOutFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkInOutFormLayout.createSequentialGroup()
                .addContainerGap(897, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(checkInOutFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(checkInOutFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        checkInOutFormLayout.setVerticalGroup(
            checkInOutFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkInOutFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(532, Short.MAX_VALUE))
            .addGroup(checkInOutFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(checkInOutFormLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout checkInOutPanelLayout = new javax.swing.GroupLayout(checkInOutPanel);
        checkInOutPanel.setLayout(checkInOutPanelLayout);
        checkInOutPanelLayout.setHorizontalGroup(
            checkInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkInOutForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        checkInOutPanelLayout.setVerticalGroup(
            checkInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkInOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkInOutForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        MainFrame m = new MainFrame();
        m.show();
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        try {
            // TODO add your handling code here:
            if (bookingNoTF.getText().isEmpty()) {
                bookingNoTF.setText("Fill both!");
            } else {
                ps = con.prepareStatement("Update rooms set Status= 'NotAvailable', BookedBy=? Where  RoomNo=?");
                ps.setString(1, bookingNoTF.getText());
                ps.setInt(2, Integer.parseInt(roomNoTF.getText()));
                ps.executeUpdate();
                showRoomsTabel();
                
                ps = con.prepareStatement("Update booking set CheckedStatus= 'Checked In' Where  BookingNo=?");
                ps.setString(1, bookingNoTF.getText());
                ps.executeUpdate();
                
                bookingNoTF.setText("");
                roomNoTF.setText("");
            }
            
            
        } catch (Exception e) {
            roomNoTF.setText("Error");
        }
                    
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (bookingNoTF.getText().isEmpty()) {
                bookingNoTF.setText("Fill both!");
            } else {
                ps = con.prepareStatement("Update rooms set Status= 'Available', BookedBy='' Where  RoomNo=?");
                ps.setInt(1, Integer.parseInt(roomNoTF.getText()));
                ps.executeUpdate();
                showRoomsTabel();

                ps = con.prepareStatement("Update booking set CheckedStatus= 'Checked Out' Where  BookingNo=?");
                ps.setString(1, bookingNoTF.getText());
                ps.executeUpdate();

                bookingNoTF.setText("");
                roomNoTF.setText("");
            }
        } catch (Exception e) {
            roomNoTF.setText("Error");
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void bookingStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingStatusButtonActionPerformed
        // TODO add your handling code here:
        BookingStatus bs = new BookingStatus();
        bs.show();
    }//GEN-LAST:event_bookingStatusButtonActionPerformed

    private void billingStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingStatusButtonActionPerformed
        // TODO add your handling code here:
        BillingStatus bi = new BillingStatus();
        bi.show();
        try {
            ps = con.prepareStatement("SELECT curdate()");
            rs = ps.executeQuery();
            rs.next();
            String billEntryDate = rs.getString(1);
            bi.dateTF.setText(billEntryDate);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_billingStatusButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Warnning", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton billingStatusButton;
    private javax.swing.JLabel bookingNoLabel;
    private javax.swing.JTextField bookingNoTF;
    private javax.swing.JButton bookingStatusButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JPanel checkInOutForm;
    private javax.swing.JPanel checkInOutPanel;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel roomNoLabel;
    public javax.swing.JTextField roomNoTF;
    private javax.swing.JTable roomsjTable;
    // End of variables declaration//GEN-END:variables

    private void showRoomsTabel() {
        try {
            ps = con.prepareStatement("Select * from rooms ");
            rs = ps.executeQuery();
            roomsjTable.setAutoResizeMode(roomsjTable.AUTO_RESIZE_ALL_COLUMNS);
            roomsjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
}
