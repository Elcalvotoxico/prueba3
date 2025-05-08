package ejercicios;

public class EJ1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			 array[i]=i+10;
			}
		
		System.err.println(array);
		
		for (int i = 0; i < array.length; i++) {
			 System.out.println("elemento " + i + " " + array[i]);
			}

 	}

}
