package tema2;

import java.util.Scanner;

public class EJE38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");
		String s1 = sc.nextLine();
		int n1 = Integer.parseInt(s1);
		System.out.println(s1+" "+n1);
		
		System.out.println("introduce un número decimal");
		String s2 = sc.nextLine();
		double n2 = Double.parseDouble(s2);
		System.out.println(s2+" "+n2);

		int n3 = 80;
		String s3 = String.valueOf(n3);
		
		int n4 = 90;
		long l = n4; 
		
		int n5 = 45;
		short sh = (short)n5;
		
	}

}