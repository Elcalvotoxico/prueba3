package tema3;

import java.util.Scanner;

public class EJEpag45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for(int i=0;i<11;i++) {
			System.out.println("introduce un número");
			String s = sc.nextLine();
			int n = Integer.parseInt(s);
			suma = suma + n;
			
		}
		
		System.out.println("la media es "+ (double)suma/11);
		sc.close();
	}
	
}
