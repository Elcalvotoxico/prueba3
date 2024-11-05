package tema3;
import java.util.Scanner;
public class EJEpag29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero");
		String s = sc.nextLine();
		int n1 = Integer.parseInt(s);
		String v = sc.nextLine();
		int n2 = Integer.parseInt(s);
		int n3 = n1 + n2;
		
		switch(n3) 
		{
		case 10: 
			System.out.println("la suma es pequeña");
			break;
		case 20: 
			System.out.println("la suma es mediana");
			break;
			default:
			System.out.println(" la suma es " + n3);
		}

	
	}

}
