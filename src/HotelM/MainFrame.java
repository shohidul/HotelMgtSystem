package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MainFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMain = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        mainChild = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("main.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        customerBtn = new javax.swing.JButton();
        bookingBtn = new javax.swing.JButton();
        serviceBtn = new javax.swing.JButton();
        billingBtn = new javax.swing.JButton();
        enquiryBtn = new javax.swing.JButton();
        logOutLabel = new javax.swing.JLabel();
        newAccLabel = new javax.swing.JLabel();
        checkInOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Hotel Management System");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bgMain.setOpaque(false);
        bgMain.setPreferredSize(new java.awt.Dimension(1100, 619));

        mainChild.setOpaque(false);

        customerBtn.setBackground(new java.awt.Color(0, 204, 51));
        customerBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerBtn.setText("Customer");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        bookingBtn.setBackground(new java.awt.Color(0, 204, 51));
        bookingBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bookingBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookingBtn.setText("Booking");
        bookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingBtnActionPerformed(evt);
            }
        });

        serviceBtn.setBackground(new java.awt.Color(0, 204, 51));
        serviceBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        serviceBtn.setForeground(new java.awt.Color(255, 255, 255));
        serviceBtn.setText("Service");
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        billingBtn.setBackground(new java.awt.Color(0, 204, 51));
        billingBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        billingBtn.setForeground(new java.awt.Color(255, 255, 255));
        billingBtn.setText("Billing");
        billingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingBtnActionPerformed(evt);
            }
        });

        enquiryBtn.setBackground(new java.awt.Color(0, 204, 51));
        enquiryBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enquiryBtn.setForeground(new java.awt.Color(255, 255, 255));
        enquiryBtn.setText("Enquiry");
        enquiryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enquiryBtnActionPerformed(evt);
            }
        });

        logOutLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        newAccLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newAccLabel.setForeground(new java.awt.Color(255, 255, 255));
        newAccLabel.setText("Create new account ?");
        newAccLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAccLabelMouseClicked(evt);
            }
        });

        checkInOutBtn.setBackground(new java.awt.Color(0, 204, 51));
        checkInOutBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checkInOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkInOutBtn.setText("Check In & Out");
        checkInOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainChildLayout = new javax.swing.GroupLayout(mainChild);
        mainChild.setLayout(mainChildLayout);
        mainChildLayout.setHorizontalGroup(
            mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainChildLayout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addGroup(mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainChildLayout.createSequentialGroup()
                        .addGroup(mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkInOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enquiryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainChildLayout.createSequentialGroup()
                                .addGroup(mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(billingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(158, 158, 158)
                                .addComponent(logOutLabel)))
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainChildLayout.createSequentialGroup()
                        .addComponent(newAccLabel)
                        .addGap(474, 474, 474))))
        );
        mainChildLayout.setVerticalGroup(
            mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainChildLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(mainChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutLabel))
                .addGap(18, 18, 18)
                .addComponent(bookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(serviceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkInOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enquiryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newAccLabel)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout bgMainLayout = new javax.swing.GroupLayout(bgMain);
        bgMain.setLayout(bgMainLayout);
        bgMainLayout.setHorizontalGroup(
            bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainChild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgMainLayout.setVerticalGroup(
            bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainChild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
        Customer c = new Customer();
        c.show();
        c.fNameTF.requestFocus();
        this.dispose();
        int num;
        String str;
        try {
            ps = con.prepareStatement("Select CCode from customer order by CCode desc LIMIT 1");
            rs = ps.executeQuery();
            rs.next();
            str = rs.getString(1);
            num = Integer.parseInt(str.substring(1));
            num++;
            if (num < 10) {
                str = "C00" + num;
            } else if (num < 100) {
                str = "C0" + num;
            } else if (num < 1000) {
                str = "C" + num;
            }
            c.CCodeTF.setText(str);

        } catch (Exception e3) {
            c.CCodeTF.setText("Error in Code generation");
        }


    }//GEN-LAST:event_customerBtnActionPerformed

    private void bookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingBtnActionPerformed
        // TODO add your handling code here:
        Booking b = new Booking();
        b.show();
        b.CCodeForeignTF.requestFocus();
        this.dispose();

        int num;
        String str;
        try {
            ps = con.prepareStatement("Select BookingNo from booking order by BookingNo desc LIMIT 1");
            rs = ps.executeQuery();
            rs.next();
            str = rs.getString(1);
            num = Integer.parseInt(str.substring(1));
            num++;
            if (num < 10) {
                str = "B00" + num;
            } else if (num < 100) {
                str = "B0" + num;
            } else if (num < 1000) {
                str = "B" + num;
            }
            b.bookingNoTF.setText(str);

            ps = con.prepareStatement("SELECT curdate()");
            rs = ps.executeQuery();
            rs.next();
            String bookingDate = rs.getString(1);
            b.bookingDateTF.setText(bookingDate);
        } catch (Exception e3) {
            b.bookingNoTF.setText("Error in Code generation");
        }
    }//GEN-LAST:event_bookingBtnActionPerformed

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
        // TODO add your handling code here:
        Service s = new Service();
        s.show();
        this.dispose();
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void billingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingBtnActionPerformed
        // TODO add your handling code here:
        Billing bi = new Billing();
        bi.show();
        bi.bookingNoForeignTF.requestFocus();
        this.dispose();

        int num;
        String str;
        try {
            ps = con.prepareStatement("Select BillNo from billing order by BillNo desc LIMIT 1");
            rs = ps.executeQuery();
            rs.next();
            str = rs.getString(1);
            num = Integer.parseInt(str.substring(3));
            num++;
            if (num < 10) {
                str = "BNo00" + num;
            } else if (num < 100) {
                str = "BNo0" + num;
            } else if (num < 1000) {
                str = "BNo" + num;
            }
            bi.billNoTF.setText(str);

            ps = con.prepareStatement("SELECT curdate()");
            rs = ps.executeQuery();
            rs.next();
            String billEntryDate = rs.getString(1);
            bi.billEntryDateTF.setText(billEntryDate);
        } catch (Exception e3) {
            bi.billNoTF.setText("Error in Code generation");
        }
    }//GEN-LAST:event_billingBtnActionPerformed

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        // TODO add your handling code here:

        LogIn_Reg log = new LogIn_Reg();
        log.show();
        this.dispose();

    }//GEN-LAST:event_logOutLabelMouseClicked

    private void enquiryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enquiryBtnActionPerformed
        // TODO add your handling code here:
        Enquiry e = new Enquiry();
        e.show();
        this.dispose();
    }//GEN-LAST:event_enquiryBtnActionPerformed

    private void newAccLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAccLabelMouseClicked
        // TODO add your handling code here:
        Registration r = new Registration();
        r.show();
        this.dispose();
    }//GEN-LAST:event_newAccLabelMouseClicked

    private void checkInOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInOutBtnActionPerformed
        // TODO add your handling code here:
        CheckInOut ch = new CheckInOut();
        ch.show();
        ch.roomNoTF.requestFocus();
        this.dispose();
    }//GEN-LAST:event_checkInOutBtnActionPerformed

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
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgMain;
    private javax.swing.JButton billingBtn;
    private javax.swing.JButton bookingBtn;
    private javax.swing.JButton checkInOutBtn;
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton enquiryBtn;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JPanel mainChild;
    private javax.swing.JLabel newAccLabel;
    private javax.swing.JButton serviceBtn;
    // End of variables declaration//GEN-END:variables
}
