package tema2;

import java.util.Scanner;

public class SF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un número");
		String s1 = sc.nextLine();
		int n1 = Integer.parseInt(s1);
		
		System.out.println("introduce un número");
		String s2 = sc.nextLine();

		int n2 = Integer.parseInt(s2);
		
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
	
		
		
		//teoria
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println(Math.min(5,16));


		int n3 = 5;
		int n4 = 16;
		System.out.println(Math.min(n3,n4));

		System.out.println(Math.pow(4,3));

		System.out.println(Math.E);
		System.out.println(Math.PI);


		double x = 4.99;
		long l = Math.round(x);
		int n5 = Math.round(n3);

		System.out.println(Math.round(x));    //4
		System.out.println(Math.floor(x));    //4
		System.out.println(Math.ceil(x));     //5
		
		
		//teoria
		public static void main(String[] args) {

			int n1=10;
			int n2=3;

			System.out.println(n1/n2);//devuelve 3

			//si quiero decimales
			System.out.println((float)n1/n2);
			System.out.println(n1/(double)n2);

	}

}
