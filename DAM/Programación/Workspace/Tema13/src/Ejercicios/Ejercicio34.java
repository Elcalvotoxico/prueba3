package Ejercicios;

import java.util.Scanner;

import Dao.ProfesorDAO;
import Modelo.Profesor;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Introduce un nombre de profesor");
		String profesor = sc.nextLine();
		Profesor profesor1 = new Profesor();
		ProfesorDAO.delete2(profesor1);
	}

}
