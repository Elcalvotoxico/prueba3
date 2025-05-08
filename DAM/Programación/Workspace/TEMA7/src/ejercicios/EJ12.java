package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano = Funciones.dimeEntero("introduce el tamaño del array",sc);
		
		int[] array = array(tamano);
		
		for (int i = 0; i < array.length; i++) {
			 System.out.print("elemento " + i + ", "+ array[i]);
			 if(i != array.length-1)
				 System.out.print(", ");
			}
		
		
		
		
	}
	public static int[] array(int tamano) {
		Random r = new Random();
		int[] array = new int[tamano];
		
		for (int i = 0; i < array.length; i++) {
			 array[i]=r.nextInt(0,10);
			}
		
		
		return array;
	}

}
