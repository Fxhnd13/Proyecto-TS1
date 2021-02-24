/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.database;

import javax.swing.JOptionPane;

/**
 * Clase destianda a mostrar mensajes en pantalla según las necesidades
 * @author jose_
 */
public class Mensaje {
 
    /**
     * Muestra un mensaje en pantalla de tipo advertencia
     * @param mensaje Cadena de texto a mostrar
     */
    public void advertencia(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra un mensaje en pantalla de tipo informacion
     * @param mensaje Cadena de texto a mostrar
     */
    public void informacion(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Muestra un mensaje en pantalla de tipo error
     * @param mensaje CAdena de texto a mostrar
     */
    public void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
