package view;

import javax.swing.JOptionPane;


public class PoundsAndNameView extends javax.swing.JFrame {
	
	public String name;
	public int pounds;
    /**
     * Creates new form ExoticWedView
     */
    public PoundsAndNameView() {
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
                jLabel1 = new javax.swing.JLabel();
                poundField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                nameField = new javax.swing.JTextField();
                proceedButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(252, 232, 201));
                setMinimumSize(new java.awt.Dimension(400, 300));
                setResizable(false);
                getContentPane().setLayout(null);

                jPanel1.setBackground(new java.awt.Color(252, 232, 201));

                jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("Pounds:");

                jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("Names:");

                nameField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameFieldActionPerformed(evt);
                        }
                });

                proceedButton.setBackground(new java.awt.Color(255, 153, 102));
                proceedButton.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
                proceedButton.setForeground(new java.awt.Color(0, 0, 0));
                proceedButton.setText("Proceed");
                proceedButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                proceedButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(poundField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                        .addComponent(nameField)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(198, 198, 198)
                                                .addComponent(proceedButton)))
                                .addContainerGap(173, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(poundField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(proceedButton)
                                .addContainerGap(187, Short.MAX_VALUE))
                );

                getContentPane().add(jPanel1);
                jPanel1.setBounds(0, 0, 500, 420);

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

        private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
                // TODO add your handling code here:
		name=nameField.getText();
		try{
			pounds=Integer.parseInt(poundField.getText());
			if (pounds<=0){
			JOptionPane.showMessageDialog(rootPane, "Pound should be greater than zero", "error", JOptionPane.ERROR_MESSAGE);
			}
			else{
				dispose();
		}
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(rootPane, "Please set a valid pound", "error", JOptionPane.ERROR_MESSAGE);
			
		}
		
        }//GEN-LAST:event_proceedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PoundsAndNameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoundsAndNameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoundsAndNameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoundsAndNameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoundsAndNameView().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField nameField;
        private javax.swing.JTextField poundField;
        private javax.swing.JButton proceedButton;
        // End of variables declaration//GEN-END:variables
}
