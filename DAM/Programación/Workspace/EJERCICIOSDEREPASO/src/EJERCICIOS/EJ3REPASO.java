package EJERCICIOS;

import java.util.Scanner;

public class EJ3REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5;
		int n = 0; 
		int factorial = 1;
		int anterior = 0;
		int multiplicacion = 1;
	     do{
	    	num = dimeEntero("Introduce numeros", sc);
	    	System.out.print("Los divisores de X son: ");
	    	if(num < 8) {
	    		for(int i = 1; i <= num; i++) {
	    			factorial = factorial * i;
	    		}
	    	}
	    	System.out.println("Factorial de " + num + " es: " + factorial);
	    	if(num<anterior) {
	    		for(int i = num; i <= anterior; i++) {
	    			multiplicacion= multiplicacion * i;
	    			
	    			
	    		}
	    		System.out.println(multiplicacion);
	    	}
	    	anterior = num;
	    	for (int i = 1; i <= num; i++) {
	    		if(num % i == 0) {
	    			
	    			if (i != num) {
	    				System.out.print(i);
						System.out.print(", ");
					}
	    		}
	    	}
	    	System.out.println();
	    }while(num % 7 != 0);
	     

	    System.out.println("fin");  
	}
	
	
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}

		} while (true);
	}
	

}
//Ve pidiendo números por consola hasta meter uno divisible por 7. De cada uno muestra sus
//divisores, escribiendo en una línea: Los divisores de X son: X, X, X
//Si el número que pides es menor que el anterior y menor de 8, muestra su factorial.
//Si es mayor que el anterior, calcula la multiplicación de los números que van del anterior a ese
//número, ambos incluidos, y muestra el valor por consola.
