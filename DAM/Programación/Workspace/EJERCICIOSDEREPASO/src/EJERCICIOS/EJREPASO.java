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
/*1: Crea una funci�n contarPares que reciba como par�metro un n�mero entero positivo y
devuelve un entero indicando cu�ntos n�meros pares existen entre 1 y ese n�mero, incluido*/
/*2: Crea una funci�n sumaNumeros que le pasamos un n�mero entero positivo como
par�metro y devuelve un entero con la suma de los n�meros del 1 a ese n�mero, incluido*/
/*3: una funci�n cercaCero que le pasamos dos n�meros enteros como par�metro y devuelve
el n�mero m�s cercano a 0. Si ambos n�meros est�n a la misma distancia de cero, devuelve el
mayor de los dos*/
/*5: Crea una funci�n mediaArmonica que le pasamos dos n�meros enteros positivos como
par�metro y devuelve su media arm�nica. La media arm�nica de dos n�meros a y b se calcula
como 2 * a * b / (a + b).*/
/*6. Crea una funci�n sumaDivisores que le pasamos un n�mero entero positivo como
par�metro y devuelve la suma de todos sus divisores (excluyendo el propio n�mero).*/
