/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.objetos;

import java.sql.Date;

/**
 * Clase destinada al almacenamiento de la información de un usuario
 * @author jose_
 */
public class Usuario {
    
    private String username, password, email, nombre, apellido, telefono;
    private Date nacimiento;
    private int rol;

    /**
     * Constructor
     */
    public Usuario() {
    }

    /**
     * Constructor
     * @param username Username del usuario
     * @param password Contraseña del usuario
     * @param email Correo del usuario
     * @param nombre Nombre del usuario
     * @param apellido Apellido del usuario
     * @param telefono Telefono del usuario
     * @param nacimiento Fecha de nacimiento del usuario
     * @param rol Rol del usuario 
     */
    public Usuario(String username, String password, String email, String nombre, String apellido, String telefono, Date nacimiento, int rol) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.rol = rol;
    }

    /**
     * @return username del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Procedimiento para cambiar el usuario
     * @param username nuevo username que deseamos que posea el usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Procedimiento para cambiar la contraseña del usuario
     * @param password nueva contraseña que deseamos que posea el usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Correo del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Procedimiento para cambiar el correo del usuario
     * @param email nuevo correo que deseamos que posea el usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento para cambiar el nombre del usuario
     * @param nombre nuevo nombre que deseamos que posea el usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Procedimiento para cambiar el apellido del usuario
     * @param apellido nuevo apellido que deseamos que posea el usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return Telefono del ususario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Procedimiento para cambiar el telefono del usuario
     * @param telefono nuevo telefono que deseamos que posea el usuario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return Nacimiento del usuario
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * Procedimiento para cambiar el nacimiento del usuario
     * @param nacimiento nueva fecha de nacimiento que deseamos que posea el usuario
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return Un entero que representa el rol del usuario
     */
    public int getRol() {
        return rol;
    }

    /**
     * Procedimiento para cambiar el rol del usuario
     * @param rol nuevo rol que deseamos que posea el usuario
     */
    public void setRol(int rol) {
        this.rol = rol;
    }
    
    /**
     * @return Una cadena de texto con la estructura de la instancia
     */
    @Override
    public String toString() {
        return "\n Usuario{" + "username=" + username + ", password=" + password + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", nacimiento=" + nacimiento + ", rol=" + rol + '}';
    }

    
}
