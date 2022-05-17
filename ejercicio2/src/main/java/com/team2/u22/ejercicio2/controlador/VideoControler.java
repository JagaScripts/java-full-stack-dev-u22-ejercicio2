/**
 * 
 */
package com.team2.u22.ejercicio2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.team2.u22.ejercicio2.modelo.Cliente;
import com.team2.u22.ejercicio2.modelo.Video;
import com.team2.u22.ejercicio2.vista.Vista;

/**
 * ejercicio2 - com.team2.u22.ejercicio2.controlador - VideoControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 17/05/2022
 */
public class VideoControler implements ActionListener {

	private Video video;
	private Vista vista;
	private Cliente cliente;

	/**
	 * @param video
	 * @param vista
	 */
	public VideoControler(Video video, Vista vista) {
		this.video = video;
		this.vista = vista;

		// Boton de Crear Video
		this.vista.botonCU_1.addActionListener(this);
		this.vista.botonFU_1.addActionListener(this);
		this.vista.botonBU_1.addActionListener(this);
		this.vista.botonAU_1.addActionListener(this);
	}

	/**
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo = "";
		String director = "";
		int id_Cliente = 0;

		// Crear Usuario
		if (this.vista.botonCU_1 == e.getSource()) {
			try {

				if (!"".equals(this.vista.txtDirector.getText())) {
					director = this.vista.txtDirector.getText();
				}

				if (!"".equals(this.vista.txtTítulo.getText())) {
					titulo = this.vista.txtTítulo.getText();
				}

				video = new Video();
				video.setDirector(director);
				video.setTitle(titulo);

				if (!"".equals(this.vista.txtCliente_id.getText())) {
					id_Cliente = Integer.parseInt(this.vista.txtCliente_id.getText());
					cliente = new Cliente();
					if (cliente.comprobarId(String.valueOf(id_Cliente))) {
						video.setCliente(cliente);
					}else {
						
						JOptionPane.showMessageDialog(null, "El cliente no existe");
						
					}
				}

				video.crearRegistro("ud22_ejercicios_db_clientes", "videos", video.toString());
				vista.txtCliente_id.setText("");
				vista.txtDirector.setText("");
				vista.txtTítulo.setText("");


			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, ex.getMessage());
				
				
			} 
			// Boton Filtrar usuarios
		} else if (this.vista.botonFU_1 == e.getSource()) {

			try {
				vista.textAreaVideos.setText(video.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "videos", 4));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Actualizar Usuario
		} else if (this.vista.botonAU_1 == e.getSource()) {

			try {
				if (!"".equals(vista.txtTituloA.getText())) {
					String actualizarVideo = "title = '" + vista.txtTituloA.getText() + "'";
					video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarVideo,
							"id = " + vista.txtIdVideoA.getText());					
					
				}

				if (!"".equals(vista.txtDirectorA.getText())) {
					String actualizarDirector = "director = '" + vista.txtDirectorA.getText() + "'";
					video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarDirector,
							"id = " + vista.txtIdVideoA.getText());
					
				}
				
				if (!"".equals(this.vista.txtCliente_idA.getText())) {
					id_Cliente = Integer.parseInt(this.vista.txtCliente_idA.getText());
					cliente = new Cliente();
					if (cliente.comprobarId(String.valueOf(id_Cliente))) {
						String actualizarIdCliente = "cli_id = '" + id_Cliente + "'";
						video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarIdCliente,
								"id = " + vista.txtIdVideoA.getText());
						
					}else {
						
						JOptionPane.showMessageDialog(null, "El cliente no existe");
						
					}
				}
				
				vista.txtTituloA.setText("");
				vista.txtDirectorA.setText("");
				vista.txtCliente_idA.setText("");
				vista.txtIdVideoA.setText("");
				
				

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, ex.getMessage());
				

			}

			// Borrar Usuario
		} else if (this.vista.botonBU_1 == e.getSource()) {

			try {
				video.eliminarRegistro("ud22_ejercicios_db_clientes", "video", "id = " + vista.txtIdVideoB.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
