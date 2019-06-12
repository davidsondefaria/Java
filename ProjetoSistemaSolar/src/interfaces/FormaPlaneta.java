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
import sistemasolar.Planeta;

/**
 *
 * @author davidson
 */
public class FormaPlaneta extends javax.swing.JFrame {
    
    
    /**
     * Creates new form FormaPlaneta
     */
    public FormaPlaneta() {
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

        painelPlaneta = new javax.swing.JPanel();
        lbNome10 = new javax.swing.JLabel();
        lbEspLuz10 = new javax.swing.JLabel();
        lbGalaxia10 = new javax.swing.JLabel();
        lbMassa10 = new javax.swing.JLabel();
        lbTemperatura10 = new javax.swing.JLabel();
        lbVelocidade10 = new javax.swing.JLabel();
        lbVolume10 = new javax.swing.JLabel();
        lbDiametro10 = new javax.swing.JLabel();
        lbAcGrav10 = new javax.swing.JLabel();
        lbIdade10 = new javax.swing.JLabel();
        tfEdL = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfTpRotacao = new javax.swing.JTextField();
        lbTpRotacao = new javax.swing.JLabel();
        lbDistEstr = new javax.swing.JLabel();
        tfDistEst = new javax.swing.JTextField();
        tfExcentricidade = new javax.swing.JTextField();
        lbExcentricidade = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        tfIdade = new javax.swing.JTextField();
        tfAcelGrav = new javax.swing.JTextField();
        tfDiametro = new javax.swing.JTextField();
        tfVolume = new javax.swing.JTextField();
        tfVelocidade = new javax.swing.JTextField();
        tfTemperatura = new javax.swing.JTextField();
        tfMassa = new javax.swing.JTextField();
        tfGalaxia = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPlaneta.setBackground(new java.awt.Color(208, 208, 208));
        painelPlaneta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 18))); // NOI18N

        lbNome10.setText("Nome:");

        lbEspLuz10.setText("Espectro de luz:");

        lbGalaxia10.setText("Galaxia:");

        lbMassa10.setText(" Massa:");

        lbTemperatura10.setText("Temperatura:");

        lbVelocidade10.setText("Velocidade:");

        lbVolume10.setText("Volume:");

        lbDiametro10.setText("Diâmetro:");

        lbAcGrav10.setText("Acel da Gravidade:");

        lbIdade10.setText("Idade:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lbTpRotacao.setText("Tempo de Rotação:");

        lbDistEstr.setText("Distância à Estrela:");

        lbExcentricidade.setText("Excentricidade:");

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

        javax.swing.GroupLayout painelPlanetaLayout = new javax.swing.GroupLayout(painelPlaneta);
        painelPlaneta.setLayout(painelPlanetaLayout);
        painelPlanetaLayout.setHorizontalGroup(
            painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlanetaLayout.createSequentialGroup()
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPlanetaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPlanetaLayout.createSequentialGroup()
                                .addComponent(lbExcentricidade)
                                .addGap(61, 61, 61)
                                .addComponent(tfExcentricidade))
                            .addGroup(painelPlanetaLayout.createSequentialGroup()
                                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbGalaxia10)
                                    .addComponent(lbMassa10)
                                    .addComponent(lbTemperatura10)
                                    .addComponent(lbVelocidade10)
                                    .addComponent(lbVolume10)
                                    .addComponent(lbDiametro10)
                                    .addComponent(lbAcGrav10)
                                    .addComponent(lbIdade10))
                                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelPlanetaLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfAcelGrav, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                                            .addComponent(tfDiametro)
                                            .addComponent(tfVolume)
                                            .addComponent(tfVelocidade)
                                            .addComponent(tfTemperatura)))
                                    .addGroup(painelPlanetaLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfGalaxia)
                                            .addComponent(tfMassa)))
                                    .addGroup(painelPlanetaLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(tfIdade))))
                            .addGroup(painelPlanetaLayout.createSequentialGroup()
                                .addComponent(lbEspLuz10)
                                .addGap(58, 58, 58)
                                .addComponent(tfEdL))
                            .addGroup(painelPlanetaLayout.createSequentialGroup()
                                .addComponent(lbNome10)
                                .addGap(123, 123, 123)
                                .addComponent(tfNome))
                            .addGroup(painelPlanetaLayout.createSequentialGroup()
                                .addComponent(lbTpRotacao)
                                .addGap(36, 36, 36)
                                .addComponent(tfTpRotacao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPlanetaLayout.createSequentialGroup()
                                .addComponent(lbDistEstr)
                                .addGap(39, 39, 39)
                                .addComponent(tfDistEst))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPlanetaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVoltar)))
                .addContainerGap())
        );
        painelPlanetaLayout.setVerticalGroup(
            painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlanetaLayout.createSequentialGroup()
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltar)
                    .addComponent(jbConfirmar))
                .addGap(12, 12, 12)
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome10)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspLuz10)
                    .addComponent(tfEdL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPlanetaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbGalaxia10)
                        .addGap(26, 26, 26)
                        .addComponent(lbMassa10)
                        .addGap(26, 26, 26)
                        .addComponent(lbTemperatura10)
                        .addGap(26, 26, 26)
                        .addComponent(lbVelocidade10)
                        .addGap(18, 18, 18)
                        .addComponent(lbVolume10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbDiametro10)
                        .addGap(65, 65, 65)
                        .addComponent(lbIdade10))
                    .addGroup(painelPlanetaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfGalaxia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAcelGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAcGrav10))
                        .addGap(12, 12, 12)
                        .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTpRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTpRotacao))
                .addGap(12, 12, 12)
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDistEstr)
                    .addComponent(tfDistEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPlanetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExcentricidade)
                    .addComponent(tfExcentricidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPlaneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        // TODO add your handling code here:
        FormaSistemaSolar frame = new FormaSistemaSolar();
        frame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        //capturar texto
        String nome = tfNome.getText();
        String edl = tfEdL.getText();
        String gal = tfGalaxia.getText();
        String massa = tfMassa.getText();
        String temperatura = tfTemperatura.getText();
        String velocidade = tfVelocidade.getText();
        String volume = tfVolume.getText();
        String diametro = tfDiametro.getText();
        String acelGrav = tfAcelGrav.getText();
        String idade = tfIdade.getText();
        String tpRot = tfTpRotacao.getText();
        String distEst = tfDistEst.getText();
        String excentricidade = tfExcentricidade.getText();
        //cria objeto de Planeta
        Planeta p1 = new Planeta(Double.parseDouble(tpRot), Double.parseDouble(distEst), Double.parseDouble(excentricidade)
                , nome, edl, gal, Double.parseDouble(massa), Double.parseDouble(temperatura), 
                Double.parseDouble(velocidade), Double.parseDouble(volume), Double.parseDouble(diametro),
                Double.parseDouble(acelGrav), Integer.parseInt(idade)); 
        JOptionPane.showMessageDialog(rootPane, "Planeta 1: \n"
                +"\nNome: "+p1.getNome()
                +"\nEspectro de Luz: "+p1.getEspectroDeLuz()
                +"\nGaláxia: "+p1.getGalaxia()
                +"\nMassa: "+p1.getMassa()+" t."
                +"\nTemperatura Média: "+p1.getTemperatura()+" ºC."
                +"\nVelocidade de órbita: "+p1.getVelocidade()+ "km/h."
                +"\nVolume: "+p1.getVolume()+" km³."
                +"\nDiâmetro: "+p1.getDiametro()+" km."
                +"\nAceleração da Gravidade: "+p1.getAcelGravidade()+" m/s²."
                +"\nIdade: "+p1.getIdade()+" anos.\n"
                +"\nTempo de Rotação: "+p1.getTpRotacao()+" h."
                +"\nDistância ao Sol: "+p1.getDistanciaSol()+" km"
                +"\nExcentricidade: "+p1.getExcentricidade()
        );
        
        FileWriter filer;
        BufferedWriter buff;
        
        
        try {
            filer  = new FileWriter("planeta.txt");
            buff  = new BufferedWriter(filer);
            buff.write(p1.getNome()+p1.getEspectroDeLuz()+p1.getGalaxia()+p1.getMassa()+ p1.getTemperatura()+p1.getVelocidade()+p1.getVolume()+p1.getDiametro()+p1.getAcelGravidade()
            +p1.getIdade()+p1.getDistanciaSol()+p1.getExcentricidade());
            buff.close();
            
   
            
        } catch (IOException ex) {
            Logger.getLogger(FormaPlaneta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbConfirmarActionPerformed
    
    
    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormaPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaPlaneta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lbAcGrav10;
    private javax.swing.JLabel lbDiametro10;
    private javax.swing.JLabel lbDistEstr;
    private javax.swing.JLabel lbEspLuz10;
    private javax.swing.JLabel lbExcentricidade;
    private javax.swing.JLabel lbGalaxia10;
    private javax.swing.JLabel lbIdade10;
    private javax.swing.JLabel lbMassa10;
    private javax.swing.JLabel lbNome10;
    private javax.swing.JLabel lbTemperatura10;
    private javax.swing.JLabel lbTpRotacao;
    private javax.swing.JLabel lbVelocidade10;
    private javax.swing.JLabel lbVolume10;
    private javax.swing.JPanel painelPlaneta;
    private javax.swing.JTextField tfAcelGrav;
    private javax.swing.JTextField tfDiametro;
    private javax.swing.JTextField tfDistEst;
    private javax.swing.JTextField tfEdL;
    private javax.swing.JTextField tfExcentricidade;
    private javax.swing.JTextField tfGalaxia;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfMassa;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTemperatura;
    private javax.swing.JTextField tfTpRotacao;
    private javax.swing.JTextField tfVelocidade;
    private javax.swing.JTextField tfVolume;
    // End of variables declaration//GEN-END:variables
}
