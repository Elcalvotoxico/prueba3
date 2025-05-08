package ejercicios;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		do {

			System.out.println("Escribe la primera cadena de texto");

			str = sc.nextLine();

			if (str != "") {

				if (palindromo(str)) {

					System.out.println(str + " Es un palindromo");

				} else {

					System.out.println(str + " No es un palindromo");

				}

			}

		} while (str.length() > 0);

		sc.close();

	}

	public static boolean palindromo(String str) {

		String s = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			s += str.charAt(i);

		}

		return str.equals(s);

	}

}
