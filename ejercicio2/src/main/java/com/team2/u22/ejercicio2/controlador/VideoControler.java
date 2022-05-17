/**
 * 
 */
package com.team2.u22.ejercicio2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
 * Fecha de creación 17/05/2022
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
		
		// Boton de Crear Usuario
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
					
					if(this.vista.fechaCUTextField.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
						
					}else {
						throw new Exception("Introduce un formato de fecha correcto");
					}
								
				}

				video.crearRegistro("ud22_ejercicios_db_clientes", "videos", video.toString());

				System.out.println(video);
				System.out.println(video);

			} catch (Exception e2) {

				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			// Boton Filtrar usuarios
		} else if (this.vista.botonFU_1 == e.getSource()) {

			vista.textArea.setText(video.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "videos", 6));

			// Actualizar Usuario
		} else if (this.vista.botonAU_1 == e.getSource()) {

			try {
			if (!"".equals(vista.nombreAUTextField.getText())) {
				String actualizarNombre = "nombre = '" + vista.nombreAUTextField.getText() + "'";
				video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarNombre,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.apellidoAUTextField.getText())) {
				String actualizarApellido = "apellido = '" + vista.apellidoAUTextField.getText() + "'";
				video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarApellido,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.direccionAUTextField.getText())) {
				String actualizarDireccion = "direccion = '" + vista.direccionAUTextField.getText() + "'";
				video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarDireccion,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.dniAUTextField.getText())) {
				String actualizarDni = "dni = '" + vista.dniAUTextField.getText() + "'";
				video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarDni,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.fechaAUTextField.getText())) {
				if(this.vista.fechaAUTextField.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
					String actualizarFecha = "fecha = '" + vista.fechaAUTextField.getText() + "'";
					video.actualizarRegistro("ud22_ejercicios_db_clientes", "videos", actualizarFecha,
							"id = " + vista.idAUTextField.getText());
				}else {
					throw new Exception("Introduce un formato de fecha correcto");
				}
				
			}
			}catch (Exception ex) {
			
				JOptionPane.showMessageDialog(null, ex.getMessage());
				
			}

			// Borrar Usuario
		} else if (this.vista.botonBU_1 == e.getSource()) {

			video.eliminarRegistro("ud22_ejercicios_db_clientes", "video", "id = " + vista.idBUTextField.getText());

		}
		
	}

}
