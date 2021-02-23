package modelos.objetos;

/**
 * Clase que almacena la información de una entidad relacional -categorizar-
 * @author esmeralda
 */
public class Categorizar {
    int idHecho;
    int idCategoria1;

    /**
     * Constructor
     * @param idHecho identificador del hecho historico
     * @param idCategoria1 identificador de la categoria
     */
    public Categorizar(int idHecho, int idCategoria1) {
        this.idHecho = idHecho;
        this.idCategoria1 = idCategoria1;
    }
    
    /**
     * @return Identificador de la categoria de la instancia
     */
    public int getIdCategoria1() {
        return idCategoria1;
    }

    /**
     * Procedimiento para modificar el identificador de la categoria de la instancia
     * @param idCategoria1 nuevo identificador de categoria que deseamos que posea la instancia
     */
    public void setIdCategoria1(int idCategoria1) {
        this.idCategoria1 = idCategoria1;
    }

    /**
     * @return Identificador del hecho historico al que relaciona la instancia
     */
    public int getIdHecho() {
        return idHecho;
    }

    /**
     * Procedimiento para modificar el identificador del hecho historico al que relaciona la instancia
     * @param idHecho nuevo identificador del hecho historico que deseamos que posea la instancia
     */
    public void setIdHecho(int idHecho) {
        this.idHecho = idHecho;
    }

    /**
     * @return Una cadena para escribir la estructura de la instancia
     */
    @Override
    public String toString() {
        return "\n Categorizar{" + "idCategoria1=" + idCategoria1 + ", idHecho=" + idHecho + '}';
    }


    
}
