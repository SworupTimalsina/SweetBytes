package view;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.*;
import view.*;
import controller.CartController;

public class CartView extends javax.swing.JFrame {
    CartModel cModel;
    public RegistrationModel rModel;
    private HashMap<String, Integer> itemsMap = new HashMap<String, Integer>();
    private DashboardView dashboardView;

    /**
     * Creates new form HomeAndItems
     */

    public CartView() {
        initComponents();

        // setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public CartView(RegistrationModel rModel) {
        this.rModel = rModel;
        initComponents();
    }

    public CartView(CartModel cModel) {
        initComponents();
        this.cModel = cModel;
        this.itemsMap = cModel.getItemsMap();
        loadCart();
        new CartController(this);
    }

    public DashboardView getDashboardView() {
        return dashboardView;
    }

    public void setDashboardView(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
    }

    public void addCartViewListener(ActionListener listenForAction) {
        okButton.addActionListener(listenForAction);
        checkoutButton.addActionListener(listenForAction);
        backButton.addActionListener(listenForAction);
    }

    public void loadCart() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        // System.out.println(itemsMap);
        for (int i = 0; i < cModel.getItems().size(); i++) {
            Object[] rowData = {
                    cModel.getItems().get(i),
                    cModel.getPrice().get(i),
                    cModel.getQuantity().get(i),
                    cModel.getTotal().get(i)
            };
            model.addRow(rowData);
        }
    }

    public void calculateDiscount() {
        /*
         * Calculates discount and displays the total, discount amount and grand total.
         */
        int numrow = jTable2.getRowCount();
        double totl = 0;
        double discount = 0;
        double grandTotal = 0;

        for (int i = 0; i < numrow; i++) {
            double val = Double.valueOf(jTable2.getValueAt(i, 3).toString());
            totl += val;
        }

        String promoCode = promotxt.getText().trim();

        if (promoCode.equalsIgnoreCase("SWEETBYTES")) {
            discount = 0.15 * totl;
        } else if (promoCode.equalsIgnoreCase("SOFTWARICA")) {
            discount = 0.2 * totl;
        } else if (promoCode.equalsIgnoreCase("LEDGROUP3")) {
            discount = 0.25 * totl;
        }

        grandTotal = totl - discount;

        totallbl.setText(Double.toString(totl));
        discountlbl.setText(Double.toString(discount));
        gtotallbl.setText(Double.toString(grandTotal));
    }

    public void checkoutdisplay() {
        CheckOutView AU = new CheckOutView();
        AU.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnProfile4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        promotxt = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        checkoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gtotallbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        discountlbl = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(252, 230, 209));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

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
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Items", "Price", "Quantity", "Total"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
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
        jLabel1.setBounds(40, 20, 200, 22);

        promotxt.setBackground(new java.awt.Color(204, 204, 204));
        promotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                promotxtActionPerformed(evt);
            }
        });
        jPanel2.add(promotxt);
        promotxt.setBounds(60, 60, 310, 30);

        okButton.setBackground(new java.awt.Color(255, 153, 51));
        okButton.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel2.add(okButton);
        okButton.setBounds(180, 110, 75, 31);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel3.setText("Cart Summary");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 20, 130, 20);

        checkoutButton.setBackground(new java.awt.Color(255, 153, 51));
        checkoutButton.setFont(new java.awt.Font("The Bold Font", 0, 12)); // NOI18N
        checkoutButton.setText("CHECKOUT");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(checkoutButton);
        checkoutButton.setBounds(380, 180, 100, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setText("Grand Total :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(70, 140, 110, 20);

        gtotallbl.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        gtotallbl.setText("0.0");
        jPanel3.add(gtotallbl);
        gtotallbl.setBounds(300, 140, 70, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel8.setText("Discount :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(70, 100, 90, 20);

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel9.setText("Total :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(70, 60, 70, 20);

        totallbl.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        totallbl.setText("0.0");
        jPanel3.add(totallbl);
        totallbl.setBounds(300, 60, 70, 20);

        discountlbl.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        discountlbl.setText("0.0");
        jPanel3.add(discountlbl);
        discountlbl.setBounds(300, 100, 70, 20);

        backButton.setBackground(new java.awt.Color(204, 204, 255));
        backButton.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← BACK");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(65, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnProfile4)
                                                        .addGap(468, 468, 468))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 438,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jPanel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 491,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 1123,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnProfile4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(43, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_jLabel2PropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel2PropertyChange

    private void btnProfile4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProfile4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnProfile4ActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okButtonActionPerformed
    }// GEN-LAST:event_okButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        // DashboardView DaB = new DashboardView();
        // DaB.show();
        // dispose();
    }// GEN-LAST:event_backButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_checkoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        CartModel cModel = new CartModel();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartView(cModel).setVisible(true);
            }
        });
        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnProfile4;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JLabel discountlbl;
    private javax.swing.JLabel gtotallbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField promotxt;
    private javax.swing.JLabel totallbl;
    // End of variables declaration//GEN-END:variables
}