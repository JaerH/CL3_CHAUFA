/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.User;
import modelo.UserDAO;

/**
 *
 * @author Rodrigo Herrada
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    
    UserDAO userDAO = new UserDAO();
    @WebMethod(operationName = "listar")
    public List<User> listar() {
        List datos = userDAO.listar();
        return datos;
    }

    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos) {
        String datos = userDAO.add(nombres, apellidos);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarID")
    public User listarID(@WebParam(name = "id") int id) {
        User user = userDAO.listarID(id);
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos) {
        String datos = userDAO.actualizar(id, nombres, apellidos);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public User Eliminar(@WebParam(name = "id") int id) {
        User u = userDAO.eliminar(id);
        return u;
    }

}
