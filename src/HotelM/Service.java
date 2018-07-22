package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Service extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Service() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
        showServiceTable();
        tableChoosejComboBox.setSelectedIndex(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        servicePanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        serviceForm = new javax.swing.JPanel(){
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
        breakfastTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        lunchTF = new javax.swing.JTextField();
        breakfastCheckBox = new javax.swing.JCheckBox();
        lunchCheckBox = new javax.swing.JCheckBox();
        dinnerCheckBox = new javax.swing.JCheckBox();
        dinnerTF = new javax.swing.JTextField();
        laundaryCheckBox = new javax.swing.JCheckBox();
        laundaryTF = new javax.swing.JTextField();
        totalTF = new javax.swing.JTextField();
        swimmingPoolTF = new javax.swing.JTextField();
        gymTF = new javax.swing.JTextField();
        telephoneTF = new javax.swing.JTextField();
        telephoneCheckBox = new javax.swing.JCheckBox();
        gymCheckBox = new javax.swing.JCheckBox();
        swimmingPoolCheckBox = new javax.swing.JCheckBox();
        totalButton = new javax.swing.JButton();
        serviceOkButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        bookingNoLabel = new javax.swing.JLabel();
        bookingNoServiceForeignTF = new javax.swing.JTextField();
        tableChoosejComboBox = new javax.swing.JComboBox<>();
        serviceStatusjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Service Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        servicePanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        servicePanel.setOpaque(false);
        servicePanel.setPreferredSize(new java.awt.Dimension(1100, 619));

        serviceForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Services Provided by the Hotel"));
        formPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        breakfastTF.setText("0");
        breakfastTF.setEnabled(false);
        formPanel.add(breakfastTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 201, -1));

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(serviceTable);

        formPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, 849, 90));

        lunchTF.setText("0");
        lunchTF.setEnabled(false);
        formPanel.add(lunchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 201, -1));

        breakfastCheckBox.setText("Breakfast");
        breakfastCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(breakfastCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        lunchCheckBox.setText("Lunch");
        lunchCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunchCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(lunchCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        dinnerCheckBox.setText("Dinner");
        dinnerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinnerCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(dinnerCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        dinnerTF.setText("0");
        dinnerTF.setEnabled(false);
        formPanel.add(dinnerTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 201, -1));

        laundaryCheckBox.setText("Laundary");
        laundaryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundaryCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(laundaryCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        laundaryTF.setText("0");
        laundaryTF.setEnabled(false);
        formPanel.add(laundaryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 201, -1));

        totalTF.setEditable(false);
        formPanel.add(totalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 201, -1));

        swimmingPoolTF.setText("0");
        swimmingPoolTF.setEnabled(false);
        formPanel.add(swimmingPoolTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 201, -1));

        gymTF.setText("0");
        gymTF.setEnabled(false);
        formPanel.add(gymTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 201, -1));

        telephoneTF.setText("0");
        telephoneTF.setEnabled(false);
        formPanel.add(telephoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 201, -1));

        telephoneCheckBox.setText("Telephone");
        telephoneCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(telephoneCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        gymCheckBox.setText("Gym");
        gymCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(gymCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        swimmingPoolCheckBox.setText("Swimming Pool");
        swimmingPoolCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swimmingPoolCheckBoxActionPerformed(evt);
            }
        });
        formPanel.add(swimmingPoolCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        totalButton.setText("Total");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });
        formPanel.add(totalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));

        serviceOkButton.setText("Save");
        serviceOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceOkButtonActionPerformed(evt);
            }
        });
        formPanel.add(serviceOkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 100, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        formPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 100, -1));

        bookingNoLabel.setText("Booking No");
        formPanel.add(bookingNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        bookingNoServiceForeignTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingNoServiceForeignTFActionPerformed(evt);
            }
        });
        formPanel.add(bookingNoServiceForeignTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 60, -1));

        tableChoosejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Booking", "Service", "Billing" }));
        tableChoosejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableChoosejComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(tableChoosejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        serviceStatusjButton.setText("Service Status");
        serviceStatusjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceStatusjButtonActionPerformed(evt);
            }
        });
        formPanel.add(serviceStatusjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 140, -1));

        javax.swing.GroupLayout serviceFormLayout = new javax.swing.GroupLayout(serviceForm);
        serviceForm.setLayout(serviceFormLayout);
        serviceFormLayout.setHorizontalGroup(
            serviceFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serviceFormLayout.createSequentialGroup()
                .addContainerGap(897, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(serviceFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(serviceFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        serviceFormLayout.setVerticalGroup(
            serviceFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(532, Short.MAX_VALUE))
            .addGroup(serviceFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(serviceFormLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serviceForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(servicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(servicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void breakfastCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastCheckBoxActionPerformed
        // TODO add your handling code here:
        if (breakfastCheckBox.isSelected()) {
            breakfastTF.setEnabled(true);
            breakfastTF.setText("");
            breakfastTF.requestFocus();
        } else {
            breakfastTF.setEnabled(false);
            breakfastTF.setText("0");
        }

    }//GEN-LAST:event_breakfastCheckBoxActionPerformed

    private void lunchCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunchCheckBoxActionPerformed
        // TODO add your handling code here:
        if (lunchCheckBox.isSelected()) {
            lunchTF.setEnabled(true);
            lunchTF.setText("");
            lunchTF.requestFocus();
        } else {
            lunchTF.setEnabled(false);
            lunchTF.setText("0");
        }
    }//GEN-LAST:event_lunchCheckBoxActionPerformed

    private void dinnerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinnerCheckBoxActionPerformed
        // TODO add your handling code here:
        if (dinnerCheckBox.isSelected()) {
            dinnerTF.setEnabled(true);
            dinnerTF.setText("");
            dinnerTF.requestFocus();

        } else {
            dinnerTF.setEnabled(false);
            dinnerTF.setText("0");
        }
    }//GEN-LAST:event_dinnerCheckBoxActionPerformed

    private void laundaryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundaryCheckBoxActionPerformed
        // TODO add your handling code here:
        if (laundaryCheckBox.isSelected()) {
            laundaryTF.setEnabled(true);
            laundaryTF.setText("");
            laundaryTF.requestFocus();
        } else {
            laundaryTF.setEnabled(false);
            laundaryTF.setText("0");
        }
    }//GEN-LAST:event_laundaryCheckBoxActionPerformed

    private void telephoneCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneCheckBoxActionPerformed
        // TODO add your handling code here:
        if (telephoneCheckBox.isSelected()) {
            telephoneTF.setEnabled(true);
            telephoneTF.setText("100");
            telephoneTF.requestFocus();
        } else {
            telephoneTF.setEnabled(false);
            telephoneTF.setText("0");
        }
    }//GEN-LAST:event_telephoneCheckBoxActionPerformed

    private void gymCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymCheckBoxActionPerformed
        // TODO add your handling code here:
        if (gymCheckBox.isSelected()) {
            gymTF.setEnabled(true);
            gymTF.setText("200");
            gymTF.requestFocus();
        } else {
            gymTF.setEnabled(false);
            gymTF.setText("0");
        }
    }//GEN-LAST:event_gymCheckBoxActionPerformed

    private void swimmingPoolCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimmingPoolCheckBoxActionPerformed
        // TODO add your handling code here:
        if (swimmingPoolCheckBox.isSelected()) {
            swimmingPoolTF.setEnabled(true);
            swimmingPoolTF.setText("200");
            swimmingPoolTF.requestFocus();
        } else {
            swimmingPoolTF.setEnabled(false);
            swimmingPoolTF.setText("0");
        }
    }//GEN-LAST:event_swimmingPoolCheckBoxActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        // TODO add your handling code here:
        try {
            int sum = 0;

            sum = Integer.parseInt(breakfastTF.getText()) + Integer.parseInt(lunchTF.getText()) + Integer.parseInt(dinnerTF.getText()) + Integer.parseInt(laundaryTF.getText()) + Integer.parseInt(telephoneTF.getText()) + Integer.parseInt(gymTF.getText()) + Integer.parseInt(swimmingPoolTF.getText());
            totalTF.setText(String.valueOf(sum));

        } catch (Exception e) {
            totalTF.setText("Fields need number only");
        }


    }//GEN-LAST:event_totalButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        breakfastCheckBox.setSelected(false);
        breakfastTF.setEnabled(false);
        breakfastTF.setText("0");

        lunchCheckBox.setSelected(false);
        lunchTF.setEnabled(false);
        lunchTF.setText("0");

        dinnerCheckBox.setSelected(false);
        dinnerTF.setEnabled(false);
        dinnerTF.setText("0");

        laundaryCheckBox.setSelected(false);
        laundaryTF.setEnabled(false);
        laundaryTF.setText("0");

        telephoneCheckBox.setSelected(false);
        telephoneTF.setEnabled(false);
        telephoneTF.setText("0");

        gymCheckBox.setSelected(false);
        gymTF.setEnabled(false);
        gymTF.setText("0");

        swimmingPoolCheckBox.setSelected(false);
        swimmingPoolTF.setEnabled(false);
        swimmingPoolTF.setText("0");

        totalTF.setText("");
        bookingNoServiceForeignTF.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void serviceOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceOkButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save?", "Save", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            try {
                if (bookingNoServiceForeignTF.getText().isEmpty() || totalTF.getText().isEmpty()) {
                    totalTF.setText("Blank field detected!");
                } else {
                    ps = con.prepareStatement("SELECT curdate()");
                    rs = ps.executeQuery();
                    rs.next();
                    String serviceDate = rs.getString(1);

                    ps = con.prepareStatement("Insert into service(Breakfast, Lunch, Dinner, Laundary, Telephone, Gym, SwimmingPool, TotalServiceCharge, BookingNo, ServiceDate) values(?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, breakfastTF.getText());
                    ps.setString(2, lunchTF.getText());
                    ps.setString(3, dinnerTF.getText());
                    ps.setString(4, laundaryTF.getText());
                    ps.setString(5, telephoneTF.getText());
                    ps.setString(6, gymTF.getText());
                    ps.setString(7, swimmingPoolTF.getText());
                    ps.setInt(8, Integer.parseInt(totalTF.getText()));
                    ps.setString(9, bookingNoServiceForeignTF.getText());
                    ps.setString(10, serviceDate);
                    ps.executeUpdate();

                    totalTF.setText("Details successfully added");

                }
                showServiceTable();

            } catch (Exception e) {
                totalTF.setText("Error!");
            }
        }

    }//GEN-LAST:event_serviceOkButtonActionPerformed

    private void bookingNoServiceForeignTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingNoServiceForeignTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bookingNoServiceForeignTFActionPerformed

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

    private void serviceStatusjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceStatusjButtonActionPerformed
        // TODO add your handling code here:
        ServiceStatus ss = new ServiceStatus();
        ss.show();
    }//GEN-LAST:event_serviceStatusjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel bookingNoLabel;
    public javax.swing.JTextField bookingNoServiceForeignTF;
    private javax.swing.JCheckBox breakfastCheckBox;
    private javax.swing.JTextField breakfastTF;
    private javax.swing.JCheckBox dinnerCheckBox;
    private javax.swing.JTextField dinnerTF;
    private javax.swing.JPanel formPanel;
    private javax.swing.JCheckBox gymCheckBox;
    private javax.swing.JTextField gymTF;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox laundaryCheckBox;
    private javax.swing.JTextField laundaryTF;
    private javax.swing.JCheckBox lunchCheckBox;
    private javax.swing.JTextField lunchTF;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel serviceForm;
    public javax.swing.JButton serviceOkButton;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JButton serviceStatusjButton;
    private javax.swing.JTable serviceTable;
    private javax.swing.JCheckBox swimmingPoolCheckBox;
    private javax.swing.JTextField swimmingPoolTF;
    private javax.swing.JComboBox<String> tableChoosejComboBox;
    private javax.swing.JCheckBox telephoneCheckBox;
    private javax.swing.JTextField telephoneTF;
    private javax.swing.JButton totalButton;
    private javax.swing.JTextField totalTF;
    // End of variables declaration//GEN-END:variables

    private void showDataInTable() {
        try {
            ps = con.prepareStatement("Select * from customer order by CCode desc LIMIT 3");
            rs = ps.executeQuery();
            serviceTable.setAutoResizeMode(serviceTable.AUTO_RESIZE_OFF);
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBookingTable() {
        try {
            ps = con.prepareStatement("Select * from booking order by BookingNo desc LIMIT 3");
            rs = ps.executeQuery();
            serviceTable.setAutoResizeMode(serviceTable.AUTO_RESIZE_ALL_COLUMNS);
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

    }

    private void showServiceTable() {
        try {
            ps = con.prepareStatement("Select * from service order by ID desc LIMIT 3");
            rs = ps.executeQuery();
            serviceTable.setAutoResizeMode(serviceTable.AUTO_RESIZE_ALL_COLUMNS);
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billing order by BillNo desc LIMIT 3");
            rs = ps.executeQuery();
            serviceTable.setAutoResizeMode(serviceTable.AUTO_RESIZE_OFF);
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

}
