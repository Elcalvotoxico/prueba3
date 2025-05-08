package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Jugador {
private int IdJugador;
private String Nombre;
private LocalDate Fecha_Fichaje;
private int Numero_De_Goles_Marcados;
private ArrayList<String> RecuerdosEspeciales;

public int getIdJugador() {
	return IdJugador;
}

public void setIdJugador(int idJugador) {
	IdJugador = idJugador;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public LocalDate getFecha_Fichaje() {
	return Fecha_Fichaje;
}

public void setFecha_Fichaje(LocalDate fecha_Fichaje) {
	Fecha_Fichaje = fecha_Fichaje;
}

public int getNumero_De_Goles_Marcados() {
	return Numero_De_Goles_Marcados;
}

public void setNumero_De_Goles_Marcados(int numero_De_Goles_Marcados) {
	Numero_De_Goles_Marcados = numero_De_Goles_Marcados;
}

public ArrayList<String> getRecuerdosEspeciales() {
	return RecuerdosEspeciales;
}

public void setRecuerdosEspeciales(ArrayList<String> recuerdosEspeciales) {
	RecuerdosEspeciales = recuerdosEspeciales;
}

public Jugador(int idJugador, String nombre, int numero_De_Goles_Marcados) {
	super();
	IdJugador = idJugador;
	Nombre = nombre;
	Fecha_Fichaje = LocalDate.now();
	Numero_De_Goles_Marcados = numero_De_Goles_Marcados;
	RecuerdosEspeciales = new ArrayList<String>();
}

public Jugador() {
	super();
	RecuerdosEspeciales = new ArrayList<String>();
	Fecha_Fichaje = LocalDate.now();
}

public void MarcaGol(/*ArrayList<String> RecuerdosEspeciales preguntar como puedo guardar un string en la lista: Se hace con el nombrelista.add(s*/) {
	int numeroDeGoles = 0;
	numeroDeGoles = numeroDeGoles + 1;
	LocalDate fechaGol = LocalDate.now();
	String numeroDeGoles1 = numeroDeGoles + "";
	numeroDeGoles1 = numeroDeGoles1 + " "+ "goles" + "-" + fechaGol;
	RecuerdosEspeciales.add(numeroDeGoles1);	
	}
}
