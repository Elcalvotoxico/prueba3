package EJERCICIOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EJ12REPASO {

	public static void main(String[] args) {
		List<Integer> listas = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		for (int i = 1; i <= 7; i++) {
			listas.add(i);
		}
		do {
			System.out.println("1. Mostrar la suma de todos sus números");
			System.out.println("2. Mostrar cuál es el número mayor y cuál es el menor");
			System.out.println("3. números ordenados de mayor a menor");
			System.out.println("4. Salir");
			numero = dimeEntero("Introduce una opcion", sc);
			switch (numero) {
			case 1:
				sumaDeNumeros(listas);
				break;
			case 2:
				mayoryMenor(listas);
				break;
			case 3:
				Ordenados(listas);
				break;
			case 4: 
				break;
			}
		} while (numero != 4);	
	}
	public static void sumaDeNumeros(List<Integer> listas) {
		int sumaTotal = 0;
		for (int i = 0; i <= listas.size(); i++) {
			sumaTotal += i;
		}
		System.out.println(sumaTotal);
	}
	public static void mayoryMenor(List<Integer> listas) {
		int mayor = listas.size();
		int menor = listas.size();
		for (int i = 0; i < listas.size(); i++) {
			if(i < menor) {
				menor = i;
			}else if(i > mayor) {
				mayor = i;
			}
		}
		System.out.println("Este es el numero menor:" + menor);
		System.out.println("Este es el numero mayor:" + mayor);
	}
	public static List<Integer> Ordenados(List<Integer> listas) {
		List<Integer> listaO = new ArrayList<Integer>();
		int longi = listas.size();
		for (int i = 0; i < longi; i++) {
			int pos = buscaMayor(listas);

			int valor = listas.get(pos);    	
			listaO.add(valor); 						
			listas.remove(pos); 			
  
		}
		System.out.println(listaO);
		return listaO;
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {	try {
			System.out.println(texto);
			String s=sc.nextLine();
			int n = Integer.parseInt(s);
			return n;
			}catch(Exception e) {
			System.out.println("Formato incorrecto");
			}
			
		
		}while(true);
		}
	private static int buscaMenor(List<Integer> listaNumeros) {
		int menor = 51;
		int pos = 0;
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) < menor) {
				menor = listaNumeros.get(i);
				pos = i;
			}

		}
		return pos;
	}
	public static int buscaMayor(List<Integer> listas) {
	    int mayor = listas.get(0); 
	    int pos = 0;

	    for (int i = 1; i < listas.size(); i++) {
	        if (listas.get(i) > mayor) { 
	            mayor = listas.get(i);
	            pos = i;
	        }
	    }

	    return pos; 
	}

}
/*Rellena una lista con 20 números aleatorios del 10 al 50 no repetidos
Mostrar la suma de todos sus números
Mostrar cuál es el número mayor y cuál es el menor
Llamar a una función que te devolverá otra lista con los números ordenados de mayor a menor
Hacerlo a mano
Mostrar ambas listas*/
