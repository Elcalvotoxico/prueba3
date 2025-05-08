package ejercicios;

import java.util.Scanner;

import clases.Persona;

public class EJ26 {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Scanner sc = new Scanner(System.in);
		Funciones.dimeEntero("Introduce tu fecha de cumple anios", null);
		if(p1.CumpleAnios()) {
		System.out.println("Felicidades " + p1.getNombre());
		}
	}
}
