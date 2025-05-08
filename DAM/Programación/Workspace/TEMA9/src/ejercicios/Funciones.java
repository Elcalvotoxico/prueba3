package ejercicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Funciones {
	//indica si el String que recibe como parametro es entero
	public static boolean esInt(String s)
	{
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//indica si el String que recibe como parametro es decimal
	public static boolean esDouble(String s)
	{
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//pide algo por consola hasta que sea un numero entero, el mensaje que pide ese algo se pasa
	//por parametro para poder personalizarlo
	public static int dimeEntero(String orden, Scanner sc)
	{
		do
		{
		try {
			System.out.println(orden);
			String s = sc.nextLine();
			int n= Integer.parseInt(s);
			return n;

		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		}while(true);
	}
	
	//pide algo por consola hasta que sea un numero decimal, el mensaje que pide ese algo se pasa
	//por parametro para poder personalizarlo
	public static double dimeDouble(String orden, Scanner sc)
	{
		do
		{
		try {
			System.out.println(orden);
			String s = sc.nextLine();
			double d= Double.parseDouble(s);
			return d;

		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		}while(true);
	}
	
	//pide algo por consola hasta que sea una fecha, y devuelve
	//un objeto de tipo LocalDate
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha,formato);
				return fecha;
				
			} catch (Exception e) {
				System.out.println("Fecha no valida");
			}
			
		} while (true);
	}
	public static void muestraArray(int[] array){
		for(int i=0;i<array.length;i++)
		{
			System.out.print(i==0?array[i]:", " + array[i]);
		}
		System.out.println();
	}
	public static void muestraArrayS(String[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(i==0?array[i]:", " + array[i]);
		}
		System.out.println();
	}
	public static void muestraListaInt(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}
	
	public static double redondea(double d)
	{
		//redondea d a 2 decimales
		return Math.round(d*100)/(double)100;
	}
	
	public static java.sql.Date convierteUtiltoSql(Date utilDate)
	{
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
	
	public static Date convierteLocalDateToDate(LocalDate ld)
	{
		return  Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static LocalDate convierteDateToLocalDate(Date utilDate)
	{
		java.sql.Date sqlDate =  new java.sql.Date(utilDate.getTime());
		return sqlDate.toLocalDate();
	}
	public static Date convierte_String_a_Date(String fecha)
    {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
    		return sdf.parse(fecha);
		} catch (Exception e) {
			return null;
		}
    }
	public static String convierte_Date_a_String(Date fDate)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fDate);
	}
}
	
	