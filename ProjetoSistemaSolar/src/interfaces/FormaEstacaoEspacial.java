/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemasolar.EstacaoEspacial;

/**
 *
 * @author davidson
 */
public class FormaEstacaoEspacial extends javax.swing.JFrame {

    /**
     * Creates new form FormaEstacaoEspacial
     */
    public FormaEstacaoEspacial() {
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

        painelEstacaoEspacial = new javax.swing.JPanel();
        lbNome10 = new javax.swing.JLabel();
        lbAltura = new javax.swing.JLabel();
        lbVelOrbita = new javax.swing.JLabel();
        lbVelMaxima = new javax.swing.JLabel();
        lbAnoLanc = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        tfVelOrbita = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfVelMaxima = new javax.swing.JTextField();
        tfAnoLanc = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelEstacaoEspacial.setBackground(new java.awt.Color(208, 208, 208));
        painelEstacaoEspacial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estação Espacial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 18))); // NOI18N

        lbNome10.setText("Nome:");

        lbAltura.setText("Altura");

        lbVelOrbita.setText("Vel. de Órbita:");

        lbVelMaxima.setText("Vel. Maxima:");

        lbAnoLanc.setText("Ano Lançamento: ");

        tfAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlturaActionPerformed(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEstacaoEspacialLayout = new javax.swing.GroupLayout(painelEstacaoEspacial);
        painelEstacaoEspacial.setLayout(painelEstacaoEspacialLayout);
        painelEstacaoEspacialLayout.setHorizontalGroup(
            painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstacaoEspacialLayout.createSequentialGroup()
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVelMaxima)
                    .addComponent(lbVelOrbita)
                    .addComponent(lbAnoLanc))
                .addGap(39, 39, 39)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfVelMaxima, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addComponent(tfVelOrbita)
                    .addComponent(tfAnoLanc)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEstacaoEspacialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmar)
                .addGap(18, 18, 18)
                .addComponent(jbVoltar))
            .addGroup(painelEstacaoEspacialLayout.createSequentialGroup()
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome10)
                    .addComponent(lbAltura))
                .addGap(117, 117, 117)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAltura)
                    .addComponent(tfNome)))
        );
        painelEstacaoEspacialLayout.setVerticalGroup(
            painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstacaoEspacialLayout.createSequentialGroup()
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltar)
                    .addComponent(jbConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome10)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAltura)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVelOrbita)
                    .addComponent(tfVelOrbita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVelMaxima)
                    .addComponent(tfVelMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelEstacaoEspacialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnoLanc)
                    .addComponent(tfAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEstacaoEspacial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEstacaoEspacial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlturaActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        // TODO add your handling code here:
        FormaSistemaSolar frame = new FormaSistemaSolar();
        frame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        //capturar texto
        String nome = tfNome.getText();
        String altura = tfAltura.getText();
        String velOrbita = tfVelOrbita.getText();
        String velMax = tfVelMaxima.getText();
        String anoLancamento = tfAnoLanc.getText();
        //cria objeto de Estação Espacial
        EstacaoEspacial ee1 = new EstacaoEspacial(nome, Double.parseDouble(altura), Double.parseDouble(velOrbita),
                Double.parseDouble(velMax), Integer.parseInt(anoLancamento));
        JOptionPane.showMessageDialog(rootPane, "Estação Espacial 1: \n"
            +"\nNome da Estação: "+ee1.getNome()
            +"\nAno de Lançamento: "+ee1.getAnoLancamento()
            +"\nAltura de Órbita: "+ee1.getAltura()+"km. "
            +"\nVelocidade de Órbita: "+ee1.getVelOrbita()+"km/h. "
            +"\nVelocidade Máxima: "+ee1.getVelMax()+"km/h. \n\n"
        );

                   FileWriter filer;
        BufferedWriter buff;
        
        
        try {
            filer  = new FileWriter("estacaoEspacial.txt");
            buff  = new BufferedWriter(filer);
            buff.write(ee1.getNome()+ee1.getAnoLancamento()+ee1.getAltura() +ee1.getVelOrbita()+ee1.getVelMax());
            buff.close();
            
   
            
        } catch (IOException ex) {
            Logger.getLogger(FormaEstacaoEspacial.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jbConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FormaEstacaoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaEstacaoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaEstacaoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaEstacaoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaEstacaoEspacial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbAnoLanc;
    private javax.swing.JLabel lbNome10;
    private javax.swing.JLabel lbVelMaxima;
    private javax.swing.JLabel lbVelOrbita;
    private javax.swing.JPanel painelEstacaoEspacial;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfAnoLanc;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfVelMaxima;
    private javax.swing.JTextField tfVelOrbita;
    // End of variables declaration//GEN-END:variables
}
