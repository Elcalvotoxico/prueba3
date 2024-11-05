package ejercicios;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
public class EJ25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		LocalDate fecha = dimeFecha(sc);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fecha.format(formato));
		LocalDate ultimoDiaMes = fecha.with(TemporalAdjusters.lastDayOfMonth());
		int dias = (int) ChronoUnit.DAYS.between(fecha, ultimoDiaMes);
		System.out.println(dias);
		LocalDate fin = LocalDate.of(fecha.getYear(), 12, 31);
		System.out.println(fin);
		int years = (int) ChronoUnit.DAYS.between(fecha, fin);
		System.out.println(years);
}
	public static LocalDate dimeFecha(Scanner sc) {
	do {try {
		System.out.println("introduce un dia");
		String s = sc.nextLine();
		int dia = Integer.parseInt(s);
		System.out.println("introduce un mes");
		String s1 = sc.nextLine();
		int mes = Integer.parseInt(s1);
		System.out.println("introduce un año");
		String s2 = sc.nextLine();
		int año = Integer.parseInt(s2);
		LocalDate ld = LocalDate.of(año, mes, dia);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld.format(formato));
		return ld;
	}catch(Exception e){
		System.out.println("Fecha no valida");
	}
	}while(true);			
	
	
		

	}
	}

