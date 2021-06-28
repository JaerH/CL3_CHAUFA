/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Herrada
 */
public class UserDAO implements CRUD{

    	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	Conexion conexion = new Conexion();
        User user = new User();
        int res;
        String msj;
        
    @Override
    public List listar() {
        List<User> usuarios = new ArrayList<>();
		String sql = "select * from user";
		
		try {
			con = conexion.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				usuarios.add(user);
			}
			
		} catch (Exception e) {
		
		}
		
		return usuarios;
    }

   @Override
    public User listarID(int id) {
        String sql = "select * from user where id=" + id;
        try {
            con = conexion.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
			}
        } catch (Exception e) {
        }
        return user;
    }

    @Override
    public String add(String nombre, String apellido) {
        String sql = "insert into user(firstName, lastName) values(?,?)";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            res = ps.executeUpdate();
            if(res == 1){
                msj = "Usuario Agregado";
            }else{
                msj = "Error";
            }
        } catch (Exception e) {
        }
        
        return msj;
    
    }

    @Override
    public String actualizar(int id, String nombre, String apellido) {
        String sql = "update user set firstName=?, lastName=? where id=" + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1 , nombre);
            ps.setString(2 , apellido);
            res = ps.executeUpdate();
            if(res == 1){
                msj = "Usuario Actualizado";
            }else{
                msj = "Error";
            }
        } catch (Exception e) {
        }
        
        return msj;
    }

    @Override
    public User eliminar(int id) {
       String sql = "delete from user where id=" + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return user;
    }

 

    
}
