package clases;

import java.util.Comparator;

public class OrdenarPorPasajeros implements Comparator<Barcos>{

@Override
public int compare(Barcos o1, Barcos o2) {
	if(o1.getNumeroPasajeros()==o2.getNumeroPasajeros()) {
		return 0;
	}else if(o1.getNumeroPasajeros()>o2.getNumeroPasajeros()) {
		return 1;
	}else {
		return -1;
	}
}
}
