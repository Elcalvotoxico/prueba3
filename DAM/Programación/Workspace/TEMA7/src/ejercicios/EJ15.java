package ejercicios;

import java.time.LocalDate;
import java.util.Random;

public class EJ15 {

	public static void main(String[] args) {
		int[] array = new int [50];	
		numerosAleatorios(array);
		for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i]);
			 if(i != array.length-1)
				 System.out.print(", ");
			}
		mayorOMenor(array);
		}
	public static void numerosAleatorios(int [] array) {
		Random r = new Random();
		for(int i= 0; i<array.length; i++) {
			array[i] = r.nextInt(10,51);
		}
	}
	public static void mayorOMenor(int [] array) {
		int mayor = 0;
		int menor = 51;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] >mayor) {
			mayor=array[i]  ;
			}
			if( array[i]<menor) {
			menor = array[i]  ;
			}
			sum += array[i];

		}
		
		System.out.println();
		System.out.println("el mayor es" + " " + mayor);
		System.out.println("el menor es" + " " + menor);
		System.out.println("la media es" + " " + (double)sum/array.length);
	
	}
}

