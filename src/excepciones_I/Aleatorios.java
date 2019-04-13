package excepciones_I;

import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de elementos"));

		int[] numeros_aleatorios = new int[elementos];

		// rellenar
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			// 0.256 * 100, 25.6 lo castea a int => 25
			numeros_aleatorios[i] = (int) (Math.random() * 100);
		}

		// ver
		for (int elemento : numeros_aleatorios) {
			System.out.println(elemento);
		}
	}

}
