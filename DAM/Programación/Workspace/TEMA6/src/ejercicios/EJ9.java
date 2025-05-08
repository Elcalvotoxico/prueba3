package ejercicios;

import java.util.Scanner;

public class EJ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce texto");
		String str = sc.nextLine();
		System.out.println("Introduce texto");
		String str1 = sc.nextLine();
		System.out.println(	dosCadenas(str, str1));
		System.out.println(tresCadenas(str, str1));
		int n = str.compareTo(str1);
		if(n>0){
			System.out.println( str.toUpperCase());
		
		}else if(n<1){
			System.out.println(str.toLowerCase());
		}
	}
	public static boolean dosCadenas(String str, String str1) {
		if(str.compareTo(str1) == 0){
			return true;
		}else
		return false;
	}
	public static boolean tresCadenas(String str, String str1) {
		if(str.compareTo(str1) == -9) {
			return false;
		}else
			return true;

	}

}
























//Pide por consola dos cadenas de texto(hecho)
//Si la primera cadena es más larga que la segunda, escribe por consola la primera cadena en mayúsculas, si no escribe la segunda cadena en minúsculas(hecho)
//Crea una función a la que le pasas las dos cadenas y te devuelve un booleano indicando si son iguales(hecho)
//Crea otra función a la que le pasas las dos cadenas  y te devuelve un booleano indicando si la segunda está contenida en la primera(hecho)																						

//s1=“las horas de programación”;
//s2=“horas”
//s3=“mano”

//s2 está contenido en s1
//s3 no está contenido en s1