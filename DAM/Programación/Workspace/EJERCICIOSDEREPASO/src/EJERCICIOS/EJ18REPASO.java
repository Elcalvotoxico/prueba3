package EJERCICIOS;

import java.util.ArrayList;
import java.util.List;

import clases1.Alumno1;
import clases1.Persona1;
import clases1.Profesor1;

public class EJ18REPASO {

	public static void main(String[] args) {
		Alumno1 alumno = new Alumno1();
		Profesor1 profesor = new Profesor1();
		List<Persona1> personas = new ArrayList<Persona1>();
		alumno.pasaDeCurso();
		System.out.println(alumno.getCurso());
		alumno.cambiarAltura();
		System.out.println(alumno.getAltura());
		profesor.cobraSueldo(500);
		System.out.println(profesor.getCuentaBancaria());
		profesor.cambiarAltura();
		System.out.println(profesor.getAltura());
		System.out.println(alumno);
		System.out.println(profesor);
		personas.add(profesor);
		personas.add(alumno);
	}

}
