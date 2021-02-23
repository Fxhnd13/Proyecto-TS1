/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

import java.sql.Date;

/**
 * Clase que almacena la información de un hecho historico
 * @author jose_
 */
public class HechoHistorico {
    
    private int id;
    private Date fechaInicio, fechaFinalizacion;
    private String titulo, descripcion;

    /**
     * Constructor
     */
    public HechoHistorico() {
    }

    /**
     * Constructor
     * @param id Identificador del hecho historico
     * @param fechaInicio Fecha en la que inicia el hecho historico
     * @param fechaFinalizacion Fecha en la que finaliza el hecho historico
     * @param titulo Titulo del hecho historico
     * @param descripcion Descripcion del hecho historico
     */
    public HechoHistorico(int id, Date fechaInicio, Date fechaFinalizacion, String titulo, String descripcion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
