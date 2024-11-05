package tema3;
import java.util.Scanner;

public class EJE61 {

	public static void main(String[] args) {
		System.out.println("número");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int numero = Integer.parseInt(s);
		
		System.out.println("edad");
		String n = sc.nextLine();
		int edad = Integer.parseInt(n);
		
		if(numero>100|| edad==18) {
			System.out.println("correcto");
	
		}
		else if(numero<100|| edad>18) {
			System.out.println("incorecto");

		}


	}

}
