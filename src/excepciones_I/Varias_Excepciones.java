package excepciones_I;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NO ES UNA BUENA PRACTICA usar try catch para excepciones no controladas
		// (RuntimeException) porque se podria mejorar el codigo antes

		try {

			// uso del metodo estatico creado
			division();
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		} catch (NumberFormatException e) {
			System.out.println("No es un numero");
			System.out.println("Mensaje: " + e.getMessage());
			System.out.println("El error es del tipo: " + e.getClass().getName());
		}
	}

	public static void division() {
		int num_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo"));
		int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"));

		System.out.println("El resultado es: " + num_1 / num_2);
	}
}
