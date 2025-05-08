package Ejercicios;

import java.util.Scanner;

import Dao.CursoDAO;
import Modelo.Curso;

public class Ejercicio38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		int num = 1;
		do {
			System.out.println("Introduce un curso");
			num=CursoDAO.procedimiento(curso);
		}while(num==0);
		
	}

}
