package clases;

import java.util.List;
import java.util.Map;

public class Equipo1 {
	protected String nombre;
	protected Entrenador entrenador;
	protected List<Jugador1> jugadores;
	protected Double presupuesto;
	protected Map<String, String> contacto;
	
	public Equipo1(String nombre, Entrenador entrenador, List<Jugador1> jugadores, Double presupuesto,
			Map<String, String> contacto) {
		super();
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.jugadores = jugadores;
		this.presupuesto = presupuesto;
		this.contacto = contacto;
	}

	public Equipo1() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public List<Jugador1> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador1> jugadores) {
		this.jugadores = jugadores;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Map<String, String> getContacto() {
		return contacto;
	}

	public void setContacto(Map<String, String> contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Equipo1 [nombre=" + nombre + ", entrenador=" + entrenador + ", jugadores=" + jugadores
				+ ", presupuesto=" + presupuesto + ", teléfono= " + contacto.get("telefono") + ", " + "fax= " + contacto.get("fax") + ", email="
						+ contacto.get("email") + "]";
	}
	
	
}
