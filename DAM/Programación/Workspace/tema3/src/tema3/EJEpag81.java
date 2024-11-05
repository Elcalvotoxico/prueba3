package tema3;
import java.util.Random;
import java.util.Scanner;
public class EJEpag81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("introduce un número");
		String s = sc.nextLine();
		int n= 0;
		n=Integer.parseInt(s);
		System.out.println("introduce un número");
		int n1=0;
		int nr=0;
		s = sc.nextLine();
		n1=Integer.parseInt(s);
		
		int max = Math.max(n, n1);
		int min = Math.min(n, n1);
			
		if(n%2==0 && n1%2==0) {	
			
			for (int i=min+2; i<max; i=i+2) {
				System.out.println(i);
	
			}
		}
		
		else {
			for(int j=10;j>=1;j--){
				nr=r.nextInt(min,max);
				System.out.println(nr);
			}
		}
	}

}
