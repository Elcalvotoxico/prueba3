package EJERCICIOS;

public class EXAMENRECUPERSCI�N {

	public static void main(String[] args) {

	}
public static boolean esPrimo(int n){
	for(int i=2;i<n-2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}
