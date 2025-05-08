package Ejecicio;

import java.time.LocalDate;
import java.util.Random;

import Clases.Evento;
import Clases.Sitio;

public class Main {

	public static void main(String[] args) {
		 Random random = new Random();
	        LocalDate fechaInicio = LocalDate.of(2000, 1, 1);
	        LocalDate fechaFin = LocalDate.of(2080, 1, 1);
	        long diasEntre = fechaInicio.until(fechaFin).getDays();
	        
	        for (int i = 0; i < 9; i++) {
	            // Generar una fecha aleatoria para cada sitio (o evento si prefieres)
	            long diasAleatorios = random.nextLong(diasEntre + 1);
	            LocalDate fechaAleatoria = fechaInicio.plusDays(diasAleatorios);
	            
	            Sitio sitios = new Sitio(random.nextInt(100, 200), "calle de mi pito pequeño");
	            System.out.println(sitios);
	            
	            // Corregido: cambiado i2 como variable de control y el límite de 29
	            for (int j = 0; j < 29; j++) {
	                // Si quieres fechas diferentes para cada evento, genera nuevas aquí
	                Evento eventos = new Evento(fechaAleatoria, random.nextInt(100, 200), sitios);
	                System.out.println(eventos);
	            }
	        }
	}
}
