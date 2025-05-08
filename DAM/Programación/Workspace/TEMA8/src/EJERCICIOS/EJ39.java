package EJERCICIOS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EJ39 {

	public static void main(String[] args) {
		Map<Integer, String> palabras = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		for (int i = 1; i <= 5; i++) {
			palabras.put(i, "titulo" + " " + i);
		}
		do {
			System.out.println("1. Muestra la lista");
			System.out.println("2. Busca referencia");
			System.out.println("3. Muestra referencias");
			System.out.println("4. Muestra titulo");
			System.out.println("5. Buscar por titulo");
			System.out.println("6. Borrar referencia");
			System.out.println("7. Salir");
			numero = Funciones.dimeEntero("Introduce una opcion", sc);
			switch (numero) {
			case 1:
				mostrarLista(palabras);
				break;
			case 2:
				buscaReferencia(sc, palabras);
				break;
			case 3:
				mostrarReferencia(palabras);
				break;
			case 4:
				mostrarTitulo(palabras);
				break;
			case 5:
				buscarPorTitulo(sc, palabras);
				break;
			case 6:
				borrarReferencia(sc, palabras);
				break;
			case 7:
				break;
			}
		} while (numero != 7);
	}

	public static void mostrarLista(Map<Integer, String> palabras) {
		Iterator<Integer> claves = palabras.keySet().iterator();
		while (claves.hasNext()) {
			Integer clave = claves.next();
			String valor = palabras.get(clave);
			System.out.println(clave + " - " + valor);

		}
	}

	public static void buscaReferencia(Scanner sc, Map<Integer, String> palabras) {
		int clave = Funciones.dimeEntero("Introduce una referencia", sc);
		if (palabras.containsKey(clave)) {
			System.out.println(palabras.get(clave));
		} else {
			System.out.println("Referencia no encontrada");
		}
	}

	public static void mostrarReferencia(Map<Integer, String> palabras) {
		System.out.println(palabras.keySet());
	}

	public static void mostrarTitulo(Map<Integer, String> palabras) {
		System.out.println(palabras.values());
	}

	public static void buscarPorTitulo(Scanner sc, Map<Integer, String> palabras) {
		System.out.println("Introduce un titulo");
		String titulo = sc.nextLine();
		int clave;
		String valor;
		if (palabras.containsValue(titulo)) {
			System.out.println(palabras.get(titulo));
			Iterator<Integer> claves = palabras.keySet().iterator();
			while (claves.hasNext()) {
				clave = claves.next();
				valor = palabras.get(clave);

				if (titulo.equalsIgnoreCase(valor)) {
					System.out.println(clave);
				}
			}
		} else {
			System.out.println("Titulo no encontrado");
		}
	}
	public static void borrarReferencia(Scanner sc, Map<Integer, String> palabras){
		int clave = Funciones.dimeEntero("Introduce una referencia", sc);
		if (palabras.containsKey(clave)) {
			palabras.remove(clave);
		}
	}
}
/*
 * Rellena un Hashmap con 5 elementos fijos Cada elemento estará compuesto por
 * una referencia (será la clave) y el título del libro (será el valor) La
 * referencia es numérica y el título String (1 – Titulo 1, 2 – Titulo 2,…)
 * Muestra el siguiente menú: 1 – Mostrar lista: muestra la lista de títulos con
 * su referencia 2 – Buscar referencia: pides una referencia por consola y
 * buscas si está en el map. Si está muestras el título, si no está muestras
 * “Referencia no encontrada” 3 – Mostrar referencias: muestra sólo las
 * referencias 4 – Mostrar título: muestra sólo los títulos 5 – Salir Ve
 * repitiendo el menú hasta que el usuario elija Salir
 */
