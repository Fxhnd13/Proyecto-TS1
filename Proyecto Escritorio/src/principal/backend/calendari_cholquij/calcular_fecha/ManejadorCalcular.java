/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.backend.calendari_cholquij.calcular_fecha;

import javax.swing.Icon;

/**
 * Clase destinada al backend del calendario cholqij
 * @author bryangmz
 */
public class ManejadorCalcular {
    
    private static ManejadorCalcular manejadorCalcular;
    
    private ManejadorCalcular(){}
    
    /**
     * Constructor que reserva el espacio en memoria de la instancia de calendario cholqij
     * @return
     */
    public static ManejadorCalcular getInstancia(){
        if (manejadorCalcular == null) {
            manejadorCalcular = new ManejadorCalcular();
        } return manejadorCalcular;
    }
    
    /**
     * Funcion que retorna el icono cargado para su posterior uso
     * @param caso Identificador de la imagen que desamos buscar
     * @return Icono que se desea cargar
     */
    public Icon getIcon(int caso){
        System.out.println("CASO " + caso);
        return (new javax.swing.ImageIcon(getClass().getResource("/com/imagenesNahualesMayas/Nahual" + caso + ".jpg"))); // NOI18N
    }
    
    /**
     * Funcion que retorna el icono cargado para su posterior uso
     * @param caso Identificador de la imagen que desamos buscar
     * @return Icono que se desea cargar
     */
    public Icon getIconLvl(int caso){
        System.out.println("CASO " + caso);
        return (new javax.swing.ImageIcon(getClass().getResource("/com/imagenesNumerosMayas/numero" + caso + ".jpg"))); // NOI18N
    }
    
}
