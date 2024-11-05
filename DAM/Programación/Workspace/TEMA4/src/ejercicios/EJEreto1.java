package ejercicios;

public class EJEreto1 {

	public static void main(String[] args) {
	}
	public static  int multiplicar(int n1, int n2) {
		return n1 * n2; 
	}
	public static int division(int n1, int n2) {
		if(n2==0) {
			System.out.println("no es posible realizar la operación");
			return -1;
		}
		return n1 / n2;
	}
	public static boolean esPositivo(int n1) {
		if(n1>0) {
			return true;
		}else {
			return false;
		}
}
	public static boolean esNegativo(int n1) {
		if(n1<0) {
			return true;
		}else {
			return false;
		}
}
}
