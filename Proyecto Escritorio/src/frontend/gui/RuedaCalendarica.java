/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import modelos.database.FechaCholqijDb;
import modelos.database.FechaHaabDb;
import modelos.database.InformacionDb;
import modelos.database.Mensaje;
import modelos.database.Utilidades;
import modelos.objetos.FechaCholqij;
import modelos.objetos.FechaHaab;
import principal.menu.Centrador;

/**
 * Frame destinado a las funcionalidades del calendario haab
 * @author jose_
 */
public class RuedaCalendarica extends javax.swing.JFrame {

    private int noCholqijPivote, noHaabPivote;
    private Date fechaPivote = Utilidades.StringToDate("2021-02-25"), fecha;
            
    /**
     * Creates new form RuedaCalendarica
     */
    public RuedaCalendarica(int noCholqijPivote, int noHaabPivote, Date fecha) {
        this.noCholqijPivote = noCholqijPivote;
        this.noHaabPivote = noHaabPivote;
        this.fecha = fecha;
        initComponents();
        colocarFondo();
        int dias=(int) ((fecha.getTime()-fechaPivote.getTime())/86400000);
        fechaIngresada.setDate(fecha);
        calcularDia(dias);
        colocarValores();
        pnlEnergiaCholqij.setBackground(new Color(255,255,255,50));
        pnlNahualCholqij.setBackground(new Color(255,255,255,50));
        pnlNahualHaab1.setBackground(new Color(255,255,255,50));
        pnlWinalHaab.setBackground(new Color(255,255,255,50));
        jPanel1.setBackground(new Color(255,255,255,50));
        jPanel4.setBackground(new Color(255,255,255,50));
    }

    /**
     * Procedimiento para colocar la imgen de fondo en el frame
     */
    public void colocarFondo(){
        JLabel backgroundLbl = new JLabel();
        this.add(backgroundLbl);
        backgroundLbl.setSize(this.getSize());
        rsscalelabel.RSScaleLabel.setScaleLabel(backgroundLbl, "Imagenes/Rueda-calendarica-tzolkin-y-haab2.jpg");
    }
    
    private void colocarValores(){
        FechaCholqijDb accesoCholqij = new FechaCholqijDb();
        FechaHaabDb accesoHaab = new FechaHaabDb();
        FechaHaab fechaHaab = accesoHaab.getFecha(noHaabPivote);
        FechaCholqij fechaCholqij = accesoCholqij.getFecha(noCholqijPivote);
        fechaHaab.getNahual().getImagen().colocarImagen(lblNahualHaab1);
        fechaHaab.getWinal().getImagen().colocarImagen(lblWinalHaab);
        cargarImagen(fechaCholqij.getEnergia().getImagen().getDirEscritorio(),lblEnergiaCholqij);
        fechaCholqij.getNahual().getImagen().colocarImagen(lblNahualCholqij);
        hacerTitulos(fechaCholqij, fechaHaab);
    }
    
    private void hacerTitulos(FechaCholqij fechaCholqij, FechaHaab fechaHaab){
        ((TitledBorder)pnlNahualHaab1.getBorder()).setTitle("Nahual - "+fechaHaab.getNahual().getNombre());
        ((TitledBorder)pnlWinalHaab.getBorder()).setTitle("Winal - "+fechaHaab.getWinal().getNombre());
        ((TitledBorder)pnlEnergiaCholqij.getBorder()).setTitle("Energia - "+fechaCholqij.getEnergia().getNombre());
        ((TitledBorder)pnlNahualCholqij.getBorder()).setTitle("Nahual - "+fechaCholqij.getNahual().getNombre());
        pnlNahualHaab1.repaint();
        pnlWinalHaab.repaint();
        pnlEnergiaCholqij.repaint();
        pnlNahualCholqij.repaint();
    }
    
    private void cargarImagen(String path, JLabel label){
        try {
            URL url = this.getClass().getResource(path);  
            ImageIcon icon = new ImageIcon(url); 
            label.setIcon(icon);
        } catch (Exception e) {
            System.out.println("Error en la URL");
        }
    }
    
    private void calcularDia(int dias){
        for (int i = 0; i < dias; i++) {
            if((noCholqijPivote+21) > 260){
                noCholqijPivote = 21-(260-noCholqijPivote);
            }else{
                noCholqijPivote+=21;
            }
            if((noHaabPivote+1) > 365){
                noHaabPivote = 1;
            }else{
                noHaabPivote++;
            }
        }
    }
    
    private void calcularDiaAnterior(int dias){
       for (int i = 0; i < dias; i++) {
            if((noCholqijPivote < 22)){
                noCholqijPivote = 260-(21-noCholqijPivote);
            }else{
                noCholqijPivote-=21;
            }
            if((noHaabPivote < 2)){
                noHaabPivote = 365;
            }else{
                noHaabPivote--;
            }
        }
    }
    
