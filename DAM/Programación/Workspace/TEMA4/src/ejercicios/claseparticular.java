package ejercicios;

import java.util.Scanner;

public class claseparticular {

	public static void main(String[] args) {
		System.out.println(suma());
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
	}
	public static int suma() {
		int i=0;
		int cont=0;
		for(i=0;i<=10;i++){
			System.out.print(cont);
			cont=cont+i;
		}
		return cont;
	}

}
