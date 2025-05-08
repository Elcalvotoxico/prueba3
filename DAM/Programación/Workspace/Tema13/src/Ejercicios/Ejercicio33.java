package Ejercicios;

import java.util.List;
import java.util.Scanner;

import Dao.AlumnoCursoDAO;
import Dao.ProfesorDAO;
import Modelo.AlumnoCurso;
import Modelo.Profesor;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Introduce un nombre de profesor");
		String profesor = sc.nextLine();
		Profesor profesor1 = new Profesor();
		ProfesorDAO.delete(profesor1);
	}

}
