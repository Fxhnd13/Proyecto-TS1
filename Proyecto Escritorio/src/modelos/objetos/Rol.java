/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

/**
 * Clase que almacena la informacion de un rol
 * @author jose_
 */
public class Rol {
    
    private int id;
    private String tipo;

    /**
     * Constructor
     * @param id Identificador de un rol
     * @param tipo Nombre del rol 
     */
    public Rol(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    /**
     * Constructor
     */
    public Rol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        @Override
    public String toString() {
        return "\nRol{" + "id=" + id + ", tipo=" + tipo + '}';
    }

    
}
