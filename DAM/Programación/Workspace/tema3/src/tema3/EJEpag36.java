package tema3;

import java.util.Scanner;

public class EJEpag36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {

			System.out.println(" introduce un numero ");

			String s = sc.nextLine();
			int n1 = Integer.parseInt(s);

			if (n1 % 2 == 0) {
				System.out.print(" es par ");
			} else {
				System.out.print(" es impar ");

			}
		}
	}

}
