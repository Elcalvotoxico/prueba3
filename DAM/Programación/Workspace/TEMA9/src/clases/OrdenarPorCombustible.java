package clases;

import java.util.Comparator;

public class OrdenarPorCombustible implements Comparator<Barcos>{

	@Override
	public int compare(Barcos o1, Barcos o2) {
		if(o1.getMotor().getConsumo()==o2.getMotor().getConsumo()) {
			return 0;
		}else if(o1.getMotor().getConsumo()<o2.getMotor().getConsumo()) {
			return 1;
		}
		return -1;
	}

}
