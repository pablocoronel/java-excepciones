package excepciones_I;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mi_matriz = new int[5];

		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = 20;
		mi_matriz[3] = -15;
		mi_matriz[4] = 40;

		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Posicion: " + i + " = " + mi_matriz[i]);
		}

		// pedir datos personales
		String nombre = JOptionPane.showInputDialog("ingrese su ombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));

		System.out.println(("El usuario " + nombre + " tiene " + edad + " años. El programa termino su ejecucion"));
	}

}
