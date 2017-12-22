package Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import Jugador.Jugador;

public class Juego extends JFrame {

	/**
	 * DECLARAMOS LAS VARIABLES PARA LA SEGUNDA VENTANA
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel MensajeJugador;
	private Jugador player1;

	/**
	 * CREAMOS LA SEGUNDA VENTANA DEL JUEGO
	 */
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MensajeJugador = new JLabel("New label");
		MensajeJugador.setHorizontalAlignment(SwingConstants.CENTER);
		MensajeJugador.setBounds(25, 26, 399, 14);
		contentPane.add(MensajeJugador);
		
	}
	
	//IMPORTAMOS EL JUGADOR PARA PODER MOSTRAR SU NOMBRE EN PANTALLA COMO NUEVO JUGADOR
	public void setJugador(Jugador player1){
		
		this.player1 = player1;
		
		//MOSTRAMOS LA ETIQUETA CON EL JUGADOR NUEVO
		MensajeJugador.setText("Bienvenido a MathDice " + player1.getNombre());
	}
}

