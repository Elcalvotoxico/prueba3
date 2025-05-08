package clases1;

import java.util.List;

public class Equipo {
private int IdEquipo;
private String Nombre;
private Entrenador Entrenador;
private List<Jugador> Jugadores;	
private double Presupuesto;

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
	return Entrenador;
}

public void setEntrenador(Entrenador entrenador) {
	Entrenador = entrenador;
}

public List<Jugador> getJugadores() {
	return Jugadores;
}

public void setJugadores(List<Jugador> jugadores) {
	Jugadores = jugadores;
}

public double getPresupuesto() {
	return Presupuesto;
}

public void setPresupuesto(double presupuesto) {
	Presupuesto = presupuesto;
}

public Equipo(int idEquipo, String nombre, clases1.Entrenador entrenador, List<Jugador> jugadores, double presupuesto) {
	super();
	IdEquipo = idEquipo;
	Nombre = nombre;
	Entrenador = entrenador;
	Jugadores = jugadores;
	Presupuesto = presupuesto;
}

public Equipo() {
	super();
}

@Override
public String toString() {
	return "Equipo [IdEquipo=" + IdEquipo + ", Nombre=" + Nombre + ", Entrenador=" + Entrenador + ", Jugadores="
			+ Jugadores + ", Presupuesto=" + Presupuesto + "]";
}

public boolean FicharJugador(Jugador j) {
	if(Jugadores.size() <= 3) {
		this.Jugadores.add(j);
		return true;
	}
	return false;
}
public boolean FicharEntrenador(Entrenador e) {
	//coste del entrenador
	double gasto = e.getSueldo() * 12;
	//comprobamos si tenemos entrenador
	if(this.Entrenador != null) {
		gasto += this.Entrenador.getSueldo() * 2;
	if(Presupuesto >= gasto) {
		Presupuesto -= gasto;
		this.Entrenador = e;
		return true;
	}
	}
	return false;
}

public boolean DespedirJugador(Jugador j, double indemnizacion) {
	if(Presupuesto >= indemnizacion) {
		this.Jugadores.remove(j);
		Presupuesto -= indemnizacion;
		return true;
	}
	return false;
}
}
