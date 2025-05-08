package ejercicios;

import java.util.Scanner;

import clases.Particular2;

public class EJ29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String email;
		int edad;
		do {
			System.out.println("Añade tu nombre");
			nombre = sc.nextLine();
		} while (nombre.length() == 0);
		do {
			System.out.println("Añade tue email");
			email = sc.nextLine();
		} while (!email.contains("@") || !email.contains("."));
		do {
			System.out.println("Añade tu edad");
			edad = sc.nextInt();
		} while (edad < 0);
		Particular2 objeto = new Particular2(nombre, edad, email);
		String telefono;
		do {
			System.out.println("Añade todos los telefono que quieras");
			telefono = sc.nextLine();
			if (telefono.length() == 9) {
				objeto.anadirTelefono(telefono);
			}

		} while (!telefono.equals("fin"));

		System.out.println(objeto.calcularSeguro());
		System.out.println(objeto);
	}
}
