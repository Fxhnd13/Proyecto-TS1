/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import modelos.database.FechaHaabDb;
import modelos.database.InformacionDb;
import modelos.database.Utilidades;
import modelos.objetos.FechaHaab;
import principal.menu.Centrador;

/**
 * Frame destinado a las funcionalidades del calendario haab
 * @author jose_
 */
public class CalendarioHaab extends javax.swing.JFrame {

    private Date fecha;
    FechaHaabDb acceso = new FechaHaabDb();
    
    /**
     * Constructor, creates new form CalendarioHaab
     */
    public CalendarioHaab(Date fecha) {
        this.fecha = fecha;
        initComponents();
        date.setDate(fecha);
        escribirFecha();
        panel1.setBackground(new Color(255,255,255,100));
        panel2.setBackground(new Color(255,255,255,100));
        panel3.setBackground(new Color(255,255,255,100));
        panel4.setBackground(new Color(255,255,255,100));
        colocarFondo();
    }
    
    /**
     * Procedimiento para colocar la imgen de fondo en el frame
     */
    public void colocarFondo(){
        JLabel backgroundLbl = new JLabel();
        this.add(backgroundLbl);
        backgroundLbl.setSize(this.getSize());
        rsscalelabel.RSScaleLabel.setScaleLabel(backgroundLbl, "Imagenes/fondoCalendarioHaab2.jpg");
    }
    
    /**
     * Procedimiento para escribir el cargador, kinal y winal que nos encontramos el día de hoy
     */
    public void escribirFecha(){
        FechaHaab fechaActual = acceso.getFechaEspecifica(Utilidades.DateToLocalDate(fecha));
        ((TitledBorder)panel2.getBorder()).setTitle("Dia - "+fechaActual.getNahual().getNombre());
        ((TitledBorder)panel3.getBorder()).setTitle("Mes - "+fechaActual.getNahual().getNombre());
        fechaActual.getNahual().getImagen().colocarImagen(Nahual);
        fechaActual.getWinal().getImagen().colocarImagen(Winal);
        fechaActual.getCargador().colocarImagen(Cargador);
    }
    
    public void nuevoFrame(){
        CalendarioHaab nuevo = new CalendarioHaab(fecha);
        this.dispose();
        Centrador.center(nuevo);
        nuevo.setVisible(true);
    }
    
    /**
     * Procedimiento para cambiar el cargador, kinal y winal activos, por el día siguiente
     */
    public void fechaSiguiente(){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.plusDays(2);
        System.out.println("antes: "+fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: "+fecha.toString());
        date.setDate(fecha);
        nuevoFrame();
    }
    
    /**
     * Procedimiento para cambiar el cargador, kinal y winal activos, por el kinal anterior
     */
    public void fechaAnterior(){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.minusDays(0);
        System.out.println("antes: "+fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: "+fecha.toString());
        date.setDate(fecha);
        escribirFecha();
        nuevoFrame();
    }
    
    /**
     * Procedimiento para cambiar el cargador, kinal y winal activos, por el winal siguiente
     */
    public void mesSiguiente(){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if(temp.getDayOfYear() > 360){
            temp = LocalDate.of(temp.getYear()+1, Month.JANUARY, temp.getDayOfYear() - 360);
        }else if(temp.getDayOfYear() > 345){
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        }else{
            temp = temp.plusDays(21);
        }
        System.out.println("antes: "+fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: "+fecha.toString());
        date.setDate(fecha);
        escribirFecha();
        nuevoFrame();
    }
    
    /**
     * Procedimiento para cambiar el cargador, kinal y winal activos, por el winal anterior
     */
    public void mesAnterior(){
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if(temp.getDayOfYear()<=5){
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 26+temp.getDayOfYear());
        }else if(temp.getDayOfYear() <= 20){
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        }else{
            temp = temp.minusDays(19);
        }
        System.out.println("antes: "+fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: "+fecha.toString());
        date.setDate(fecha);
        escribirFecha();
        nuevoFrame();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        Nahual = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        Cargador = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        date = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        Winal = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel2.setBackground(new java.awt.Color(187, 187, 187));
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        Nahual.setText(" ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nahual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nahual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(187, 187, 187));
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        Cargador.setText(".");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cargador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cargador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(187, 187, 187));
        panel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(74, 74, 74))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        panel3.setBackground(new java.awt.Color(187, 187, 187));
        panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        Winal.setText(" ");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Winal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Winal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Informacion Kinal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Informacion Winal");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Informacion Calendario");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Anterior");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Siguiente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(11, 11, 11)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton5)
                            .addComponent(jButton2)))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton6)))
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Procedimiento que llama al metodo fecha siguiente
     * @param evt parametro que activa el procedimiento
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fechaSiguiente();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Procedimiento que llama al metodo fecha anterior
     * @param evt parametro que activa el procedimiento
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechaAnterior();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Procedimiento que llama al metodo mes siguiente
     * @param evt parametro que activa el procedimiento
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mesSiguiente();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Procedimiento que llama al metodo fecha anterior
     * @param evt parametro que activa el procedimiento
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mesAnterior();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * Procedimiento para colocar el cargador, kinal y winal de la fecha especificada por el usuario
     * @param evt parametro que activa el procedimiento
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fecha = date.getDate();
        escribirFecha();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Procedimiento para mostrar un mensaje informativo sobre el knal del calendario haab
     * @param evt parametro que activa el procedimiento
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        InformacionDb accesoInf = new InformacionDb();
        JOptionPane.showMessageDialog(this, accesoInf.getInformacion("inf_kin_haab_escritorio").getDescripcionEscritorio(), "Kinal", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Procedimiento para mostrar un mensaje informativo sobre el calendario haab
     * @param evt parametro que activa el procedimiento
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        InformacionDb accesoInf = new InformacionDb();
        JOptionPane.showMessageDialog(this, accesoInf.getInformacion("inf_haab_escritorio").getDescripcionEscritorio(), "Informacion Calendario", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * Procedimiento para mostrar un mensaje informativo sobre el winal del calendario haab
     * @param evt parametro que activa el procedimiento
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        InformacionDb accesoInf = new InformacionDb();
        JOptionPane.showMessageDialog(this, accesoInf.getInformacion("inf_uinal_haab_escritorio").getDescripcionEscritorio(), "Winal", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton7ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargador;
    private javax.swing.JLabel Nahual;
    private javax.swing.JLabel Winal;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
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