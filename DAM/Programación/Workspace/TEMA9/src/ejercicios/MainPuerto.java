package ejercicios;

import java.util.Random;

import clases.Barcos;
import clases.Catamaran;
import clases.Lancha;
import clases.Motor;
import clases.OrdenarPorPasajeros;
import clases.OrdenarPorPrecio;
import clases.OrdenarPorPrecio2;
import clases.Puerto;
import clases.Yate;

public class MainPuerto {

	public static void main(String[] args) {
		Puerto puerto = new Puerto();
		Random random = new Random();
		for (int i = 0; i < 11; i++) {
			Motor m1 = new Motor("citroen" + i, random.nextInt(500, 1000), random.nextInt(30, 50));
			Motor m2 = new Motor("mercedes" + i, random.nextInt(600, 1000), random.nextInt(40,  60));
			if (puerto.puedenEntrar() == false) {
				System.out.println("No se han podido añadir");
			} else {
				switch (random.nextInt(0, 3)) {
				case 0:
					Yate yate = new Yate("Yate" + i, random.nextInt(5, 15), m1, random.nextInt(5, 15),
							random.nextBoolean(), random.nextInt(2, 10));
					puerto.añadirBarco(yate);
					break;
				case 1:
					Lancha lancha = new Lancha("Lancha" + i, random.nextInt(5, 15), m1, random.nextInt(5, 15),
							random.nextBoolean(), random.nextInt(2, 10));
					puerto.añadirBarco(lancha);
					break;
				case 2:
					Catamaran catamaran = new Catamaran("Yate" + i, random.nextInt(5, 15), m1, random.nextInt(5, 15),
							m2, random.nextInt(2, 10));
					puerto.añadirBarco(catamaran);
					break;
				}
			}
			
		}
//. Muestra ordenados los barcos de mayor a menor número de pasajeros que podemos viajar.
		puerto.getBarcos().sort(new OrdenarPorPasajeros());
		for (Barcos barco : puerto.getBarcos()) {
			System.out.println(barco);
		}
		puerto.getBarcos().sort(new OrdenarPorPrecio());
		for (Barcos barco : puerto.getBarcos()) {
			System.out.println(barco);
		}
		puerto.getBarcos().sort(new OrdenarPorPrecio2());
		// System.out.println(puerto.getBarcos().getFirst().calcularPrecioViaje(4));

		for (Barcos barco : puerto.getBarcos()) {
			if (barco.calcularPrecioViaje(4) != -1) {
				System.out.println(barco.calcularPrecioViaje(4));
				break;
			}

		}
		puerto.elimarBarcosConsumo();
		System.out.println(puerto.getBarcos());
	}

}
