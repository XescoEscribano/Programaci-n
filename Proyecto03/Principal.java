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

	/**
	 *CREAMOS LA VENTANA PRINCIPAL.
	 */
	public Principal() {
		setTitle("Mathdice Version 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 *VAMOS A CREAR A NUESTRO PRIMER JUGADOR BÁSICO PARA PODER LUEGO MOSTRARLO POR PANTALLA. 
		 */
		Jugador player1 = new Jugador();
		player1.setNombre("Xesco");
		player1.setApellido1("Escribano");
		player1.setApellido2("Zacares");
		player1.setEdad(33);
		player1.setIdentificador(0);
		player1.setPuntuacion(0);
		
		
		//CREADAS LAS ETIQUETAS PARA EL COMIENZO DEL JUEGO DONDE SE RECOGEN LOS DATOS
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(26, 31, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimerApellido = new JLabel("PRIMER APELLIDO");
		lblPrimerApellido.setBounds(26, 66, 109, 14);
		contentPane.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("SEGUNDO APELLIDO");
		lblSegundoApellido.setBounds(26, 106, 109, 14);
		contentPane.add(lblSegundoApellido);
		
		JLabel lblEdadJugador = new JLabel("EDAD JUGADOR 1");
		lblEdadJugador.setBounds(26, 147, 109, 14);
		contentPane.add(lblEdadJugador);
		
		//AQUÍ COGEREMOS LOS ATRIBUTOS QUE NOS DE EL JUGADOR PARA PODER PARTICIPAR CON ELLOS.
		
		nom = new JTextField(player1.getNombre());
		nom.setBounds(142, 28, 233, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		ape1 = new JTextField(player1.getApellido1());
		ape1.setColumns(10);
		ape1.setBounds(142, 63, 233, 20);
		contentPane.add(ape1);
		
		ape2 = new JTextField(player1.getApellido2());
		ape2.setColumns(10);
		ape2.setBounds(142, 103, 233, 20);
		contentPane.add(ape2);
		
		//HE TENIDO UN PROBLEMA EN LA EDAD, NO SE PORQUE NO SE MUESTRA EN EL TEXTFIELD LA EDAD QUE INTRODUZCO Y NO VEO EL FALLO CUAL PUEDE SER.
		
		edades = new JTextField(player1.getEdad());
		edades.setColumns(10);
		edades.setBounds(142, 144, 53, 20);
		contentPane.add(edades);
		
		JLabel jugador = new JLabel("");
		jugador.setAutoscrolls(true);
		jugador.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
		jugador.setDoubleBuffered(true);
		jugador.setFocusCycleRoot(true);
		jugador.setFocusTraversalPolicyProvider(true);
		jugador.setFont(new Font("Shruti", Font.BOLD, 10));
		jugador.setBounds(10, 185, 380, 66);
		contentPane.add(jugador);
		
		
		//BOTON QUE HEMOS CREADO PARA QUE LA INFORMACION LA PODAMOS MOSTRAR EN PANTALLA EN LA APP.
		JButton GuardaJugador = new JButton("Guardar Jugador");
		GuardaJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador.setText(player1.toString());
				//PROBAMOS SI LA INFORMACIÓN QUE RECIBIMOS ES CORRECTA Y SE PUEDE MOSTRAR (AQUÍ POR CONSOLA).
				System.out.println(player1.toString());
			}
		});
		GuardaJugador.setBounds(217, 131, 155, 46);
		contentPane.add(GuardaJugador);
		
		
		
		
		
		
		
	}
}
