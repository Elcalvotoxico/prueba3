package Ejercicio;

import java.util.Scanner;

import Clases.Funciones;

public class Ej1 {

	public static void main(String[] args) {
		
		try {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa un número decimal (ejemplo: 12.5): ");
	        String entrada = scanner.nextLine();
	        double numero =Double.parseDouble(entrada); 
	        System.out.println("El número ingresado es: " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Numero erroneo");
		
		} catch (Exception e) {
			System.out.println("Error desconocido: " + e.getMessage());
		}


	}
}
