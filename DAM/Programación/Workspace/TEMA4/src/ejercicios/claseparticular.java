package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class claseparticular {
	public static final int FINAL=5;
	public static void main(String[] args) {
		System.out.println(suma());
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
		
	}
	public static int suma() {
		int i=0;
		int cont=0;
		for(i=0;i<=10;i++){
			System.out.print(cont);
			cont=cont+i;
		}
		return cont;
	}
	public static int sumaDeNumeros(int n1, int n2) {
		int suma = n1 + n2;
		return (suma);
	}
public static void clase() {
	String str = "cero";
	String prueba = "ro";
	if(str.charAt(2)==4) {
		
	}
	
	if(str.substring(0)==str.substring(4)) {
		
	}
	System.out.println(str.toLowerCase());
	System.out.println(str.trim());
	System.out.println(str.replace('c', 'm'));
	System.out.println(str.replaceAll(prueba, "lo"));
	System.out.println(str.replaceFirst("ce", prueba));
	System.out.println(str.concat(prueba).concat("lo"));

}
public static void clase1() {
	String prueba = "hola";
	String prueba1 = "adios";
	System.out.println(prueba.concat(" ").concat(prueba1).toUpperCase());
	if(!prueba.contains(prueba1)) {
		
	}
	if(prueba.startsWith("ad")) {
		
	}
	if(prueba.endsWith("ad")) {
		
	}
	System.out.println(prueba.indexOf(prueba));
	System.out.println(prueba.lastIndexOf(prueba1));
}
}
