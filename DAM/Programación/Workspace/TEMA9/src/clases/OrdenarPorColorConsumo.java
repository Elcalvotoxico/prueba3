package clases;

import java.util.Comparator;

public class OrdenarPorColorConsumo implements Comparator<Electrodomesticos> {
	
	@Override
	public int compare(Electrodomesticos o1, Electrodomesticos o2) {
		return o1.getConsumoEnergetico().compareTo(o2.getConsumoEnergetico());
	}
}
