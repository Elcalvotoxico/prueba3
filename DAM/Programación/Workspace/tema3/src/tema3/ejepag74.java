package tema3;

import java.util.Scanner;

public class ejepag74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un n�mero");

		int n = 0;
		int suma = 0;
		int multiplicaci�n = 1;
		int cont = 0;
		do {
			try {
				System.out.println("Introduce un n�");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				System.out.println(n);
				if (n != 0) {
					suma = suma + n;
					multiplicaci�n = multiplicaci�n * n;
					cont++;

				}

			} catch (Exception ex) {
				System.out.println("Introduce un n� correcto");
			}
		} while (n != 0);
		System.out.println(suma);
		System.out.println(multiplicaci�n);
		int media = suma / cont;
		System.out.println(media);

		sc.close();
	}

}