    public void nuevoFrame(){
        RuedaCalendarica nuevo = new RuedaCalendarica(noCholqijPivote, noHaabPivote, fecha);
        this.dispose();
        Centrador.center(nuevo);
        nuevo.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        pnlNahualHaab1 = new javax.swing.JPanel();
        lblNahualHaab1 = new javax.swing.JLabel();
        pnlWinalHaab = new javax.swing.JPanel();
        lblWinalHaab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlEnergiaCholqij = new javax.swing.JPanel();
        lblEnergiaCholqij = new javax.swing.JLabel();
        pnlNahualCholqij = new javax.swing.JPanel();
        lblNahualCholqij = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fechaIngresada = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 330));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Haab", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlNahualHaab1.setBackground(new java.awt.Color(0, 0, 0));
        pnlNahualHaab1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nahual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlNahualHaab1.setForeground(new java.awt.Color(255, 255, 255));

        lblNahualHaab1.setText("<Sin Imagen>");

        javax.swing.GroupLayout pnlNahualHaab1Layout = new javax.swing.GroupLayout(pnlNahualHaab1);
        pnlNahualHaab1.setLayout(pnlNahualHaab1Layout);
        pnlNahualHaab1Layout.setHorizontalGroup(
            pnlNahualHaab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNahualHaab1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblNahualHaab1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlNahualHaab1Layout.setVerticalGroup(
            pnlNahualHaab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNahualHaab1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNahualHaab1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlWinalHaab.setBackground(new java.awt.Color(0, 0, 0));
        pnlWinalHaab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlWinalHaab.setForeground(new java.awt.Color(255, 255, 255));

        lblWinalHaab.setText("<Sin Imagen>");

        javax.swing.GroupLayout pnlWinalHaabLayout = new javax.swing.GroupLayout(pnlWinalHaab);
        pnlWinalHaab.setLayout(pnlWinalHaabLayout);
        pnlWinalHaabLayout.setHorizontalGroup(
            pnlWinalHaabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWinalHaabLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblWinalHaab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnlWinalHaabLayout.setVerticalGroup(
            pnlWinalHaabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWinalHaabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblWinalHaab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlNahualHaab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlWinalHaab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNahualHaab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWinalHaab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Cholqi'j", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlEnergiaCholqij.setBackground(new java.awt.Color(0, 0, 0));
        pnlEnergiaCholqij.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Energia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblEnergiaCholqij.setText("<Sin Imagen>");

        javax.swing.GroupLayout pnlEnergiaCholqijLayout = new javax.swing.GroupLayout(pnlEnergiaCholqij);
        pnlEnergiaCholqij.setLayout(pnlEnergiaCholqijLayout);
        pnlEnergiaCholqijLayout.setHorizontalGroup(
            pnlEnergiaCholqijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnergiaCholqijLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblEnergiaCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlEnergiaCholqijLayout.setVerticalGroup(
            pnlEnergiaCholqijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnergiaCholqijLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblEnergiaCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlNahualCholqij.setBackground(new java.awt.Color(0, 0, 0));
        pnlNahualCholqij.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nahual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlNahualCholqij.setForeground(new java.awt.Color(255, 255, 255));

        lblNahualCholqij.setText("<Sin Imagen>");

        javax.swing.GroupLayout pnlNahualCholqijLayout = new javax.swing.GroupLayout(pnlNahualCholqij);
        pnlNahualCholqij.setLayout(pnlNahualCholqijLayout);
        pnlNahualCholqijLayout.setHorizontalGroup(
            pnlNahualCholqijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNahualCholqijLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblNahualCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlNahualCholqijLayout.setVerticalGroup(
            pnlNahualCholqijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNahualCholqijLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNahualCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlEnergiaCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNahualCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNahualCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEnergiaCholqij, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Siguiente Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Dia Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Informacion Rueda Calendarica");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        fechaIngresada.setBackground(new java.awt.Color(204, 204, 204));
        fechaIngresada.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61)
                        .addComponent(fechaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addComponent(fechaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcularDia(1);
        colocarValores();
        LocalDate tmp = Utilidades.DateToLocalDate(fecha);
        tmp = tmp.plusDays(2);
        fecha = Utilidades.LocalDateToDate(tmp);
        nuevoFrame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calcularDiaAnterior(1);
        colocarValores();
        LocalDate tmp = Utilidades.DateToLocalDate(fecha);
        tmp = tmp.minusDays(0);
        fecha = Utilidades.LocalDateToDate(tmp);
        nuevoFrame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int dias=(int) ((fechaIngresada.getDate().getTime()-fechaPivote.getTime())/86400000);
        if(dias < 0 ){
            calcularDiaAnterior(dias*-1);
        }else{
            calcularDia(dias);
        }
        colocarValores();
        nuevoFrame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Mensaje mensaje = new Mensaje();
        InformacionDb accesoInf = new InformacionDb();
        mensaje.informacion(accesoInf.getInformacion("inf_rueda_calendarica").getDescripcionEscritorio());
    }//GEN-LAST:event_jButton4ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaIngresada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblEnergiaCholqij;
    private javax.swing.JLabel lblNahualCholqij;
    private javax.swing.JLabel lblNahualHaab;
    private javax.swing.JLabel lblNahualHaab1;
    private javax.swing.JLabel lblWinalHaab;
    private javax.swing.JPanel pnlEnergiaCholqij;
    private javax.swing.JPanel pnlNahualCholqij;
    private javax.swing.JPanel pnlNahualHaab;
    private javax.swing.JPanel pnlNahualHaab1;
    private javax.swing.JPanel pnlWinalHaab;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        
        private Image imagen;
        
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/images/Fondo Calendario Haab.png")).getImage();
            g.drawImage(imagen,0,0,this.getWidth(),this.getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

}