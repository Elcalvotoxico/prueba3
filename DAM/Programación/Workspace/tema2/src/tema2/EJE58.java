package tema2;
import java.util.Scanner;
public class EJE58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Coste del producto");

		String s = sc.nextLine();

		double n=Double.parseDouble(s);

		

		System.out.println("Porcentaje de Beneficio");

		String s1= sc.nextLine();

		double n1=Double.parseDouble(s1);

		double n2= ((n*n1)/100); 

		

		System.out.println("Costo");

		System.out.println(n+n2);

		

		System.out.println("IVA");

		double n3= (n+n2);

		System.out.println((n3*0.21)+n3);
	}

}
