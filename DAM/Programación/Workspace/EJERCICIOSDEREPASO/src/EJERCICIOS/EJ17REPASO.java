package EJERCICIOS;

import java.time.LocalDate;
import java.util.Random;

import clases1.Alumno;
import clases1.Persona;
import clases1.Profesor;

public class EJ17REPASO {

	public static void main(String[] args) {
		LocalDate aleatorio = LocalDate.of(2005, 05, 15);
		Persona padre1 = new Persona(); 
		padre1.setFechaNacimiento(aleatorio);
		System.out.println(padre1.calculaEdad());
		Alumno alumno1 = new Alumno("Carlos", "Calvo", 123456, aleatorio, 1.84, 12345, 1, "Instituto");
		System.out.println(alumno1);
		Profesor profesor1 = new Profesor("Carlos", "Calvo", 123456, aleatorio, 1.84, 123456,
				1050.00, 4000.00);
		System.out.println(profesor1);

	}

}
