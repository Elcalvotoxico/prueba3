package EJERCICIOS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EJ7REPASO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Introduce la primera fecha (formato yyyy/MM/dd):");
		String fecha1str = sc.nextLine();
		Date fecha1 = null;
		Date fecha2 = null;
		int diferenciaMeses = 0;
		while(true) {
			try {
			fecha1 = formatoFecha.parse(fecha1str);
		}catch (Exception e) {
			System.out.println("Formato no valido");
			return;
		}
			System.out.println("Introduce la segunda fecha (Formato yyyy/MM/dd):");
			String fecha2str = sc.nextLine();
			try {
				fecha2 = formatoFecha.parse(fecha2str);
				if(fecha2.after(fecha1)) {
					break;
				}else {
					System.out.println("La segunda fecha debe ser posterior a la primera");
				}
			}catch (Exception e) {
				System.out.println("Formato no valido");
				return;
			}
		}
		Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(fecha1);
        
    	Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(fecha2);
        
        if(calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR) || calendar1.get(Calendar.DAY_OF_WEEK) == calendar2.get(Calendar.DAY_OF_WEEK)) {
        	int mes1 = calendar1.get(Calendar.MONTH);
        	int mes2 = calendar2.get(Calendar.MONTH);
        	diferenciaMeses = Math.abs(mes2 - mes1);
        	System.out.println("La diferencia en meses o en dias entre las dos fechas es:" + diferenciaMeses);
        }else {
        	System.out.println("Las fechas no son del mismo año");
        }
        int cantidadNombres = (diferenciaMeses < 3) ? 4 : diferenciaMeses;
        System.out.println("Por favor, ingresa " + cantidadNombres + " nombres:");
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Has ingresado: " + nombre);
        }
		System.out.println("Primera fecha:" + formatoFecha.format(fecha1));
		System.out.println("Segunda fecha:" + formatoFecha.format(fecha2));

	}

	
	
	
	/*Descripción del Proyecto:
		Crea un programa que pida dos fechas por consola, validando que la segunda sea mayor en el tiempo que la
		primera. Si no lo es, vuelve a pedir la segunda fecha hasta que lo sea.
		Con esas fechas:
		 Si son del mismo año y son de distinto mes o distinto día, calcula la diferencia de meses entre las fechas.
		Pide por consola tantos nombres como la diferencia de meses, en caso de que esa diferencia sea menor de
		3, pide 4 nombres.
		Despues de introducir todos los nombres,
		o muestra al nombre de tamaño más pequeño
		o muestra el nombre que alfabéticamente es el primero
		o muestra las vocales separadas por guiones de la última palabra introducida, no mostrar guion
		después de última vocal ( Ej. botella-&gt; o-e-a)

		 Si no son del mismo año, calcula la media de los días mensuales que van de una fecha a otra, incluye el mes
		de la primera fecha, pero no el el mes de la segunda fecha. Ademas, muestra las consonantes del mes de la
		segunda fecha separadas por comas. (Ej April -&gt; p,r,l)
		Por ejemplo, si las fechas son: 1/1/2023 y 1/2/2024, hay que calcular la media de 31 (enero 2023), 28
		(febrero 2023), 31 (marzo 2023), 30 (abril), ...31 (diciembre 2023), 31 (enero 2024).
		La suma de los días de todos los meses: 31+28+31+…+31=396 días. Media = 396 días/13 meses=30.46

		Validación de entradas:
		El programa debe manejar entradas no válidas, como si el usuario ingresa una fecha no válida.
		Distribución de Trabajo en Equipo:
		En el archivo README.md del repositorio comentar que métodos van a ser necesarios y como va a ser la
		distibucion del trabajo por alumno.
		El alumno 1, creará el repositorio, mientras el alumno 2 creará el proyecto en eclipse con el main.
		Ambos igualarán el proyecto en eclipse.
		Alumno 1 realizará la parte si son del mismo año.
		Alumno 2 realizará el main y la parte de si son de distinto año.
		Después fusionar el código tanto en Github como en local
		Entrega:
		Sube el proyecto a Classroom
		Crea un link en la tarea de Classroom y copia el link de Github.*/
}
