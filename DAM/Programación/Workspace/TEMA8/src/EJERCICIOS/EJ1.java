package EJERCICIOS;

import java.util.ArrayList;
import java.util.List;

public class EJ1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		// A�adimos 10 Elementos en el ArrayList
		for (int i=1; i<=5; i++){
		lista.add(i*3); 
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista);
		
		// A�adimos un nuevo elemento al ArrayList en la posici�n 2
		lista.add(2, 10);
		System.out.println(lista);
		//borramos el elemento de la posici�n 3
		lista.remove(3);
		System.err.println(lista);
		//modificamos el elemento de la posici�n 4
		lista.set(4, 25);
		System.out.println(lista);
		for (Integer elemento : lista) {
			System.out.println(elemento);
		}
		//limpiamos la lista
		lista.clear();

	}

	}

