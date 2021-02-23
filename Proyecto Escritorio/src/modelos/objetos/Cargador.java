/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase designada a almacenar la información de un cargador del calendario Haab
 * @author jose_
 */

public class Cargador {
 
    private String nombre, descripcion, imagen;

    /**
     * Constructor
     */
    public Cargador() {
    }

    /**
     * Constructor
     * @param nombre nombre del cargador
     * @param descripcion descripcion del cargador
     * @param imagen ruta de la imagen del cargador
     */
    public Cargador(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * @return Nombre del cargador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento para cambiar el nombre del cargador
     * @param nombre nuevo nombre que deseamos que el cargador posea
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Descripcion del cargador
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Procedimiento para cambiar la descripcion del cargador
     * @param descripcion nueva descripcion que deseamos que el cargador posea
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return Ruta de la imagen del cargador
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Procedimiento para cambiar la ruta de la imagen del cargador
     * @param imagen nueva ruta de la imagen que deseamos que posea el cargador
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    /**
     * Coloca la imagen del cargador (carga su ruta designada) dentro de un label otorgado de parametro.
     * @param label
     */
    public void colocarImagen(JLabel label){
        ImageIcon imIcon = new ImageIcon(this.imagen);
        Icon icono = new ImageIcon(imIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }
}
