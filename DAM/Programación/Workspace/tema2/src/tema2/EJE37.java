package tema2;

import java.util.Scanner;

public class EJE37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un número");
		String s1 = sc.nextLine();
		int n1 = Integer.parseInt(s1);

		System.out.println("introduce un número");
		String s2 = sc.nextLine();

		int n2 = Integer.parseInt(s2);
		
		System.out.println(n1);
		System.out.println(n2);
		
		int n3 = n1;
		n1 = n2; 
		n2 = n3;
		System.out.println(n1);
		System.out.println(n2);
		
	
	}

}
