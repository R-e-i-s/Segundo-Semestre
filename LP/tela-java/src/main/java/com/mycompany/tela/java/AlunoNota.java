/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tela.java;

/**
 *
 * @author rafael.reis
 */
public class AlunoNota extends javax.swing.JFrame {

    /**
     * Creates new form AlunoNota
     */
    public AlunoNota() {
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

        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        txtBoxNota01 = new javax.swing.JTextField();
        txtBoxNota02 = new javax.swing.JTextField();
        btnCalcularMedia = new javax.swing.JButton();
        lblResultadoMedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lblNota1.setForeground(new java.awt.Color(0, 0, 0));
        lblNota1.setText("Nota 1");

        lblNota2.setBackground(new java.awt.Color(255, 255, 255));
        lblNota2.setForeground(new java.awt.Color(0, 0, 0));
        lblNota2.setLabelFor(this);
        lblNota2.setText("Nota 2");

        txtBoxNota01.setBackground(new java.awt.Color(255, 255, 255));
        txtBoxNota01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxNota01ActionPerformed(evt);
            }
        });

        txtBoxNota02.setBackground(new java.awt.Color(255, 255, 255));

        btnCalcularMedia.setText("Calcular Média");
        btnCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMediaActionPerformed(evt);
            }
        });

        lblResultadoMedia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblResultadoMedia.setForeground(new java.awt.Color(0, 0, 0));
        lblResultadoMedia.setText("A sua média é:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultadoMedia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBoxNota01, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcularMedia)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBoxNota02)))
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBoxNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBoxNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota2))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularMedia)
                .addGap(18, 18, 18)
                .addComponent(lblResultadoMedia)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoxNota01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxNota01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxNota01ActionPerformed

    private void btnCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMediaActionPerformed
        Double txtBox1Conteudo = Double.valueOf(txtBoxNota01.getText());
        Double txtBox2Conteudo = Double.valueOf(txtBoxNota02.getText());

        Double resultadoMedia = (txtBox1Conteudo * 0.4) + (txtBox2Conteudo * 0.6) ;
        
        lblResultadoMedia.setText(String.format("A sua média é: %.2f", resultadoMedia));
    }//GEN-LAST:event_btnCalcularMediaActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedia;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblResultadoMedia;
    private javax.swing.JTextField txtBoxNota01;
    private javax.swing.JTextField txtBoxNota02;
    // End of variables declaration//GEN-END:variables
}
