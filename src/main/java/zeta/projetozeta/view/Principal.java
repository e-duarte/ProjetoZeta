/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeta.projetozeta.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import zeta.projetozeta.controle.PesquisaControle;
import zeta.projetozeta.modelo.pesquisa.Pesquisa;
import zeta.projetozeta.modelo.usuario.Usuario;

import zeta.projetozeta.modelo.voo.Voo;


public class Principal extends javax.swing.JFrame {
    private PesquisaControle pesqCont;
    private Pesquisa pesquisa;
    private List<Voo> voos;
    private Descricao descricao;
    private JLabel labelCompanhia;
    private Icon iconCompanhia;
    private Login panelLogin;
    
    public Principal() throws FileNotFoundException {
        initComponents(); // Constuindo os componentes visuais
        
        this.setLayout(new BorderLayout(5,5));
        this.add(panelFun, BorderLayout.NORTH);
        this.add(panelConteudo, BorderLayout.CENTER);
        
        
        pesquisa = new Pesquisa("TXT");
        voos = new ArrayList();
        
        panelLogin = new Login();
        panelLogin.setPanelConteudo(panelConteudo);
        
    }

    // Código gerado pelo NetBeans. Inicializa as variaveis usada pelo a ferramenta
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFun = new javax.swing.JPanel();
        bEstatistica = new javax.swing.JButton();
        bAvisos = new javax.swing.JButton();
        bVooMon = new javax.swing.JButton();
        iconeZeta = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        bPerfil = new javax.swing.JButton();
        panelConteudo = new javax.swing.JPanel();
        panelPesq = new javax.swing.JPanel();
        pbuttonPesq = new javax.swing.JPanel();
        bPesquisa = new javax.swing.JButton();
        textOrigem = new javax.swing.JTextField();
        sepOrigem = new javax.swing.JSeparator();
        textdestino = new javax.swing.JTextField();
        sepDestino = new javax.swing.JSeparator();
        textpartida = new javax.swing.JTextField();
        sepPartida = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zeta");

        panelFun.setBackground(new java.awt.Color(153, 153, 153));

