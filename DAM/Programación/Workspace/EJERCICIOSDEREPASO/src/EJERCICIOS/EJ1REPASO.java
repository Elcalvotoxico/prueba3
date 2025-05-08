package EJERCICIOS;
import java.util.Random;
import java.util.Scanner;

public class EJ1REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < 2; i++) {
			int n = dimeEntero("Introduce un numero", sc);
			if (mayor < n) {
				mayor = n;
			}
		}
		int n = 0;
		int suma = 0;
		int menor3 = 21;
		int mayor2 = 0;
		int cont = 0;
		do {

			n = dimeEntero("Introduce un numero", sc);
			suma = suma + n;
			cont++;
		} while (!(mayor % n == 0));
		System.out.println(suma / cont);
		if (n % 2 == 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i);
					if (i != n) {
						System.out.print(", ");
					}
				}
			}
		}else{
			for (int i = 0; i < n; i++) {
				
			
			int numeroRandom = r.nextInt(1,21);
			if ( numeroRandom % 2 == 0) {
				suma = suma + numeroRandom;
			}
			if(numeroRandom % 3 == 0) {
				if(menor3>numeroRandom) {
					menor3 = numeroRandom;
				}
			}
			if(mayor2<numeroRandom) {
				if(mayor<numeroRandom) {
					mayor2 = mayor;
					mayor = numeroRandom;
				}else {
					mayor2 = numeroRandom;
				}
			}
			}
			System.out.println(suma);
		}
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

}
