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
import modelos.objetos.Winal;

/**
 * Clase destinada al manejo de la conexion con la base de datos para CRUD de un Winal
 * @author jose_
 */
public class WinalDb {

    /**
     * Crea un nuevo winal en la base de datos
     * @param winal Winal que deseamos crear
     */
    public void crear(Winal winal){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO winal "
                    + "(nombre,descripcion,idImagen) VALUES (?,?,?);");
            statement.setString(1, winal.getNombre());
            statement.setString(2, winal.getDescripcion());
            statement.setInt(3, winal.getImagen().getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Modifica la inforamcion de un winal existente en la base de datos
     * @param winal Winal que deseamos modificar
     */
    public void modificar(Winal winal){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE winal "
                    + "SET nombre=?, descripcion=?, idImagen=? WHERE id=?;");
            statement.setString(1, winal.getNombre());
            statement.setString(2, winal.getDescripcion());
            statement.setInt(3, winal.getImagen().getId());
            statement.setInt(4, winal.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Elimina la información de un winal existente en la base de datos
     * @param winal Winal que deseamos eliminar
     */
    public void eliminar(Winal winal){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM winal WHERE id=?;");
            statement.setInt(1, winal.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Busca un winal especifico en la base de datos según el identificador deseado
     * @param id Identificador para hacer la busqueda del winal
     * @return Winal hallado (null si no existe)
     */
    public Winal getWinal(int id) {
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM winal WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /**
     * Lista todos los winales existentes en la base de datos
     * @return Listado de winales
     */
    public List<Winal> getWinales(){
        List<Winal> winales = new ArrayList();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM winal;");
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) winales.add(instanciarDeResultSet(resultado));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return winales;
    }
    
    private Winal instanciarDeResultSet(ResultSet resultado) throws SQLException{
        ImagenDb accesoImagen = new ImagenDb();
        return new Winal(
                resultado.getInt("id"),
                resultado.getString("nombre"),
                resultado.getString("descripcion"),
                accesoImagen.getImagen(resultado.getInt("idImagen"))
        );
    }
    
}
