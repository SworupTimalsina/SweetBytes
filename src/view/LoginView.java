package view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.*;
import controller.*;


public class LoginView extends javax.swing.JFrame {
LoginModel model;
    public LoginView() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1006, 625));
        getContentPane().setLayout(null);

        txtusername.setBackground(new java.awt.Color(231, 228, 213));
        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 0));
        txtusername.setBorder(null);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername);
        txtusername.setBounds(330, 340, 320, 30);

        txtpassword.setBackground(new java.awt.Color(231, 228, 213));
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.setBorder(null);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(330, 400, 340, 30);

        showpass.setBackground(new java.awt.Color(231, 228, 213));
        showpass.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        showpass.setForeground(new java.awt.Color(0, 0, 0));
        showpass.setText("Show Password");
        showpass.setBorder(null);
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass);
        showpass.setBounds(320, 440, 140, 19);

        jButton1.setBackground(new java.awt.Color(231, 228, 213));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Forgot Password");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 440, 120, 23);

        btnLogin1.setBackground(new java.awt.Color(239, 215, 154));
        btnLogin1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin1.setText("Register");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin1);
        btnLogin1.setBounds(440, 510, 130, 30);

        btnLogin.setBackground(new java.awt.Color(239, 215, 154));
        btnLogin.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(440, 470, 130, 30);

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loginpagee.png"))); // NOI18N
        jLabel3.setText("WELCOME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1010, 590);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 70, 37, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginController l=new LoginController(this);
           
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        RegistrationView RV = new RegistrationView();
        RV.show();
        dispose();
        
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ForgotpwdView FP = new ForgotpwdView();
        FP.show();
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
        if(showpass.isSelected())
            txtpassword.setEchoChar((char)0);
        else
            txtpassword.setEchoChar('•');
        
    }//GEN-LAST:event_showpassActionPerformed

    public LoginModel getUser()
{
    model=new LoginModel(txtusername.getText(),txtpassword.getText());
    return model;
}

public void setMessage(String msg)
{
    JOptionPane.showMessageDialog(this, msg);
}
public void setErrorMessage(String msg){
    JOptionPane.showMessageDialog(rootPane, msg, "Error", JOptionPane.ERROR_MESSAGE);
}
public void addLoginListner(ActionListener log)
{
    btnLogin.addActionListener(log);
}
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
