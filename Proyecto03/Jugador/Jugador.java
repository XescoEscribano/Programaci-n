package Jugador;

public class Jugador {
	
		//DECLARAMOS VARIABLES BASICAS DEL JUGADOR
	
		private String nombre;
		private String apellido1;
		private String apellido2;
		private int edad;
		private int puntos;
		private int ID;
		
	
		
		public Jugador() {
			//CONTRUCTOR PÚBLICO DE LA CLASE JUGADOR
		}

		
		
		/*LISTA DE GETTERS Y SETTERS PARA OBTENER DATOS DE LOS JUGADORES (SIN RESTRICCIONES POR AHORA)
		* MÁS ADELANTE PONDREMOS RESTRICCIONES DEL TIPO EDAD, ID VÁLIDO, STRINGS DE NOMBRES SIN ESTAR VACIOS, ETC...
		*/
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}
		
		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
				this.edad = edad;
		}

		public int getPuntuacion() {
			return puntos;
		}

		public void setPuntuacion(int puntos) {
			this.puntos = puntos;
		}

		public int getIdentificador() {
			return ID;
		}

		public void setIdentificador(int ID) {
			this.ID = ID;
		}
		
		public String toString() {
			return "Jugador " + ID + ", nombre=" + nombre + ", apellidos=" + apellido1 + " " + apellido2 + ", edad=" + edad + ", puntuación=" + puntos;
		}


}
