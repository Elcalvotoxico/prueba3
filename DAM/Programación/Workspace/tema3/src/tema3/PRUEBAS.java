package tema3;

import java.util.Scanner;

public class PRUEBAS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valido=false;
		int numero =0;
		while(!valido){
			System.out.println("introduce un número entero");
			try {
				numero=sc.nextInt();
				valido=true;
			}
			catch(Exception e)
			{System.out.println("porfavor introduce un número correcto");
			sc.next();
		}
		}
		int cont = numero + 1;
		while (true) {
			boolean primo = true;
			for (int i = 2; i < cont; i++) {
				if (cont % i == 0) {
					primo = false;
					break;

				}

			}
			if (primo) {
				break;
			}
			cont++;
		}
		
		System.out.println("el siguiente número primo es" +" " +  cont);
		sc.close();

	}
}
