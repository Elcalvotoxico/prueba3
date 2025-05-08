package ejercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Entrenador;
import clases.Equipo;
import clases.Jugador;

public class EJQUIPODEFUTBOL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numero = 0;
		
        // Crear 5 equipos
        List<Equipo> equipos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int idEquipo = i + 1;
            String nombreEquipo = "Equipo " + idEquipo;
            int presupuesto = 20000 + random.nextInt(80001); 
            equipos.add(new Equipo(i, nombreEquipo, 100000));
        }

        // Crear 25 jugadores
        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            int idJugador = i + 1;
            jugadores.add(new Jugador(i, "Jugador"+i,  i));
        }
        
        //crea 10 entrenadores
        List<Entrenador> entrenadores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int idEntrenador = i + 1;
            entrenadores.add(new Entrenador(i, 1500,  i));
        }
        
        do {
        	System.out.println("1.Fichar jugadores");
        	System.out.println("2.Fichar entrenador");
        	System.out.println("3.Marcar gol");
        	System.out.println("4.Despedir jugador");
        	System.out.println("5.Ver equipos");
        	System.out.println("6.Salir");
        	numero = Funciones.dimeEntero("Introduce una opcion", sc);
        	switch(numero) {
        	case 1:
        		ficharJugadores(equipos, jugadores, sc, random);
        		break;
        	case 2:
        		
        		break;
        	case 3:
        		
        		break;
        	case 4:
        		
        		break;
        	case 5:
        		
        		break;
        	case 6:
        		break;
        	}
        }while(numero != 6);
	}
	public static void ficharJugadores( List<Equipo> equipos, List<Jugador> jugadores, Scanner sc,Random random) {
		Equipo equi = null;
		boolean esta = false;
		do { 
		for (Equipo equipo : equipos) {
			System.out.println(equipo);
		}
		int numero = Funciones.dimeEntero("Dime un id de un equipo", sc);
		for (Equipo equipo : equipos) {
			if(equipo.getIdEquipo()==numero) {
				equi = equipo;
				esta = true;
				break;
			}
		}
		}while(esta!=true);
		int numeroAleatorio = random.nextInt(0,jugadores.size());
		Jugador jugadorAleatorio = jugadores.get(numeroAleatorio);
		if(equi.ficharJugador(jugadorAleatorio)) {
		System.out.println(jugadorAleatorio.getNombre() + " ha sido fichado por" + equi.getNombre());
		jugadorAleatorio.getFecha_Fichaje();
		}else {
			System.out.println(equi.getNombre()+ " no ha podido fichar a más jugadores.");
		}

	}
	public static void ficharEntrenadores(List<Equipo> equipos, Scanner sc,Random random) {
		Equipo equi = null;
		boolean esta = false;
		do { 
			for (Equipo equipo : equipos) {
				System.out.println(equipo);
			}
			int numero = Funciones.dimeEntero("Dime un id de un equipo", sc);
			for (Equipo equipo : equipos) {
				if(equipo.getIdEquipo()==numero) {
					equi = equipo;
					esta = true;
					break;
				}
			}
			}while(esta!=true);
	}
	public static void marcarGol(List<Equipo> equipos, Scanner sc,Random random) {
		Equipo equi = null;
		boolean esta = false;
		do { 
			for (Equipo equipo : equipos) {
				System.out.println(equipo);
			}
			int numero = Funciones.dimeEntero("Dime un id de un equipo", sc);
			for (Equipo equipo : equipos) {
				if(equipo.getIdEquipo()==numero) {
					equi = equipo;
					esta = true;
					break;
				}
			}
			}while(esta!=true);
	}
	public static void despedirJugador(List<Equipo> equipos, Scanner sc,Random random) {
		Equipo equi = null;
		boolean esta = false;
		do { 
			for (Equipo equipo : equipos) {
				System.out.println(equipo);
			}
			int numero = Funciones.dimeEntero("Dime un id de un equipo", sc);
			for (Equipo equipo : equipos) {
				if(equipo.getIdEquipo()==numero) {
					equi = equipo;
					esta = true;
					break;
				}
			}
			}while(esta!=true);
	}
}
