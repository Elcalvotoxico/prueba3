package tema3;

import java.util.Scanner;

public class EJEpag62 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");

		String s=sc.nextLine();

		int i =Integer.parseInt(s);

		

		while  (!((i % 2 != 0 && i > 100) || (i % 7 == 0))) {

			

			System.out.println("Introduce un numero");

			s=sc.nextLine();

			i =Integer.parseInt(s);

		}

		sc.close();

	}



}