package tema3;

import java.util.Scanner;

public class EJEpag43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1 && i % 3 == 0 || i % 5 == 1 && i == -100) {
				System.out.println(i);
				n=n+i;
			}
		}
		System.out.println("la suma es " + n);
		sc.close();
	}
}
