package clases1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Jugador {
public int IdJugador;
public String Nombre;
public LocalDate Fichaje;
public int golesMarcados;
List<String> recuerdos;

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

public LocalDate getFichaje() {
	return Fichaje;
}

public void setFichaje(LocalDate fichaje) {
	Fichaje = fichaje;
}

public int getGolesMarcados() {
	return golesMarcados;
}

public void setGolesMarcados(int golesMarcados) {
	this.golesMarcados = golesMarcados;
}

public List<String> getRecuerdos() {
	return recuerdos;
}

public void setRecuerdos(List<String> recuerdos) {
	this.recuerdos = recuerdos;
}

public Jugador(int idJugador, String nombre, int golesMarcados) {
	super();
	IdJugador = idJugador;
	Nombre = nombre;
	this.golesMarcados = golesMarcados;
	}

public Jugador() {
	super();
}

@Override
public String toString() {
	return "Jugador [IdJugador=" + IdJugador + ", Nombre=" + Nombre + ", Fichaje=" + Fichaje + ", golesMarcados="
			+ golesMarcados + ", recuerdos=" + recuerdos + "]";
}	

public void MarcaGol() {
	golesMarcados += 1;
	recuerdos.add("gol" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
}
}
