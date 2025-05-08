package ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EJ26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		LocalDate fecha = LocalDate.now();
		LocalDate fecha1 = Funciones.dimeFecha("Introduce una fecha", sc);
		if(fecha.isBefore(fecha1)) {
			System.out.println("La fecha es futura");
		}else {
			System.out.println("La fecha es pasada");
		}
		LocalDate fecha2 = Funciones.dimeFecha("Introduce una fecha", sc);
		
		if(fecha1.isBefore(fecha2)) {
			System.out.println("La fecha es futura");
		}else {
			System.out.println("La fecha es pasada");
		}
		int diasDiferencia = (int) ChronoUnit.DAYS.between(fecha,fecha1);
		System.out.println(diasDiferencia);
	}

}
