
package api.login;

import java.io.Serializable;

/**
 * Clase destinada a almacenar la informacion de los credenciales de un usuario que desea tener una sesion activa
 * convirtiendose en archivo binario
 * @author jose_
 */
public class UsuarioLogueo implements Serializable{
    
    private String correo, contrasenia;

    public UsuarioLogueo(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
}
