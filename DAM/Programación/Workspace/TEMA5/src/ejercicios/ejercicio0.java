package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ejercicio0 {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println(hoy);
		hoy = LocalDate.of(2024, 12, 25);
		System.out.println(hoy);
		hoy = LocalDate.parse("2024-12-25");
		System.out.println(hoy);
		LocalDateTime Idt = LocalDateTime.now();
		System.out.println(Idt);
		LocalDate ld = LocalDate.now();
		System.out.println(ld.isLeapYear()); 		//indica si es bisiesto true/false
		System.out.println(ld.getDayOfMonth()); 	//día del mes (1-31)
		System.out.println(ld.getDayOfWeek()); 	//día de la semana MONDAY
		System.out.println(ld.getDayOfYear()); 	//día del año (1-365)
		System.out.println(ld.getMonth()); 		//nombre del mes OCTOBER
		System.out.println(ld.getMonthValue()); 	//nº de mes (1-12)
		System.out.println(ld.getYear()); 			//año 2023
		System.out.println(ld.lengthOfMonth()); 	//nº de días del mes

	}

}
