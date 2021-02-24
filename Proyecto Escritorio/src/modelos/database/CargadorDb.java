/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.objetos.Cargador;

/**
 * Clase destinada al manejo de la conexion con la base de datos para CRUD de cargador
 * @author jose_
 */

public class CargadorDb {
    
    /**
     * Crea un cargador en la base de datos
     * @param cargador cargador a crear
     */
    public void crear(Cargador cargador){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO cargador "
                    + "(nombre,descripcion,rutaImagen) VALUES (?,?,?);");
            statement.setString(1, cargador.getNombre());
            statement.setString(2, cargador.getDescripcion());
            statement.setString(3, cargador.getImagen());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Modifica un cargador en la base de datos
     * @param cargador cargador a modificar
     */
    public void modificar(Cargador cargador){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE cargador SET "
                    + "descripcion=?, rutaImagen=? WHERE nombre=?;");
            statement.setString(1, cargador.getDescripcion());
            statement.setString(2, cargador.getImagen());
            statement.setString(3, cargador.getNombre());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Elimina un cargador de la base de datos
     * @param cargador cargador a eliminar
     */
    public void eliminar(Cargador cargador){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM cargador WHERE nombre=?");
            statement.setString(1, cargador.getNombre());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Lista todos los cargadores existentes
     * @return Cargadores
     */
    public List<Cargador> getCargadores(){
        List<Cargador> cargadores = new ArrayList();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM cargador;");
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) cargadores.add(instanciarDeResultSet(resultado));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cargadores;
    }
    
    /**
     * Carga un cargador con el nombre especificado
     * @param nombre Nombre para buscar el cargador
     * @return Cargador hallado
     */
    public Cargador getCargador(String nombre){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM cargador WHERE nombre=?;");
            statement.setString(1, nombre);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /**
     * Carga un cargador con el identificador especificado
     * @param id Identificador para buscar al cargador
     * @return Cargador hallado
     */
    public Cargador getCargador(int id){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM cargador WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private Cargador instanciarDeResultSet(ResultSet resultado) throws SQLException{
        return new Cargador(
                resultado.getString("nombre"),
                resultado.getString("descripcion"),
                resultado.getString("rutaImagen")
        );
    }
}
