package clases;

import java.util.Date;
import java.util.List;

public class Jugador1 {
	protected int IdJugador;
	protected String Nif;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	protected Date Fecha_Fichaje;
	protected int NumeroGoles;
	protected List<String> RecuerdosEpeciales;

	public Jugador1(int idJugador, String nif, String nombre, String apellidos, int edad, Date fecha_Fichaje,
			int numeroGoles, List<String> recuerdosEpeciales) {
		super();
		IdJugador = idJugador;
		Nif = nif;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
		Fecha_Fichaje = fecha_Fichaje;
		NumeroGoles = numeroGoles;
		RecuerdosEpeciales = recuerdosEpeciales;
	}

	public Jugador1() {
		super();
	}

	public int getIdJugador() {
		return IdJugador;
	}

	public void setIdJugador(int idJugador) {
		IdJugador = idJugador;
	}

	public String getNif() {
		return Nif;
	}

	public void setNif(String nif) {
		Nif = nif;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public Date getFecha_Fichaje() {
		return Fecha_Fichaje;
	}

	public void setFecha_Fichaje(Date fecha_Fichaje) {
		Fecha_Fichaje = fecha_Fichaje;
	}

	public int getNumeroGoles() {
		return NumeroGoles;
	}

	public void setNumeroGoles(int numeroGoles) {
		NumeroGoles = numeroGoles;
	}

	public List<String> getRecuerdosEpeciales() {
		return RecuerdosEpeciales;
	}

	public void setRecuerdosEpeciales(List<String> recuerdosEpeciales) {
		RecuerdosEpeciales = recuerdosEpeciales;
	}

	@Override
	public String toString() {
		return "Jugador1 [IdJugador=" + IdJugador + ", Nif=" + Nif + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", Edad=" + Edad + ", Fecha_Fichaje=" + Fecha_Fichaje + ", NumeroGoles=" + NumeroGoles
				+ ", RecuerdosEpeciales=" + RecuerdosEpeciales + "]";
	}

	private String CumpleAnios() {
		Edad = Edad + 1;
		String frase = "Felicidades campeon";
		if (Edad > 30) {
			frase = frase + "ya va siendo hora de jubilarse";
		}
		return frase;
	}

	private void MarcaGol() {
		NumeroGoles = NumeroGoles + 1;
	}

	private void MarcaGol(String recuerdo) {
		NumeroGoles = NumeroGoles + 1;
		RecuerdosEpeciales.add(recuerdo);
	}
}
