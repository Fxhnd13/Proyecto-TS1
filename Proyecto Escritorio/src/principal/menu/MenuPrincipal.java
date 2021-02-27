/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.menu;

import api.login.ArchivoLogin;
import frontend.gui.CalendarioHaab;
import frontend.gui.RuedaCalendarica;
import gui.infonahuales.VentanaInfoNahuales;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelos.objetos.Usuario;
import principal.backend.perfil_usuario.Informacion;
import principal.frontend.gui.calendari_cholquij.FrameCalendario;
import principal.frontend.gui.perfil_usuario.FramePerfil;
import principal.ui.LineaDeTiempo;

/**
 * Clase designada al frame del menu principal, contiene dentro las opciones de las que se puede hacer uso dentro de la aplicación de escritorio
 * @author luisGonzalez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Informacion info = new Informacion();
    public final static ImageIcon BG = new ImageIcon("Imagenes/BackGroundMainMenu.jpg");
    private Usuario user;
    private ArchivoLogin archivoLogin = new ArchivoLogin();
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Usuario user) {
        this.user = user;
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        infoUsuarioPane.setBackground(new Color(255,255,255,100));
        setLocationRelativeTo(null);       
        setBackground();
        informacionUsuario(this.user);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlMenu = new javax.swing.JPanel();
        btnCholqij = new javax.swing.JButton();
        btnCholqij1 = new javax.swing.JButton();
        btnCholqij2 = new javax.swing.JButton();
        btnNahuales = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnLinea = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        infoUsuarioPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        apellidoLbl = new javax.swing.JLabel();
        correoLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        telefonoLbl = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        pnlMenu.setBackground(new java.awt.Color(51, 153, 255));

        btnCholqij.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCholqij.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij.setText("Calendario Cholqij");
        btnCholqij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqijActionPerformed(evt);
            }
        });

        btnCholqij1.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCholqij1.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij1.setText("Calendario Haab");
        btnCholqij1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij1ActionPerformed(evt);
            }
        });

        btnCholqij2.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCholqij2.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij2.setText("Rueda Calendarica");
        btnCholqij2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij2ActionPerformed(evt);
            }
        });

        btnNahuales.setBackground(new java.awt.Color(204, 204, 204));
        btnNahuales.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNahuales.setForeground(new java.awt.Color(0, 0, 0));
        btnNahuales.setText("Nahuales");
        btnNahuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahualesActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(204, 204, 204));
        btnPerfil.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setText("Editar datos");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnLinea.setBackground(new java.awt.Color(204, 204, 204));
        btnLinea.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnLinea.setForeground(new java.awt.Color(0, 0, 0));
        btnLinea.setText("Linea de Tiempo");
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCholqij)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCholqij1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCholqij2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNahuales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(btnPerfil)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCholqij)
                    .addComponent(btnCholqij1)
                    .addComponent(btnCholqij2)
                    .addComponent(btnNahuales)
                    .addComponent(btnPerfil)
                    .addComponent(btnLinea))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrarSesion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("Apellidos:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setText("Telefono:");

        nombreLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N

        apellidoLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N

        correoLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N

        fechaLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N

        telefonoLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N

        javax.swing.GroupLayout infoUsuarioPaneLayout = new javax.swing.GroupLayout(infoUsuarioPane);
        infoUsuarioPane.setLayout(infoUsuarioPaneLayout);
        infoUsuarioPaneLayout.setHorizontalGroup(
            infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(fechaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                        .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(telefonoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(apellidoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(correoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
        );
        infoUsuarioPaneLayout.setVerticalGroup(
            infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUsuarioPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(infoUsuarioPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefonoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addComponent(infoUsuarioPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoUsuarioPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crea una instancia del frame 'Calendario Cholqij'
     * @param evt evento que lanza el procedimiento
     */
    private void btnCholqijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqijActionPerformed
        FrameCalendario calendarioCholquij = new FrameCalendario();
        Centrador.center(calendarioCholquij);
        calendarioCholquij.setVisible(true);
    }//GEN-LAST:event_btnCholqijActionPerformed

    /**
     * Crea una instancia del frame 'FramePerfil' para modificar la información del usuario
     * @param evt evento que lanza el procedimiento
     */
    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //cambiar el parametro nombre por el indicado
        Usuario user2 = info.buscarDatos(user.getUsername());
        if(user2 != null){
            FramePerfil perfil = new FramePerfil(this, true, user);
            perfil.setLocation(900, 120);
            //Centrador.center(perfil);
            perfil.setVisible(true);
        } 
    }//GEN-LAST:event_btnPerfilActionPerformed
    
    /**
     * Carga en pantalla la información del usuario logeado
     * @param user usuario sobre el cual debemos mostrar la información en el frame principal
     */
    public void informacionUsuario(Usuario user){
        correoLbl.setText(user.getEmail());
        nombreLbl.setText(user.getNombre());
        apellidoLbl.setText(user.getApellido());
        if(user.getNacimiento() != null) fechaLbl.setText(user.getNacimiento().toString());
        telefonoLbl.setText(user.getTelefono());
    }
    
    /**
     * Procedimiento que carga la imagen predeterminada en la instancia del menú principal
     */
    private void setBackground() {
        JLabel backgroundLbl = new JLabel();
        this.add(backgroundLbl);
        backgroundLbl.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        rsscalelabel.RSScaleLabel.setScaleLabel(backgroundLbl, "Imagenes/BackGroundMainMenu.jpg");
    }
    
    /**
     * Procedimiento que crea una instancia de 'Calendario Haab'
     * @param evt evento que lanza al procedimiento
     */
    private void btnCholqij1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij1ActionPerformed
        CalendarioHaab calendario = new CalendarioHaab();
        Centrador.center(calendario);
        calendario.setVisible(true);
    }//GEN-LAST:event_btnCholqij1ActionPerformed

    /**
     * Sin implementación
     */
    private void btnCholqij2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij2ActionPerformed
        RuedaCalendarica rueda = new RuedaCalendarica();
        rueda.setVisible(true);
    }//GEN-LAST:event_btnCholqij2ActionPerformed

    /**
     * Procedimiento que crea una instancia de 'VentanaInfoNahuales'
     * @param evt evento que lanza al procedimiento
     */
    private void btnNahualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahualesActionPerformed
        VentanaInfoNahuales ventanaInfoNahuales = new VentanaInfoNahuales();
        Centrador.center(ventanaInfoNahuales);
        ventanaInfoNahuales.setVisible(true);
    }//GEN-LAST:event_btnNahualesActionPerformed

    /**
     * Procedimiento que crea una instancia de 'LineaDeTiempo'
     * @param evt evento que lanza al procedimiento
     */
    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        LineaDeTiempo linea = new LineaDeTiempo(user);
        Centrador.center(linea);
        linea.setVisible(true);
    }//GEN-LAST:event_btnLineaActionPerformed

    /**
     * Procedimiento que genera el archivo con las credenciales del usuario si se desea tener sesión activa
     * @param evt evento que lanza al procedimiento
     */
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        archivoLogin.escribirArchivo(null);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLbl;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCholqij;
    private javax.swing.JButton btnCholqij1;
    private javax.swing.JButton btnCholqij2;
    private javax.swing.JButton btnLinea;
    private javax.swing.JButton btnNahuales;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel correoLbl;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JPanel infoUsuarioPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JLabel telefonoLbl;
    // End of variables declaration//GEN-END:variables
}