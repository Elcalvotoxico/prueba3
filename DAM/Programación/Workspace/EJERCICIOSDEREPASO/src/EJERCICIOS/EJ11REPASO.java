package EJERCICIOS;

import java.util.Scanner;

public class EJ11REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String str = sc.nextLine();
		int numero;
		do {
			System.out.println("1. Impares");
			System.out.println("2. Reemplazo");
			System.out.println("3. Subcadena");
			System.out.println("0. Salir");
			numero = dimeEntero("Introduce una opción", sc);
			switch(numero) {
			case 1:
				System.out.println(impares(str));
				break;
			case 2:
				System.out.println(remplazo(str));
				break;
			case 3:
				System.out.println(subCadena(str));
				break;
			case 0:
				break;
			}
		}while(numero!=0);
	}
	public static String impares(String str) {
		String s = "";
		for(int i = 0; i < str.length(); i++) {
			if(i%2==1) {
				s = s +(str.substring(i,i+1));
			}
		}
		return s;
	}
	public static String remplazo(String str) {
		Scanner sc = new Scanner(System.in);
		if(str.length()>10) {
			return "00" + str.substring(2);
		}
		return str;
	}
	public static String subCadena(String str) {
		int numero = 0;
		int numero1 = 0;
		Scanner sc = new Scanner(System.in);
		do {
			 numero = dimeEntero("introduce un numero 1", sc);
		}while(numero<0&&numero<str.length()-1);
		do {
			numero1 = dimeEntero("Introduce un numero 2", sc);

		}while(numero1<0&&numero1<str.length()-1&&numero<numero1);
		String c = str.substring(numero,numero1);
		return c;
	}
	public static int dimeEntero(String texto, Scanner sc){
		do {
			try {
				System.err.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			}catch(Exception e) {
				System.out.println("Formato incorrecto");
			}
		}while(true);
	}
}
