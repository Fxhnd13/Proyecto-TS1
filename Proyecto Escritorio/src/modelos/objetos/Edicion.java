/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

import java.sql.Date;

/**
 * Clase que almacena la información de una edición a un hecho historico
 * @author jose_
 */
public class Edicion {
    
    private int id;
    private String usuario;
    private int idHechoHIstorico;
    private Date fecha;
    private boolean creacion;

    /**
     * Constructor
     */
    public Edicion() {
    }

    /**
     * Constructor
     * @param id identificador de la edición
     * @param usuario usuario que realizó la edición
     * @param idHechoHistorico identificador del hecho historico editado
     * @param fecha fecha en que se realizó la edición
     * @param creacion si el hecho historico fue aprobado o no
     */
    public Edicion(int id, String usuario, int idHechoHistorico, Date fecha, boolean creacion) {
        this.id = id;
        this.usuario = usuario;
        this.idHechoHIstorico = idHechoHistorico;
        this.fecha = fecha;
        this.creacion = creacion;
    }

    /**
     * @return Identificador de la instancia
     */
    public int getId() {
        return id;
    }

    /**
     * Procedimiento para modificar el valor del identificador de la instancia
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Username del usuario relacionado a la instancia
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Procedimiento para modificar el valor del username del usuario relacionado a la instancia
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return Identificador del hecho historico relacionado a la instancia
     */
    public int getIdHechoHIstorico() {
        return idHechoHIstorico;
    }

    /**
     * Procedimiento para modificar el valor del hecho historico relacionado a la instancia
     * @param idHechoHIstorico Nuevo identificador que deseamos que posea la instancia
     */
    public void setIdHechoHIstorico(int idHechoHIstorico) {
        this.idHechoHIstorico = idHechoHIstorico;
    }

    /**
     * @return Fecha de creación de la instancia
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Procedimiento para modificar la fecha de creación de la instancia
     * @param fecha Nueva fecha de creación de la instancia
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return Si la instancia fue aprobada
     */
    public boolean isCreacion() {
        return creacion;
    }

    /**
     * Procedimiento para modificar si la instancia fue aprobada
     * @param creacion Nuevo valor para la aprobación de la instancia
     */
    public void setCreacion(boolean creacion) {
        this.creacion = creacion;
    }

    /**
     * @return Una cadena de texto con la estructura de la instancia
     */
    @Override
    public String toString() {
        return "\n Edicion{" + "id=" + id + ", usuario=" + usuario + ", idHechoHIstorico=" + idHechoHIstorico + ", fecha=" + fecha + ", creacion=" + creacion + '}';
    }

}
