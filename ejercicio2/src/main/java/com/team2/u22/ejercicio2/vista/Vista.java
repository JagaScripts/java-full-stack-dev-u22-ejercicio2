package com.team2.u22.ejercicio2.vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * ejercicio1 - vista - Vista
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 10/05/2022
 */
public class Vista extends JFrame {

	public JPanel contentPane;
	public JTextField nombreCUTextField;
	public JTextField apellidoCUTextField;
	public JTextField direccionCUTextField;
	public JTextField dniCUTextField;
	public JTextField fechaCUTextField;
	public JTextField idAUTextField;
	public JTextField nombreAUTextField;
	public JTextField apellidoAUTextField;
	public JTextField direccionAUTextField;
	public JTextField dniAUTextField;
	public JTextField fechaAUTextField;
	public JTextField idBUTextField;
	public JTextArea textArea;

	public JButton botonCU;
	public JButton botonAU;
	public JButton botonFU;
	public JButton botonBU;
	public JButton botonCU_1;
	public JButton botonAU_1;
	public JButton botonFU_1;
	public JButton botonBU_1;
	public JTextField txtIdVideo;
	public JTextField txtTítulo;
	public JTextField txtDirector;
	public JTextField txtCliente_id;
	public JTextField txtIdVideoA;
	public JTextField textField_6;
	public JTextField txtDirectorA;
	public JTextField txtCliente_idA;
	public JTextField txtIdVideoB;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 917);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCrear = new JPanel();
		panelCrear.setBounds(10, 11, 352, 205);
		contentPane.add(panelCrear);
		panelCrear.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 55, 61, 14);
		panelCrear.add(lblNewLabel_1);

		nombreCUTextField = new JTextField();
		nombreCUTextField.setBounds(65, 52, 122, 20);
		panelCrear.add(nombreCUTextField);
		nombreCUTextField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		lblNewLabel_2.setBounds(10, 83, 56, 14);
		panelCrear.add(lblNewLabel_2);

		apellidoCUTextField = new JTextField();
		apellidoCUTextField.setBounds(65, 80, 86, 20);
		panelCrear.add(apellidoCUTextField);
		apellidoCUTextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Direccion:");
		lblNewLabel_3.setBounds(167, 83, 61, 14);
		panelCrear.add(lblNewLabel_3);

		direccionCUTextField = new JTextField();
		direccionCUTextField.setBounds(230, 80, 122, 20);
		panelCrear.add(direccionCUTextField);
		direccionCUTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setBounds(20, 108, 46, 14);
		panelCrear.add(lblNewLabel_4);

		dniCUTextField = new JTextField();
		dniCUTextField.setBounds(65, 108, 86, 20);
		panelCrear.add(dniCUTextField);
		dniCUTextField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Fecha:");
		lblNewLabel_5.setBounds(174, 108, 46, 14);
		panelCrear.add(lblNewLabel_5);

		fechaCUTextField = new JTextField();
		fechaCUTextField.setToolTipText("Formato de fecha yyyy-MM-dd");
		fechaCUTextField.setBounds(230, 108, 86, 20);
		panelCrear.add(fechaCUTextField);
		fechaCUTextField.setColumns(10);

		botonCU = new JButton("Enviar");
		botonCU.setBounds(139, 157, 89, 23);
		panelCrear.add(botonCU);

		JLabel lblNewLabel_6 = new JLabel("Crear Usuario");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6.setBounds(20, 11, 106, 21);
		panelCrear.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Formato de fecha yyyy-MM-dd");
		lblNewLabel.setBounds(167, 133, 175, 14);
		panelCrear.add(lblNewLabel);

		JPanel panelLeer = new JPanel();
		panelLeer.setBounds(390, 11, 352, 205);
		contentPane.add(panelLeer);
		panelLeer.setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(10, 41, 332, 124);
		panelLeer.add(textArea);

		JLabel lblNewLabel_6_1 = new JLabel("Filtrar Usuarios");
		lblNewLabel_6_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(33, 9, 117, 21);
		panelLeer.add(lblNewLabel_6_1);

		botonFU = new JButton("Filtrar");
		botonFU.setBounds(143, 171, 89, 23);
		panelLeer.add(botonFU);

		JPanel panelActualizar = new JPanel();
		panelActualizar.setBounds(10, 239, 352, 205);
		contentPane.add(panelActualizar);
		panelActualizar.setLayout(null);

		JLabel lblNewLabel_6_2 = new JLabel("Actualizar Usuario");
		lblNewLabel_6_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(10, 11, 140, 21);
		panelActualizar.add(lblNewLabel_6_2);

		JLabel lblNewLabel_7 = new JLabel("Id:");
		lblNewLabel_7.setBounds(160, 15, 25, 14);
		panelActualizar.add(lblNewLabel_7);

		idAUTextField = new JTextField();
		idAUTextField.setColumns(10);
		idAUTextField.setBounds(184, 12, 54, 20);
		panelActualizar.add(idAUTextField);

		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(10, 46, 61, 14);
		panelActualizar.add(lblNewLabel_1_1);

		nombreAUTextField = new JTextField();
		nombreAUTextField.setColumns(10);
		nombreAUTextField.setBounds(65, 43, 86, 20);
		panelActualizar.add(nombreAUTextField);

		JLabel lblNewLabel_2_1 = new JLabel("Apellido:");
		lblNewLabel_2_1.setBounds(170, 46, 56, 14);
		panelActualizar.add(lblNewLabel_2_1);

		apellidoAUTextField = new JTextField();
		apellidoAUTextField.setColumns(10);
		apellidoAUTextField.setBounds(230, 43, 86, 20);
		panelActualizar.add(apellidoAUTextField);

		JLabel lblNewLabel_3_1 = new JLabel("Direccion:");
		lblNewLabel_3_1.setBounds(10, 71, 61, 14);
		panelActualizar.add(lblNewLabel_3_1);

		direccionAUTextField = new JTextField();
		direccionAUTextField.setColumns(10);
		direccionAUTextField.setBounds(75, 68, 86, 20);
		panelActualizar.add(direccionAUTextField);

		JLabel lblNewLabel_4_1 = new JLabel("DNI:");
		lblNewLabel_4_1.setBounds(170, 71, 46, 14);
		panelActualizar.add(lblNewLabel_4_1);

		dniAUTextField = new JTextField();
		dniAUTextField.setColumns(10);
		dniAUTextField.setBounds(230, 68, 86, 20);
		panelActualizar.add(dniAUTextField);

		JLabel lblNewLabel_5_1 = new JLabel("Fecha:");
		lblNewLabel_5_1.setBounds(10, 102, 46, 14);
		panelActualizar.add(lblNewLabel_5_1);

		fechaAUTextField = new JTextField();
		fechaAUTextField.setToolTipText("Formato de fecha yyyy-MM-dd");
		fechaAUTextField.setColumns(10);
		fechaAUTextField.setBounds(65, 99, 86, 20);
		panelActualizar.add(fechaAUTextField);

		botonAU = new JButton("Actualizar");
		botonAU.setBounds(137, 151, 101, 23);
		panelActualizar.add(botonAU);
		
		JLabel lblNewLabel_8 = new JLabel("Formato de fecha yyyy-MM-dd");
		lblNewLabel_8.setBounds(10, 127, 175, 14);
		panelActualizar.add(lblNewLabel_8);

		JPanel panelBorrar = new JPanel();
		panelBorrar.setBounds(390, 239, 352, 205);
		contentPane.add(panelBorrar);
		panelBorrar.setLayout(null);

		JLabel lblNewLabel_6_3 = new JLabel("Borrar Usuario");
		lblNewLabel_6_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_3.setBounds(10, 11, 113, 21);
		panelBorrar.add(lblNewLabel_6_3);

		JLabel lblNewLabel_7_1 = new JLabel("Id:");
		lblNewLabel_7_1.setBounds(10, 46, 25, 14);
		panelBorrar.add(lblNewLabel_7_1);

		idBUTextField = new JTextField();
		idBUTextField.setColumns(10);
		idBUTextField.setBounds(34, 43, 54, 20);
		panelBorrar.add(idBUTextField);

		botonBU = new JButton("Borrar");
		botonBU.setBounds(133, 144, 89, 23);
		panelBorrar.add(botonBU);
		
		JPanel panelCrear_1 = new JPanel();
		panelCrear_1.setLayout(null);
		panelCrear_1.setBounds(8, 450, 352, 205);
		contentPane.add(panelCrear_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Id:");
		lblNewLabel_1_2.setBounds(10, 55, 61, 14);
		panelCrear_1.add(lblNewLabel_1_2);
		
		txtIdVideo = new JTextField();
		txtIdVideo.setColumns(10);
		txtIdVideo.setBounds(65, 52, 122, 20);
		panelCrear_1.add(txtIdVideo);
		
		JLabel lblNewLabel_2_2 = new JLabel("Titulo:");
		lblNewLabel_2_2.setBounds(10, 83, 56, 14);
		panelCrear_1.add(lblNewLabel_2_2);
		
		txtTítulo = new JTextField();
		txtTítulo.setColumns(10);
		txtTítulo.setBounds(65, 80, 86, 20);
		panelCrear_1.add(txtTítulo);
		
		JLabel lblNewLabel_3_2 = new JLabel("Director:");
		lblNewLabel_3_2.setBounds(203, 55, 61, 14);
		panelCrear_1.add(lblNewLabel_3_2);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(199, 80, 122, 20);
		panelCrear_1.add(txtDirector);
		
		JLabel lblNewLabel_4_2 = new JLabel("Cliente_id:");
		lblNewLabel_4_2.setBounds(10, 108, 61, 14);
		panelCrear_1.add(lblNewLabel_4_2);
		
		txtCliente_id = new JTextField();
		txtCliente_id.setColumns(10);
		txtCliente_id.setBounds(75, 105, 86, 20);
		panelCrear_1.add(txtCliente_id);
		
		JButton botonCU_1 = new JButton("Enviar");
		botonCU_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonCU_1.setBounds(139, 157, 89, 23);
		panelCrear_1.add(botonCU_1);
		
		JLabel lblNewLabel_6_4 = new JLabel("Crear Video");
		lblNewLabel_6_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_4.setBounds(20, 11, 106, 21);
		panelCrear_1.add(lblNewLabel_6_4);
		
		JPanel panelLeer_1 = new JPanel();
		panelLeer_1.setLayout(null);
		panelLeer_1.setBounds(390, 450, 352, 205);
		contentPane.add(panelLeer_1);
		
		JTextArea textAreaVideos = new JTextArea();
		textAreaVideos.setBounds(10, 41, 332, 124);
		panelLeer_1.add(textAreaVideos);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Filtrar Videos");
		lblNewLabel_6_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_1_1.setBounds(33, 9, 117, 21);
		panelLeer_1.add(lblNewLabel_6_1_1);
		
		JButton botonFU_1 = new JButton("Filtrar");
		botonFU_1.setBounds(143, 171, 89, 23);
		panelLeer_1.add(botonFU_1);
		
		JPanel panelActualizar_1 = new JPanel();
		panelActualizar_1.setLayout(null);
		panelActualizar_1.setBounds(10, 658, 352, 205);
		contentPane.add(panelActualizar_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Id:");
		lblNewLabel_1_1_1.setBounds(10, 46, 61, 14);
		panelActualizar_1.add(lblNewLabel_1_1_1);
		
		txtIdVideoA = new JTextField();
		txtIdVideoA.setColumns(10);
		txtIdVideoA.setBounds(65, 43, 86, 20);
		panelActualizar_1.add(txtIdVideoA);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Título:");
		lblNewLabel_2_1_1.setBounds(170, 46, 56, 14);
		panelActualizar_1.add(lblNewLabel_2_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(230, 43, 86, 20);
		panelActualizar_1.add(textField_6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Director:");
		lblNewLabel_3_1_1.setBounds(10, 71, 61, 14);
		panelActualizar_1.add(lblNewLabel_3_1_1);
		
		txtDirectorA = new JTextField();
		txtDirectorA.setColumns(10);
		txtDirectorA.setBounds(75, 68, 86, 20);
		panelActualizar_1.add(txtDirectorA);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Cliente_id:");
		lblNewLabel_4_1_1.setBounds(170, 71, 56, 14);
		panelActualizar_1.add(lblNewLabel_4_1_1);
		
		txtCliente_idA = new JTextField();
		txtCliente_idA.setColumns(10);
		txtCliente_idA.setBounds(230, 68, 86, 20);
		panelActualizar_1.add(txtCliente_idA);
		
		JButton botonAU_1 = new JButton("Actualizar");
		botonAU_1.setBounds(137, 151, 101, 23);
		panelActualizar_1.add(botonAU_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Actualizar Video");
		lblNewLabel_6_2_1.setBounds(10, 9, 140, 21);
		panelActualizar_1.add(lblNewLabel_6_2_1);
		lblNewLabel_6_2_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		
		JPanel panelBorrar_1 = new JPanel();
		panelBorrar_1.setLayout(null);
		panelBorrar_1.setBounds(390, 658, 352, 205);
		contentPane.add(panelBorrar_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Borrar Video");
		lblNewLabel_6_3_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_3_1.setBounds(10, 11, 113, 21);
		panelBorrar_1.add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Id:");
		lblNewLabel_7_1_1.setBounds(10, 46, 25, 14);
		panelBorrar_1.add(lblNewLabel_7_1_1);
		
		txtIdVideoB = new JTextField();
		txtIdVideoB.setColumns(10);
		txtIdVideoB.setBounds(34, 43, 54, 20);
		panelBorrar_1.add(txtIdVideoB);
		
		JButton botonBU_1 = new JButton("Borrar");
		botonBU_1.setBounds(133, 144, 89, 23);
		panelBorrar_1.add(botonBU_1);
	}
}
