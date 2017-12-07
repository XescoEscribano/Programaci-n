import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Jugador.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

public class Principal extends JFrame {

	/**
	 * CREACIÓN DE LOS CAMPOS DE TEXTO PARA PODER RELLENAR POR EL USUARIO JUGADOR
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nom;
	private JTextField ape1;
	private JTextField ape2;
	private JTextField edades;
	private JTextField registro;
	private String edad;
	

	/**
	 * LANZADOR DE LA APP PRINCIPAL
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//GENERAMOS EL JUGADOR NUEVO
	Jugador player1 = new Jugador();

	/**
	 *CREAMOS LA VENTANA PRINCIPAL.
	 */
	public Principal() {
		setTitle("Mathdice Version 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CREADAS LAS ETIQUETAS PARA EL COMIENZO DEL JUEGO DONDE SE RECOGEN LOS DATOS
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(26, 79, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimerApellido = new JLabel("PRIMER APELLIDO");
		lblPrimerApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrimerApellido.setBounds(26, 110, 109, 14);
		contentPane.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("SEGUNDO APELLIDO");
		lblSegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSegundoApellido.setBounds(26, 141, 109, 14);
		contentPane.add(lblSegundoApellido);
		
		JLabel lblEdadJugador = new JLabel("EDAD JUGADOR ");
		lblEdadJugador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdadJugador.setBounds(26, 169, 109, 14);
		contentPane.add(lblEdadJugador);
		
		//AQUÍ COGEREMOS LOS ATRIBUTOS QUE NOS DE EL JUGADOR PARA PODER PARTICIPAR CON ELLOS.
		
		nom = new JTextField();
		nom.setBounds(142, 76, 233, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		ape1 = new JTextField();
		ape1.setColumns(10);
		ape1.setBounds(142, 107, 233, 20);
		contentPane.add(ape1);
		
		ape2 = new JTextField();
		ape2.setColumns(10);
		ape2.setBounds(142, 138, 233, 20);
		contentPane.add(ape2);
		
		edades = new JTextField();
		edades.setColumns(10);
		edades.setBounds(142, 166, 233, 20);
		contentPane.add(edades);
		edad=edades.getText();
		
		//BOTON QUE HEMOS CREADO PARA QUE LA INFORMACION LA PODAMOS MOSTRAR EN PANTALLA EN LA APP.
		JButton GuardaJugador = new JButton("A JUGAR!!!");
		GuardaJugador.setFont(new Font("Tahoma", Font.BOLD, 11));
		GuardaJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//ASIGNAMOS LAS PROPIEDADES AL JUGADOR
				asignarPropiedades();
				
				
				//COMPROBAMOS SI LOS CAMPOS QUE SE TIENEN QUE INTRODUCIR ESTAN LLENOS O VACIOS Y MOSTRAMOS MENSAJE Y SI LA EDAD ES UN NUMERO O NO
				if (player1.getNombre().length() == 0 || player1.getApellido1().length()==0 || player1.getApellido2().length()==0){
					registro.setText("Faltan campos por rellenar o la edad no es un número.REVISELO");
				}else {
					registro.setText(player1.toString());
				}
				
				
			}
				
		});
		GuardaJugador.setBounds(26, 215, 349, 20);
		contentPane.add(GuardaJugador);
		
		JLabel lblDatosJugador = new JLabel("DATOS JUGADOR");
		lblDatosJugador.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDatosJugador.setBounds(134, 11, 149, 34);
		contentPane.add(lblDatosJugador);
		
		registro = new JTextField();
		registro.setBounds(26, 246, 349, 73);
		contentPane.add(registro);
		registro.setColumns(10);		
		
	}
	
	public void asignarPropiedades(){ 
		 		player1.setNombre(nom.getText()); 
		 		player1.setApellido1(ape1.getText()); 
		 		player1.setApellido2(ape2.getText()); 
		 		player1.setEdad(Integer.valueOf(edades.getText()));		 
	} 
	//public boolean comprobarSiStringNumero(String edad){ 
		 																 
	//	 			try{ 
	//	 				Integer.parseInt(edad);				
	//	 				return true;							
	//	 			} 
	//	 			catch (Exception e){ 
	//	 				return false;							 
	//	 			} 
	//	 		} 

}
