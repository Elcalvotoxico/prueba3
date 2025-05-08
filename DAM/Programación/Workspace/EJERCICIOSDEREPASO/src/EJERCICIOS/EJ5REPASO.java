package EJERCICIOS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class EJ5REPASO {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(hoy.plusDays(2).format(formato));
		System.out.println(hoy.plusDays(7).format(formato));
		System.out.println(hoy.minusYears(2).format(formato));
		System.out.println(hoy.minusMonths(4).format(formato));
		System.out.println(hoy.plusDays(9).format(formato));
		LocalDate ultimoDiaMes = hoy.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate primerDiaA�o = hoy.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(ultimoDiaMes.format(formato));
		System.out.println(primerDiaA�o.format(formato));
	}
	
	
	
	
	
	
	
	
	
	
	//Crear un programa que, partiendo de la fecha actual, nos muestre:
		//La fecha que ser� dentro de dos d�as.
		//La fecha que ser� dentro de una semana.
		//La fecha que fue hace 2 a�os.
		//La fecha que fue hace 4 meses.
		//El �ltimo d�a del mes.
		//El primer d�a del a�o.
		//Mostrar las fechas siempre dd/MM/yyyy

}
