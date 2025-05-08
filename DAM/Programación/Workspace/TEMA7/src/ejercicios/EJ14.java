package ejercicios;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EJ14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate[] array = new LocalDate[10];
		rellenar(array);
		mostrarArray(array);
		sc.close();

	}
	public static void rellenar(LocalDate[] array) {
		LocalDate hoy = LocalDate.now().plusDays(1);
		for (int i = 0; i < array.length; i++) {
			  array[i] = hoy;
				hoy= hoy.plusDays(1);
	
			}
	}
	public static void mostrarArray(LocalDate[] array) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("eeee d 'de' MMMM 'de' yyyy");
		for(int i = 0; i <array.length; i++) {
			System.out.println(array[i].format(formato));
		}
		System.out.println();
	}
}
