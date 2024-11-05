package tema3;

import java.util.Scanner;

public class EJEpag77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do
		{
			try
			{
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				if (n > 9) {
                    System.out.println("Introduce un nº correcto (9 o menor)");
                } else
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
			
		}while(true);

		


			int n1= n;
			for (int i = 1; i <= 9; i++) {
				System.out.println(n1 + "x" + i + "=" + (n1 * i));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


