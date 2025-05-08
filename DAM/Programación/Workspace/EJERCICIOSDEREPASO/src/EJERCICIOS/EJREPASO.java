package EJERCICIOS;

import java.util.Scanner;

public class EJREPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("1. Contar pares");
			System.out.println("2. Suma de numeros");
			System.out.println("3. Mas cerca del cero");
			System.out.println("4. Media armonica");
			System.out.println("5. Suma de divisores");
			int n = dimeEntero("Introduce una opcion", sc);
		switch(n) {
		case 1: 
			contarPares();
		case 2: 
			sumaNumeros();
		case 3:
			cercaCero();	
		case 4:
			mediaArmonica();
		case 5:
			sumaDivisores();
		}
		}while(opcion != 0);
	}
	public static void sumaDivisores() {
		Scanner sc = new Scanner(System.in);
		int numero = dimeEntero("Introduce un numero", sc);
		int suma = 0;
		int contador = 0;
		for(int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				suma = suma  + i;
				System.out.println(suma);

			}
		}
	}
	public static double mediaArmonica() {
		Scanner sc = new Scanner(System.in);
		int numero = dimeEntero("Introduce un numero", sc);
		int numero1 = dimeEntero("Introduce un numero", sc);
		double media = 2.0 * (numero * numero1) / (numero + numero1);
		System.out.println("La media armonica de" + " " + numero + " " + "y" + " " + numero1 + " " + "=" + " " + media);
		return media;
	}
	
	public static int cercaCero() {
		Scanner sc = new Scanner(System.in);
		int numero = dimeEntero("Introduce un numero", sc);
		int numero1 = dimeEntero("Introduce un numero", sc);
		int distancia1 =  Math.abs(numero);
		int distancia2 =  Math.abs(numero1);
		if(distancia1 < distancia2) {
			System.out.println("El primer numero esta mas cerca del cero");
		}else {
			System.out.println("El segundo numero esta mas cerca del cero");
		}
		 return Math.max(numero1, numero1);
	}
	public static int sumaNumeros() {
		Scanner sc = new Scanner(System.in);
		int numero = dimeEntero("Introduce un numero", sc);
		int suma = 0;
		for(int i = 1; i <= numero; i++) {
			suma = suma + i;
		}
		System.out.println("la suma de los numeros es:" + suma);
		return suma;
	}
	public static int contarPares() {
		Scanner sc = new Scanner(System.in);
		int numero = dimeEntero("Introduce un numero", sc);
		int contador = 0;
		for(int i = 1; i <= numero; i++) {
			if(i % 2 == 0) {
			 contador++;
			}
		}
		System.out.println("Entre el 1 y el numero introducido hay:" + " " + contador + " numeros pares.");
		return contador;
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			}catch(Exception e) {
				System.out.println("Formato incorrecto");
			}
		}while(true);
	}
}
/*1: Crea una función contarPares que reciba como parámetro un número entero positivo y
devuelve un entero indicando cuántos números pares existen entre 1 y ese número, incluido*/
/*2: Crea una función sumaNumeros que le pasamos un número entero positivo como
parámetro y devuelve un entero con la suma de los números del 1 a ese número, incluido*/
/*3: una función cercaCero que le pasamos dos números enteros como parámetro y devuelve
el número más cercano a 0. Si ambos números están a la misma distancia de cero, devuelve el
mayor de los dos*/
/*5: Crea una función mediaArmonica que le pasamos dos números enteros positivos como
parámetro y devuelve su media armónica. La media armónica de dos números a y b se calcula
como 2 * a * b / (a + b).*/
/*6. Crea una función sumaDivisores que le pasamos un número entero positivo como
parámetro y devuelve la suma de todos sus divisores (excluyendo el propio número).*/
