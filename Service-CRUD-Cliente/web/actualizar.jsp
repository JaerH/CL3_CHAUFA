<%-- 
    Document   : actualizar
    Created on : 28/06/2021, 05:49:35 AM
    Author     : Rodrigo Herrada
--%>

<%@page import="webservice.User"%>
<%@page import="modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-6">
            <div class="card">
                <div class="card-header ">
                    <h5>Actualizar nuevo Usuario</h5>
                </div>
                <% 
                   int id = Integer.parseInt((String)request.getAttribute("iduser"));
                   UserService user = new UserService();
                   User u = user.listarID(id);
                %>
                <div class="card-body">
                    <form action="Controlador">
                        <label>ID</label>
                        <input type="text" name="txtid" readonly="" class="form-control" value="<%= u.getId()%>" >
                        <label>Nombres</label>
                        <input type="text" name="txtnom" class="form-control" value="<%= u.getFirstName()%>">
                        <label>Apellidos</label>
                        <input type="text" name="txtape" class="form-control" value="<%= u.getLastName()%>"><br>
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        <a href="Controlador?accion=index" class="btn btn-primary">Volver</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
