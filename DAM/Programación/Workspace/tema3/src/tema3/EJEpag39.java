package tema3;
import java.util.Scanner;
public class EJEpag39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			String s=sc.nextLine();
			n=Integer.parseInt(s);
		}
		System.out.println(n);
	}
}
