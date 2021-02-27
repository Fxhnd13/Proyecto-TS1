/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.database;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase destinada a la conversion de distintos formatos de fecha
 * @author jose_
 */
public class Utilidades {
    
    /**
     * Conversión de SqlDate a LocalDate
     * @param fecha SqlDate que se desea convertir
     * @return fecha como una instancia de LocalDate
     */
    public static java.time.LocalDate SqlDateToJavaLocalDate(java.sql.Date fecha){
        return java.time.LocalDate.parse(fecha.toString());
    }
    
    /**
     * Conversión de LocalDate a SqlDate
     * @param fecha LocalDate que se desea convertir
     * @return fecha como una instancia de SqlDate
     */
    public static java.sql.Date JavaLocalDateToSqlDate(java.time.LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    
    /**
     * Conversión de Date a SqlDate
     * @param fecha Date que se desea convertir
     * @return fecha como una instancia de SqlDate
     */
    public static java.sql.Date JavaDateToSqlDate(java.util.Date fecha){
        return new java.sql.Date(fecha.getTime());
    }
    
    /**
     * Conversión de SqlDate a Date
     * @param fecha SqlDate que se desea convertir
     * @return fecha como una instancia de Date
     */
    public static java.util.Date SqlDateToJavaDate(java.sql.Date fecha){
        return new java.util.Date(fecha.getTime());
    }
    
    /**
     * Conversión de LocalDate a Date
     * @param fecha LocalDate que se desea convertir
     * @return fecha como una instancia de Date
     */
    public static java.util.Date LocalDateToDate(java.time.LocalDate fecha){
        return Date.from(fecha.atStartOfDay().toInstant(ZoneOffset.UTC));
    }
    
    /**
     * Conversión de Date a LocalDate
     * @param fecha Date que se desea convertir
     * @return fecha como una instancia de LocalDate
     */
    public static java.time.LocalDate DateToLocalDate(java.util.Date fecha){
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    /**
     * Conversión de una cadena con formato 'aaaa-MM-dd' a SqlDate
     * @param fecha String que se desea convertir
     * @return fecha como una instancia de SqlDate
     */
    public static Date StringToDate(String fecha){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        //String strFecha = “2007-12-25”;
        try {
            return formatoDelTexto.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
