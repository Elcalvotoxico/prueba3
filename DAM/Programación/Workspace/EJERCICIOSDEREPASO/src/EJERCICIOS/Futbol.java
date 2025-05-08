package EJERCICIOS;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases1.Entrenador;
import clases1.Equipo;
import clases1.Jugador;
import EJERCICIOS.Funciones;



public class Futbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int numero = 0;
		//crea 5 equipos
		List<Equipo> equipos = new ArrayList<>();
		Equipo equi = null;
		for(int i = 0; i < 5; i++) {
			int idEquipo = i + 1;
			String  nombreEquipo = "Equipo" + idEquipo;
			int presupuesto = 20000 + r.nextInt();
			equipos.add(new Equipo(idEquipo, nombreEquipo, null, null, 100000));
		}
		//crea 25 jugadores
		List<Jugador> jugadores = new ArrayList();
		for(int i = 0; i < 25; i++) {
			int idJugador = i + 1;
			jugadores.add(new Jugador(i, "Jugador"+i, i));
 		}
		//crea 10 entrenadores
		List<Entrenador> entrenadores = new ArrayList();
		for(int i = 0; i < 10; i++) {
			int idEntrenador = i + 1;
			int sueldo = 1000 + r.nextInt();
			entrenadores.add(new Entrenador(i, null, 1500, i));
		}
		do {
			System.out.println("1. Fichar jugadores");
			System.out.println("2. Fichar entrenador");
			System.out.println("3. Marcar gol");
			System.out.println("4. Despedir jugador:");
			System.out.println("5. Ver equipos");
			System.out.println("6. Salir");
			numero = Funciones.dimeEntero("Introduce una opcion", sc);
		switch(numero){
		case 1:
			equi = pideEquipo(equipos, sc);
			fichar(equipos, r);
			break;
		case 2:
			equi = pideEquipo(equipos, sc);
			ficharEntrenador(entrenadores, r);
			break;
		case 3:
			equi = pideEquipo(equipos, sc);
			marcarGol(equipos, r);
			break;
		case 4:
			equi = pideEquipo(equipos, sc);
			despedirJugador(equipos, r);
			break;
		case 5:
			verEquipos(equipos);
			break;
	}
	}while(numero!=6);
	}
public static void fichar(List<Equipo> equipos, Random r) {
	Equipo equi = null;
	if (equi.getJugadores().size()>0) {
		Jugador jug = equi.getJugadores().get(r.nextInt(equi.getJugadores().size()));
		jug.MarcaGol();
		System.out.println("Gol marcado por" + jug.getNombre());
		
	}
}
public static void ficharEntrenador(List<Entrenador> entrenadores, Random r) {
	Equipo equi = null;
	Entrenador entre = entrenadores.get(r.nextInt(entrenadores.size()));
	if(equi.FicharEntrenador(entre)) {
		System.out.println(equi.getNombre() + "fichado por el entrenador " + entre.getNombre());
	}else {
		System.out.println(equi.getNombre() + "no tiene presupuesto para fichar al entrenador" + entre.getNombre());
	}
	
}
public static void marcarGol(List<Equipo> equipos, Random r) {
	Equipo equi = null;
	if(equi.getJugadores().size()>0) {
		Jugador jug = equi.getJugadores().get(r.nextInt(equi.getJugadores().size()));
		jug.MarcaGol();
		System.out.println("Gol marcado por " + jug.getNombre());
	}else {
		System.out.println("No hay jugadores");
	}
}
public static void despedirJugador(List<Equipo> equipos, Random r) {
	Equipo equi = null;
	if(equi.getJugadores().size()>0) {
		Jugador jug = equi.getJugadores().get(r.nextInt(equi.getJugadores().size()));
		if(equi.DespedirJugador(jug, r.nextDouble(1000, 2001))) {
			System.out.println("El equipo " + equi.getNombre() + "ha podido despedir al jugador " + jug.getNombre());
		}else {
			System.out.println("El equipo" + equi.getNombre() + "ha despedido al jugador " + jug.getNombre() + "por falta de presupuesto");
		}
		
	}else {
		System.out.println("El equipo no tiene jugadores");
	}
}
public static void verEquipos(List<Equipo> equipos) {
	Equipo equi = null;
	for (Equipo equipo : equipos) {
		System.out.println(equi.getNombre());
		if(equi.getEntrenador()==null) {
			System.out.println("Sin entrenador");
		}else {
			System.out.println(", entrenador " + equi.getEntrenador().getNombre());
			System.out.println(", presupuesto " + equi.getPresupuesto()+".");
		}
		if(equi.getJugadores().size()==0) {
			System.out.println("No tien jugadores");
		}else {
			System.out.println(", jugadores: ");
			for (Jugador jug : equi.getJugadores()) {
				System.out.println(jug.getNombre() + ", goles " + jug.getGolesMarcados() + ", recuerdos " + jug.getRecuerdos());
			}
		}
	}
}
public static Equipo pideEquipo(List<Equipo> equipos, Scanner sc) {
	int idEquipo = 0;
	do {
		for (Equipo equi : equipos) {
			System.out.println(equi);
			idEquipo = Funciones.dimeEntero("Inroduce el id del equipo", sc);
		}
	}while(idEquipo < 1 || idEquipo > 5);
	return equipos.get(idEquipo-1);
}
}


