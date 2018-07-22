
package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Billing extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private int damt;

    public Billing() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
        focusLostListener();
        showBillingTable();
        tableChoosejComboBox.setSelectedIndex(3);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        billingPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        billingForm = new javax.swing.JPanel(){
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
        bookingNoLabel = new javax.swing.JLabel();
        bookingNoForeignTF = new javax.swing.JTextField();
        roomNoTF = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billingTable = new javax.swing.JTable();
        billingSaveButton = new javax.swing.JButton();
        billingClearButton = new javax.swing.JButton();
        dateOfArivalLabel = new javax.swing.JLabel();
        dateOfArivalTF = new javax.swing.JTextField();
        departureDateTF = new javax.swing.JTextField();
        departureDateLabel = new javax.swing.JLabel();
        billNoTF = new javax.swing.JTextField();
        serviceChargesTF = new javax.swing.JTextField();
        totalRoomRentTF = new javax.swing.JTextField();
        billingDayTF = new javax.swing.JTextField();
        billingDayLabel = new javax.swing.JLabel();
        totalRoomRentLabel = new javax.swing.JLabel();
        serviceChargesLabel = new javax.swing.JLabel();
        billNoLabel = new javax.swing.JLabel();
        outstandingAmountLabel = new javax.swing.JLabel();
        grossBillAmountLabel = new javax.swing.JLabel();
        outstandingAmountTF = new javax.swing.JTextField();
        amountRecivedTF = new javax.swing.JTextField();
        creditCardNoTF = new javax.swing.JTextField();
        grossBillAmountTF = new javax.swing.JTextField();
        amountRecivedLabel = new javax.swing.JLabel();
        creditCardNoLabel = new javax.swing.JLabel();
        billingModeLabel = new javax.swing.JLabel();
        netBillAmountLabel = new javax.swing.JLabel();
        lNameLabel3 = new javax.swing.JLabel();
        serviceTaxLabel = new javax.swing.JLabel();
        serviceTaxTF = new javax.swing.JTextField();
        discountAllowedTF = new javax.swing.JTextField();
        netBillAmountTF = new javax.swing.JTextField();
        billingModeComboBox = new javax.swing.JComboBox<>();
        tableChoosejComboBox = new javax.swing.JComboBox<>();
        addNewBillButton = new javax.swing.JButton();
        billEntryDateTF = new javax.swing.JTextField();
        billingPrintButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Billing Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        billingPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        billingPanel.setOpaque(false);

        billingForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Billing Information"));
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingNoLabel.setText("Booking No");
        formPanel.add(bookingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 109, -1));

        bookingNoForeignTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingNoForeignTFActionPerformed(evt);
            }
        });
        formPanel.add(bookingNoForeignTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 201, -1));

        roomNoTF.setEditable(false);
        formPanel.add(roomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 201, -1));

        roomNoLabel.setText("Room No.");
        formPanel.add(roomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 109, -1));

        billingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(billingTable);

        formPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, 849, 90));

        billingSaveButton.setText("Save");
        billingSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingSaveButtonActionPerformed(evt);
            }
        });
        formPanel.add(billingSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 100, -1));

        billingClearButton.setText("Clear");
        billingClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingClearButtonActionPerformed(evt);
            }
        });
        formPanel.add(billingClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 100, -1));

        dateOfArivalLabel.setText("Date Of Arival");
        formPanel.add(dateOfArivalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 109, -1));

        dateOfArivalTF.setEditable(false);
        formPanel.add(dateOfArivalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 201, -1));

        departureDateTF.setEditable(false);
        formPanel.add(departureDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 201, -1));

        departureDateLabel.setText("Departure Date");
        formPanel.add(departureDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, -1));

        billNoTF.setEditable(false);
        formPanel.add(billNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, -1));

        serviceChargesTF.setEditable(false);
        serviceChargesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceChargesTFActionPerformed(evt);
            }
        });
        formPanel.add(serviceChargesTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 201, -1));

        totalRoomRentTF.setEditable(false);
        formPanel.add(totalRoomRentTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 201, -1));

        billingDayTF.setEditable(false);
        formPanel.add(billingDayTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 201, -1));

        billingDayLabel.setText("Billing Days");
        formPanel.add(billingDayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 109, -1));

        totalRoomRentLabel.setText("Total Room Rent");
        formPanel.add(totalRoomRentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, -1));

        serviceChargesLabel.setText("Service Charges");
        formPanel.add(serviceChargesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, -1));

        billNoLabel.setText("Bill No.");
        formPanel.add(billNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 109, -1));

        outstandingAmountLabel.setText("Outstanding Amount");
        formPanel.add(outstandingAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 150, -1));

        grossBillAmountLabel.setText("Gross Bill Amount");
        formPanel.add(grossBillAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 130, -1));

        outstandingAmountTF.setEditable(false);
        outstandingAmountTF.setText("0");
        formPanel.add(outstandingAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 201, -1));

        amountRecivedTF.setText("0");
        amountRecivedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountRecivedTFActionPerformed(evt);
            }
        });
        formPanel.add(amountRecivedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 201, -1));

        creditCardNoTF.setText("NULL");
        creditCardNoTF.setEnabled(false);
        creditCardNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardNoTFActionPerformed(evt);
            }
        });
        formPanel.add(creditCardNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 201, -1));

        grossBillAmountTF.setEditable(false);
        formPanel.add(grossBillAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 201, -1));

        amountRecivedLabel.setText("Amount Recived");
        formPanel.add(amountRecivedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 130, -1));

        creditCardNoLabel.setText("Credit Card No.");
        formPanel.add(creditCardNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 109, -1));

        billingModeLabel.setText("Billing Mode");
        formPanel.add(billingModeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 109, -1));

        netBillAmountLabel.setText("Net Bill Amount");
        formPanel.add(netBillAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 109, -1));

        lNameLabel3.setText("Discount Allowed");
        formPanel.add(lNameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, -1));

        serviceTaxLabel.setText("Service Tax in %");
        formPanel.add(serviceTaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 120, -1));

        serviceTaxTF.setEditable(false);
        formPanel.add(serviceTaxTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 201, -1));

        discountAllowedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountAllowedTFActionPerformed(evt);
            }
        });
        formPanel.add(discountAllowedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 201, -1));

        netBillAmountTF.setEditable(false);
        formPanel.add(netBillAmountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 201, -1));

        billingModeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Cash", "By Card" }));
        billingModeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingModeComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(billingModeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 200, -1));

        tableChoosejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Booking", "Service", "Billing" }));
        tableChoosejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableChoosejComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(tableChoosejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        addNewBillButton.setText("Add New");
        addNewBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBillButtonActionPerformed(evt);
            }
        });
        formPanel.add(addNewBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 100, -1));

        billEntryDateTF.setEditable(false);
        formPanel.add(billEntryDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 90, -1));

        billingPrintButton.setText("Print");
        billingPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingPrintButtonActionPerformed(evt);
            }
        });
        formPanel.add(billingPrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 100, -1));

        javax.swing.GroupLayout billingFormLayout = new javax.swing.GroupLayout(billingForm);
        billingForm.setLayout(billingFormLayout);
        billingFormLayout.setHorizontalGroup(
            billingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingFormLayout.createSequentialGroup()
                .addContainerGap(941, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(billingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(billingFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        billingFormLayout.setVerticalGroup(
            billingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(billingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(billingFormLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout billingPanelLayout = new javax.swing.GroupLayout(billingPanel);
        billingPanel.setLayout(billingPanelLayout);
        billingPanelLayout.setHorizontalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billingForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billingPanelLayout.setVerticalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billingForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        MainFrame m = new MainFrame();
        m.show();
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void billingClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingClearButtonActionPerformed
        // TODO add your handling code here:
        bookingNoForeignTF.setText("");
        departureDateTF.setText("");
        billingDayTF.setText("");
        totalRoomRentTF.setText("");
        serviceChargesTF.setText("");
        grossBillAmountTF.setText("");
        serviceTaxTF.setText("");
        discountAllowedTF.setText("");
        netBillAmountTF.setText("");
        billingModeComboBox.setSelectedIndex(0);
        creditCardNoTF.setText("NULL");
        outstandingAmountTF.setText("0");
        amountRecivedTF.setText("0");
        roomNoTF.setText("");
        dateOfArivalTF.setText("");
                
    }//GEN-LAST:event_billingClearButtonActionPerformed

    private void billingSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingSaveButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save?", "Save", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            try {
                if (amountRecivedTF.getText().equals("0") && outstandingAmountTF.getText().equals("0")) {

                    amountRecivedTF.setText("Enter amount recived!");

                } else {
                    ps = con.prepareStatement("Insert into billing values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, billNoTF.getText());
                    ps.setString(2, billEntryDateTF.getText());
                    ps.setString(3, bookingNoForeignTF.getText());
                    ps.setString(4, departureDateTF.getText());
                    ps.setInt(5, Integer.parseInt(billingDayTF.getText()));
                    ps.setInt(6, Integer.parseInt(totalRoomRentTF.getText()));
                    ps.setInt(7, Integer.parseInt(serviceChargesTF.getText()));
                    ps.setInt(8, Integer.parseInt(grossBillAmountTF.getText()));
                    ps.setInt(9, Integer.parseInt(serviceTaxTF.getText()));
                    ps.setInt(10, Integer.parseInt(discountAllowedTF.getText()));
                    ps.setInt(11, Integer.parseInt(netBillAmountTF.getText()));
                    ps.setString(12, (String) billingModeComboBox.getSelectedItem());
                    ps.setString(13, creditCardNoTF.getText());
                    ps.setInt(14, Integer.parseInt(amountRecivedTF.getText()));
                    ps.setInt(15, Integer.parseInt(outstandingAmountTF.getText()));
                    ps.executeUpdate();

                    billNoTF.setText("Billing successfully done");
                   // bookingNoForeignTF.setText("");
                    departureDateTF.setText("");
                    billingDayTF.setText("");
                    totalRoomRentTF.setText("");
                    serviceChargesTF.setText("");
                    grossBillAmountTF.setText("");
                    serviceTaxTF.setText("");
                    discountAllowedTF.setText("");
                    netBillAmountTF.setText("");
                    billingModeComboBox.setSelectedIndex(0);
                    creditCardNoTF.setText("");
                    outstandingAmountTF.setText("0");
                    amountRecivedTF.setText("");
                    roomNoTF.setText("");
                    dateOfArivalTF.setText("");
                    showBillingTable();
                    //For printing the bill
                    //   PrintUtilities.printComponent(this);
                }

            } catch (Exception e) {
                billNoTF.setText("Error in Billing");

            }
        }
    }//GEN-LAST:event_billingSaveButtonActionPerformed

    private void bookingNoForeignTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingNoForeignTFActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select * from booking where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            roomNoTF.setText(rs.getString(4));
            dateOfArivalTF.setText(rs.getString(6));
            departureDateTF.setText(rs.getString(7));

            ps = con.prepareStatement("Select DateDiff(?,?)");
            ps.setString(1, departureDateTF.getText());
            ps.setString(2, dateOfArivalTF.getText());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getString(1).equals("0")) {
                billingDayTF.setText("1");
            } else {
                billingDayTF.setText(rs.getString(1));
            }

            ps = con.prepareStatement("Select * from rooms where RoomNo=?");
            ps.setString(1, roomNoTF.getText());
            rs = ps.executeQuery();
            rs.next();
            int rent;
            rent = rs.getInt(3) * Integer.parseInt(billingDayTF.getText());
            totalRoomRentTF.setText(String.valueOf(rent));

            ps = con.prepareStatement("Select sum(TotalServiceCharge) from service where BookingNo=?");
            ps.setString(1, bookingNoForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();

            serviceChargesTF.setText(String.valueOf(rs.getInt(1)));

            int amt, st, ar;
            amt = Integer.parseInt(totalRoomRentTF.getText()) + Integer.parseInt(serviceChargesTF.getText());
            grossBillAmountTF.setText(String.valueOf(amt));
            st = amt * 10 / 100;
            serviceTaxTF.setText(String.valueOf(st));
            discountAllowedTF.setText("0");

            amt = amt + st;
            damt = amt;
            netBillAmountTF.setText(String.valueOf(amt));

            discountAllowedTF.requestFocus();

        } catch (Exception ex) {
            bookingNoForeignTF.setText("BookingNo doesn't exist!");
        }
    }//GEN-LAST:event_bookingNoForeignTFActionPerformed

    private void serviceChargesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceChargesTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_serviceChargesTFActionPerformed

    private void discountAllowedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountAllowedTFActionPerformed
        // TODO add your handling code here:
        int ar;
        ar = Integer.parseInt(discountAllowedTF.getText());
        damt = damt - ar;
        netBillAmountTF.setText(String.valueOf(damt));

        amountRecivedTF.requestFocus();
    }//GEN-LAST:event_discountAllowedTFActionPerformed

    private void billingModeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingModeComboBoxActionPerformed
        // TODO add your handling code here:
        String qq;
        qq = (String) billingModeComboBox.getSelectedItem();
        if (qq.equals("By Card")) {
            creditCardNoTF.setEnabled(true);
            creditCardNoTF.setText("");
            creditCardNoTF.requestFocus();
            amountRecivedTF.setText("0");
            amountRecivedTF.setEnabled(false);
            outstandingAmountTF.setText("0");
        } else {
            creditCardNoTF.setText("NULL");
            creditCardNoTF.setEnabled(false);
            amountRecivedTF.setText("0");
            amountRecivedTF.setEnabled(true);
        }
    }//GEN-LAST:event_billingModeComboBoxActionPerformed

    private void amountRecivedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountRecivedTFActionPerformed
        // TODO add your handling code here:
        int ar;
        ar = Integer.parseInt(netBillAmountTF.getText()) - Integer.parseInt(amountRecivedTF.getText());
        outstandingAmountTF.setText(String.valueOf(ar));
    }//GEN-LAST:event_amountRecivedTFActionPerformed

    private void creditCardNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardNoTFActionPerformed
        // TODO add your handling code here:
        amountRecivedTF.setText(String.valueOf(netBillAmountTF.getText()));
    }//GEN-LAST:event_creditCardNoTFActionPerformed

    private void tableChoosejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableChoosejComboBoxActionPerformed
        // TODO add your handling code here:
        if (tableChoosejComboBox.getSelectedIndex() == 0) {
            showDataInTable();
        }

        if (tableChoosejComboBox.getSelectedIndex() == 1) {
            showBookingTable();
        }

        if (tableChoosejComboBox.getSelectedIndex() == 2) {
            showServiceTable();
        }

        if (tableChoosejComboBox.getSelectedIndex() == 3) {
            showBillingTable();
        }
    }//GEN-LAST:event_tableChoosejComboBoxActionPerformed

    private void addNewBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBillButtonActionPerformed
        // TODO add your handling code here:
        bookingNoForeignTF.setText("");
        bookingNoForeignTF.requestFocus();

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
            billNoTF.setText(str);

            ps = con.prepareStatement("SELECT curdate()");
            rs = ps.executeQuery();
            rs.next();
            String billEntryDate = rs.getString(1);
            billEntryDateTF.setText(billEntryDate);

        } catch (Exception e3) {
            billNoTF.setText("Error in Code generation");
        }
    }//GEN-LAST:event_addNewBillButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Warnning", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void billingPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingPrintButtonActionPerformed
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
    }//GEN-LAST:event_billingPrintButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBillButton;
    private javax.swing.JLabel amountRecivedLabel;
    private javax.swing.JTextField amountRecivedTF;
    private javax.swing.JLabel backLabel;
    public javax.swing.JTextField billEntryDateTF;
    private javax.swing.JLabel billNoLabel;
    public javax.swing.JTextField billNoTF;
    private javax.swing.JButton billingClearButton;
    private javax.swing.JLabel billingDayLabel;
    private javax.swing.JTextField billingDayTF;
    private javax.swing.JPanel billingForm;
    private javax.swing.JComboBox<String> billingModeComboBox;
    private javax.swing.JLabel billingModeLabel;
    private javax.swing.JPanel billingPanel;
    private javax.swing.JButton billingPrintButton;
    private javax.swing.JButton billingSaveButton;
    private javax.swing.JTable billingTable;
    public javax.swing.JTextField bookingNoForeignTF;
    private javax.swing.JLabel bookingNoLabel;
    private javax.swing.JLabel creditCardNoLabel;
    private javax.swing.JTextField creditCardNoTF;
    private javax.swing.JLabel dateOfArivalLabel;
    private javax.swing.JTextField dateOfArivalTF;
    private javax.swing.JLabel departureDateLabel;
    public javax.swing.JTextField departureDateTF;
    private javax.swing.JTextField discountAllowedTF;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel grossBillAmountLabel;
    private javax.swing.JTextField grossBillAmountTF;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lNameLabel3;
    private javax.swing.JLabel netBillAmountLabel;
    private javax.swing.JTextField netBillAmountTF;
    private javax.swing.JLabel outstandingAmountLabel;
    private javax.swing.JTextField outstandingAmountTF;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JTextField roomNoTF;
    private javax.swing.JLabel serviceChargesLabel;
    public javax.swing.JTextField serviceChargesTF;
    private javax.swing.JLabel serviceTaxLabel;
    private javax.swing.JTextField serviceTaxTF;
    private javax.swing.JComboBox<String> tableChoosejComboBox;
    private javax.swing.JLabel totalRoomRentLabel;
    private javax.swing.JTextField totalRoomRentTF;
    // End of variables declaration//GEN-END:variables

    private void focusLostListener() {
        bookingNoForeignTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                try {
                    ps = con.prepareStatement("Select * from booking where BookingNo=?");
                    ps.setString(1, bookingNoForeignTF.getText());
                    rs = ps.executeQuery();
                    rs.next();
                    roomNoTF.setText(rs.getString(4));
                    dateOfArivalTF.setText(rs.getString(6));
                    departureDateTF.setText(rs.getString(7));

                    ps = con.prepareStatement("Select DateDiff(?,?)");
                    ps.setString(1, departureDateTF.getText());
                    ps.setString(2, dateOfArivalTF.getText());
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs.getString(1).equals("0")) {
                        billingDayTF.setText("1");
                    } else {
                        billingDayTF.setText(rs.getString(1));
                    }

                    ps = con.prepareStatement("Select * from rooms where RoomNo=?");
                    ps.setString(1, roomNoTF.getText());
                    rs = ps.executeQuery();
                    rs.next();
                    int rent;
                    rent = rs.getInt(3) * Integer.parseInt(billingDayTF.getText());
                    totalRoomRentTF.setText(String.valueOf(rent));

                    ps = con.prepareStatement("Select sum(TotalServiceCharge) from service where BookingNo=?");
                    ps.setString(1, bookingNoForeignTF.getText());
                    rs = ps.executeQuery();
                    rs.next();

                    serviceChargesTF.setText(String.valueOf(rs.getInt(1)));

                    int amt, st, ar;
                    amt = Integer.parseInt(totalRoomRentTF.getText()) + Integer.parseInt(serviceChargesTF.getText());
                    grossBillAmountTF.setText(String.valueOf(amt));
                    st = amt * 10 / 100;
                    serviceTaxTF.setText(String.valueOf(st));
                    discountAllowedTF.setText("0");

                    amt = amt + st;
                    damt = amt;
                    netBillAmountTF.setText(String.valueOf(amt));

                    discountAllowedTF.requestFocus();

                } catch (Exception ex) {
                    bookingNoForeignTF.setText("BookingNo doesn't exist!");
                }
            }
        });

        discountAllowedTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                int ar;
                ar = Integer.parseInt(discountAllowedTF.getText());
                damt = damt - ar;
                netBillAmountTF.setText(String.valueOf(damt));

                amountRecivedTF.requestFocus();
            }
        });

        departureDateTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                bookingNoForeignTF.requestFocus();
            }
        });
    }
    
    private void showDataInTable() {
        try {
            ps = con.prepareStatement("Select * from customer order by CCode desc LIMIT 3");
            rs = ps.executeQuery();
            billingTable.setAutoResizeMode(billingTable.AUTO_RESIZE_OFF);
            billingTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBookingTable() {
        try {
            ps = con.prepareStatement("Select * from booking order by BookingNo desc LIMIT 3");
            rs = ps.executeQuery();
            billingTable.setAutoResizeMode(billingTable.AUTO_RESIZE_ALL_COLUMNS);
            billingTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

    }

    private void showServiceTable() {
        try {
            ps = con.prepareStatement("Select * from service order by ID desc LIMIT 3");
            rs = ps.executeQuery();
            billingTable.setAutoResizeMode(billingTable.AUTO_RESIZE_ALL_COLUMNS);
            billingTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billing order by BillNo desc LIMIT 3");
            rs = ps.executeQuery();
            billingTable.setAutoResizeMode(billingTable.AUTO_RESIZE_OFF);
            billingTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
}
