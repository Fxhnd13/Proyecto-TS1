/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.frontend.gui.calendari_cholquij;

import java.awt.Color;
import javax.swing.JFrame;
import principal.backend.calendari_cholquij.calcular_fecha.CalcularFecha;
import principal.backend.manejadores.ManejadorInformacion;
import principal.frontend.gui.calendari_cholquij.matriz.matrizCholquijFrame;

/**
 *
 * @author jose_
 */
public class PanelCalendarioCholquij extends javax.swing.JPanel {

    private matrizCholquijFrame frame;
    private final ManejadorInformacion manejadorInformacion = ManejadorInformacion.getInstancia();
    /**
     * Creates new form PanelCalendarioCholquij
     */
    public PanelCalendarioCholquij() {
        initComponents();
        this.setBackground(new Color(255, 255, 255, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalendarioCalcularFecha = new javax.swing.JButton();
        btnNahual = new javax.swing.JButton();
        btnMatrizCalendario = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCalendarioCalcularFecha1 = new javax.swing.JButton();
        btnNahual1 = new javax.swing.JButton();
        btnMatrizCalendario1 = new javax.swing.JButton();
        btnMatrizCalendario2 = new javax.swing.JButton();

        setOpaque(false);

        btnCalendarioCalcularFecha.setBackground(new java.awt.Color(51, 51, 51));
        btnCalendarioCalcularFecha.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnCalendarioCalcularFecha.setForeground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha.setText("Calcular Fecha Cholq'ij");
        btnCalendarioCalcularFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFechaActionPerformed(evt);
            }
        });

        btnNahual.setBackground(new java.awt.Color(51, 51, 51));
        btnNahual.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnNahual.setForeground(new java.awt.Color(204, 204, 204));
        btnNahual.setText("Nahual - Energia Cholq'ij");
        btnNahual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahualActionPerformed(evt);
            }
        });

        btnMatrizCalendario.setBackground(new java.awt.Color(51, 51, 51));
        btnMatrizCalendario.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnMatrizCalendario.setForeground(new java.awt.Color(204, 204, 204));
        btnMatrizCalendario.setText("Informacion Cholq'ij (Matriz)");
        btnMatrizCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCalendarioActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CALENDARIO CHOLQ'IJ");

        btnCalendarioCalcularFecha1.setBackground(new java.awt.Color(51, 51, 51));
        btnCalendarioCalcularFecha1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnCalendarioCalcularFecha1.setForeground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha1.setText("Calendario Lunar");
        btnCalendarioCalcularFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFecha1ActionPerformed(evt);
            }
        });

        btnNahual1.setBackground(new java.awt.Color(51, 51, 51));
        btnNahual1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnNahual1.setForeground(new java.awt.Color(204, 204, 204));
        btnNahual1.setText("Formas de contar");
        btnNahual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahual1ActionPerformed(evt);
            }
        });

        btnMatrizCalendario1.setBackground(new java.awt.Color(51, 51, 51));
        btnMatrizCalendario1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnMatrizCalendario1.setForeground(new java.awt.Color(204, 204, 204));
        btnMatrizCalendario1.setText("Dias");
        btnMatrizCalendario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCalendario1ActionPerformed(evt);
            }
        });

        btnMatrizCalendario2.setBackground(new java.awt.Color(51, 51, 51));
        btnMatrizCalendario2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnMatrizCalendario2.setForeground(new java.awt.Color(204, 204, 204));
        btnMatrizCalendario2.setText("Calendario Cholq'ij (información)");
        btnMatrizCalendario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCalendario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalendarioCalcularFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMatrizCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalendarioCalcularFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNahual1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMatrizCalendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMatrizCalendario2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(460, 460, 460))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalendarioCalcularFecha)
                        .addGap(40, 40, 40)
                        .addComponent(btnNahual)
                        .addGap(40, 40, 40)
                        .addComponent(btnMatrizCalendario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalendarioCalcularFecha1)
                        .addGap(40, 40, 40)
                        .addComponent(btnNahual1)
                        .addGap(40, 40, 40)
                        .addComponent(btnMatrizCalendario1)))
                .addGap(58, 58, 58)
                .addComponent(btnMatrizCalendario2)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalendarioCalcularFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFechaActionPerformed
        // TODO add your handling code here:
        CalcularFecha calcularFecha = new CalcularFecha(new JFrame(), true);
        calcularFecha.setVisible(true);
    }//GEN-LAST:event_btnCalendarioCalcularFechaActionPerformed

    private void btnNahualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahualActionPerformed
        // TODO add your handling code here:
        CholqijFrame cholqijFrame = new CholqijFrame();
        cholqijFrame.setVisible(true);
    }//GEN-LAST:event_btnNahualActionPerformed

    private void btnMatrizCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCalendarioActionPerformed
        // TODO add your handling code here:
        if (frame == null) {
            frame = new matrizCholquijFrame();
        }
        frame.setVisible(true);
    }//GEN-LAST:event_btnMatrizCalendarioActionPerformed

    private void btnCalendarioCalcularFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFecha1ActionPerformed
        // TODO add your handling code here:
        manejadorInformacion.mostrarInfCalendarioLunar();
    }//GEN-LAST:event_btnCalendarioCalcularFecha1ActionPerformed

    private void btnNahual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahual1ActionPerformed
        // TODO add your handling code here:
        manejadorInformacion.mostarInfFormasDeContar();
    }//GEN-LAST:event_btnNahual1ActionPerformed

    private void btnMatrizCalendario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCalendario1ActionPerformed
        // TODO add your handling code here:
        manejadorInformacion.mostrarInfDiasCholquij();
    }//GEN-LAST:event_btnMatrizCalendario1ActionPerformed

    private void btnMatrizCalendario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCalendario2ActionPerformed
        // TODO add your handling code here:
        manejadorInformacion.mostrarInfCholquij();
    }//GEN-LAST:event_btnMatrizCalendario2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendarioCalcularFecha;
    private javax.swing.JButton btnCalendarioCalcularFecha1;
    private javax.swing.JButton btnMatrizCalendario;
    private javax.swing.JButton btnMatrizCalendario1;
    private javax.swing.JButton btnMatrizCalendario2;
    private javax.swing.JButton btnNahual;
    private javax.swing.JButton btnNahual1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}