
package gui.infonahuales;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import modelos.database.ConexionDb;
import modelos.database.NahualDb;
import modelos.objetos.Nahual;
import principal.backend.calendari_cholquij.calcular_fecha.CalcularFecha;

public class VentanaInfoNahuales extends javax.swing.JFrame {
    
    //ManejadorNahualGUI manejadorNahualGUI = new ManejadorNahualGUI();
    private NahualDb nahualDb = new NahualDb();
    private ArrayList<Nahual> listaNahuales = null;
    private ConexionDb conexionDb = new ConexionDb();
    private int indice = 0;
    private JTextPane textPaneSig = new JTextPane();
    private JTextPane textPaneDes = new JTextPane();
    private JLabel labelDescripcion = new JLabel("Descripcion");
    
    private FondoPanel fondoPanel = new FondoPanel();
    
    public VentanaInfoNahuales() {
        this.setContentPane(fondoPanel);
        initComponents();
        this.setLocationRelativeTo(null);
        panelInfo.setBackground(new Color(255,255,255,50));
        SignificadoPanel.setBackground(new Color(255,255,255,50));
        DescripcionPanel.setBackground(new Color(255,255,255,50));
        //scrollPane.setBackground(new Color(255, 255, 255, 100));
        //panelInfo.setBackground(new Color(255, 255, 255, 100));
        textPaneSig.setEditable(false);
        textPaneDes.setEditable(false);
//        labelDescripcion.setFont(labelSignificado.getFont());
//        labelDescripcion.setBackground(labelSignificado.getBackground());
//        labelDescripcion.setForeground(labelSignificado.getForeground());
        
//        textPaneSig.setBackground(new Color(255, 255, 255, 100));
        //textPaneSig.setOpaque(false);
        
        ImageIcon imIconAnterior = new ImageIcon("./src/gui/imagenes/anterior.png");
        Icon iconoAnterior = new ImageIcon(imIconAnterior.getImage().getScaledInstance(botonAnterior.getWidth(), botonAnterior.getHeight(), Image.SCALE_DEFAULT));
        botonAnterior.setIcon(iconoAnterior);
        ImageIcon imIconSiguiente = new ImageIcon("./src/gui/imagenes/siguiente.png");
        Icon iconoSiguiente = new ImageIcon(imIconSiguiente.getImage().getScaledInstance(botonSiguiente.getWidth(), botonSiguiente.getHeight(), Image.SCALE_DEFAULT));
        botonSiguiente.setIcon(iconoSiguiente);
        
        //Levantamos el listado de nahuales en la db y lo agragamos y lista ya estaria fucionando al 100
        listaNahuales = (ArrayList<Nahual>) nahualDb.getNahuales();
        pintar();
    }
    public void setPosiciones(){
        
//        textPaneSig.setBounds(labelSignificado.getX(), labelSignificado.getHeight()+labelSignificado.getY()+2, panelInfo.getWidth()-100, calcularFilas(textPaneSig.getText())*25);
//        labelDescripcion.setBounds(labelSignificado.getX(), labelSignificado.getHeight()+textPaneSig.getHeight()+20, labelSignificado.getWidth()+10, labelSignificado.getHeight());
//        textPaneDes.setBounds(labelDescripcion.getX(), labelSignificado.getHeight()+textPaneSig.getHeight()+labelDescripcion.getHeight()+25, panelInfo.getWidth()-100, calcularFilas(textPaneDes.getText())*25);
        
//        int lineas = textPaneSig.set
        //String texto = textPaneDes.getText();
        //System.out.println("Tamanio: "+texto.length());
        //System.out.println("TamanioM: "+texto.substring(0, 143));
        
        //scrollPane.repaint();
        panelInfo.repaint();
        panelInfo.updateUI();
        //scrollPane.repaint();
        
        //System.out.println(texto);
    }
    
    private boolean verificarNahuales(){
        if(listaNahuales!=null && listaNahuales.size()>2){
            return true;
        }
        return false;
    }
    
    public int calcularFilas(String texto){
        int total = (int) texto.length()/143;
        if(total>0){
            total += 1;
            return total;
        }
        
        return 1;
    }
    
