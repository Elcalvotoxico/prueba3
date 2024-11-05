package tema3;

import java.util.Scanner;

public class EJEpag76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un mes (1-12): ");
        
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        int a�o = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mes no v�lido. Debe estar entre 1 y 12.");
        } else if (mes % 2 != 0) {
            System.out.println("Los meses impares no son v�lidos.");
        } else {
            System.out.println("Mes v�lido: " + mes);
        }
        if (dia < 0 || dia > 30) {
            System.out.println("D�a no v�lido. Debe ser del 1 al 30.");
        } else if (dia % 2 == 0) {
            System.out.println("Los d�as pares no son v�lidos.");
        } else {
            System.out.println("Dia v�lido: " + dia);
        }
        if (a�o < 2000 || dia > 2024) {
            System.out.println("A�o no v�lido. Debe ser del 2000 al 2024.");
        } else if (a�o % 2 == 0) {
            System.out.println("Los a�os pares no son v�lidos.");
        } else {
            System.out.println("A�o v�lido: " + a�o);
        }
    }
}
