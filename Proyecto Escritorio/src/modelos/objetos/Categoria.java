/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

/**
 * Clase que almacena la información de una categoria
 * @author jose_
 */
public class Categoria {
    
    private int id;
    private String nombre;

    /**
     * Constructor
     */
    public Categoria() {
    }

    /**
     * Constructor
     * @param id identificador de la categoria
     * @param nombre nombre de la categoria
     */
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * @return Identificador de la categoria
     */
    public int getId() {
        return id;
    }

    /**
     * Procedimiento para modificar el identificador de la categoria
     * @param id nuevo identificador que deseamos que posea la categoria
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Nombre de la categoria
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento para modificar el nombre de la categoria
     * @param nombre nuevo nombre que deseamos que posea la categoria
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
