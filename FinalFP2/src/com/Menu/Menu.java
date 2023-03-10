/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Menu;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    int xMause,yMause;
    public Menu() {
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

        Bg = new javax.swing.JPanel();
        Borde = new javax.swing.JPanel();
        Salida = new javax.swing.JPanel();
        TextoS = new javax.swing.JLabel();
        Control = new javax.swing.JPanel();
        Juego = new javax.swing.JPanel();
        TxJuego = new javax.swing.JLabel();
        Historia = new javax.swing.JPanel();
        TxHistoria = new javax.swing.JLabel();
        Historial = new javax.swing.JPanel();
        TxHistorial = new javax.swing.JLabel();
        Creditos = new javax.swing.JPanel();
        TxCreditos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Borde.setOpaque(false);
        Borde.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BordeMouseDragged(evt);
            }
        });
        Borde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BordeMousePressed(evt);
            }
        });

        Salida.setOpaque(false);

        TextoS.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TextoS.setForeground(new java.awt.Color(255, 255, 255));
        TextoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoS.setText("X");
        TextoS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalidaLayout = new javax.swing.GroupLayout(Salida);
        Salida.setLayout(SalidaLayout);
        SalidaLayout.setHorizontalGroup(
            SalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SalidaLayout.setVerticalGroup(
            SalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoS, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BordeLayout = new javax.swing.GroupLayout(Borde);
        Borde.setLayout(BordeLayout);
        BordeLayout.setHorizontalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BordeLayout.createSequentialGroup()
                .addGap(0, 746, Short.MAX_VALUE)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BordeLayout.setVerticalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BordeLayout.createSequentialGroup()
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bg.add(Borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        Control.setOpaque(false);

        Juego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Juego.setOpaque(false);

        TxJuego.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TxJuego.setForeground(new java.awt.Color(255, 255, 255));
        TxJuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxJuego.setText("Nuevo Juego");
        TxJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxJuegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxJuegoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JuegoLayout = new javax.swing.GroupLayout(Juego);
        Juego.setLayout(JuegoLayout);
        JuegoLayout.setHorizontalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JuegoLayout.setVerticalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Historia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historia.setOpaque(false);

        TxHistoria.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TxHistoria.setForeground(new java.awt.Color(255, 255, 255));
        TxHistoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxHistoria.setText("Historia");
        TxHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxHistoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxHistoriaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HistoriaLayout = new javax.swing.GroupLayout(Historia);
        Historia.setLayout(HistoriaLayout);
        HistoriaLayout.setHorizontalGroup(
            HistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxHistoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HistoriaLayout.setVerticalGroup(
            HistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        Historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historial.setOpaque(false);

        TxHistorial.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TxHistorial.setForeground(new java.awt.Color(255, 255, 255));
        TxHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxHistorial.setText("Historial de Juego");
        TxHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxHistorialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HistorialLayout = new javax.swing.GroupLayout(Historial);
        Historial.setLayout(HistorialLayout);
        HistorialLayout.setHorizontalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        HistorialLayout.setVerticalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        Creditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Creditos.setOpaque(false);

        TxCreditos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TxCreditos.setForeground(new java.awt.Color(255, 255, 255));
        TxCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxCreditos.setText("Creditos");
        TxCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxCreditosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CreditosLayout = new javax.swing.GroupLayout(Creditos);
        Creditos.setLayout(CreditosLayout);
        CreditosLayout.setHorizontalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxCreditos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreditosLayout.setVerticalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ControlLayout = new javax.swing.GroupLayout(Control);
        Control.setLayout(ControlLayout);
        ControlLayout.setHorizontalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Historia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ControlLayout.setVerticalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlLayout.createSequentialGroup()
                .addComponent(Juego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        Bg.add(Control, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 280, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Img/fondo.png"))); // NOI18N
        Bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoSMouseClicked
         System.exit(0);
    }//GEN-LAST:event_TextoSMouseClicked

    private void BordeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BordeMousePressed
          xMause=evt.getX();
          yMause=evt.getY();
    }//GEN-LAST:event_BordeMousePressed

    private void BordeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BordeMouseDragged
        int x =evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMause, y-yMause);
    }//GEN-LAST:event_BordeMouseDragged

    private void TextoSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoSMouseEntered
        TextoS.setForeground(Color.red);
    }//GEN-LAST:event_TextoSMouseEntered

    private void TextoSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoSMouseExited
        TextoS.setForeground(Color.white);
    }//GEN-LAST:event_TextoSMouseExited

    private void TxJuegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxJuegoMouseEntered
          Juego.setBackground(Color.gray);
          TxJuego.setForeground(Color.blue);
    }//GEN-LAST:event_TxJuegoMouseEntered

    private void TxJuegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxJuegoMouseExited
       TxJuego.setForeground(Color.white);
    }//GEN-LAST:event_TxJuegoMouseExited

    private void TxHistoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxHistoriaMouseEntered
        TxHistoria.setForeground(Color.blue);
    }//GEN-LAST:event_TxHistoriaMouseEntered

    private void TxHistoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxHistoriaMouseExited
        TxHistoria.setForeground(Color.white);
    }//GEN-LAST:event_TxHistoriaMouseExited

    private void TxHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxHistorialMouseEntered
       TxHistorial.setForeground(Color.blue);
    }//GEN-LAST:event_TxHistorialMouseEntered

    private void TxHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxHistorialMouseExited
       TxHistorial.setForeground(Color.white);
    }//GEN-LAST:event_TxHistorialMouseExited

    private void TxCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxCreditosMouseEntered
      TxCreditos.setForeground(Color.blue);
    }//GEN-LAST:event_TxCreditosMouseEntered

    private void TxCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxCreditosMouseExited
       TxCreditos.setForeground(Color.white);
    }//GEN-LAST:event_TxCreditosMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel Borde;
    private javax.swing.JPanel Control;
    private javax.swing.JPanel Creditos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Historia;
    private javax.swing.JPanel Historial;
    private javax.swing.JPanel Juego;
    private javax.swing.JPanel Salida;
    private javax.swing.JLabel TextoS;
    private javax.swing.JLabel TxCreditos;
    private javax.swing.JLabel TxHistoria;
    private javax.swing.JLabel TxHistorial;
    private javax.swing.JLabel TxJuego;
    // End of variables declaration//GEN-END:variables
}
