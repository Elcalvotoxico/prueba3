package ejercicios;

import java.util.Scanner;

public class Funciones {
	public static boolean esInt(String num) {
		try {
		 Integer.parseInt(num);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	public static boolean esDouble(String num) {
		try {
		 Double.parseDouble(num);
			return true;
		}catch(Exception e) {
			return false;
		}
	
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {	try {
			System.out.println(texto);
			String s=sc.nextLine();
			int n = Integer.parseInt(s);
			return n;
			}catch(Exception e) {
			System.out.println("Formato incorrecto");
			}
			
		
		}while(true);
		}
	public static double dimeDouble(String texto, Scanner sc) {
		do {	try {
			System.out.println(texto);
			String s=sc.nextLine();
			double n= Double.parseDouble(s);
			return n;
			}catch(Exception e) {
			System.out.println("Formato incorrecto");
			}
			
		
		}while(true);
	}
	public static boolean esBisiesto(int anyo) {
		if((anyo%4==0&&anyo%100!=0)||anyo%400==0) {
			return true;
		}else {
			return false;
		}
	}
	public static String ICM(double estatura, double peso) {
			double ic= peso/(estatura*estatura);
			if(ic<=18.5) {
				return("Peso inferior al normal");
			}else if(ic>=18.5&&ic<=24.9) {
				return("Peso normal");
			}else if(ic>=25.0&&ic<=29.9) {
				return("Peso superior al normal");
			}else if(ic<30) {
				return("Obesidad");
			}
			return null;
			
			
	}
	}
	
	
