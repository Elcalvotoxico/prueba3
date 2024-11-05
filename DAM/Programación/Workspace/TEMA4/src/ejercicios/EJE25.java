package ejercicios;

import java.util.Scanner;

public class EJE25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*String s =sc.nextLine();*/
		/*Funciones.esInt(s);*/
		/*System.out.println(Funciones.esInt(s));*/
		/*System.out.println(Funciones.esDouble(s));*/
		int n = Funciones.dimeEntero("numeero", sc);
		/*System.out.println(Funciones.dimeDouble("numero", sc));*/
		System.out.println(Funciones.esBisiesto(n));
	}
		

}
