package view;


import java.awt.Color;
import javax.swing.JFrame;


public class CartView extends javax.swing.JFrame {

    /**
     * Creates new form HomeAndItems
     */
    public CartView() {
        initComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
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
        btnAboutUs = new javax.swing.JButton();
        btnContactUs = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnProfile1 = new javax.swing.JButton();
        btnProfile2 = new javax.swing.JButton();
        btnProfile3 = new javax.swing.JButton();
        btnProfile4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        btnAboutUs.setBackground(new java.awt.Color(255, 204, 204));
        btnAboutUs.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnAboutUs.setText("ABOUT US");
        btnAboutUs.setBorder(null);
        btnAboutUs.setContentAreaFilled(false);

        btnContactUs.setBackground(new java.awt.Color(255, 204, 204));
        btnContactUs.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnContactUs.setText("REVIEW");
        btnContactUs.setBorder(null);
        btnContactUs.setContentAreaFilled(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

        btnProfile1.setBackground(new java.awt.Color(255, 204, 204));
        btnProfile1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnProfile1.setText("CART");
        btnProfile1.setBorder(null);
        btnProfile1.setBorderPainted(false);
        btnProfile1.setContentAreaFilled(false);
        btnProfile1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfile1ActionPerformed(evt);
            }
        });

        btnProfile2.setBackground(new java.awt.Color(255, 204, 204));
        btnProfile2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnProfile2.setText("HOME");
        btnProfile2.setBorder(null);
        btnProfile2.setBorderPainted(false);
        btnProfile2.setContentAreaFilled(false);
        btnProfile2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfile2ActionPerformed(evt);
            }
        });

        btnProfile3.setBackground(new java.awt.Color(255, 204, 204));
        btnProfile3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        btnProfile3.setText("ITEMS");
        btnProfile3.setBorder(null);
        btnProfile3.setBorderPainted(false);
        btnProfile3.setContentAreaFilled(false);
        btnProfile3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProfile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfile3ActionPerformed(evt);
            }
        });

        btnProfile4.setBackground(new java.awt.Color(255, 204, 204));
        btnProfile4.setFont(new java.awt.Font("MS PMincho", 0, 48)); // NOI18N
        btnProfile4.setText("Your Cart");
        btnProfile4.setBorder(null);
        btnProfile4.setBorderPainted(false);
        btnProfile4.setContentAreaFilled(false);
        btnProfile4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProfile4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfile4ActionPerformed(evt);
            }
        });

        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Items", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setName(""); // NOI18N
        jTable2.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setText("Apply Promo Code:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 20, 200, 21);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(60, 60, 310, 30);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 110, 75, 26);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel3.setText("Cart Summary");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 20, 130, 20);

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("The Bold Font", 0, 12)); // NOI18N
        jButton2.setText("CHECKOUT");
        jPanel3.add(jButton2);
        jButton2.setBounds(350, 170, 100, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProfile4)
                        .addGap(469, 469, 469))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnProfile)
                .addGap(55, 55, 55)
                .addComponent(btnProfile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProfile2)
                .addGap(30, 30, 30)
                .addComponent(btnProfile3)
                .addGap(29, 29, 29)
                .addComponent(btnContactUs)
                .addGap(18, 18, 18)
                .addComponent(btnAboutUs)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile)
                    .addComponent(btnProfile1)
                    .addComponent(btnProfile2)
                    .addComponent(btnProfile3)
                    .addComponent(btnContactUs)
                    .addComponent(btnAboutUs))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProfile4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2PropertyChange

    private void btnProfile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfile3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfile3ActionPerformed

    private void btnProfile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfile2ActionPerformed

    private void btnProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfile1ActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        btnProfile.setBackground(Color.pink);

    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnProfile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfile4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfile4ActionPerformed

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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartView().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnContactUs;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnProfile1;
    private javax.swing.JButton btnProfile2;
    private javax.swing.JButton btnProfile3;
    private javax.swing.JButton btnProfile4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
