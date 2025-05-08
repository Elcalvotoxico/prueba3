package EJERCICIOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EJE29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		List<Integer> listaN = new ArrayList<Integer>();
		List<Integer> listaP = new ArrayList<Integer>();
		int numeroAleatorio = 0;
		for (int i = 0; i < 100; i++) {
			numeroAleatorio = r.nextInt(-25,26);
			if(numeroAleatorio < 0) {
				listaN.add(i);
			}else {
				listaP.add(i);
			}
		}
		int numero;
		do {
			System.out.println("1. Muestra las dos listas");
			System.out.println("2. Indica cual tiene mas numero pares");
			System.out.println("3. Pide un numero y si esta en alguna lista mostrara cuántas veces, si no está en ninguna mostrara “No está”.");
			System.out.println("4. Salir");
			numero = Funciones.dimeEntero("Introduce una opcion", sc);
			switch(numero) {
			case 1:
				System.out.println(listaN);
				System.out.println(listaP);
				break;
			case 2:
			int n = esPares(listaN);
			int p = esPares(listaP);
			if(n > p) {
				System.out.println("La lista N tiene mas numeros pares");
			}else if(p < n) {
				System.out.println("La lista P tiene mas numero pares");
			}else {
				System.out.println("Las listas contienen los mismos numeros pares");
			}
				break;
			case 3:
			System.out.println("Introduce un numero");
			int numero2 = sc.nextInt();
			for (int i = 0; i < numero2; i++) {
				
			}
				break;
			case 4:
				break;
			}
		}while(numero!=6);

	}
	public static int esPares(List<Integer> lista){
		int cont = 0;
		for (int i = 0; i < lista.size(); i++) {
		if(lista.get(i) % 2 == 0) {
			cont++;
		}
	}
		return cont;
	}
}
/*Genera 100 nº aleatorios entre -25 y 25
Guarda los negativos en una lista y los positivos en otra
El 0 es positivo
Muestra el menú:
1-Mostrar las dos listas
2-Indicar cuál tiene más números pares
3-Pedir un nº:  si está en alguna lista mostrar cuántas veces, si no está en ninguna mostrar “No está”.
4-Salir
Repetir el menú hasta que el usuario indique salir.

No repetir código, usar funciones*/
