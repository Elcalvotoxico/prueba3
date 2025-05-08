package EJERCICIOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EJ24 {

	public static void main(String[] args) {
		//creo la lista con los numeros random
		Random r = new Random();
		int [] numerosAleatorios = new int [20];
		//se introduce al array numero random desde el 0 al 100
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = r.nextInt(101);
		}
		//aqui llamo a la funcion del arraylist
		List<Integer> lista = Lista(numerosAleatorios);
		//aqui llamo a otras funciones qube lo que hacen es mostrar el array y el arraylist
		clasesComunes.muestraArray(numerosAleatorios);
		clasesComunes.muestraListaInt(lista);
		
		
 	}
	//esta es la funcion que mete al arraylist los numeros pares 
	public static List<Integer> Lista (int[] array){
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				lista.add(array[i]);
			}
		}
		return lista;
	}

}
/*Crea un programa en el que rellenas un array de 20 números aleatorios, entre 0 a 100
Llama a una función que te devolverá una lista con los números pares de ese array
Recibe el array y devuelve una lista
Muestra el array y la lista, mostrando en ambos sus números separados por comas sin mostrar la última coma

Ejemplo salida:
100, 55, 48, 90, 23, 97, 25, 38, 45, 36, 16, 22, 6, 29, 64, 22, 17, 24, 87, 19
100, 48, 90, 38, 36, 16, 22, 6, 64, 22, 24*/
