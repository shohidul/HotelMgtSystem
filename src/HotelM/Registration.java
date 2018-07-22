package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Registration() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        regForm = new javax.swing.JPanel(){
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
        userNameLabel = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        retypePasswordLabel = new javax.swing.JLabel();
        regButton = new javax.swing.JButton();
        retypePasswordField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registration Form");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        regPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        regPanel.setOpaque(false);

        regForm.setOpaque(false);

        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setText("Back to main menu");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setText("UserName");
        formPanel.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 109, -1));
        formPanel.add(userNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 201, -1));

        passwordLabel.setText("Password");
        formPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 109, -1));

        retypePasswordLabel.setText("Retype Password");
        formPanel.add(retypePasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 140, -1));

        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        formPanel.add(regButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 200, -1));
        formPanel.add(retypePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, -1));
        formPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 200, -1));

        javax.swing.GroupLayout regFormLayout = new javax.swing.GroupLayout(regForm);
        regForm.setLayout(regFormLayout);
        regFormLayout.setHorizontalGroup(
            regFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regFormLayout.createSequentialGroup()
                .addContainerGap(897, Short.MAX_VALUE)
                .addComponent(backLabel)
                .addGap(70, 70, 70))
            .addGroup(regFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regFormLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        regFormLayout.setVerticalGroup(
            regFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backLabel)
                .addContainerGap(532, Short.MAX_VALUE))
            .addGroup(regFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regFormLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to register?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            if (passwordField.getText().isEmpty()) {
                userNameTF.setText("Password is blank");
            } else {
                try {
                    ps = con.prepareStatement("Insert into users values(?,?)");
                    String str1, str2;
                    str1 = passwordField.getText();
                    str2 = retypePasswordField.getText();
                    if (str1.equals(str2)) {
                        ps.setString(1, userNameTF.getText());
                        ps.setString(2, passwordField.getText());
                        ps.executeUpdate();

                        userNameTF.setText("Registration successfull");
                        passwordField.setText("");
                        retypePasswordField.setText("");
                    } else {
                        userNameTF.setText("Password doesn't match!");
                    }

                } catch (Exception e) {
                    userNameTF.setText("Error in  Registration!");
                }
            }
        }
    }//GEN-LAST:event_regButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Warnning", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton regButton;
    private javax.swing.JPanel regForm;
    private javax.swing.JPanel regPanel;
    private javax.swing.JPasswordField retypePasswordField;
    private javax.swing.JLabel retypePasswordLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
