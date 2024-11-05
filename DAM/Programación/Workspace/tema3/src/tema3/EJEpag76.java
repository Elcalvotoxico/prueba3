package tema3;

import java.util.Scanner;

public class EJEpag76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un mes (1-12): ");
        
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        int año = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mes no válido. Debe estar entre 1 y 12.");
        } else if (mes % 2 != 0) {
            System.out.println("Los meses impares no son válidos.");
        } else {
            System.out.println("Mes válido: " + mes);
        }
        if (dia < 0 || dia > 30) {
            System.out.println("Día no válido. Debe ser del 1 al 30.");
        } else if (dia % 2 == 0) {
            System.out.println("Los días pares no son válidos.");
        } else {
            System.out.println("Dia válido: " + dia);
        }
        if (año < 2000 || dia > 2024) {
            System.out.println("Año no válido. Debe ser del 2000 al 2024.");
        } else if (año % 2 == 0) {
            System.out.println("Los años pares no son válidos.");
        } else {
            System.out.println("Año válido: " + año);
        }
    }
}
