package ejercicios;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce texto");
		String str = sc.nextLine();
		int numero;
		do {
			System.out.println("1. Subcadena");
			System.out.println("2. Remplazo");
			System.out.println("3. Impares");
			System.out.println("0. salir");
			 numero = Funciones.dimeEntero("opcion", sc);
			switch(numero) {
			case 1:
				System.out.println(subCadena(str));
				break;
			case 2:
				System.out.println(remplazo(str));
				break;
			case 3:
				System.out.println(Impares(str));
				break;
			case 0: 
				break;
			}
		}while(numero!=0);
	}
	public static String subCadena(String str) {
		int num1=0;
		int num2=0;
			Scanner sc = new Scanner(System.in);
			do {
			 num1=Funciones.dimeEntero("Introduce un numero 1", sc);
			}while(num1<0&&num1<str.length()-1);
			
			do {
				num2=Funciones.dimeEntero("Introduce un numero 2", sc);
			}while(num1<0&&num1<str.length()-1&&num2<num1);
		
			
			String c = str.substring(num1,num2);
		return c;	
	}
	public static String remplazo(String str){
		Scanner sc = new Scanner(System.in);
		if(str.length()>10) {
		return "00" + str.substring(2);
		}
		return str; 
	}
	
	public static String Impares(String str) {
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==1) {
			s = s + (str.substring(i,i+1));	
			}
		}
		
		
		return s;
	}
}
