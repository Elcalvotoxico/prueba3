package tema2;
import java.util.Scanner;
public class EJE55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		

		System.out.println("Introduce el radio de la esfera");

		String s1=sc.nextLine();

		double n=Double.parseDouble(s1);


		double area = 4 * Math.PI * Math.pow(n, 2);

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(n, 3);

        

        System.out.println("area=" + area);

        System.out.println("volumen"+ volumen);

		sc.close();
	}

}
