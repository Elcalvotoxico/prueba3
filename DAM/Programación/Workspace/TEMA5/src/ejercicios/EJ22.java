package ejercicios;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class EJ22 {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();

		System.out.println(hoy);

		

		LocalDate ld = LocalDate.now();

		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		

		LocalDate ld1 = LocalDate.now();

		System.out.println(ld1.getDayOfMonth ( ) + " de " + ld.getMonth ( ) + " de "+ ld.getYear( ));
	}

}
