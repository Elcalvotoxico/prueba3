package tema3;

import java.util.Scanner;
import java.util.Random;

public class EJEpag78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("introduce un número");

		int n = 0;
		do {
			try {
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n = Integer.parseInt(s);

			} catch (Exception ex) {
				System.out.println("Introduce un nº correcto");
			}
		} while (n < 1 || n > 6);// aqui se escribe el mientra.

		int cont = 0;
		for (int i = 1; i <= 100; i++) {

			int n1 = r.nextInt(1, 7);
			if (n1 == n) {
				cont++;
			}
		}
		System.out.println("el numero n ha salido" +" "+ cont);

		sc.close();
	}
}
