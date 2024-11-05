package tema3;

import java.util.Scanner;

public class EJEpag33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero");

		String s = sc.nextLine();
		int n1 = Integer.parseInt(s);

		System.out.println("introduce otro numero");
		String v = sc.nextLine();
		int n2 = Integer.parseInt(v);

		if (n1 < n2) {

			for (int i = n1; i<=n2; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = n2; i<n1; i++) {
				System.out.println(i + " ");
			}
		}
	}

}
