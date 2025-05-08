package EJERCICIOS;

import java.util.Scanner;

public class EJ10REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		String str = sc.nextLine();
		System.out.println("Introduce un texto");
		String str1 = sc.nextLine();
		int n = str.compareTo(str1);
		if(n<0) {
			System.out.println( str.toUpperCase());
		}else if (n<1){
			System.out.println(str.toLowerCase());
		}
	}
	public static boolean dosCadenas(String str, String str1) {
		if(str.compareTo(str1) == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean trescadenas(String str, String str1) {
		if(str.compareTo(str1) == -9) {
			return false;
		}else
			return true;s
	}
}
