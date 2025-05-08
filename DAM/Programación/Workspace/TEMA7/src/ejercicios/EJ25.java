package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EJ25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Random r = new Random();
		int[] array = new int[20];
		int numero;
		for (int i = 0; i < array.length; i++) {
			int n = r.nextInt(1, 50);
			if (esta(array, n)) {
				i--;
			} else {
				array[i] = n;
			}
		}
		/*for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}*/
		//menu
		do {
			System.out.println("1. Buscar número");
			System.out.println("2. Calcular media");
			System.out.println("3. Mostrar pares");
			System.out.println("4. Buscar 3 mayores");
			System.out.println("5. Devolver primos");
			System.out.println("6. Salir");
			numero = dimeEntero("Introduce una opcion", sc);
			switch(numero) {
			case 1:
				System.out.println(esta(array, numero));
				break;
			case 2:
				calcularMedia(array);
				break;
			case 3:
				mostrarPares(array);
				break;
			case 4:
				System.out.println();
				break;
			case 5: 
				System.out.println();
				break;
			case 6:
				break;
			}
		}while(numero!=6);
	}

	public static boolean esta(int[] array2, int n) {
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == n) {
				return true;
			}
		}
		return false;
	}
	public static void calcularMedia(int [] array3) {
		int cont = 0;
		for(int i = 0; i < array3.length; i++ ) {
			cont = array3[i] + cont;
		}
		int media = cont / array3.length;
		System.out.println(media);
	}
	public static void mostrarPares(int [] array4) {
		boolean hayPar = false;
		for (int i = 0; i < array4.length; i++) {
			if(array4[i]%2==0) {
				System.out.println(array4[i]);
				hayPar = true;
			}
		}
		if(hayPar == false) {
			System.out.println("No hay ningun numero par");
		}
	}
	public static int[] buscarLos3MasGrande(int [] array5) {
		Scanner sc = new Scanner(System.in);
		int [] guardarNumeros = [3];
		int numero = sc.nextInt();
		for (int i = 0; i < array5.length; i++) {
			if(numero < array5[i]) {
				
			}
		}
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

/*
 * Rellena un array con 20 números aleatorios del 1 al 50 sin repetir Muestra un
 * menú con las siguientes opciones: 1 - Buscar número: lo pediréis por consola
 * e indicaréis si está o no 2 – Calcular media: muestra la media por consola 3
 * – Mostrar pares: muestra por consola los números pares 4 – Buscar 3 mayores:
 * llama a una función que pida un número por consola y devuelva un array con
 * los 3 primeros número del array mayores que él. Si no hay 3 los dejará a
 * valor 0. Muestra los números de ese array separados por espacios 5 – Devolver
 * primos: llama a una función que mostrará por consola los números primos que
 * tenga el array 6 – Salir El programa ejecutará la opción elegida y volverá a
 * mostrar el menú Terminará cuando elijan la opción 6 Usa funciones
 */
