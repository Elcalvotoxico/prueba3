package tema3;

import java.util.Scanner;



public class EJEpag63 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i=0;

		

		do{

			System.out.println("Introduce un numero");

			String s=sc.nextLine();

			i =Integer.parseInt(s);

		}while(!(i>0 && i<10));

		

	

		System.out.println("FIN");



sc.close();

	}



}
