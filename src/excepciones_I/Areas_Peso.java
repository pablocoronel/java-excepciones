package excepciones_I;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso {
	// atributo estatico
	static int figura;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		try {
			figura = entrada.nextInt();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		} finally { // se ejecuta si o si
			entrada.close();
		}

		int lado;
		int base;
		int alto;
		int radio;
		int altura;

		switch (figura) {
		case 1:
			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El area del cuadradoes " + Math.pow(lado, 2));
			break;

		case 2:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			alto = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El area del rectangulo es " + base * alto);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			alto = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es " + (base * alto) / 2);
			break;
		case 4:
			radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El area del circulo es " + Math.PI * (Math.pow(radio, 2)));
			break;

		default:
			System.out.println("La opcion no es correcta");
		}

		/*****************************************************/
		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
		System.out.println("Si sos hombre tu peso ideal es " + (altura - 110) + " kg");
		System.out.println("Si sos mujer tu peso ideal es " + (altura - 120) + " kg");

	}

}
