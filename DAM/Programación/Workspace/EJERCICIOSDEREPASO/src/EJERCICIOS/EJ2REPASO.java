package EJERCICIOS;

import java.util.Scanner;

public class EJ2REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 0;
		int suma = 0;
		double media = 0;
		int mayor = 0;
		int menorMulti3 = 40;
		int contDePrimo = 0;
		while(i < 3) {
			System.out.println("Introduce 20 numeros");
			n = dimeEntero("Introduce numero", sc);
			if(n > 10 && n < 40 && n % 2 != 0) {
				i++;
				suma = suma + n;
				if(mayor < n) {
					mayor = n;
				}
				if(n % 3 == 0 && n < menorMulti3) {
					menorMulti3 = n;
				}
				if(primo(n)) {
					contDePrimo = contDePrimo + 1;
				}
			}else {
				System.out.println("Numero incorrecto");
			}
			
		}
		media = suma/3;
		System.out.println(menorMulti3);
		System.out.println(media);
		System.out.println(mayor);
		System.out.println(contDePrimo);

	}
	public static boolean primo(int num) {
		for(int i = 2; i < num; i++) {
		if(num % i==0) {
			return true;
		}
		}
		return false;
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}

		} while (true);

	}
	
	
	//Pide 20 n�meros por consola. Los n�meros tienen que estar entre 10 y 40, sino lo est�n no son
			//v�lidos y lo tienes que volver a pedir. De los que est�n entre 10 y 40, indica la media de los
			//impares, indica el mayor de todos e indica el menor de los m�ltiplos de 3. Calcula tambi�n
			//cu�ntos primos salen. Si no sale ninguno que lo diga.
}
