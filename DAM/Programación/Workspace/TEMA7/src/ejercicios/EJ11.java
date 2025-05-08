package ejercicios;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funciones.dimeEntero("introduce un nuemero",sc);
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			 array[i]=Funciones.dimeEntero("introduce un nuemero",sc);

			}
				
		for (int i = 0; i < array.length; i++) {
			 System.out.println("elemento " + i + " " + array[i]);
			}
	}

}
