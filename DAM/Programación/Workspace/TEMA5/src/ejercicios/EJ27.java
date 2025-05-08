package ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EJ27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha = Funciones.dimeFecha("Dime tu fecha de cumpleaños, dia/mes/año", sc);
		int numero = 0;
		do {
			System.out.println("1. Calcular edad en dias");
			System.out.println("2. Calcular edad en meses");
			System.out.println("3. Mostrar edada completa");
			System.out.println("4. Calcular dias al proximo cumpleaños");
			System.out.println("0. salir");
			 numero = Funciones.dimeEntero("opcion", sc);
			switch(numero) {
			case 1:
				System.out.println(edadEnDias(fecha));
				break;
			case 2:
				System.out.println(edadEnMeses(fecha));
				break;
			case 3:
				edadCompleta(fecha);
				break;
			case 4:
				System.out.println(proximoCumpleaños(fecha));
				break;
			case 0: 
				break;
			}
		}while(numero!=0);
		
	}
	public static  int edadEnDias(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(fecha,hoy);
		System.out.println(dias);
		return dias;
		
		
	}
	public static  int edadEnMeses(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		int meses = (int) ChronoUnit.MONTHS.between(fecha,hoy);
		System.out.println(meses);
		return meses;
		
		
	}
	public static  void edadCompleta(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fecha, hoy);
		System.out.println(p.getYears()+" " + "años" + " " +p.getMonths() + " meses" + " "+p.getDays()+ " " +  "dias"); 
		
	}
	public static  int proximoCumpleaños(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		LocalDate ld2 = LocalDate.of(hoy.getYear()+1, fecha.getMonthValue(), fecha.getDayOfMonth());
		int dias = (int) ChronoUnit.DAYS.between(hoy,ld2);
		return dias;
	
	}
	

}
