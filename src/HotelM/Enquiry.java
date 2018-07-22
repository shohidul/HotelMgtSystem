package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Enquiry extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Enquiry() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
        focusListner();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enquiryPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        enquiryForm = new javax.swing.JPanel(){
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
        nameLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        CCTF = new javax.swing.JTextField();
        CCLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nationalityTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTA = new javax.swing.JTextArea();
        ageTF = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        enquiryClearButton = new javax.swing.JButton();
        nationalityLabel = new javax.swing.JLabel();
        phoneNoTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        roomNoTF = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneNoLabel = new javax.swing.JLabel();
        netBillAmountTF = new javax.swing.JTextField();
        netBillAmountLabel = new javax.swing.JLabel();
        dateOfArivalTF = new javax.swing.JTextField();
        dateOfArivalLabel = new javax.swing.JLabel();
        dateOfDepartureLabel = new javax.swing.JLabel();
        dateOfDepartureTF = new javax.swing.JTextField();
        noOfPersonTF = new javax.swing.JTextField();
        dueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        elst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        checkOutBillButton = new javax.swing.JButton();
        bookingNoTF = new javax.swing.JTextField();
        billNoTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        elst1 = new javax.swing.JList<>();
        noOfPersonLabel1 = new javax.swing.JLabel();
        dueTF = new javax.swing.JTextField();
        checkedStatusTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Enquriy Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        enquiryPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        enquiryPanel.setOpaque(false);

        enquiryForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Enquiry Form"));
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setText("Name");
        formPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 109, -1));

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        formPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 201, -1));
        formPanel.add(CCTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 201, -1));

        CCLabel.setText("Customer Code");
        formPanel.add(CCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 109, -1));

        addressLabel.setText("Address");
        formPanel.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 109, -1));

        nationalityTF.setEditable(false);
        formPanel.add(nationalityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 201, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addressTA.setEditable(false);
        addressTA.setColumns(10);
        addressTA.setLineWrap(true);
        addressTA.setRows(3);
        addressTA.setAutoscrolls(false);
        jScrollPane1.setViewportView(addressTA);

        formPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 200, 40));

        ageTF.setEditable(false);
        formPanel.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 201, -1));

        ageLabel.setText("Age");
        formPanel.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 109, -1));

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        formPanel.add(findButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 80, -1));

        enquiryClearButton.setText("Clear");
        enquiryClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enquiryClearButtonActionPerformed(evt);
            }
        });
        formPanel.add(enquiryClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 180, 80, -1));

        nationalityLabel.setText("Nationality");
        formPanel.add(nationalityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 109, -1));

        phoneNoTF.setEditable(false);
        formPanel.add(phoneNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 201, -1));

        emailTF.setEditable(false);
        formPanel.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 201, -1));

        roomNoTF.setEditable(false);
        formPanel.add(roomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 90, -1));

        roomNoLabel.setText("Room & booking No.");
        formPanel.add(roomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 150, -1));

        emailLabel.setText("E-mail");
        formPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 109, -1));

        phoneNoLabel.setText("Phone No.");
        formPanel.add(phoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 109, -1));

        netBillAmountTF.setEditable(false);
        formPanel.add(netBillAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 100, -1));

        netBillAmountLabel.setText("Net Bill Amount");
        formPanel.add(netBillAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 109, -1));

        dateOfArivalTF.setEditable(false);
        formPanel.add(dateOfArivalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, -1));

        dateOfArivalLabel.setText("Date Of Arival");
        formPanel.add(dateOfArivalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 109, -1));

        dateOfDepartureLabel.setText("Date Of Departure");
        formPanel.add(dateOfDepartureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 140, -1));

        dateOfDepartureTF.setEditable(false);
        formPanel.add(dateOfDepartureTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 201, -1));

        noOfPersonTF.setEditable(false);
        formPanel.add(noOfPersonTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 201, -1));

        dueLabel.setText("Due Amount");
        formPanel.add(dueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 109, -1));

        jScrollPane2.setViewportView(elst);

        formPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 170, 100));

        jLabel1.setText("Find Customer Code by first name");
        formPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        checkOutBillButton.setText("Check Bill Status");
        checkOutBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBillButtonActionPerformed(evt);
            }
        });
        formPanel.add(checkOutBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 170, -1));
        formPanel.add(bookingNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 100, -1));

        billNoTF.setEditable(false);
        formPanel.add(billNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 90, -1));

        jScrollPane3.setViewportView(elst1);

        formPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 170, -1));

        noOfPersonLabel1.setText("No. Of Person");
        formPanel.add(noOfPersonLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 109, -1));

        dueTF.setEditable(false);
        formPanel.add(dueTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 201, -1));

        checkedStatusTF.setEditable(false);
        formPanel.add(checkedStatusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 100, -1));

        javax.swing.GroupLayout enquiryFormLayout = new javax.swing.GroupLayout(enquiryForm);
        enquiryForm.setLayout(enquiryFormLayout);
        enquiryFormLayout.setHorizontalGroup(
            enquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enquiryFormLayout.createSequentialGroup()
                .addContainerGap(941, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(enquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enquiryFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        enquiryFormLayout.setVerticalGroup(
            enquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enquiryFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(enquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enquiryFormLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout enquiryPanelLayout = new javax.swing.GroupLayout(enquiryPanel);
        enquiryPanel.setLayout(enquiryPanelLayout);
        enquiryPanelLayout.setHorizontalGroup(
            enquiryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enquiryForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        enquiryPanelLayout.setVerticalGroup(
            enquiryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enquiryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enquiryForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enquiryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(enquiryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        MainFrame m = new MainFrame();
        m.show();
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void enquiryClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enquiryClearButtonActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");
        CCTF.setText("");
        ageTF.setText("");
        addressTA.setText("");
        phoneNoTF.setText("");
        nationalityTF.setText("");
        emailTF.setText("");
        roomNoTF.setText("");
        bookingNoTF.setText("");
        dateOfArivalTF.setText("");
        dateOfDepartureTF.setText("");
        noOfPersonTF.setText("");
        billNoTF.setText("");
        netBillAmountTF.setText("");
        String ss[] = new String[10];
        elst.setListData(ss);
        dueTF.setText("");
        checkedStatusTF.setText("");
    }//GEN-LAST:event_enquiryClearButtonActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
        String ss[];
        ss = new String[10];
        int i = 0;
        try {
            ps = con.prepareStatement("Select * from customer where FirstName=?");
            ps.setString(1, nameTF.getText());
            rs = ps.executeQuery();
            while (rs.next()) {
                ss[i] = rs.getString(1);
                i++;
            }
            elst.setListData(ss);
            elst.setVisibleRowCount(5);
        } catch (Exception e1) {
            nameTF.setText("No such record Available!");
        }
    }//GEN-LAST:event_nameTFActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:

        try {

            ps = con.prepareStatement("Select * from customer where CCode=?");
            ps.setString(1, CCTF.getText());
            rs = ps.executeQuery();
            rs.next();
            CCTF.setText(rs.getString(1));
            ageTF.setText(String.valueOf(rs.getInt(5)));
            nationalityTF.setText(rs.getString(7));
            addressTA.setText(rs.getString(11));
            phoneNoTF.setText(rs.getString(13));
            emailTF.setText(rs.getString(14));
            nameTF.setText(rs.getString(2) + " " + rs.getString(3));

            ps = con.prepareStatement("Select * from booking where CCode=?");
            ps.setString(1, CCTF.getText());
            rs = ps.executeQuery();
            rs.next();
            bookingNoTF.setText(rs.getString(1));

        } catch (Exception ee1) {
            CCTF.setText("Error in finding record " + CCTF.getText());
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void checkOutBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBillButtonActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select * from billing where BookingNo=?");
            ps.setString(1, bookingNoTF.getText());
            rs = ps.executeQuery();
            rs.next();
            billNoTF.setText(rs.getString(1));
            dateOfDepartureTF.setText(rs.getString(4));
            netBillAmountTF.setText(rs.getString(11));
            dueTF.setText(rs.getString(15));

            ps = con.prepareStatement("Select * from booking where BookingNo=?");
            ps.setString(1, bookingNoTF.getText());
            rs = ps.executeQuery();
            rs.next();
            CCTF.setText(rs.getString(2));
            roomNoTF.setText(String.valueOf(rs.getInt(4)));
            dateOfArivalTF.setText(rs.getString(6));
            noOfPersonTF.setText(String.valueOf(rs.getInt(8)));
            checkedStatusTF.setText(rs.getString(11));
        } catch (Exception e) {
            netBillAmountTF.setText("Error in finding record ");
        }
    }//GEN-LAST:event_checkOutBillButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enquiry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCLabel;
    private javax.swing.JTextField CCTF;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTA;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField billNoTF;
    private javax.swing.JTextField bookingNoTF;
    private javax.swing.JButton checkOutBillButton;
    private javax.swing.JTextField checkedStatusTF;
    private javax.swing.JLabel dateOfArivalLabel;
    private javax.swing.JTextField dateOfArivalTF;
    private javax.swing.JLabel dateOfDepartureLabel;
    private javax.swing.JTextField dateOfDepartureTF;
    private javax.swing.JLabel dueLabel;
    private javax.swing.JTextField dueTF;
    private javax.swing.JList<String> elst;
    private javax.swing.JList<String> elst1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton enquiryClearButton;
    private javax.swing.JPanel enquiryForm;
    private javax.swing.JPanel enquiryPanel;
    private javax.swing.JButton findButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField nationalityTF;
    private javax.swing.JLabel netBillAmountLabel;
    private javax.swing.JTextField netBillAmountTF;
    private javax.swing.JLabel noOfPersonLabel1;
    private javax.swing.JTextField noOfPersonTF;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTF;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JTextField roomNoTF;
    // End of variables declaration//GEN-END:variables

    private void focusListner() {
        nameTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String ss[];
                ss = new String[10];
                int i = 0;
                try {
                    ps = con.prepareStatement("Select * from customer where FirstName=?");
                    ps.setString(1, nameTF.getText());
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        ss[i] = rs.getString(1);
                        i++;
                    }
                    elst.setListData(ss);
                    elst.setVisibleRowCount(5);
                } catch (Exception e1) {
                    nameTF.setText("Sorry !! No such record Available");
                }
            }
        });

        elst.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String x = (String) elst.getSelectedValue();
                CCTF.setText(x);

                String ss[];
                ss = new String[10];
                int i = 0;
                try {
                    ps = con.prepareStatement("Select * from booking where Ccode=?");
                    ps.setString(1, x);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        ss[i] = rs.getString(1);
                        i++;
                    }
                    elst1.setListData(ss);
                    elst1.setVisibleRowCount(5);
                } catch (Exception e1) {
                    CCTF.setText("Sorry !! No such record Available");
                }

            }
        });

        elst1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String x = (String) elst1.getSelectedValue();
                bookingNoTF.setText(x);
            }
        });
    }

}
