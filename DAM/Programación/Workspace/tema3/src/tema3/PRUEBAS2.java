package tema3;

import java.util.Scanner;

public class PRUEBAS2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");
		int numero = sc.nextInt();
		int cont = numero - 1;
		System.out.println("tiene" + " " + cont + " " + "digitos");
		for (int i = numero; i <= cont; i++) {
			if (numero % i == cont) {
				if (i == cont)
					System.out.println(i);
				else
					System.out.println(i);
			}
			cont--;
		}

	}

}
