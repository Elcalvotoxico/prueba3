package EJERCICIOS;

import java.util.Random;
import java.util.Scanner;

public class EJ8REPASO {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = dimeEntero("Intrododuce un numero", sc);
		switch(n){
		case 1: 
			muestraDe2En2();
			break;
		case 2:
			muestrade5En5();
			break;
		case 3:
			divisiblesEntre2Y3();
			break;
		case 4: 
			sumaDeUno();
			break;
		case 5:
			sumaHastaMenos1();
			break;
		case 6:
			menoresMayoresIguales();
		case 7:
			numerosAleatorios();
		case 8:
			numeroPrimo();
		case 0: 
			break;
		}
		
	}
	public static void numeroPrimo() {
		Scanner sc = new Scanner(System.in);
		int num = dimeEntero("Introduce un numero", sc);
		boolean esPrimo = true;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(num % i != 0) {
				esPrimo = false;
				System.out.println("Es un numero primo");
				break;
			}else {
				System.out.println("No es un numero primo");
			}
		}
	}
	public static void numerosAleatorios() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int numeroRandom = r.nextInt(1,41);
		for(int intentos = 10; intentos >= 0; intentos--) {
			int n = dimeEntero("Introduce un numero", sc);
			if( n < numeroRandom) {
				System.out.println("El numero introducido es menor al numero aleatorio");
				System.out.println("Te quedan" + " " + intentos + " " + "intentos");
			}
			if(n > numeroRandom) {
				System.out.println("El numero introducido es mayor al numero aleatorio");
				System.out.println("Te quedan" + " " + intentos + " " + "intentos");

			}
			if(n == numeroRandom) {
				System.out.println("El numero introducido es igual al numero aleatorio");
				System.out.println("Te han sobrado" + " " + intentos);
			}
			if(intentos == 0) {
			System.out.println("El numero aleatorio era" + " " + numeroRandom);
			}
		}
	}
	public static void menoresMayoresIguales() {
		Scanner sc = new Scanner(System.in);
		int menores = 0;
		int mayores = 0;
		int iguales = 0;
		for(int i = 0; i <=4; i++) {
			int numeros = dimeEntero("Introduce un numero", sc);
			int contador = numeros;
			System.out.println(contador);
			if(numeros < 0) {
				menores++;
			}else if(numeros > 0) {
				mayores++;
			}else if(numeros == 0) {
				iguales++;
			}
		}
		System.out.println("Estos numeros introducidos son menores a cero" + " " + menores);
		System.out.println("Estos numeros son mayores a cero" + " " + mayores);
		System.out.println("Estos numeros son iguales a cero" + " " + iguales);
	}
	public static void sumaImpares() {
		Scanner sc = new Scanner(System.in);
		int numero1 = dimeEntero("Introduce un numero", sc);
		int numero2 = dimeEntero("Introduce un numero", sc);
		int suma = 0;
		 int inicio = Math.min(numero1, numero2);
	     int fin = Math.max(numero1, numero2);
		for(int i = inicio; i <= fin ;i++){
			if(i % 2 != 0) {
				suma += i;

			}
		}
		System.out.println("La suma de los números impares entre " + inicio + " y " + fin + " es: " + suma);
	}
	public static void sumaHastaMenos1(){
		Scanner sc = new Scanner(System.in);
		int numero;
		int suma = 0;
		int contador = 0;

		while(true) {
			numero = dimeEntero("Introduce números. Para terminar, introduce -1.", sc);
			if(numero == -1) {
				break;
			}
			suma += numero;
			contador++;
		}
		System.out.println("Has introducido " + contador + " " + "numeros.");
		System.out.println("La suma de los numeros es:" + suma);
	}
	public static void sumaDeUno() {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int n = dimeEntero("Introduce un numero", sc);
		for(int i = 1; i < n; i++) {
		 suma = +i;
	        System.out.println(n + " - " + suma);
		}
	}
	public static void divisiblesEntre2Y3() {
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				int n = i;
				System.out.println(n);
			}
		}
	}
	public static void muestrade5En5() {
		int i = 0;
		while(i < 20) {
			int n = i * 5 + 5;
			i++; 
			System.out.println(n);
		}
	}
	public static void muestraDe2En2() {
		for(int i = 0; i <= 50; i++) {
			int n = i * 2; 
			System.out.println(n);
		}
		
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			}catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		}while (true);
	}

}
//1. Mostrar del 0 al 100 de 2 en 2 usando un bucle for
//2. Mostrar del 0 al 100 de 5 en 5 usando un bucle while
//3. Mostrar del 1 al 100 y que sean divisibles entre 2 y 3 (ambos)
/*4. Preguntar por teclado un número y realizar la suma desde el 1 a ese número, este
número debe ser mayor que 1. Por ejemplo, si introduce 5, sumaréis 1+2+3+4+5=15 y
mostraréis 5 – 15; (Preguntar como hacer para que muestre solo por pantalla el numero introducido por consola y la suma total de la distancia que hay desde el 1 hasta el numero introducido).*/
/*5. Crea en el que vayamos insertando números hasta que insertemos un -1. Al acabar
mostrar el número de números introducidos y la suma de todos los números
introducidos*/
/*6. Crea un programa que le pregunte al usuario dos números. Al acabar el programa
debe mostrar la suma de los números impares entre esos dos números.*/
/*7. Crea un programa que le pregunte al usuario cuantos números quiere introducir. El
programa le irá pidiendo números indicando el contador. Al acabar mostrará cuántos
números introducidos son mayores que 0, menores que 0 e iguales a 0*/
/*8. Crea una aplicación que permita adivinar un número. La aplicación genera un número
aleatorio del 1 al 40. A continuación, va pidiendo números y va respondiendo si el
número a adivinar es mayor o menor que el introducido, además de los intentos que
te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta
el número (además te dice en cuantos intentos lo has acertado), si se llega al límite de
intentos te muestra el número que había generado y te dice que has perdido.*/
//9. Crea un programa que muestre si un número introducido por teclado es primo o no. (Preguntar en clase si asi estaria bien el numero primo).
