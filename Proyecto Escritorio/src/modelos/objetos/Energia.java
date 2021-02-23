/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

/**
 * Clase destinada a almacenar la información de una energia
 * @author jose_
 */
public class Energia {

    private int id;
    private String nombre;
    private Imagen imagen;

    /**
     * Constructor
     */
    public Energia() {
    }

    /**
     * Constructor
     * @param id Identificador de la instancia energia
     * @param nombre Nombre de la instancia energia
     * @param imagen Imagen de la instancia energia
     */
    public Energia(int id, String nombre, Imagen imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    /**
     * @return Identificador de la instancia energia
     */
    public int getId() {
        return id;
    }

    /**
     * Procedimiento para modificar el identificador de la instancia energia
     * @param id Nuevo identificador que deseamos que posea la instancia energía
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Nombre de la instancia energía
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento para modificar el nombre de la instancia energia
     * @param nombre Nuevo nombre que deseamos que posea la instancia energia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Imagen de la instancia energia
     */
    public Imagen getImagen() {
        return imagen;
    }

    /**
     * Procedimiento para modificar la imagen de la instancia energía
     * @param imagen Nueva imagen que deseamos que posea la instancia energía
     */
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
    
}
