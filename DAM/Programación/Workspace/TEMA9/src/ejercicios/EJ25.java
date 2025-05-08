package ejercicios;

import java.util.Scanner;

import clases.Particular;

public class EJ25 {
	public static void main(String[] args){
		Particular p1 = new Particular();
		System.out.println("Introduce un nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		p1.setNombre(nombre);
		p1.setEdad(Funciones.dimeEntero("Introduce edad", sc));
		System.err.println("Introduce un email");
		String email = sc.nextLine();
		p1.setEmail(email);
		System.out.println(p1);
		System.out.println(p1.CalcularSeguro());
	}
}
