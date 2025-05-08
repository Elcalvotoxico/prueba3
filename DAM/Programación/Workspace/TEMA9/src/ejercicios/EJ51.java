package ejercicios;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Alumno;
import clases.Profesor;
import ejercicios.Funciones;
public class EJ51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r=new Random();
		//pido alumnos
		int nAlumnos = Funciones.dimeEntero("Nº alumnos", sc);
		//pido profes
		int nProfes = Funciones.dimeEntero("Nº profes", sc);
		//genero
		List<Alumno> alumnos = generaAlumnos(nAlumnos, r);
		//genero
		List<Profesor> profesores = generaProfesores(nProfes, r);
		//muestro
		for(Alumno al:alumnos)
		{
			System.out.println(al);
			System.out.println("Edad=" + al.calculaEdad());
		}
		for(Profesor pr:profesores)
		{
			System.out.println(pr);
			System.out.println("Edad=" + pr.calculaEdad());
		}
		sc.close();
	}

	public static List<Alumno> generaAlumnos(int nAlumnos, Random r)
	{
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for(int i=1;i<=nAlumnos;i++)
		{
			Alumno al = new Alumno("nombre"+i, "apellidos"+i, "nif"+i, Funciones. convierteLocalDateToDate(LocalDate.now().minusDays(r.nextInt(3650,20147))), r.nextInt(150, 211),i, r.nextInt(1,7), "estudiosPrevios"+i);
			alumnos.add(al);
		}
		return alumnos;
	}
	
	public static List<Profesor> generaProfesores(int nProfes, Random r)
	{
		List<Profesor> profesores = new ArrayList<Profesor>();
		for(int i=1;i<=nProfes;i++)
		{
			Profesor pr = new Profesor("nombre"+i, "apellidos"+i, "nif"+i, Funciones. convierteLocalDateToDate(LocalDate.now().minusDays(r.nextInt(3650,20147))), r.nextInt(150, 211), r.nextDouble(1000,2500),r.nextDouble(100,10000),i);
			profesores.add(pr);
		}
		return profesores;
	}
	
	}


