package excepciones_I;

import javax.swing.JOptionPane;

public class Comprueba_Email_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// guarda lo ingresado desde un cuadro de dialogo
		String email = JOptionPane.showInputDialog("Ingresa el email");

		// tratar la excepcion
		try {
			examina_email(email);
		} catch (Longitud_Email_Erronea e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // imprime el mensaje de error
		}
	}

	// con throws se indica que puede lanzar un error
	public static void examina_email(String email) throws Longitud_Email_Erronea {
		int arroba = 0;
		boolean punto = false;

		if (email.length() <= 3) {
			// aca uso la excepcion propia
			throw new Longitud_Email_Erronea("El email es demaciado corto");
		} else {

			for (int i = 0; i < email.length(); i++) {
//			string.charAt() es para obtener el caracter de una posicion dada
				if (email.charAt(i) == '@') { // el tipo char se escribe entre COMILLAS SIMPLES
					arroba++;
				}

				if (email.charAt(i) == '.') { // el tipo char se escribe entre COMILLAS SIMPLES
					punto = true;
				}
			}

			if (arroba == 1 && punto == true) {
				System.out.println("El email es correcto");
			} else {
				System.out.println("El email es incorrecto");
			}
		}
	}
}

// creacion de una excepcion propia
class Longitud_Email_Erronea extends Exception {
	public Longitud_Email_Erronea() {

	}

	public Longitud_Email_Erronea(String mensaje_error) {
		super(mensaje_error); // al constructor padre se le pasa el mensaje de error
	}
}
