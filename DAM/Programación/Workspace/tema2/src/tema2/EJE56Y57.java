package tema2;

import java.util.Scanner;

public class EJE56Y57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Importe de la compra");

		String s1=sc.nextLine();

		double n=Double.parseDouble(s1);

		

		

		System.out.println("Coge este billete");

		String s2=sc.nextLine();

		double n1=Double.parseDouble(s2);

		System.out.println("Cambio");

		System.out.println(n1-n);

		sc.close();
		
		

		
		
		
	}

}
