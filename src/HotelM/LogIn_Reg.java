package HotelM;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

public class LogIn_Reg extends javax.swing.JFrame implements ActionListener {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LogIn_Reg() {
        initComponents();
        
        setLocationRelativeTo(null);
        con = JDBC.abc();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("bgSky.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        logInPnl = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon ic = new ImageIcon(getClass().getResource("logInPanel.png"));

                Image i = ic.getImage();

                g.drawImage (i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        userNameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setMinimumSize(new java.awt.Dimension(1100, 619));
        setPreferredSize(new java.awt.Dimension(1100, 618));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 619));

        bgPanel.setMinimumSize(new java.awt.Dimension(1100, 619));
        bgPanel.setOpaque(false);
        bgPanel.setPreferredSize(new java.awt.Dimension(1100, 619));

        logInPnl.setMinimumSize(new java.awt.Dimension(375, 385));
        logInPnl.setName(""); // NOI18N
        logInPnl.setOpaque(false);
        logInPnl.setPreferredSize(new java.awt.Dimension(372, 385));
        logInPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name");
        logInPnl.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 89, 93, -1));

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");
        logInPnl.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 168, 70, -1));

        logInBtn.setBackground(new java.awt.Color(0, 204, 51));
        logInBtn.setForeground(new java.awt.Color(255, 255, 255));
        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        logInPnl.add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 255, 200, 40));

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        logInPnl.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 110, 200, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Hotel  JAVA");
        logInPnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 27));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello!");
        logInPnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 11, -1, 27));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        logInPnl.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 189, 200, 40));

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(logInPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(logInPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // TODO add your handling code here:
        go();
    }//GEN-LAST:event_logInBtnActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
        if (userField.getText() == null || userField.getText().trim().equals("")) {
            go();
        } else {
            passField.requestFocus();
        }
    }//GEN-LAST:event_userFieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
        go();
    }//GEN-LAST:event_passFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new LogIn_Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel logInPnl;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    public javax.swing.JTextField userField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ee) {

    }

    private void go() {
        try {
            ps = con.prepareStatement("Select * from users where UserName=? and Password=?");
            ps.setString(1, userField.getText());
            ps.setString(2, passField.getText());
            rs = ps.executeQuery();
            rs.next();
            userField.setText(rs.getString(1));
            passField.setText(rs.getString(2));

            MainFrame main = new MainFrame();
            main.show();
            this.dispose();

        } catch (Exception e) {
            userField.setText("Illegal User Name or Password");
            passField.setText("");
            userField.requestFocus();
        }
    }
}
