package tema2;

import java.util.Random;

public class EJE41 {
//ejercico 48 del powerpoint tema 2
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt();
		System.out.println(r.nextInt(0,12));
		System.out.println(r.nextInt(50,86));
		System.out.println(r.nextInt(-10,0));
		System.out.println(r.nextDouble(0,1));
		System.out.println(r.nextDouble(10,31));

	}

}
