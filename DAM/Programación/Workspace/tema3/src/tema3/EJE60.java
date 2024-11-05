package tema3;

import java.util.Random;

public class EJE60 {

	public static void main(String[] args) {
		Random r = new Random();
		int v1 = r.nextInt(1,11);
		System.out.println("V1="+v1);

		int v2 = r.nextInt(1,11);
		System.out.println("V2="+v2);

		
		if(v1>v2) {
			System.out.println(v1 + " es mayor que " + v2);
		}
		else if (v2>v1){
			System.out.println(v1 + " no es mayor que " + v2);
			
		}
		else {
			System.out.println(v1 + " es igual a " + v2);
			
		}
	}

}
