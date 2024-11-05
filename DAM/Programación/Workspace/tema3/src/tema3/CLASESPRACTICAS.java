package tema3;

public class CLASESPRACTICAS {

	public static void main(String[] args) {
		int numero = 5;
		int numero2 = 10;
		numero=numero2;
		// si número es mayor que numero2 imprime la suma en caso cintrario imprime la resta
		if(numero==numero2) {
			int prueba = numero + numero2;
			System.out.println(prueba);
		} else {//cualquier otro caso
			System.out.println(numero - numero2);
		}
	}

}
