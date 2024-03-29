/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genius.visao;

import genius.controlador.Controle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class MainScreen extends javax.swing.JFrame {
    private Controle controle = new Controle();
    private boolean tempo;
    private Timer t  = new Timer(5000, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println();
            if (tempo==true) {
                t.stop();
            } else {
                DialogoDerrota.setVisible(true);
            }
        }
    });
    
    
    public void setColorBlueButton(Color cor){
        BlueButton.setBackground(cor);
    }
    public void setColorGreenButton(Color cor){
        GreenButton.setBackground(cor);
    }
    public void setColorRedButton(Color cor){
        RedButton.setBackground(cor);
    }
    public void setColorYellowButton(Color cor){
        YellowButton.setBackground(cor);
    }
    public MainScreen() {
        initComponents();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        DialogoVitoria.setBounds((screenSize.width-206)/2, (screenSize.height-150)/2,206,150);
        DialogoDerrota.setBounds((screenSize.width-206)/2, (screenSize.height-150)/2,206,150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoVitoria = new javax.swing.JDialog();
        RestartVitoria = new javax.swing.JButton();
        labelVitora = new javax.swing.JLabel();
        DialogoDerrota = new javax.swing.JDialog();
        RestartDerrota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        RedButton = new javax.swing.JButton();
        GreenButton = new javax.swing.JButton();
        BlueButton = new javax.swing.JButton();
        YellowButton = new javax.swing.JButton();

        DialogoVitoria.setMinimumSize(new java.awt.Dimension(206, 150));
        DialogoVitoria.setModal(true);

        RestartVitoria.setText("Reiniciar");
        RestartVitoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartVitoriaActionPerformed(evt);
            }
        });

        labelVitora.setText("Você venceu!!!");

        javax.swing.GroupLayout DialogoVitoriaLayout = new javax.swing.GroupLayout(DialogoVitoria.getContentPane());
        DialogoVitoria.getContentPane().setLayout(DialogoVitoriaLayout);
        DialogoVitoriaLayout.setHorizontalGroup(
            DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoVitoriaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RestartVitoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVitora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        DialogoVitoriaLayout.setVerticalGroup(
            DialogoVitoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoVitoriaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelVitora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(RestartVitoria)
                .addGap(24, 24, 24))
        );

        DialogoDerrota.setMinimumSize(new java.awt.Dimension(206, 150));
        DialogoDerrota.setModal(true);
        DialogoDerrota.setPreferredSize(new java.awt.Dimension(206, 150));

        RestartDerrota.setText("Reiniciar");
        RestartDerrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartDerrotaActionPerformed(evt);
            }
        });

        jLabel1.setText("GAME OVER   : (");

        javax.swing.GroupLayout DialogoDerrotaLayout = new javax.swing.GroupLayout(DialogoDerrota.getContentPane());
        DialogoDerrota.getContentPane().setLayout(DialogoDerrotaLayout);
        DialogoDerrotaLayout.setHorizontalGroup(
            DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoDerrotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RestartDerrota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogoDerrotaLayout.setVerticalGroup(
            DialogoDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoDerrotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(RestartDerrota)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(DialogoDerrota.getBounds());

        StartButton.setText("Iniciar");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        RedButton.setBackground(java.awt.Color.red);
        RedButton.setForeground(new java.awt.Color(187, 7, 7));
        RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedButtonActionPerformed(evt);
            }
        });

        GreenButton.setBackground(java.awt.Color.green);
        GreenButton.setForeground(new java.awt.Color(1, 123, 1));
        GreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenButtonActionPerformed(evt);
            }
        });

        BlueButton.setBackground(java.awt.Color.blue);
        BlueButton.setForeground(new java.awt.Color(26, 17, 210));
        BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed(evt);
            }
        });

        YellowButton.setBackground(java.awt.Color.yellow);
        YellowButton.setForeground(new java.awt.Color(192, 184, 2));
        YellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GreenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BlueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YellowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BlueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedButtonActionPerformed
        this.loopCompara(0);
    }//GEN-LAST:event_RedButtonActionPerformed

    private void GreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenButtonActionPerformed
        this.loopCompara(1);
    }//GEN-LAST:event_GreenButtonActionPerformed

    private void BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueButtonActionPerformed
        this.loopCompara(2);
    }//GEN-LAST:event_BlueButtonActionPerformed

    private void YellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowButtonActionPerformed
        this.loopCompara(3);
    }//GEN-LAST:event_YellowButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        controle.zeraIndice();
        this.tempo = true;
        controle.setNivel();
        controle.geraSequencia();  
        try {
            this.piscaSequencia();
            tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void RestartVitoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartVitoriaActionPerformed
        controle.zeraIndice();
        this.tempo=true;
        controle.setNivel();
        controle.geraSequencia(); 
        DialogoVitoria.setVisible(false);
        try {
            this.piscaSequencia();
            this.tempo=false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_RestartVitoriaActionPerformed

    private void RestartDerrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartDerrotaActionPerformed
        controle.zeraIndice();
        this.tempo = true;
        controle.setNivel();
        controle.geraSequencia();
        DialogoDerrota.setVisible(false);
        try {
            this.piscaSequencia();
            this.tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RestartDerrotaActionPerformed
    
   public void loopCompara(int entrada){
       int resultado = controle.compara(entrada);
       if(resultado==2){
           t.stop();
           controle.zeraIndice();
           this.tempo = true;
           System.out.println("Nivel = " + controle.getNivel());
           try {
            this.piscaSequencia();
            this.tempo = false;
            t.start();
        } catch (Exception ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       if(resultado ==3){;
           t.stop();
           DialogoVitoria.setVisible(true);
       }
       if(resultado==0){
           t.stop();
           DialogoDerrota.setVisible(true);
       }
       if(resultado==1){
          t.stop();
       }
       
   }                                          
    
     
   public void piscaSequencia() throws Exception{
        for(int i = 0;i<controle.getNivel();i++)           
                switch (controle.getSequencia().get(i)){
                    case 0:
                        RedButton.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        RedButton.setBackground(Color.red);
                        update(getGraphics());
                        break;
                    case 1:
                        GreenButton.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        GreenButton.setBackground(Color.green);
                        update(getGraphics());
                        break;
                    case 2:
                        BlueButton.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        BlueButton.setBackground(Color.blue);
                        update(getGraphics());
                        break;
                    case 3:
                        YellowButton.setBackground(Color.gray);
                        update(getGraphics());
                        Thread.sleep(1000);
                        YellowButton.setBackground(Color.yellow);
                        update(getGraphics());
                        break;
                }
                
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainScreen Tela = new MainScreen();
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                Tela.setBounds((screenSize.width-316)/2, (screenSize.height-300)/2,316,300);
                
                Tela.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlueButton;
    private javax.swing.JDialog DialogoDerrota;
    private javax.swing.JDialog DialogoVitoria;
    private javax.swing.JButton GreenButton;
    private javax.swing.JButton RedButton;
    private javax.swing.JButton RestartDerrota;
    private javax.swing.JButton RestartVitoria;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton YellowButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelVitora;
    // End of variables declaration//GEN-END:variables
}
