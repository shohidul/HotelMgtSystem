package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Customer extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Customer() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
        showDataInTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexbuttonGroup = new javax.swing.ButtonGroup();
        maritialStatusbuttonGroup = new javax.swing.ButtonGroup();
        nationalitybuttonGroup = new javax.swing.ButtonGroup();
        customerPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        customerForm = new javax.swing.JPanel(){
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
        fNameLabel = new javax.swing.JLabel();
        fNameTF = new javax.swing.JTextField();
        lNameTF = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryTF = new javax.swing.JTextField();
        PPNoLabel = new javax.swing.JLabel();
        PPNoTF = new javax.swing.JTextField();
        visaNoLabel = new javax.swing.JLabel();
        visaNoTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        residentialAddressTA = new javax.swing.JTextArea();
        phoneNoTF = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        sexLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        unmarriedRadioButton = new javax.swing.JRadioButton();
        marriedRadioButton = new javax.swing.JRadioButton();
        maritialStatusLabel = new javax.swing.JLabel();
        BDRadioButton = new javax.swing.JRadioButton();
        nationalityLabel = new javax.swing.JLabel();
        foreignerRadioButton = new javax.swing.JRadioButton();
        CCodeLabel = new javax.swing.JLabel();
        CCodeTF = new javax.swing.JTextField();
        residentialAddressLabel = new javax.swing.JLabel();
        officalAddessLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        officalAddessTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerjTable = new javax.swing.JTable();
        customerSaveButton = new javax.swing.JButton();
        customerClearButton = new javax.swing.JButton();
        tableChoosejComboBox = new javax.swing.JComboBox<>();
        addNewCustButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Customer Information Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        customerPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        customerPanel.setOpaque(false);
        customerPanel.setPreferredSize(new java.awt.Dimension(1100, 619));

        customerForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fNameLabel.setText("First Name");
        formPanel.add(fNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 56, 109, -1));
        formPanel.add(fNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 54, 201, -1));
        formPanel.add(lNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 79, 201, -1));

        lNameLabel.setText("Last Name");
        formPanel.add(lNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 81, 109, -1));

        ageLabel.setText("Age");
        formPanel.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 106, 109, -1));
        formPanel.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 104, 201, -1));

        countryLabel.setText("Country");
        formPanel.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 155, 109, -1));
        formPanel.add(countryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 153, 201, -1));

        PPNoLabel.setText("Passport No.");
        formPanel.add(PPNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 180, 109, -1));
        formPanel.add(PPNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 178, 201, -1));

        visaNoLabel.setText("Visa No.");
        formPanel.add(visaNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 205, 109, -1));
        formPanel.add(visaNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 203, 201, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        residentialAddressTA.setColumns(10);
        residentialAddressTA.setLineWrap(true);
        residentialAddressTA.setRows(3);
        residentialAddressTA.setAutoscrolls(false);
        jScrollPane1.setViewportView(residentialAddressTA);

        formPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 222, 57));
        formPanel.add(phoneNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 251, 201, -1));

        phoneNoLabel.setText("Phone No.");
        formPanel.add(phoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 253, 109, -1));

        emailLabel.setText("E-mail");
        formPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 278, 109, -1));

        statusLabel.setText("Status");
        formPanel.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 256, 109, -1));
        formPanel.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 276, 201, -1));

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "Ocational", "Regular", "Blacklisted" }));
        formPanel.add(statusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 222, -1));

        sexLabel.setText("Sex");
        formPanel.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 29, 109, -1));

        sexbuttonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        formPanel.add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        sexbuttonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        formPanel.add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        maritialStatusbuttonGroup.add(unmarriedRadioButton);
        unmarriedRadioButton.setText("Unmarried");
        formPanel.add(unmarriedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, -1));

        maritialStatusbuttonGroup.add(marriedRadioButton);
        marriedRadioButton.setText("Married");
        formPanel.add(marriedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        maritialStatusLabel.setText("Maritial Status");
        formPanel.add(maritialStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 60, 109, -1));

        nationalitybuttonGroup.add(BDRadioButton);
        BDRadioButton.setText("Bangladeshi");
        BDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDRadioButtonActionPerformed(evt);
            }
        });
        formPanel.add(BDRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        nationalityLabel.setText("Nationality");
        formPanel.add(nationalityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 91, 109, -1));

        nationalitybuttonGroup.add(foreignerRadioButton);
        foreignerRadioButton.setText("Foreigner");
        foreignerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foreignerRadioButtonActionPerformed(evt);
            }
        });
        formPanel.add(foreignerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        CCodeLabel.setText("Customer Code");
        formPanel.add(CCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 31, 109, -1));

        CCodeTF.setEditable(false);
        formPanel.add(CCodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 29, 201, -1));

        residentialAddressLabel.setText("Residential Address");
        formPanel.add(residentialAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 135, -1, -1));

        officalAddessLabel.setText("Offical Addess (If any)");
        formPanel.add(officalAddessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 202, 160, -1));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        officalAddessTA.setColumns(10);
        officalAddessTA.setLineWrap(true);
        officalAddessTA.setRows(3);
        officalAddessTA.setAutoscrolls(false);
        jScrollPane3.setViewportView(officalAddessTA);

        formPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 222, 57));

        customerjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerjTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(customerjTable);

        formPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, 849, 90));

        customerSaveButton.setText("Save");
        customerSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSaveButtonActionPerformed(evt);
            }
        });
        formPanel.add(customerSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 110, -1));

        customerClearButton.setText("Clear");
        customerClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerClearButtonActionPerformed(evt);
            }
        });
        formPanel.add(customerClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 110, -1));

        tableChoosejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Booking", "Service", "Billing" }));
        tableChoosejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableChoosejComboBoxActionPerformed(evt);
            }
        });
        formPanel.add(tableChoosejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        addNewCustButton.setText("Add New");
        addNewCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustButtonActionPerformed(evt);
            }
        });
        formPanel.add(addNewCustButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 220, -1));

        javax.swing.GroupLayout customerFormLayout = new javax.swing.GroupLayout(customerForm);
        customerForm.setLayout(customerFormLayout);
        customerFormLayout.setHorizontalGroup(
            customerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerFormLayout.createSequentialGroup()
                .addContainerGap(897, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(customerFormLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        customerFormLayout.setVerticalGroup(
            customerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void customerClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerClearButtonActionPerformed
        // TODO add your handling code here:
        //CCodeTF.setText("");
        fNameTF.setText("");
        lNameTF.setText("");
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        ageTF.setText("");
        marriedRadioButton.setSelected(false);
        unmarriedRadioButton.setSelected(false);
        BDRadioButton.setSelected(false);
        foreignerRadioButton.setSelected(false);
        countryTF.setText("");
        PPNoTF.setText("");
        visaNoTF.setText("");
        residentialAddressTA.setText("");
        officalAddessTA.setText("");
        phoneNoTF.setText("");
        emailTF.setText("");
        statusComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_customerClearButtonActionPerformed

    private void customerSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSaveButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save?", "Save", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            try {
                ps = con.prepareStatement("SELECT curdate()");
                rs = ps.executeQuery();
                rs.next();
                String dataEntryDate = rs.getString(1);
                ps = con.prepareStatement("Insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, CCodeTF.getText());
                ps.setString(2, fNameTF.getText());
                ps.setString(3, lNameTF.getText());
                if (maleRadioButton.isSelected()) {
                    ps.setString(4, "Male");
                } else {
                    ps.setString(4, "Female");
                }
                ps.setInt(5, Integer.parseInt(ageTF.getText()));
                if (unmarriedRadioButton.isSelected()) {
                    ps.setString(6, "Unmarried");
                } else {
                    ps.setString(6, "Married");
                }
                if (BDRadioButton.isSelected()) {
                    ps.setString(7, "Bangladeshi");
                } else {
                    ps.setString(7, "Foreigner");
                }
                ps.setString(8, countryTF.getText());
                ps.setString(9, PPNoTF.getText());
                ps.setString(10, visaNoTF.getText());
                ps.setString(11, residentialAddressTA.getText());
                ps.setString(12, officalAddessTA.getText());
                ps.setString(13, phoneNoTF.getText());
                ps.setString(14, emailTF.getText());
                ps.setString(15, (String) statusComboBox.getSelectedItem());
                ps.setString(16, dataEntryDate);
                ps.executeUpdate();

                CCodeTF.setText("Customer details successfully added");
                fNameTF.setText("");
                lNameTF.setText("");
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(false);
                ageTF.setText("");
                marriedRadioButton.setSelected(false);
                unmarriedRadioButton.setSelected(false);
                BDRadioButton.setSelected(false);
                foreignerRadioButton.setSelected(false);
                countryTF.setText("");
                PPNoTF.setText("");
                visaNoTF.setText("");
                residentialAddressTA.setText("");
                officalAddessTA.setText("");
                phoneNoTF.setText("");
                emailTF.setText("");

                showDataInTable();
            } catch (Exception e) {
                CCodeTF.setText("Error in adding Customer details");
            }
        }
    }//GEN-LAST:event_customerSaveButtonActionPerformed

    private void BDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDRadioButtonActionPerformed
        // TODO add your handling code here:
        if (BDRadioButton.isSelected()) {
            countryTF.setText("Bangladesh");
            countryTF.setEditable(false);
        }
    }//GEN-LAST:event_BDRadioButtonActionPerformed

    private void foreignerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foreignerRadioButtonActionPerformed
        // TODO add your handling code here:
        if (foreignerRadioButton.isSelected()) {
            countryTF.setText("");
            countryTF.setEditable(true);
        }
    }//GEN-LAST:event_foreignerRadioButtonActionPerformed

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

    private void addNewCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCustButtonActionPerformed
        // TODO add your handling code here:
        fNameTF.requestFocus();
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
            CCodeTF.setText(str);

        } catch (Exception e3) {
            CCodeTF.setText("Error in Code generation");
        }
    }//GEN-LAST:event_addNewCustButtonActionPerformed

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
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BDRadioButton;
    private javax.swing.JLabel CCodeLabel;
    public javax.swing.JTextField CCodeTF;
    private javax.swing.JLabel PPNoLabel;
    private javax.swing.JTextField PPNoTF;
    private javax.swing.JButton addNewCustButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTF;
    private javax.swing.JButton customerClearButton;
    private javax.swing.JPanel customerForm;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JButton customerSaveButton;
    private javax.swing.JTable customerjTable;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel fNameLabel;
    public javax.swing.JTextField fNameTF;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JRadioButton foreignerRadioButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTF;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel maritialStatusLabel;
    private javax.swing.ButtonGroup maritialStatusbuttonGroup;
    private javax.swing.JRadioButton marriedRadioButton;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.ButtonGroup nationalitybuttonGroup;
    private javax.swing.JLabel officalAddessLabel;
    private javax.swing.JTextArea officalAddessTA;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTF;
    private javax.swing.JLabel residentialAddressLabel;
    private javax.swing.JTextArea residentialAddressTA;
    private javax.swing.JLabel sexLabel;
    private javax.swing.ButtonGroup sexbuttonGroup;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JComboBox<String> tableChoosejComboBox;
    private javax.swing.JRadioButton unmarriedRadioButton;
    private javax.swing.JLabel visaNoLabel;
    private javax.swing.JTextField visaNoTF;
    // End of variables declaration//GEN-END:variables

    private void showDataInTable() {
        try {
            ps = con.prepareStatement("Select * from customer order by CCode desc LIMIT 3");
            rs = ps.executeQuery();
            customerjTable.setAutoResizeMode(customerjTable.AUTO_RESIZE_OFF);
            customerjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBookingTable() {
        try {
            ps = con.prepareStatement("Select * from booking order by BookingNo desc LIMIT 3");
            rs = ps.executeQuery();
            customerjTable.setAutoResizeMode(customerjTable.AUTO_RESIZE_ALL_COLUMNS);
            customerjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }

    }

    private void showServiceTable() {
        try {
            ps = con.prepareStatement("Select * from service order by ID desc LIMIT 3");
            rs = ps.executeQuery();
            customerjTable.setAutoResizeMode(customerjTable.AUTO_RESIZE_ALL_COLUMNS);
            customerjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void showBillingTable() {
        try {
            ps = con.prepareStatement("Select * from billing order by BillNo desc LIMIT 3");
            rs = ps.executeQuery();
            customerjTable.setAutoResizeMode(customerjTable.AUTO_RESIZE_OFF);
            customerjTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
}