        bEstatistica.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        bEstatistica.setText("statistic");
        bEstatistica.setBorder(null);
        bEstatistica.setBorderPainted(false);
        bEstatistica.setContentAreaFilled(false);
        bEstatistica.setFocusPainted(false);
        bEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstatisticaActionPerformed(evt);
            }
        });

        bAvisos.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        bAvisos.setText("Avisos");
        bAvisos.setBorder(null);
        bAvisos.setBorderPainted(false);
        bAvisos.setContentAreaFilled(false);
        bAvisos.setFocusPainted(false);
        bAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvisosActionPerformed(evt);
            }
        });

        bVooMon.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        bVooMon.setText("Meeting");
        bVooMon.setBorder(null);
        bVooMon.setBorderPainted(false);
        bVooMon.setContentAreaFilled(false);
        bVooMon.setFocusPainted(false);
        bVooMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVooMonActionPerformed(evt);
            }
        });

        iconeZeta.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        iconeZeta.setText("Zeta");

        bLogin.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        bLogin.setText("Login");
        bLogin.setBorder(null);
        bLogin.setBorderPainted(false);
        bLogin.setContentAreaFilled(false);
        bLogin.setFocusPainted(false);
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        bPerfil.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        bPerfil.setText("Perfil");
        bPerfil.setBorder(null);
        bPerfil.setBorderPainted(false);
        bPerfil.setContentAreaFilled(false);
        bPerfil.setFocusPainted(false);
        bPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFunLayout = new javax.swing.GroupLayout(panelFun);
        panelFun.setLayout(panelFunLayout);
        panelFunLayout.setHorizontalGroup(
            panelFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iconeZeta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVooMon)
                .addGap(2, 2, 2)
                .addComponent(bEstatistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAvisos)
                .addGap(63, 63, 63)
                .addComponent(bPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLogin)
                .addGap(39, 39, 39))
        );
        panelFunLayout.setVerticalGroup(
            panelFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(iconeZeta, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addComponent(bVooMon)
                .addComponent(bAvisos)
                .addComponent(bPerfil)
                .addComponent(bLogin)
                .addComponent(bEstatistica))
        );

        panelConteudo.setBackground(new java.awt.Color(255, 255, 255));

        panelPesq.setBackground(new java.awt.Color(41, 127, 232));
        panelPesq.setForeground(new java.awt.Color(255, 255, 255));

        pbuttonPesq.setBackground(new java.awt.Color(0, 232, 73));

        bPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        bPesquisa.setText("Pesquisar");
        bPesquisa.setBorder(null);
        bPesquisa.setBorderPainted(false);
        bPesquisa.setContentAreaFilled(false);
        bPesquisa.setFocusable(false);
        bPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pbuttonPesqLayout = new javax.swing.GroupLayout(pbuttonPesq);
        pbuttonPesq.setLayout(pbuttonPesqLayout);
        pbuttonPesqLayout.setHorizontalGroup(
            pbuttonPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbuttonPesqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        pbuttonPesqLayout.setVerticalGroup(
            pbuttonPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbuttonPesqLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        textOrigem.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        textOrigem.setText("origem");
        textOrigem.setBorder(null);
        textOrigem.setOpaque(false);
        textOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOrigemActionPerformed(evt);
            }
        });

        sepOrigem.setBackground(new java.awt.Color(160, 160, 160));

        textdestino.setText("destino");
        textdestino.setBorder(null);
        textdestino.setOpaque(false);
        textdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdestinoActionPerformed(evt);
            }
        });

        sepDestino.setBackground(new java.awt.Color(160, 160, 160));

        textpartida.setText("data da partida");
        textpartida.setBorder(null);
        textpartida.setOpaque(false);
        textpartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpartidaActionPerformed(evt);
            }
        });

        sepPartida.setBackground(new java.awt.Color(160, 160, 160));

        javax.swing.GroupLayout panelPesqLayout = new javax.swing.GroupLayout(panelPesq);
        panelPesq.setLayout(panelPesqLayout);
        panelPesqLayout.setHorizontalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesqLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textOrigem)
                            .addComponent(sepOrigem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sepDestino)
                            .addComponent(textdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPesqLayout.createSequentialGroup()
                                .addComponent(textpartida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                                .addComponent(sepPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pbuttonPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        panelPesqLayout.setVerticalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addComponent(textOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addComponent(textdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textpartida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(panelPesqLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pbuttonPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(panelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOrigemActionPerformed

    private void textdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdestinoActionPerformed

    private void textpartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpartidaActionPerformed

    private void bVooMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVooMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVooMonActionPerformed

    private void bAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAvisosActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLoginActionPerformed

    private void bPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPerfilActionPerformed

    private void bPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisaActionPerformed

        pesquisa.setOrigem(textOrigem.getText());
        pesquisa.setDestino(textdestino.getText());
        pesquisa.setIda(textpartida.getText());
        voos = pesqCont.chamaPesquisa(pesquisa);
        
        panelConteudo.setLayout(new GridLayout(voos.size(),0));
        
        panelPesq.setVisible(false);
        
        for(Voo aux : voos){
            descricao = new Descricao();
            
            if(aux.getCompanhia().equals("Azul")){
               iconCompanhia = new ImageIcon(getClass().getResource("azul.png"));
               labelCompanhia = new JLabel("Azul");
               labelCompanhia.setIcon(iconCompanhia);
            }else if(aux.getCompanhia().equals("Gol")){
               iconCompanhia = new ImageIcon(getClass().getResource("azul.png"));
               labelCompanhia = new JLabel();
               labelCompanhia.setIcon(iconCompanhia);
            }else{
               iconCompanhia = new ImageIcon(getClass().getResource("azul.png"));
               labelCompanhia = new JLabel();
               labelCompanhia.setIcon(iconCompanhia);
            }
            descricao.setLabelIcone(labelCompanhia);
            
            descricao.setLabelData(new JLabel(aux.getIda()));
            descricao.setNomeOrigem(new JLabel(aux.getOrigem()));
            descricao.setNomeDestino(new JLabel(aux.getDestino()));
            descricao.setLabelDestino(new JLabel(aux.getIda()));
            descricao.setLabelOrigem(new JLabel(aux.getIda()));
            
            panelConteudo.add(descricao);
        }
      
    }//GEN-LAST:event_bPesquisaActionPerformed

    private void bEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstatisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEstatisticaActionPerformed

 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAvisos;
    private javax.swing.JButton bEstatistica;
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bPerfil;
    private javax.swing.JButton bPesquisa;
    private javax.swing.JButton bVooMon;
    private javax.swing.JLabel iconeZeta;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelFun;
    private javax.swing.JPanel panelPesq;
    private javax.swing.JPanel pbuttonPesq;
    private javax.swing.JSeparator sepDestino;
    private javax.swing.JSeparator sepOrigem;
    private javax.swing.JSeparator sepPartida;
    private javax.swing.JTextField textOrigem;
    private javax.swing.JTextField textdestino;
    private javax.swing.JTextField textpartida;
    // End of variables declaration//GEN-END:variables
}
