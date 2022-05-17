package com.team2.u22.ejercicio2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import com.team2.u22.ejercicio2.modelo.Cliente;
import com.team2.u22.ejercicio2.vista.Vista;

/**
 * 
 * ejercicio1 - com.team2.u22.ejercicio1.controlador - ClienteControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 10/05/2022
 */
public class ClienteControler implements ActionListener {

	private Cliente cliente;
	private Vista vista;

	/**
	 * Contructor de clase le pasamos el moledo cliente y vista cliente
	 * 
	 * @param cliente
	 * @param clienteVista
	 */
	public ClienteControler(Cliente cliente, Vista clienteVista) {
		this.cliente = cliente;
		this.vista = clienteVista;

		// Boton de Crear Usuario
		this.vista.botonCU.addActionListener(this);
		this.vista.botonFU.addActionListener(this);
		this.vista.botonBU.addActionListener(this);
		this.vista.botonAU.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String nombre = "";
		String apellido = "";
		String direccion = "";
		int dni = 0;
		String fecha = "";
		

		// Crear Usuario
		if (this.vista.botonCU == e.getSource()) {
			try {

				if (!"".equals(this.vista.nombreCUTextField.getText())) {
					nombre = this.vista.nombreCUTextField.getText();
				}

				if (!"".equals(this.vista.apellidoCUTextField.getText())) {
					apellido = this.vista.apellidoCUTextField.getText();
				}

				if (!"".equals(this.vista.direccionCUTextField.getText())) {
					direccion = this.vista.direccionCUTextField.getText();
				}

				if (!"".equals(this.vista.dniCUTextField.getText())) {
					dni = Integer.parseInt(this.vista.dniCUTextField.getText());
				}

				if (!"".equals(this.vista.fechaCUTextField.getText())) {
					if(this.vista.fechaCUTextField.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
						fecha = this.vista.fechaCUTextField.getText();
					}else {
						throw new Exception("Introduce un formato de fecha correcto");
					}
								
				}

				cliente = new Cliente(nombre, apellido, direccion, dni, fecha.toString());
				cliente.crearRegistro("ud22_ejercicios_db_clientes", "cliente", cliente.toString());

				System.out.println(cliente);
				System.out.println(cliente);

			} catch (Exception e2) {

				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			// Boton Filtrar usuarios
		} else if (this.vista.botonFU == e.getSource()) {

			vista.textArea.setText(cliente.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "cliente", 6));

			// Actualizar Usuario
		} else if (this.vista.botonAU == e.getSource()) {

			try {
			if (!"".equals(vista.nombreAUTextField.getText())) {
				String actualizarNombre = "nombre = '" + vista.nombreAUTextField.getText() + "'";
				cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarNombre,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.apellidoAUTextField.getText())) {
				String actualizarApellido = "apellido = '" + vista.apellidoAUTextField.getText() + "'";
				cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarApellido,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.direccionAUTextField.getText())) {
				String actualizarDireccion = "direccion = '" + vista.direccionAUTextField.getText() + "'";
				cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarDireccion,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.dniAUTextField.getText())) {
				String actualizarDni = "dni = '" + vista.dniAUTextField.getText() + "'";
				cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarDni,
						"id = " + vista.idAUTextField.getText());
			}

			if (!"".equals(vista.fechaAUTextField.getText())) {
				if(this.vista.fechaAUTextField.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
					String actualizarFecha = "fecha = '" + vista.fechaAUTextField.getText() + "'";
					cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", actualizarFecha,
							"id = " + vista.idAUTextField.getText());
				}else {
					throw new Exception("Introduce un formato de fecha correcto");
				}
				
			}
			}catch (Exception ex) {
			
				JOptionPane.showMessageDialog(null, ex.getMessage());
				
			}

			// Borrar Usuario
		} else if (this.vista.botonBU == e.getSource()) {

			cliente.eliminarRegistro("ud22_ejercicios_db_clientes", "cliente", "id = " + vista.idBUTextField.getText());

		}

	}

}
