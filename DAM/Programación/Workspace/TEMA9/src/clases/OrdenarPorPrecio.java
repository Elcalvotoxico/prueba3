package clases;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Barcos>{

	@Override
	public int compare(Barcos o1, Barcos o2) {
		double precio1=o1.calcularPrecioViaje(5);
		double precio2=o2.calcularPrecioViaje(5);
		return (int) (precio1 - precio2);

	}
}
