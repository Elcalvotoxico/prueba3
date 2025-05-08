package Ramas01;

import java.util.Scanner;

import Ejercicios.Ej25_22;
import Ejercicios.Funciones1;

public class Ramas01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int opcion = 0;
		do {
			System.out.println("Selecciona la conversion de longitud:");
				System.out.println("1. Agregar nota de un alumno.");
				System.out.println("2. Calcular promedio.");
				System.out.println("2. Mostrar nota más alta.");
				System.out.println("2. Mostrar nota más baja.");
				System.out.println("0. salir");
				
				int num=funciones1.dimeEntero("Opcion", sc);
				switch(num) {
				case 1:
					double millas= Ej25_22.dimeDouble("Escribe la distancia en millas", sc);
					System.out.println(Funciones1.millasKM(millas));
					break;
				case 2:
					double kilometro= Ej25_22.dimeDouble("Escribe la distancia en kilometos", sc);
					System.out.println(Funciones1.kmMillas(kilometro));
					break;
					}
				
			}while (opcion != 0 );
		System.out.println(suma(8));
		System.out.println(resta(9));
	}
	public static int suma(int n1) {
		int suma = 0;
		suma= suma + 1;
		int contador = 0;
		contador++;
		int mayor = 0;
		mayor = Math.max(mayor, n1);
		return mayor;
	}
	public static int resta(int n1) {
		int resta = 0;
		resta = resta - 1;
		int contador = 0;
		contador--;
		int mayor = 0;
		mayor = Math.max(mayor, n1);
		return mayor;
	}


}
