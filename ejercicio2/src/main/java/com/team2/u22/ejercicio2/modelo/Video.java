/**
 * 
 */
package com.team2.u22.ejercicio2.modelo;

import java.sql.SQLException;

import com.team2.u22.ejercicio2.modelo.gestiondb.ServicioBD;

/**
 * ejercicio2 - com.team2.u22.ejercicio2.modelo - Video
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 15/05/2022
 */
public class Video extends ServicioBD{
	
	private int id;
	private String title;
	private String director;
	private Cliente cliente;
	
	

	/**
	 * 
	 */
	public Video() {
	}
	
	

	/**
	 * @param id
	 * @param title
	 * @param director
	 * @param cliente
	 */
	public Video(int id, String title, String director, Cliente cliente) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.cliente = cliente;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}



	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}



	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}



	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public void usarBaseDatos(String nombreBaseDatos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}

	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String registros) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.crearRegistro(nombreBaseDatos, tabla, registros);
	}

	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}

	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}

	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) throws SQLException{
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "videos";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}

	
	@Override
	public String toString() {
		
	
		String titleAux;
		String directorAux;
		
		if(!this.title.equals("")) {
			titleAux = "'" + this.title + "'";
		}else {
			titleAux = null;
		}
		
		if(!this.director.equals("")) {
			directorAux = "'" + this.director + "'";
		}else {
			directorAux = null;
		}
		
	
		
		return "(default ," + titleAux + ", " + directorAux + ", " + cliente.getId() + ")";
	}
		
	
}
