package view;


import java.awt.Color;
import javax.swing.JFrame;

import model.*;


public class DashboardView extends javax.swing.JFrame {

    public RegistrationModel rModel;
    /**
     * Creates new form HomeAndItems
     */
    public DashboardView(RegistrationModel rModel) {
        this.rModel=rModel;
      
        initComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
    public DashboardView(){
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

        jPanel1 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnItems = new javax.swing.JButton();
        btnAboutUs = new javax.swing.JButton();
        btnContactUs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblWCakes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblBCakes = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCCakes = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblSweetBytes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(252, 230, 209));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        btnProfile.setBackground(new java.awt.Color(255, 204, 204));
        btnProfile.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnProfile.setText("PROFILE");
        btnProfile.setBorder(null);
        btnProfile.setBorderPainted(false);
        btnProfile.setContentAreaFilled(false);
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnCart.setBackground(new java.awt.Color(255, 204, 204));
        btnCart.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnCart.setText("HISTORY");
        btnCart.setBorder(null);
        btnCart.setBorderPainted(false);
        btnCart.setContentAreaFilled(false);
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 204, 204));
        btnHome.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnHome.setText("HOME");
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setDefaultCapable(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnItems.setBackground(new java.awt.Color(255, 204, 204));
        btnItems.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnItems.setText("ITEMS");
        btnItems.setBorder(null);
        btnItems.setBorderPainted(false);
        btnItems.setContentAreaFilled(false);
        btnItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsActionPerformed(evt);
            }
        });

        btnAboutUs.setBackground(new java.awt.Color(255, 204, 204));
        btnAboutUs.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnAboutUs.setText("ABOUT US");
        btnAboutUs.setBorder(null);
        btnAboutUs.setContentAreaFilled(false);
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        btnContactUs.setBackground(new java.awt.Color(255, 204, 204));
        btnContactUs.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnContactUs.setText("REVIEW");
        btnContactUs.setBorder(null);
        btnContactUs.setContentAreaFilled(false);
        btnContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactUsActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(null);

        lblWCakes.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        lblWCakes.setText("Wedding Cakes");
        lblWCakes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblWCakesPropertyChange(evt);
            }
        });
        jPanel2.add(lblWCakes);
        lblWCakes.setBounds(70, 220, 270, 50);

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton1.setText("Browse Now");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 280, 105, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CAKE.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 570);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(null);

        lblBCakes.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        lblBCakes.setText("Birthday cakes");
        jPanel3.add(lblBCakes);
        lblBCakes.setBounds(70, 220, 241, 43);

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton3.setText("Browse Now");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(150, 270, 105, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BDAYCAKE.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 570);

        jPanel4.setLayout(null);

        lblCCakes.setBackground(new java.awt.Color(0, 0, 0));
        lblCCakes.setFont(new java.awt.Font("Imprint MT Shadow", 1, 32)); // NOI18N
        lblCCakes.setText("Customize your own cake");
        jPanel4.add(lblCCakes);
        lblCCakes.setBounds(20, 210, 430, 43);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton2.setText("Browse Now");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(160, 280, 105, 37);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CAKECUSTOM.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 570);

        lblSweetBytes.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblSweetBytes.setText("Sweet Bytes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProfile)
                        .addGap(74, 74, 74)
                        .addComponent(btnCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome)
                        .addGap(42, 42, 42)
                        .addComponent(btnItems)
                        .addGap(35, 35, 35)
                        .addComponent(btnContactUs)
                        .addGap(38, 38, 38)
                        .addComponent(btnAboutUs))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSweetBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(585, 585, 585))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile)
                    .addComponent(btnCart)
                    .addComponent(btnHome)
                    .addComponent(btnItems)
                    .addComponent(btnContactUs)
                    .addComponent(btnAboutUs))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSweetBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        btnProfile.setBackground(Color.pink);
        ProfileView profilePage = new ProfileView();
        ProfileModel pModel=profilePage.setNewProfile(rModel);
        profilePage.fillCustomersData(pModel);
        
        profilePage.show();
        dispose();
        
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        DashboardView DaB = new DashboardView(rModel);
        DaB.show();
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsActionPerformed
        // TODO add your handling code here:
        ItemsView JFI = new ItemsView("DashboardView");
        JFI.show();
        dispose();
    }//GEN-LAST:event_btnItemsActionPerformed

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        // TODO add your handling code here:
        TransactionHistoryView THV = new TransactionHistoryView();
        THV.show();
        dispose();
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactUsActionPerformed
        // TODO add your handling code here:
        ReviewView DV = new ReviewView();
        DV.show();
        dispose();
        
    }//GEN-LAST:event_btnContactUsActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:
        AboutUs AV = new AboutUs();
        AV.show();
        dispose();
//      
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BirthdayCakeView BcV = new BirthdayCakeView();
        BcV.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CustomizeCakeView CcV = new CustomizeCakeView(rModel);
        CcV.show();
        dispose();
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblWCakesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblWCakesPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_lblWCakesPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        WeddingCakeView WcV = new WeddingCakeView();
        WcV.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        RegistrationModel rModel= new RegistrationModel();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView(rModel).setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnContactUs;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnItems;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBCakes;
    private javax.swing.JLabel lblCCakes;
    private javax.swing.JLabel lblSweetBytes;
    private javax.swing.JLabel lblWCakes;
    // End of variables declaration//GEN-END:variables
}
