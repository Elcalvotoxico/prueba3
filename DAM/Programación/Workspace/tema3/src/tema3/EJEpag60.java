package tema3;

import java.util.Scanner;



public class EJEpag60 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");

		String s=sc.nextLine();

		int n1 =Integer.parseInt(s);

		

		System.out.println("Introduce un numero");

		String s1=sc.nextLine();

		int n2 =Integer.parseInt(s1);

		

		int mayor=n1;

		int menor=n2;

		

		while(n1 >= n2)

		{

			System.out.println();

			n1--;

		}



	sc.close();

	}



}
