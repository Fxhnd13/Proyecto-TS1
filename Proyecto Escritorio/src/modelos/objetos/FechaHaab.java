/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

import java.sql.Date;

/**
 * Clase destinada a almacenar la información de una fecha del calendario haab
 * @author jose_
 */
public class FechaHaab {
    
    private int id;
    private Nahual nahual;
    private Winal winal;
    private String nombre, descripcion;
    private Date fecha;
    private Cargador cargador;

    /**
     * Constructor
     */
    public FechaHaab() {
    }

    /**
     * Constructor
     * @param id Identificador de la fecha del calendario haab
     * @param nahual Nahual de la fecha del calendario haab
     * @param winal Winal de la fecha del calendario haab
     * @param nombre Nombre de la fecha del calendario haab (si tiene)
     * @param descripcion Descripcion de la fecha del calendario haab (si tiene)
     * @param fecha Fecha a la que corresponde del calendario haab
     * @param cargador Cargador de la fecha actual del calendario haab
     */
    public FechaHaab(int id, Nahual nahual, Winal winal, String nombre, String descripcion, Date fecha, Cargador cargador) {
        this.id = id;
        this.nahual = nahual;
        this.winal = winal;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cargador = cargador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nahual getNahual() {
        return nahual;
    }

    public void setNahual(Nahual nahual) {
        this.nahual = nahual;
    }

    public Winal getWinal() {
        return winal;
    }

    public void setWinal(Winal winal) {
        this.winal = winal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }
    
}
