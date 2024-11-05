package tema2;

import java.util.Scanner;

public class EJE59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("horas trabjadas");
		String s = sc.nextLine();
		double horas =Double.parseDouble(s);

		
		System.out.println("bonus");
		String s1 = sc.nextLine();
		double bonus=Double.parseDouble(s1);
		double n2= ((horas*bonus)/100); 

			double bruto = horas*100;
			double sueldo = bruto -bruto*00.7 - bruto*0.1 - 124 +bonus;
			System.out.println("El sueldo es" + sueldo);

	}

}
