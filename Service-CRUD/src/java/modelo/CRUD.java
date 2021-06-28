/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Rodrigo Herrada
 */
public interface CRUD {
    	public List listar();
	public User listarID(int id);
	public String add(String nombre, String apellido);
	public String actualizar(int id, String nombre,  String apellido);
	public User eliminar(int id);
}
