package Ramas01;

public class EJEFUCNIONES {

	public static void main(String[] args) {
		numPositivo(8);
		boolean p=positivo(-8);
		System.out.println(p);
		double area=circuloArea(5.2);
		System.out.println(area);
		int n=mayor4(20,6,10,30);
		System.out.println(n);
		System.out.println(circuloCircunferencia(4));
		imprimir("hola",5);
	}
	public static void imprimir(String texto,int num) {
		for(int i=0; i<num;i++) {
			System.out.println(texto);
		}
	}
	public static int mayor4(int n1, int n2, int n3, int n4) {
		int n5=Math.max(n1, n2);
		int n6=Math.max(n3, n4);
		return Math.max(n5, n6);
	}
	public static double circuloCircunferencia(double radio) {
		if(radio<0) 
		return Math.PI*radio*2;
		return 0;
	}
	public static double circuloArea(double radio) {
		if(radio<0) 
		return Math.PI*radio*radio;
		return 0;
	}
	public static boolean positivo(int num) {
		if(num<0)
			return false;
		else 
			return true;
	}
	public static void numPositivo(int num) {
		if(num<0) {
			System.out.println("negativo");
		}else {
			System.out.println("positivo");
		}
	}
}
