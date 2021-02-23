
package api.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase destinada a el manejo del guardado de sesion activa y configuración del archivo con las credenciales
 * @author jose_
 */
public class ArchivoLogin {
    
    private static File fileSesion = new File("./src/api/login/logueo.bin");
    
    /**
     * Funcion para verificar la existencia del archivo de credenciales
     * @return si existe
     */
    public boolean verificarExitenciaArchivo(){
        if(!fileSesion.exists()){
            escribirArchivo(null);
            return false;
        }
        return true;
    }
    
    /**
     * Procedimiento para escribir las credenciales en un archivo binario
     * @param usuarioLogueo credenciales del usuario
     */
    public void escribirArchivo(UsuarioLogueo usuarioLogueo){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileSesion));
            
            oos.writeObject(usuarioLogueo);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Funcion para retornar las credenciales de un usuario si existe un archivo binario con las credenciales
     * @return Usuario con las credenciales encontradas
     */
    public UsuarioLogueo leerLogueo(){
        UsuarioLogueo usuarioLogueo = null;
        ObjectInputStream entrada = null;
        try {
            
            entrada = new ObjectInputStream(new FileInputStream(fileSesion));
            usuarioLogueo = (UsuarioLogueo) entrada.readObject();
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(ArchivoLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarioLogueo;
    }
    
    
}
