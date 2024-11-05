package tema3;

import java.util.Scanner;

public class PRUEBAS3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce un número: ");
		 int numero = sc.nextInt();
		 int cont=1;
		 for (int i=1;i<=numero;i++) {
			 if(numero*cont==i);{
			     System.out.println("El número tiene" +" " + i + " " + "dígitos.");
			 }
		 }

	     sc.close();
	}

}
