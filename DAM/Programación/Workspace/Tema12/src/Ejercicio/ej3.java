package Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        try {
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        System.out.print("Ingresa un índice para obtener el nombre: ");
        int indice = Integer.parseInt(scanner.nextLine());
        System.out.println("El nombre en el índice " + indice + " es: " + nombres.get(indice));
        }
 
        catch (NumberFormatException e) {
        	System.out.println("Numero erroneo");		
		}
    	catch (IndexOutOfBoundsException e) {
    		System.out.println("Cantidad erronea");
    	}
		
        catch (Exception e) {
			System.out.println("Error desconocido:" + e.getMessage());
		}
    }
}
