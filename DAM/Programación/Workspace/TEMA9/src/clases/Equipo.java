package clases;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private int IdEquipo;
	private String Nombre;
	private Entrenador entrenador;
	private List<Jugador> Jugadores;
	private double presupuesto;

	public int getIdEquipo() {
		return IdEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		IdEquipo = idEquipo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public List<Jugador> getJugadores() {
		return Jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		Jugadores = jugadores;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Equipo(int idEquipo, String nombre, double presupuesto) {
		super();
		IdEquipo = idEquipo;
		Nombre = nombre;
		Jugadores = new ArrayList<Jugador>();
		this.presupuesto = presupuesto;
	}

	public Equipo() {
		super();
		this.entrenador = entrenador;
	}

	public boolean ficharJugador(Jugador jugador) {
		if (Jugadores.size() < 3) {
			Jugadores.add(jugador);
			return true;
		}
		return false;
	}

	public boolean ficharEntrenador(Entrenador entrenador) {
		int costeEntrenador = entrenador.getSueldo() * 12;
		if (this.entrenador != null) {
			int indemnizacion = this.entrenador.getSueldo() * 2;
			if (presupuesto >= indemnizacion + costeEntrenador) {
				presupuesto -= indemnizacion;
				this.entrenador = entrenador;
				presupuesto -= costeEntrenador;
				return true;
			} else {
				return false;
			}
		} else {
			if (presupuesto >= costeEntrenador) {
				this.entrenador = entrenador;
				presupuesto -= costeEntrenador;
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean DespedirJugador(Jugador jugador, int indemnizacion) {
		if (presupuesto > indemnizacion) {
			presupuesto -= indemnizacion;
			Jugadores.add(jugador);
			return true;
		} else {
			return false;
		}
	}

	
	public String toString() {
		return "Equipo [IdEquipo=" + IdEquipo + ", Nombre=" + Nombre + ", entrenador=" + entrenador + ", Jugadores="
				+ Jugadores + ", presupuesto=" + presupuesto + "]";
	}


}
