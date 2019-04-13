package excepciones_I;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suma operacion_1 = new Suma();
		Resta operacion_2 = new Resta();
		Multiplica operacion_3 = new Multiplica();
		Divide operacion_4 = new Divide();

		System.out.println(operacion_1.calculo(7, 8));
		System.out.println(operacion_2.calculo(7, 8));
		System.out.println(operacion_3.calculo(7, 8));
		System.out.println(operacion_4.calculo(7, 8));
	}

}
