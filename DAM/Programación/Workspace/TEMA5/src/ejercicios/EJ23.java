package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EJ23 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(ld.format(formato));

		System.out.println(ld.plusDays(2).format(formato));



		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(ld.plusDays(7).format(formato1));

		

		DateTimeFormatter formato2= DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(ld.minusYears(2).format(formato2));

		

		DateTimeFormatter formato3= DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(ld.minusMonths(4).format(formato3));

		

		DateTimeFormatter formato4= DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate ultimoDiaMes = ld.withDayOfMonth(2);

		System.out.println(ultimoDiaMes.format(formato4));

		

		DateTimeFormatter formato5= DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate primerDiaDelAno = ld.withDayOfYear(1);

		System.out.println(primerDiaDelAno.format(formato5));
	}

}
