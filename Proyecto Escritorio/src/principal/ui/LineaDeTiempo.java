/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelos.database.HechoHistoricoDb;
import modelos.objetos.HechoHistorico;
import modelos.objetos.Usuario;

/**
 * Clase destianda a el manejo del frame para la linea de tiempo de los hechos historicos
 * @author sergio
 */
public class LineaDeTiempo extends javax.swing.JFrame {

    private ArrayList<EventoDeTiempo> eventos;
    private Usuario usuario;
    public final static ImageIcon BG = new ImageIcon("Imagenes/fondoHistoria.jpg");
    private int index = 0;

    /**
     * Constructor, creates new form LineaDeTiempo
     */
    public LineaDeTiempo(Usuario usuario) {
        initComponents();
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        obtenerHechos();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.eventos = eventos;
        verificarUsuario();
        addPrimerHecho();
        setBackground();
    }

    /**
     * Procedimiento para cargar los hechos historicos aprobados
     */
    public void obtenerHechos() {
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        LinkedList<HechoHistorico> hechoHistoricos = hechoHistoricoDb.leerHechosHistoricos();
        eventos = new ArrayList<>();

        for (int i = 0; i < hechoHistoricos.size(); i++) {

            eventos.add(new EventoDeTiempo(hechoHistoricos.get(i)));

        }
    }

    private void setBackground() {
        JLabel backgroundLbl = new JLabel();
        backgroundLbl.setSize(this.getSize());
        rsscalelabel.RSScaleLabel.setScaleLabel(backgroundLbl, "Imagenes/fondoHistoria.jpg");
        this.add(backgroundLbl);
        backgroundLbl.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnCholqij4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setSize(new java.awt.Dimension(700, 410));

        jLabel1.setBackground(new java.awt.Color(73, 64, 21));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("  Linea De Tiempo  ");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(204, 204, 204));
        btnSiguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCholqij4.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCholqij4.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij4.setText("Eliminar Evento");
        btnCholqij4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Agregar Evento");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 230, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguiente)
                                .addGap(305, 305, 305))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(btnCholqij4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnCholqij4))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSiguiente))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        index++;
        jPanel1.removeAll();
        jPanel1.add(eventos.get(index));
        eventos.get(index).setVisible(true);
        jPanel1.validate();
        jPanel1.repaint();
        if (index == eventos.size() - 1) {
            btnSiguiente.setEnabled(false);

        } else {
            btnSiguiente.setEnabled(true);
        }
        jButton1.setEnabled(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index--;
        jPanel1.removeAll();
        jPanel1.add(eventos.get(index));
        eventos.get(index).setVisible(true);
        jPanel1.validate();
        jPanel1.repaint();
        if (index == 0) {
            jButton1.setEnabled(false);

        } else {
            jButton1.setEnabled(true);
        }
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AgregarEvento ae= new AgregarEvento();
        ae.setLinea(this);
        ae.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCholqij4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij4ActionPerformed

    }//GEN-LAST:event_btnCholqij4ActionPerformed
    private void addPrimerHecho() {
        System.out.println(eventos.size());
        if (eventos.size() > 0) {
            jPanel1.add(eventos.get(0));
            eventos.get(0).setVisible(true);
            jPanel1.validate();
            jPanel1.repaint();
        }
    }

    /**
     * @param args the command line arguments
     */
    private void verificarUsuario() {
        if (usuario.getRol() == 1) {
            jButton6.setVisible(true);
            btnCholqij4.setVisible(true);
        } else {
            jButton6.setVisible(false);
            btnCholqij4.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCholqij4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}