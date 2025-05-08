package ejercicios;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cadena = "";

		do {

			System.out.println("Escribe una frase");

			cadena = sc.nextLine();

			if (!cadena.equals("")) {

				System.out.println(cambio(cadena));

			}

		} while (!cadena.equals(cadena));

		sc.close();

	}

	public static String cambio(String cadena) {

		String cambia = "";

		for (int i = 0; i < cadena.length(); i++) {

			String letra = cadena.substring(i, i + 1);

			if (i % 2 == 0) {

				letra = letra.toUpperCase();

			} else {

				letra = letra.toLowerCase();

			}

			cambia += letra;

		}

		return cambia;

	}
}
