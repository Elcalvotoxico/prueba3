package tema3;

import java.util.Random;
import java.util.Scanner;

public class EJEpag82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random(); 
		int mayor = 0;
		int menor = 81;
		int suma = 0;
		int cont = 0;
		int n = 0;
		do {
			n = r.nextInt(30, 81);
			System.out.println(n);
			if (n > mayor) {
				mayor = n;
			}
			if (n < menor) {
				menor = n;
			}
			boolean entra = false;
			for (int i=2;i<n;i++) {
				if(n%i==0) {
					entra=true;
					break;
				}
			}
			if(!entra) {
				suma = suma + n;
				cont++;
			}

		} while (n != 40);
		if(suma==0) {
			System.out.println("No es primo");
		}
		System.out.println("La media es" + " " + suma/cont);
		System.out.println("El número mayor es" + " " + mayor);
		System.out.println("El número menor es" + " " + menor);

	}

}
