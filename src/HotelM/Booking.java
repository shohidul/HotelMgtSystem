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
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class Booking extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Booking() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();        
        availableRooms();
        CCodeForeignTFFocusLost();
        showBookingTable();

        tableChoosejComboBox.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        bookingForm = new javax.swing.JPanel(){
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
        bookingNoTF = new javax.swing.JTextField();
        CCodeForeignLabel = new javax.swing.JLabel();
        CCodeForeignTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        noOfPersonLabel = new javax.swing.JLabel();
        noOfPersonTF = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        roomNoTF = new javax.swing.JTextField();
        bookingDateLabel = new javax.swing.JLabel();
        bookingDateTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTA = new javax.swing.JTextArea();
        relationshipLabel = new javax.swing.JLabel();
        bookSaveButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookingjTable = new javax.swing.JTable();
        bookingClearButton = new javax.swing.JButton();
        roomsComboBox = new javax.swing.JComboBox<>();
        tableChoosejComboBox = new javax.swing.JComboBox<>();
        addNewBookButton = new javax.swing.JButton();
        dateOfArivalLabel1 = new javax.swing.JLabel();
        bookingStatusButton = new javax.swing.JButton();
        relationshipTF = new javax.swing.JTextField();
        dateOfDepartureLabel = new javax.swing.JLabel();
        bookingForTF = new javax.swing.JTextField();
        bookingForLabel = new javax.swing.JLabel();
        roomsButton = new javax.swing.JButton();
        dateOfArivalTF = new com.toedter.calendar.JDateChooser();
        dateOfDepartureTF = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Booking Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bookingPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        bookingPanel.setOpaque(false);
        bookingPanel.setPreferredSize(new java.awt.Dimension(1100, 619));

        bookingForm.setOpaque(false);
        bookingForm.setPreferredSize(new java.awt.Dimension(1100, 608));

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Booking Information"));
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingNoLabel.setText("Booking No.");
        formPanel.add(bookingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 109, -1));

        bookingNoTF.setEditable(false);
        formPanel.add(bookingNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 201, -1));

        CCodeForeignLabel.setText("Customer Code");
        formPanel.add(CCodeForeignLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 109, -1));

        CCodeForeignTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCodeForeignTFActionPerformed(evt);
            }
        });
        formPanel.add(CCodeForeignTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 201, -1));

        nameTF.setEditable(false);
        formPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 201, -1));

        nameLabel.setText("Name");
        formPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 109, -1));

        addressLabel.setText("Address");
        formPanel.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 109, -1));

        noOfPersonLabel.setText("No. Of Person");
        formPanel.add(noOfPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 109, -1));
        formPanel.add(noOfPersonTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 201, -1));

        roomNoLabel.setText("Room No.");
        formPanel.add(roomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 109, -1));
        formPanel.add(roomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 201, -1));

        bookingDateLabel.setText("Booking Date");
        formPanel.add(bookingDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 109, -1));

        bookingDateTF.setEditable(false);
        formPanel.add(bookingDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 201, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addressTA.setEditable(false);
        addressTA.setColumns(10);
        addressTA.setLineWrap(true);
        addressTA.setRows(3);
        addressTA.setAutoscrolls(false);
        jScrollPane1.setViewportView(addressTA);

        formPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 200, 57));

        relationshipLabel.setText("Relationship");
        formPanel.add(relationshipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 109, -1));

        bookSaveButton.setText("Save");
        bookSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSaveButtonActionPerformed(evt);
            }
        });
        formPanel.add(bookSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 100, -1));

        bookingjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(bookingjTable);

        formPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, 850, 90));

        bookingClearButton.setText("Clear");
        bookingClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingClearButtonActionPerformed(evt);
            }
        });
        formPanel.add(bookingClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 100, -1));

        roomsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(roomsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 200, -1));

        tableChoosejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Booking", "Service", "Billing" }));
        tableChoosejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableChoosejComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(tableChoosejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        addNewBookButton.setText("Add New");
        addNewBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBookButtonActionPerformed(evt);
            }
        });
        formPanel.add(addNewBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 200, -1));

        dateOfArivalLabel1.setText("Date Of Arival");
        formPanel.add(dateOfArivalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 109, -1));

        bookingStatusButton.setText("Booking Status");
        bookingStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingStatusButtonActionPerformed(evt);
            }
        });
        formPanel.add(bookingStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 150, -1));
        formPanel.add(relationshipTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 201, -1));

        dateOfDepartureLabel.setText("Date Of Departure");
        formPanel.add(dateOfDepartureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 140, -1));

        bookingForTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingForTFActionPerformed(evt);
            }
        });
        formPanel.add(bookingForTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 201, -1));

        bookingForLabel.setText("Booking For Days");
        formPanel.add(bookingForLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 140, -1));

        roomsButton.setText("Room List");
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });
        formPanel.add(roomsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, -1));

        dateOfArivalTF.setDateFormatString("yyyy-MM-dd");
        dateOfArivalTF.setOpaque(false);
        formPanel.add(dateOfArivalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 200, -1));

        dateOfDepartureTF.setDateFormatString("yyyy-MM-dd");
        dateOfDepartureTF.setOpaque(false);
        formPanel.add(dateOfDepartureTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 200, -1));

        javax.swing.GroupLayout bookingFormLayout = new javax.swing.GroupLayout(bookingForm);
        bookingForm.setLayout(bookingFormLayout);
        bookingFormLayout.setHorizontalGroup(
            bookingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingFormLayout.createSequentialGroup()
                .addContainerGap(897, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(bookingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookingFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        bookingFormLayout.setVerticalGroup(
            bookingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(532, Short.MAX_VALUE))
            .addGroup(bookingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookingFormLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingForm, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        MainFrame m = new MainFrame();
        m.show();
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void bookingClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingClearButtonActionPerformed
        // TODO add your handling code here:
        //bookingNoTF.setText("");
        CCodeForeignTF.setText("");
        nameTF.setText("");
        addressTA.setText("");
        roomNoTF.setText("");
        ((JTextField)dateOfArivalTF.getDateEditor().getUiComponent()).setText("");
        ((JTextField)dateOfDepartureTF.getDateEditor().getUiComponent()).setText("");
        bookingForTF.setText("");
        noOfPersonTF.setText("");
        relationshipTF.setText("");
        roomsComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_bookingClearButtonActionPerformed

    private void bookSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSaveButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save?", "Save", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            try {
                ps = con.prepareStatement("Insert into booking values (?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, bookingNoTF.getText());
                ps.setString(2, CCodeForeignTF.getText());
                ps.setString(3, nameTF.getText());
                ps.setInt(4, Integer.parseInt(roomNoTF.getText()));
                ps.setString(5, bookingDateTF.getText());
                ps.setString(6, ((JTextField)dateOfArivalTF.getDateEditor().getUiComponent()).getText());
                ps.setString(7, ((JTextField)dateOfDepartureTF.getDateEditor().getUiComponent()).getText());
                ps.setString(8, bookingForTF.getText());
                ps.setInt(9, Integer.parseInt(noOfPersonTF.getText()));
                ps.setString(10, relationshipTF.getText());
                ps.setString(11, "");
                ps.executeUpdate();

                bookingNoTF.setText("Booking successfully added");
                CCodeForeignTF.setText("");
                nameTF.setText("");
                addressTA.setText("");
                roomNoTF.setText("");
                ((JTextField)dateOfArivalTF.getDateEditor().getUiComponent()).setText("");
                ((JTextField)dateOfDepartureTF.getDateEditor().getUiComponent()).setText("");
                bookingForTF.setText("");
                noOfPersonTF.setText("");
                relationshipTF.setText("");
                showBookingTable();
            } catch (Exception e) {
                bookingNoTF.setText("Error in Booking");
            }
        }
    }//GEN-LAST:event_bookSaveButtonActionPerformed

    private void CCodeForeignTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCodeForeignTFActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select * from customer where CCode=?");
            ps.setString(1, CCodeForeignTF.getText());
            rs = ps.executeQuery();
            rs.next();
            nameTF.setText(rs.getString(2) + " " + rs.getString(3));
            addressTA.setText(rs.getString(11));
        } catch (Exception ex) {
            CCodeForeignTF.setText("Invalid Customer No.!");
            nameTF.setText("");
            addressTA.setText("");

        }
    }//GEN-LAST:event_CCodeForeignTFActionPerformed

    private void roomsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsComboBoxActionPerformed
        // TODO add your handling code here:
        String rr;
        rr = (String) roomsComboBox.getSelectedItem();
        rr = rr.substring(0, 3);
        roomNoTF.setText(rr);
    }//GEN-LAST:event_roomsComboBoxActionPerformed

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

    private void addNewBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBookButtonActionPerformed
        // TODO add your handling code here:
        CCodeForeignTF.requestFocus();
        CCodeForeignTF.setText("");
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
            bookingNoTF.setText(str);

            ps = con.prepareStatement("SELECT curdate()");
            rs = ps.executeQuery();
            rs.next();
            String bookingDate = rs.getString(1);
            bookingDateTF.setText(bookingDate);
        } catch (Exception e3) {
            bookingNoTF.setText("Error in Code generation");
        }
    }//GEN-LAST:event_addNewBookButtonActionPerformed

    private void bookingStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingStatusButtonActionPerformed
        // TODO add your handling code here:
        BookingStatus bs = new BookingStatus();
        bs.show();
    }//GEN-LAST:event_bookingStatusButtonActionPerformed

    private void bookingForTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingForTFActionPerformed
        // TODO add your handling code here:
        try {
            ps = con.prepareStatement("Select DateDiff(?,?)");
            ps.setString(1, ((JTextField)dateOfDepartureTF.getDateEditor().getUiComponent()).getText());
            ps.setString(2, ((JTextField)dateOfArivalTF.getDateEditor().getUiComponent()).getText());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getString(1).equals("0")) {
                bookingForTF.setText("1");
            } else {
                bookingForTF.setText(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bookingForTFActionPerformed

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        // TODO add your handling code here:
        RoomList rm = new RoomList();
        rm.show();
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling cod// dateOfArivalTF.setText("");
      //  dateOfDepartureTF.setText("");e here:
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCodeForeignLabel;
    public javax.swing.JTextField CCodeForeignTF;
    private javax.swing.JButton addNewBookButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTA;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton bookSaveButton;
    private javax.swing.JButton bookingClearButton;
    private javax.swing.JLabel bookingDateLabel;
    public javax.swing.JTextField bookingDateTF;
    private javax.swing.JLabel bookingForLabel;
    private javax.swing.JTextField bookingForTF;
    private javax.swing.JPanel bookingForm;
    private javax.swing.JLabel bookingNoLabel;
    public javax.swing.JTextField bookingNoTF;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JButton bookingStatusButton;
    private javax.swing.JTable bookingjTable;
    private javax.swing.JLabel dateOfArivalLabel1;
    private com.toedter.calendar.JDateChooser dateOfArivalTF;
    private javax.swing.JLabel dateOfDepartureLabel;
    private com.toedter.calendar.JDateChooser dateOfDepartureTF;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel noOfPersonLabel;
    private javax.swing.JTextField noOfPersonTF;
    private javax.swing.JLabel relationshipLabel;
    private javax.swing.JTextField relationshipTF;
    private javax.swing.JLabel roomNoLabel;
    public javax.swing.JTextField roomNoTF;
    private javax.swing.JButton roomsButton;
    private javax.swing.JComboBox<String> roomsComboBox;
    private javax.swing.JComboBox<String> tableChoosejComboBox;
    // End of variables declaration//GEN-END:variables

    private void availableRooms() {

        try {
            ps = con.prepareStatement("Select * from rooms where status='available'");
            rs = ps.executeQuery();
            roomsComboBox.addItem("   Select available room   ");
            while (rs.next()) {
                String s = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3);
                roomsComboBox.addItem(s);
            }

        } catch (Exception e) {
            roomNoTF.setText("Sorry !! No Rooms are Available");
        }
    }

    private void CCodeForeignTFFocusLost() {

        CCodeForeignTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                try {
                    ps = con.prepareStatement("Select * from customer where CCode=?");
                    ps.setString(1, CCodeForeignTF.getText());
                    rs = ps.executeQuery();
                    rs.next();
                    nameTF.setText(rs.getString(2) + " " + rs.getString(3));
                    addressTA.setText(rs.getString(11));
                    bookingDateTF.requestFocus();
                } catch (Exception ex) {
                    CCodeForeignTF.setText("Invalid Customer No.!");
                    nameTF.setText("");
                    addressTA.setText("");

                }
            }
        });

    }

    private void showDataInTable() {
        try {
            ps = con.prepareStatement("Select * from customer order by CCode desc LIMIT 3");
            rs = ps.executeQuery();
            bookingjTable.setAutoResizeMode(bookingjTable.AUTO_RESIZE_OFF);
            bookingjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBookingTable() {
        try {
            ps = con.prepareStatement("Select * from booking order by BookingNo desc LIMIT 3");
            rs = ps.executeQuery();
            bookingjTable.setAutoResizeMode(bookingjTable.AUTO_RESIZE_ALL_COLUMNS);
            bookingjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

    }

    private void showServiceTable() {
        try {
            ps = con.prepareStatement("Select * from service order by ID desc LIMIT 3");
            rs = ps.executeQuery();
            bookingjTable.setAutoResizeMode(bookingjTable.AUTO_RESIZE_ALL_COLUMNS);
            bookingjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billing order by BillNo desc LIMIT 3");
            rs = ps.executeQuery();
            bookingjTable.setAutoResizeMode(bookingjTable.AUTO_RESIZE_OFF);
            bookingjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
}
