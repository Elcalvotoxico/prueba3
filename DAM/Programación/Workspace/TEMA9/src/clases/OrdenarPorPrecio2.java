package clases;

import java.util.Comparator;

public class OrdenarPorPrecio2 implements Comparator<Barcos>{

	@Override
	public int compare(Barcos o1, Barcos o2) {
		double precio1=o1.calcularPrecioViaje(4);
		double precio2=o2.calcularPrecioViaje(4);
		return (int) (precio1 - precio2);
	}

}
