package excepciones_I;

public class Suma implements Calcula {
	private int resultado;

	public int calculo(int numero_1, int numero_2) {
		this.resultado = numero_1 + numero_2;

		return this.resultado;
	}
}
