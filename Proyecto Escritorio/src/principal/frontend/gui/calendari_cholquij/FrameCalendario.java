/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.frontend.gui.calendari_cholquij;

import javax.swing.JLabel;
import principal.backend.calendari_cholquij.calcular_fecha.CalcularFecha;
import principal.backend.manejadores.ManejadorInformacion;
import principal.frontend.gui.calendari_cholquij.matriz.matrizCholquijFrame;

/**
 * Frame que muestra las funcionalidades del calendario cholqij
 * @author bryangmz
 */
public class FrameCalendario extends javax.swing.JFrame {

    private matrizCholquijFrame frame;
    private final ManejadorInformacion manejadorInformacion = ManejadorInformacion.getInstancia();
    
    /**
     * Creates new form FrameCalendario
     */
    public FrameCalendario() {
        initComponents();
        this.setLocationRelativeTo(null);
        colocarFondo();
    }
    
    /**
     * Procedimiento para colocar la imgen de fondo en el frame
     */
    public void colocarFondo(){
        JLabel backgroundLbl = new JLabel();
        this.add(backgroundLbl);
        backgroundLbl.setSize(this.getSize());
        rsscalelabel.RSScaleLabel.setScaleLabel(backgroundLbl, "Imagenes/fondoCholqij.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCalendarioCalcularFecha = new javax.swing.JButton();
        btnNahual = new javax.swing.JButton();
        btnMatrizCalendario = new javax.swing.JButton();
        btnCalendarioCalcularFecha1 = new javax.swing.JButton();
        btnCalendarioCalcularFecha2 = new javax.swing.JButton();
        btnCalendarioCalcularFecha3 = new javax.swing.JButton();
        btnCalendarioCalcularFecha4 = new javax.swing.JButton();

        setResizable(false);
        setSize(new java.awt.Dimension(800, 430));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CALENDARIO CHOLQ'IJ");

        btnCalendarioCalcularFecha.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalendarioCalcularFecha.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioCalcularFecha.setText("Calcular Fecha Cholq'ij");
        btnCalendarioCalcularFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFechaActionPerformed(evt);
            }
        });

        btnNahual.setBackground(new java.awt.Color(204, 204, 204));
        btnNahual.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnNahual.setForeground(new java.awt.Color(0, 0, 0));
        btnNahual.setText("Nahual - Energia Cholq'ij");
        btnNahual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahualActionPerformed(evt);
            }
        });

        btnMatrizCalendario.setBackground(new java.awt.Color(204, 204, 204));
        btnMatrizCalendario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnMatrizCalendario.setForeground(new java.awt.Color(0, 0, 0));
        btnMatrizCalendario.setText("Informacion Cholq'ij (Matriz)");
        btnMatrizCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCalendarioActionPerformed(evt);
            }
        });

        btnCalendarioCalcularFecha1.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalendarioCalcularFecha1.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioCalcularFecha1.setText("Informacion");
        btnCalendarioCalcularFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFecha1ActionPerformed(evt);
            }
        });

        btnCalendarioCalcularFecha2.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalendarioCalcularFecha2.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioCalcularFecha2.setText("Calendario Lunar");
        btnCalendarioCalcularFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFecha2ActionPerformed(evt);
            }
        });

        btnCalendarioCalcularFecha3.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalendarioCalcularFecha3.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioCalcularFecha3.setText("Formas de contar");
        btnCalendarioCalcularFecha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFecha3ActionPerformed(evt);
            }
        });

        btnCalendarioCalcularFecha4.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalendarioCalcularFecha4.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioCalcularFecha4.setText("Dias");
        btnCalendarioCalcularFecha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFecha4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalendarioCalcularFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCalendarioCalcularFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCalendarioCalcularFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMatrizCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCalendarioCalcularFecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(btnCalendarioCalcularFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalendarioCalcularFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalendarioCalcularFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNahual)
                    .addComponent(btnCalendarioCalcularFecha3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMatrizCalendario)
                    .addComponent(btnCalendarioCalcularFecha4))
                .addGap(18, 18, 18)
                .addComponent(btnCalendarioCalcularFecha)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Procedimiento para mostrar el frame de la funcionalidad para calcular fecha del calendario cholqij
     * @param evt evento que ejecuta el procedimiento
     */
    private void btnCalendarioCalcularFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFechaActionPerformed
        // TODO add your handling code here:
        CalcularFecha calcularFecha = new CalcularFecha(this, true);
        calcularFecha.setVisible(true);
    }//GEN-LAST:event_btnCalendarioCalcularFechaActionPerformed

    /**
     * Procedimiento que muestra en pantalla el frame de la funcionalidad de matriz del calendario cholqij
     * @param evt evento que ejecuta el procedimiento
     */
    private void btnMatrizCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCalendarioActionPerformed
        // TODO add your handling code here:
        if (frame == null) {
            frame = new matrizCholquijFrame();
        }
        frame.setVisible(true);
    }//GEN-LAST:event_btnMatrizCalendarioActionPerformed

    /**
     * Procedimiento que muestra en pantalla el frame sobre informacion del calendario cholqij
     * @param evt evento que ejecuta el procedimiento
     */
    private void btnNahualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahualActionPerformed
        // TODO add your handling code here:
        CholqijFrame cholqijFrame = new CholqijFrame();
        cholqijFrame.setVisible(true);
    }//GEN-LAST:event_btnNahualActionPerformed

    private void btnCalendarioCalcularFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFecha1ActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfCholquij();
    }//GEN-LAST:event_btnCalendarioCalcularFecha1ActionPerformed

    private void btnCalendarioCalcularFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFecha2ActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfCalendarioLunar();
    }//GEN-LAST:event_btnCalendarioCalcularFecha2ActionPerformed

    private void btnCalendarioCalcularFecha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFecha3ActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostarInfFormasDeContar();
    }//GEN-LAST:event_btnCalendarioCalcularFecha3ActionPerformed

    private void btnCalendarioCalcularFecha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFecha4ActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfDiasCholquij();
    }//GEN-LAST:event_btnCalendarioCalcularFecha4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendarioCalcularFecha;
    private javax.swing.JButton btnCalendarioCalcularFecha1;
    private javax.swing.JButton btnCalendarioCalcularFecha2;
    private javax.swing.JButton btnCalendarioCalcularFecha3;
    private javax.swing.JButton btnCalendarioCalcularFecha4;
    private javax.swing.JButton btnMatrizCalendario;
    private javax.swing.JButton btnNahual;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
