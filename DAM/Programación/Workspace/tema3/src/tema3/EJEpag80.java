package tema3;
import java.util.Scanner;

public class EJEpag80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un n�mero");

		
		int n=0;
		do
		{
			try
			{
				System.out.println("Introduce un n�");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				if (n > 6) {
                    System.out.println("Introduce un n� correcto (6 o menor)");
                } else
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un n� correcto");
			}
			
		}while(true);
		
		long suma= 1;
		for(int i=2;i<=n;i++)	
		{
			suma=suma*i;
			
		}

		System.out.println(suma);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
