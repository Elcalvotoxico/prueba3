package EJERCICIOS;

import java.time.LocalDate;
import java.util.Date;

import clases1.Funciones;

public class EJ16REPASO {

	public static void main(String[] args) {
		String fecha = "05-07-2005";
		Date fechaConvertida = Funciones.convierte_String_a_Date(fecha);
		System.out.println(fechaConvertida);
		String fecha1 = Funciones.convierte_Date_a_String(fechaConvertida);
		System.out.println(fecha1);
		LocalDate fecha2 = Funciones.convierte_Date_a_LocalDate(fechaConvertida);
		System.out.println(fecha2);
		Date fecha3 = Funciones.convierte_LocalDate_a_Date(fecha2);
		System.out.println(fecha3);
	}

}
