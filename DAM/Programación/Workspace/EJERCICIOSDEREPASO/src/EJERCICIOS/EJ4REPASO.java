package EJERCICIOS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EJ4REPASO {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(hoy.format(formato));
		System.out.println(hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(hoy.getDayOfMonth ( ) + " de " + hoy.getMonth ( ) + " de "+ hoy.getYear( ));
	}
	//Crear un programa que nos muestre la fecha actual con su formato por defecto y después vaya mostrando la fecha con el siguiente formato:
		//22-12–2024
		//22/12/2024
		//22 de DECEMBER de 2024

}
