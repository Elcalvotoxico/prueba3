package tema3;

import java.util.Scanner;

public class ejepag74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");

		int n = 0;
		int suma = 0;
		int multiplicación = 1;
		int cont = 0;
		do {
			try {
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				System.out.println(n);
				if (n != 0) {
					suma = suma + n;
					multiplicación = multiplicación * n;
					cont++;

				}

			} catch (Exception ex) {
				System.out.println("Introduce un nº correcto");
			}
		} while (n != 0);
		System.out.println(suma);
		System.out.println(multiplicación);
		int media = suma / cont;
		System.out.println(media);

		sc.close();
	}

}
