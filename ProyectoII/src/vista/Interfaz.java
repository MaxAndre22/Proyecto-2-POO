/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import control.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gerson
 */
public class Interfaz extends javax.swing.JFrame {

    Controlador controlador= new Controlador();
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        
        btnIzquierda.setIcon(btn_setIcono("/iconos/1.png", btnIzquierda));
        btnIzquierda.setBackground(new Color(0,0,0,0));
        btnDerecha.setIcon(btn_setIcono("/iconos/3.png", btnDerecha));
        btnDerecha.setBackground(new Color(0,0,0,0));
        btnArriba.setIcon(btn_setIcono("/iconos/2.png", btnArriba));
        btnArriba.setBackground(new Color(0,0,0,0));
        btnAbajo.setIcon(btn_setIcono("/iconos/4.png", btnAbajo));
        btnAbajo.setBackground(new Color(0,0,0,0));
        
        this.setLocationRelativeTo(null); /*Se centra automáticamente*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        generar_Tablero(25,15);
        this.setVisible(true);
        System.out.println(this.controlador.getTablero().toString());
        
        
            
    }
    
    public void generar_Tablero (int x, int y){
        
        
        this.setLayout(null);

        int pos_x=10;
        int pos_y=30;
        int cont=0;
        int numero;
        int promedio= ((x*y)*5)/100;
        
        for (int i = 0; i < x*y; i++) {
            
            Casilla casilla= new Casilla(i);
            casilla.getLblcasilla().setBounds(pos_x, pos_y, 30, 30);
            
            
                    
            cont++;
            if (cont<x){
                pos_x=pos_x+31;
            }
            else{
                pos_x=10;
                pos_y=pos_y+31;
                cont=0;
            }
            
            this.add(casilla.getLblcasilla());
            this.controlador.getTablero().Agregar_Casilla(casilla);
            this.controlador.getTablero().getLista_casilla().get(i).getLblcasilla().setIcon(lbl_setIcono ("/iconos/cesped.jpg",
            this.controlador.getTablero().getLista_casilla().get(i).getLblcasilla()));
            this.controlador.getTablero().getLista_casilla().get(i).getLblcasilla().addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Clicked");
                }

            });
             
                
        }
        for (int i = 0; i < promedio; i++) {
            
            numero = (int) (Math.random() * x*y) + 1;
            this.controlador.getTablero().Retorna_Casilla(numero).getLblcasilla().setIcon(lbl_setIcono("/iconos/obstáculo.jpg",
            this.controlador.getTablero().Retorna_Casilla(numero).getLblcasilla()));
            
            
        }
        
        
    
    }
    
    public Icon btn_setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon icono = new ImageIcon (icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
        
    }
    
    public Icon lbl_setIcono(String url, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = label.getWidth();
        int alto = label.getHeight();
        
        ImageIcon icono = new ImageIcon (icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar_Turno = new javax.swing.JButton();
        btnArriba = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar_Turno.setText("Iniciar Turno");
        btnIniciar_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar_TurnoActionPerformed(evt);
            }
        });

        btnArriba.setBorder(null);
        btnArriba.setBorderPainted(false);
        btnArriba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArriba.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArriba.setIconTextGap(2);
        btnArriba.setOpaque(false);
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });

        btnAbajo.setBorder(null);
        btnAbajo.setBorderPainted(false);
        btnAbajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbajo.setIconTextGap(2);
        btnAbajo.setOpaque(false);
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });

        btnDerecha.setBorder(null);
        btnDerecha.setBorderPainted(false);
        btnDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDerecha.setIconTextGap(2);
        btnDerecha.setOpaque(false);
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzquierda.setBackground(new java.awt.Color(0, 0, 0));
        btnIzquierda.setText(" ");
        btnIzquierda.setBorder(null);
        btnIzquierda.setBorderPainted(false);
        btnIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzquierda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIzquierda.setIconTextGap(2);
        btnIzquierda.setOpaque(false);
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciar_Turno)
                        .addGap(130, 130, 130)
                        .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440)
                .addComponent(btnArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciar_Turno)
                    .addComponent(btnAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciar_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciar_TurnoActionPerformed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnIzquierdaActionPerformed
  
    
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIniciar_Turno;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
