package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rodrigo Herrada
 */
public class Conexion {
    private String nombreBD = "crudservice";
    private String usuario = "root";
    private String password = "@Krypt*j@ER$H@r*";
    private String url = "jdbc:mysql://localhost:3306/" + nombreBD + "?useUnicode=true?use" 
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" 
            + "serverTimezone=UTC&autoReconnect=true&useSSL=false";
    Connection conn = null;
    
	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,usuario,password);
                        
                        if(conn != null){
                            System.out.println("Conexion exitosa a la BD: " + nombreBD);
                        }
			
		} catch (Exception e) {
			e.printStackTrace();
                        System.out.println("Error al conectar con la base de datos");
                             
		}
	}
	
	public Connection getConnection() {
		return conn;
	}

}
