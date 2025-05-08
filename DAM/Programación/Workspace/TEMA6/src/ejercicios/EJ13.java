package ejercicios;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");

		String s = sc.nextLine();

		System.out.println("Introduce una letra:");

		char letra = sc.next().charAt(0);

		int opcion;

		do {

			System.out.println("Men�:");

			System.out.println("1 - Veces");

			System.out.println("2 - Primera aparici�n");

			System.out.println("3 - �ltima aparici�n");

			System.out.println("0 - Salir");

			System.out.print("Selecciona una opci�n: ");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("La letra '" + letra + "' aparece " + contarVeces(s, letra) + " veces en la frase.");

				break;

			case 2:

				int primeraPos = primeraAparicion(s, letra);

				if (primeraPos != -1) {

					System.out.println(

							"La primera aparici�n de la letra '" + letra + "' est� en la posici�n: " + primeraPos);

				} else {

					System.out.println("La letra '" + letra + "' no se encuentra en la frase.");

				}

				break;

			case 3:

				int ultimaPos = ultimaAparicion(s, letra);

				if (ultimaPos != -1) {

					System.out.println(

							"La �ltima aparici�n de la letra '" + letra + "' est� en la posici�n: " + ultimaPos);

				} else {

					System.out.println("La letra '" + letra + "' no se encuentra en la frase.");

				}

				break;

			case 0:

				System.out.println("Saliendo del programa...");

				break;

			default:

				System.out.println("Opci�n inv�lida. Por favor, elige una opci�n v�lida.");

			}

		} while (opcion != 0);

		sc.close();

	}

	public static int contarVeces(String frase, char letra) {

		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == letra) {

				contador++;

			}

		}

		return contador;

	}

	public static int primeraAparicion(String s, char letra) {

		return s.indexOf(letra);

	}

	public static int ultimaAparicion(String s, char letra) {

		return s.lastIndexOf(letra);

	}
}
