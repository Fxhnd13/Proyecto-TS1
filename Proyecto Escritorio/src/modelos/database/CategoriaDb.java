/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelos.objetos.Categoria;

/**
 * Clase destinada al manejo de la conexion con la base de datos para CRUD de Categoria
 * @author jose_
 */
public class CategoriaDb {
    
    private Mensaje mensajes = new Mensaje();
    
    /**
     * Crea una categoria
     * @param categoriaACrear Categoria que se desea guardar en la base de datos
     */
    public void crearCategoria(Categoria categoriaACrear) {//creamos una nueva categoria
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO categoria "
                    + "(id, nombre) VALUES (?,?);");
            statement.setInt(1, categoriaACrear.getId());
            statement.setString(2, categoriaACrear.getNombre());
            statement.executeUpdate();
            mensajes.informacion("Se ha creado la categoria con éxito.");
        } catch (SQLException ex) {
            mensajes.error("Ingrese otra categoria, asegurese que el identificador '" + categoriaACrear.getId() + "' no se repita");
        }
    }

    /**
     * Modifica los datos de una categoria
     * @param categoriaActualizar Categoria que deseamos modificar
     */
    public void actualizarCategoria(Categoria categoriaActualizar) {//actualizamos categoria
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE categoria SET "
                    + "nombre=? WHERE id=? ;");
            statement.setString(1, categoriaActualizar.getNombre());
            statement.setInt(2, categoriaActualizar.getId());
            statement.executeUpdate();
            mensajes.informacion("Se ha creado la categoria con éxito.");
        } catch (SQLException ex) {
            mensajes.error("No se actualizo la categoria. Asegurese que exista la categoria");
        }

    }

    /**
     * Elimina una categoria
     * @param categoriaEliminar Categoria que deseamos eliminar
     */
    public void eliminarCategoria(Categoria categoriaEliminar) {//eliminamos categoria
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM categoria WHERE id=?;");
            statement.setInt(1, categoriaEliminar.getId());
            statement.executeUpdate();
            mensajes.informacion("Se ha eliminado la categoria con exito.");
        } catch (SQLException ex) {
            mensajes.error("No se elimino la categoria. Asegurese que  exista la categoria");
        }
    }

    /**
     * Carga todas las categorias existentes de la base de datos
     * @return Un lisatdo de todas las categorias halladas
     */
    public LinkedList<Categoria> leerCategorias() { //mostramos todas las categorias  y devolvemos en una lista
        LinkedList<Categoria> listaCategorias = new LinkedList<>();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM categoria;");
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                Categoria categoria = convertirACategoria(resultado);
                listaCategorias.add(categoria);
            }
        } catch (SQLException ex) {
            mensajes.error("No se han leido las categorias de la base de datos.");
        }
        return listaCategorias;
    }

    /**
     * Carga una categoria por el identificador de la misma
     * @param rolABuscar Identificador de la categoria a buscar
     * @return Categoria hallada
     */
    public Categoria leerCategoria(Categoria rolABuscar) {//leemos una categoria en especifico y lo devolvemos
        Categoria rolUsuario = null;

        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM categoria WHERE id= ? ;");
            statement.setInt(1, rolABuscar.getId());
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                rolUsuario = convertirACategoria(resultado);
            }
        } catch (SQLException ex) {
            mensajes.error("No se encontro la categoria");
        }
        return rolUsuario;
    }
    
    private Categoria convertirACategoria(ResultSet resultado) {
        Categoria rolDevolver = null;
        try {
            rolDevolver = new Categoria(resultado.getInt(1), resultado.getString("nombre"));
        } catch (SQLException ex) {
            mensajes.error("error en conversion de categoria");
        }
        return rolDevolver;
    }

    
}
