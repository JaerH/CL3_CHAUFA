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
                    <h5>Agregar nuevo Usuario</h5>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Nombres</label>
                        <input type="text" name="txtnom" class="form-control">
                        <label>Apellidos</label>
                        <input type="text" name="txtape" class="form-control">
                        <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
