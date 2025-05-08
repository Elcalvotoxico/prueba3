package EJERCICIOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EJ28 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			lista.add(r.nextInt(101));
		}
		boolean primo = false;
		 Iterator<Integer> iterator = lista.iterator();
	        while (iterator.hasNext()) {	
	            int numero = iterator.next();
	            if(esPrimo(numero)) {
			iterator.remove();	
			primo = true;
	            }
	        }
	        if(primo) {
	        	System.out.println(lista);
	        }
	        else {
            	System.out.println("La lista no tenía números primos");
            }

	}
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

}
/*Rellena una lista con 25 números aleatorios del 1 al 100
Muéstralos todos
Borra los números primos
Si no había primos, escribe por consola: “La lista no tenía números primos”, si tenía primos, muestra otra vez la lista
Para probar la parte de que no tenga primos, reduce el tamaño de la lista a 3 números o rellénala con números fijos

Ejemplo de salida:
37, 36, 35, 39, 15, 14, 62, 7, 45, 1, 50, 68, 4, 42, 69, 99, 95, 51, 85, 75, 28, 33, 90, 2, 97
36, 35, 39, 15, 14, 62, 45, 50, 68, 4, 42, 69, 99, 95, 51, 85, 75, 28, 33, 90*/
