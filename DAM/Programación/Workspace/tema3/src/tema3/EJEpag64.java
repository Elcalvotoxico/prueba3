package tema3;
import java.util.Scanner;
public class EJEpag64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");
		
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		System.out.println("los divisores son");
		
		for(int i= 1; i<=n;i++){
			if (n%i==0) 
			{
			System.out.println(i );
			}
		}
		
				
				

			sc.close();
		}
			
	
}

		
	
		
		
		
		
		
		
		
		
		
	


