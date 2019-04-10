package excepciones_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Que desea hacer?");
		System.out.println("1: Introducir datos");
		System.out.println("2: Salir del programa");

		Scanner entrada = new Scanner(System.in);

		int decision = entrada.nextInt();

		if (decision == 2) {
			System.out.println("Chau");
			System.exit(0); // termina la ejecucion del programa
		} else if (decision == 1) {
			// si el metodo NO fuera estatico
//			Entrada_Datos a = new Entrada_Datos();
//			a.pedirDatos();

			pedirDatos();
		} else {
			System.exit(0);
		}
	}

	// es un metodo estatico para poder llamarlo sin instanciar la misma clase
	// NO es buena practica ya que se puede arreglar el codigo, pero en este caso se
	// lanza una excepcion para manejarla
	public static void pedirDatos() throws InputMismatchException {

		// se trata lo lanzado aca para que continue el programa
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Nombre: ");
			String nombre = entrada.nextLine();

			System.out.println("Edad: ");
			int edad = entrada.nextInt();

			System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + ", el año que viene tendras "
					+ (edad + 1) + " años");
			entrada.close();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("No es un numero");
		}

		System.out.println("fin");
	}

}
