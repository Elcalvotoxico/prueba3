package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EJ13 {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("cccc/MM/yyyy");
		LocalDate[] array = new LocalDate[10];
		for (int i = 0; i < array.length; i++) {
			 array[i]=hoy.plusDays(i+1);

			}
		for (int i = 0; i < array.length; i++) {
			 System.out.print("elemento " + i + ", "+ array[i]);
			 if(i != array.length-1)
				 System.out.print(", ");
			}
	}

}
