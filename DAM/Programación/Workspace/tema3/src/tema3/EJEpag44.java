package tema3;

import java.util.Scanner;

public class EJEpag44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");
		String s = sc.nextLine();

		System.out.println("introduce un número");
		String s1 = sc.nextLine();

		int n = Integer.parseInt(s);
		int n1 = Integer.parseInt(s1);
		int n2 = 1;
		if (n > n1) {

			for (int i = n1; i <= n; i++) {
				n2 = n2 * i;
			}
		} else {
			for (int i = n; i <= n1; i++) {
				n2 = n2 * i;
			}
			
		}

		System.out.println(n2);
		sc.close();
	}
}
