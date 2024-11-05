package tema3;
import java.util.Scanner;
public class EJEpag52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		System.out.println("introduce un número");
		
		String s = sc.nextLine();
		int n1 = Integer.parseInt(s);
		
		
		for(int i=1;i<=n1;i++) {
			System.out.println();
			for(int j=n1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int n=1;n<=i;n++) {
				System.out.print("*");
			}
			for(int n2=1;n2<=i;n2++) {
				System.out.print("*");
			}
		}
		sc.close();
	}
}
