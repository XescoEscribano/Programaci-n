import Ventanas.Login;
import Ventanas.Juego;

public class Principal {

	/**
	 * LANZADOR DE LA APP PRINCIPAL
	 */
	public static void main(String[] args) {
		//GENERAMOR LA VENTANA JUEGO A UTILIZAR
		Juego vJuego= new Juego();
		
		//GENERAMOS LA VENTANA PARA HACER EL LOGIN
		Login vLogin= new Login(vJuego);
		vLogin.setVisible(true);
	
	}
	
	

}
