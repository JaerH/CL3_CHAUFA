
package modelo;

import webservice.User;

/**
 *
 * @author Rodrigo Herrada
 */
public class UserService {
    
    public UserService(){
        
    }

    public  java.util.List<webservice.User> listar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String agregar(java.lang.String nombres, java.lang.String apellidos) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregar(nombres, apellidos);
    }

    public User listarID(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarID(id);
    }

    public String actualizar(int id, java.lang.String nombres, java.lang.String apellidos) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizar(id, nombres, apellidos);
    }

    public User eliminar(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminar(id);
    }
    
    
}
