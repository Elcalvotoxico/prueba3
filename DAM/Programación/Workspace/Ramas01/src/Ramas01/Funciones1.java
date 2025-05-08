package Ramas01;

import java.util.Scanner;

public class Funciones1 {
	public static void submenulongitud(Scanner sc){
		int opcion = 0;
		do {
		System.out.println("Selecciona la conversion de longitud:");
			System.out.println("1. Millas a Kilometros");
			System.out.println("2. Kilometros a Millas");
			System.out.println("0. salir");
			
			int num=Ej25_22.dimeEntero("Opcion", sc);
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
	}
	
	public static void submenuPeso(Scanner sc){
		int opcion = 0;
		do {
		System.out.println("Selecciona la conversion de Peso:");
			System.out.println("1. Kilogramos a Libras");
			System.out.println("2. Libras a Kilogramos");
			System.out.println("0. salir");
			
			int num=Ej25_22.dimeEntero("Opcion", sc);
			switch(num) {
			case 1:
				double kilogramos= Ej25_22.dimeDouble("Escribe la distancia en Kilogramos", sc);
				System.out.println(Funciones1.KgLibra(kilogramos));
				break;
			case 2:
				double libras= Ej25_22.dimeDouble("Escribe la distancia en Libras", sc);
				System.out.println(Funciones1.libraKg(libras));
				break;
				}
		}while (opcion != 0 );
	}

	
	public static double millasKM(double millas) {
		return millas * 1.609;
	}

	public static double kmMillas(double km) {
		return km * 0.62137119;
	}

	public static double KgLibra(double kg) {
		return kg * 2.20462262;
	}

	public static double libraKg(double libra) {
		return libra * 0.45359237;

	}
}
