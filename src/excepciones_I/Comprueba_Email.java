package excepciones_I;

import javax.swing.JOptionPane;

public class Comprueba_Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// guarda lo ingresado desde un cuadro de dialogo
		String email = JOptionPane.showInputDialog("Ingresa el email");

		// tratar la excepcion
		try {
			examina_email(email);
		} catch (NullPointerException e) {
			System.out.println("La direccion de email no es correcta");
		}
	}

	// con throws se indica que puede lanzar un error
	public static void examina_email(String email) throws NullPointerException {
		int arroba = 0;
		boolean punto = false;

		if (email.length() <= 3) {
			// asi tambien se puede, es lo mismop
			// NullPointerException e = new NullPointerException();
			// throw e;

			// se lanza una excepcion de forma manual en un punto determinado del codigo
			throw new NullPointerException(); // el tipo de exception no importa, es de ejemplo
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
