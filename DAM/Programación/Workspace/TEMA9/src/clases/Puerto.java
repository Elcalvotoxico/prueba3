package clases;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
	private List<Barcos> barcos;
	public final static double precioGasolina = 1.25;

	public Puerto() {
		super();
		this.barcos = new ArrayList<Barcos>(10);

	}

	public boolean añadirBarco(Barcos barco) {
		if (puedenEntrar()) {
			barcos.add(barco);
			return true;
		}
		return false;

	}

	public void eliminarBarco(Barcos barco) {
		barcos.remove(barco);
	}

	public List<Barcos> getBarcos() {
		return barcos;
	}

	public void setBarcos(List<Barcos> barcos) {
		this.barcos = barcos;
	}

	public boolean puedenEntrar() {
		if (barcos.size() >= 10) {
			return false;
		} else {
			return true;
		}

	}
	public void elimarBarcosConsumo() {
		List<Barcos> barcos1 = Barcos.mayorCombustible(barcos);
		barcos.remove(0);
		barcos.remove(0);
	}
}