    private Icon getIconNahual(Nahual nahual, JLabel label){
        ImageIcon imIcon = new ImageIcon(nahual.getImagen().getDirEscritorio());
        Icon icono = new ImageIcon(imIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        return icono;
    }
    
    public void pintarNahuales(){
        if(indice == 0){
            labalIzquierda.setIcon(getIconNahual(listaNahuales.get(listaNahuales.size()-1), labalIzquierda));
            labelPrincipal.setIcon(getIconNahual(listaNahuales.get(indice), labelPrincipal));
            labelDerecha.setIcon(getIconNahual(listaNahuales.get(indice+1), labelDerecha));
        }else if(indice == listaNahuales.size()-1){
            labalIzquierda.setIcon(getIconNahual(listaNahuales.get(indice-1), labalIzquierda));
            labelPrincipal.setIcon(getIconNahual(listaNahuales.get(indice), labelPrincipal));
            labelDerecha.setIcon(getIconNahual(listaNahuales.get(0), labelDerecha));
        }else{
            labalIzquierda.setIcon(getIconNahual(listaNahuales.get(indice-1), labalIzquierda));
            labelPrincipal.setIcon(getIconNahual(listaNahuales.get(indice), labelPrincipal));
            labelDerecha.setIcon(getIconNahual(listaNahuales.get(indice+1), labelDerecha));
        }
        significadoTexto.setText(listaNahuales.get(indice).getSignificado());
        descripcionTexto.setText(listaNahuales.get(indice).getDescripcion());
        labelNombre.setText(listaNahuales.get(indice).getId()+". "+listaNahuales.get(indice).getNombre());
    }
    private void pintar(){
        if(verificarNahuales()){
            pintarNahuales();
            
        }
    }
    
    private void anterior(){
        if(indice==0)
            indice = listaNahuales.size()-1;
        else
            indice--;
    }
    private void siguiente(){
        if(indice==(listaNahuales.size()-1))
            indice = 0;
        else
            indice++;
    }
    
    
    public int nahual(int cont){
        //System.out.println("Contador " + cont);
        int contador = cont;
        int contadorNahual = 6;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 20) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                } contador++;
            } return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 20;
            } else {
                contadorNahual--;
            } contador--;
        } return contadorNahual;
        
    }
    
    
    private void calcularFecha(){
        int numNahual = nahual(timeCholqij(date.getCalendar().getTime().getTime()));
        indice = numNahual;
        pintarNahuales();
        setPosiciones();
    }
    
    public int timeCholqij(long date){
        try {
            String string = "Nov 15, 2020 00:00:00 AM";
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.ROOT);
            Date datePivote = sdf.parse(string);
//            System.out.println("DATE PIVOTE " + datePivote);
            long regresar = TimeUnit.DAYS.convert(datePivote.getTime() - date, TimeUnit.MILLISECONDS);
            return (int) regresar;
        } catch (ParseException ex) {
            Logger.getLogger(CalcularFecha.class.getName()).log(Level.SEVERE, null, ex);
        } return 1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNav = new javax.swing.JPanel();
        labelDerecha = new javax.swing.JLabel();
        labalIzquierda = new javax.swing.JLabel();
        labelPrincipal = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        btnCalcular = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        SignificadoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        significadoTexto = new javax.swing.JEditorPane();
        DescripcionPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionTexto = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(550, 700));

        PanelNav.setOpaque(false);

        labelDerecha.setForeground(new java.awt.Color(204, 204, 204));
        labelDerecha.setOpaque(true);

        labalIzquierda.setOpaque(true);

        labelNombre.setBackground(new java.awt.Color(0, 0, 0));
        labelNombre.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelNombre.setOpaque(true);

        botonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseClicked(evt);
            }
        });

        botonAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAnteriorMouseClicked(evt);
            }
        });

        date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular Nahual de la Fecha");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        SignificadoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Significado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        SignificadoPanel.setOpaque(false);

        significadoTexto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(significadoTexto);

        javax.swing.GroupLayout SignificadoPanelLayout = new javax.swing.GroupLayout(SignificadoPanel);
        SignificadoPanel.setLayout(SignificadoPanelLayout);
        SignificadoPanelLayout.setHorizontalGroup(
            SignificadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignificadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        SignificadoPanelLayout.setVerticalGroup(
            SignificadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignificadoPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        DescripcionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        DescripcionPanel.setOpaque(false);

        descripcionTexto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(descripcionTexto);

        javax.swing.GroupLayout DescripcionPanelLayout = new javax.swing.GroupLayout(DescripcionPanel);
        DescripcionPanel.setLayout(DescripcionPanelLayout);
        DescripcionPanelLayout.setHorizontalGroup(
            DescripcionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescripcionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        DescripcionPanelLayout.setVerticalGroup(
            DescripcionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescripcionPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignificadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescripcionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignificadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescripcionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelNavLayout = new javax.swing.GroupLayout(PanelNav);
        PanelNav.setLayout(PanelNavLayout);
        PanelNavLayout.setHorizontalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labalIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular))
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        PanelNavLayout.setVerticalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavLayout.createSequentialGroup()
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(labalIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(PanelNav, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(date.getDate()!=null){
            calcularFecha();
        }else{
            JOptionPane.showMessageDialog(null, "Debe de seleccionar o ingresar una fecha");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void botonAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnteriorMouseClicked
        if(verificarNahuales()){
            anterior();
            pintarNahuales();
            date.setDate(null);
        }
    }//GEN-LAST:event_botonAnteriorMouseClicked

    private void botonSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseClicked
        if(verificarNahuales()){
            siguiente();
            pintarNahuales();
            date.setDate(null);
        }
    }//GEN-LAST:event_botonSiguienteMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DescripcionPanel;
    private javax.swing.JPanel PanelNav;
    private javax.swing.JPanel SignificadoPanel;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton btnCalcular;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JEditorPane descripcionTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labalIzquierda;
    private javax.swing.JLabel labelDerecha;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JEditorPane significadoTexto;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("../imagenes/fondoNahuales.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
}
