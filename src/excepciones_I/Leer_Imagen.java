package excepciones_I;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Leer_Imagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mi_Imagen imagen = new Mi_Imagen();

		// si la imagen no se encuentra se lanza otra excepcion, NullPointerException,
		// como la misma hereda de RuntimeException, se pueda mejorar el codigo para
		// solucionar el problema

		if (imagen.getImagen() == null) {
			System.out.println("No se encontro la imagen 2, NullPointerException");
		} else {
			// todo ok
			System.out.println(imagen.getImagen().getWidth(null));
		}
	}

}

class Mi_Imagen {
	private Image imagen;

	public Mi_Imagen() {
		// maneja una excepcion que hereda de IOException, por lo cual es OBLIGATORIO
		// implementar el bloque try catch para manejar la excepcion
		try {
			// si la imagen no se encuentra, se lanza la excepcion IOException
			// original: edlp.png
			imagen = ImageIO.read(new File("src/excepciones_I/edlp0.png"));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("La imagen no se encuentra, IOException");
		}
	}

	/**
	 * @return the imagen
	 */
	public Image getImagen() {
		return imagen;
	}

}