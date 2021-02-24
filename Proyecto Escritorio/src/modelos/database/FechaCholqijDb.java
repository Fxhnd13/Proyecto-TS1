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
import modelos.objetos.FechaCholqij;

/**
 * Clase destinada al manejo de la conexion con la base de datos para CRUD de una fecha cholqij
 * @author jose_
 */
public class FechaCholqijDb {

    /**
     * Crea una nueva fecha de calendario cholqij
     * @param fecha Fecha a crear
     */
    public void crear(FechaCholqij fecha){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO calendariocholqij "
                    + "(nahual,energia,fecha,descripcion) VALUES (?,?,?,?);");
            statement.setInt(1,fecha.getNahual().getId());
            statement.setInt(2, fecha.getEnergia().getId());
            statement.setDate(3, fecha.getFecha());
            statement.setString(4, fecha.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Modifica una fecha de calendario cholqij existente en la base de datos
     * @param fecha Fecha a modificar
     */
    public void modificar(FechaCholqij fecha){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE calendariocholqij "
                    + "SET nahual=?, energia=?, fecha=?, descripcion=? WHERE id=?;");
            statement.setInt(1,fecha.getNahual().getId());
            statement.setInt(2, fecha.getEnergia().getId());
            statement.setDate(3, fecha.getFecha());
            statement.setString(4, fecha.getDescripcion());
            statement.setInt(5, fecha.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Elimina una fecha de calendario cholqij de la base de datos
     * @param fecha Fecha que deseamos eliminar
     */
    public void eliminar(FechaCholqij fecha){
        try{
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM calendariocholqij WHERE id=?;");
            statement.setInt(1, fecha.getId());
            statement.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    /**
     * Busca una fecha de calendario cholqij especifica en base a su identificador
     * @param id Identificador de la fecha que buscamos
     * @return Fecha cholqij hallada (null si no existe)
     */
    public FechaCholqij getFecha(int id) {
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM calendariocholqij WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()) return instanciarDeResultSet(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /**
     * Lista todas las fechas cholqij existentes en la base de datos
     * @return Listado de fechas cholqij
     */
    public List<FechaCholqij> getFechas(){
        List<FechaCholqij> fechas = new ArrayList();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM calendariocholqij;");
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) fechas.add(instanciarDeResultSet(resultado));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return fechas;
    }
    
    private FechaCholqij instanciarDeResultSet(ResultSet resultado) throws SQLException{
        NahualDb accesoNahual = new NahualDb();
        EnergiaDb accesoEnergia = new EnergiaDb();
        return new FechaCholqij(
                resultado.getInt("id"),
                accesoNahual.getNahual(resultado.getInt("nahual")),
                accesoEnergia.getEnergia(resultado.getInt("energia")),
                resultado.getDate("fecha"),
                resultado.getString("descripcion")
        );
    }
}
