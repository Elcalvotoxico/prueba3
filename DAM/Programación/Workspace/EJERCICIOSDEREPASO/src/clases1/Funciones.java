package clases1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Funciones {
	
public static Date convierte_String_a_Date(String fecha) {
	SimpleDateFormat formato2 = new SimpleDateFormat("dd-MM-yyyy");
	try {
		return formato2.parse(fecha);
	}catch(Exception e) {
		return null;
	}

}

public static String convierte_Date_a_String(Date fecha) {
	SimpleDateFormat formato2 = new SimpleDateFormat("dd-MM-yyyy");
	String st_hoy2 = formato2.format(fecha);
	return st_hoy2;

}

public static LocalDate convierte_Date_a_LocalDate(Date fecha) {
	SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
	String st_hoy2 = formato2.format(fecha);
	LocalDate ld3 = LocalDate.parse(st_hoy2);
	return ld3;
	
	/*LocalDate fecha1 = LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDay());
	return fecha1;*/
}

public static Date convierte_LocalDate_a_Date(LocalDate fecha) {
	String fecha1 = fecha.toString();
	SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
	try {
		return formato2.parse(fecha1);
	}catch(Exception e) {
		return null;
	}
}

}
