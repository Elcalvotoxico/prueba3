package Ejercicios;

import java.util.List;
import java.util.Scanner;

import Dao.AlumnoCursoDAO;
import Modelo.AlumnoCurso;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un curso");
		String curso = sc.nextLine();
		List<AlumnoCurso> lista = AlumnoCursoDAO.lista(curso);
		boolean entra = false;
		for(AlumnoCurso c:lista) {
			entra=true;
			System.out.println(c.getAlumno().getNombre()+" "+ c.getAlumno().getApellidos()+" "+ (c.getNotaMedia()<5?"no":"")+" pasa de curso");
		}
	}

}
/*Vamos a pedir por pantalla un curso y mostraremos por pantalla los alumnos matriculados en ese curso y si pasan de curso o no, en ese curso en el a�o activo.
El a�o activo se indica en la tabla anioescolar
Si la nota media es menor de 5 no pasan de curso, si es mayor de 5 s� que pasan
El a�o activo no lo pong�is fijo, buscar cu�l es en la bd
*/