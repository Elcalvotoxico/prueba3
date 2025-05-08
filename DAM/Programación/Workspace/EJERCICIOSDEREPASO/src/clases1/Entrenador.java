package clases1;

public class Entrenador {
private int	IdEntrenador;
private String Nombre;
private double Sueldo;
private double SaldoBanco;

public int getIdEntrenador() {
	return IdEntrenador;
}

public void setIdEntrenador(int idEntrenador) {
	IdEntrenador = idEntrenador;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public double getSueldo() {
	return Sueldo;
}

public void setSueldo(double sueldo) {
	Sueldo = sueldo;
}

public double getSaldoBanco() {
	return SaldoBanco;
}

public void setSaldoBanco(double saldoBanco) {
	SaldoBanco = saldoBanco;
}

public Entrenador(int idEntrenador, String nombre, double sueldo, double saldoBanco) {
	super();
	IdEntrenador = idEntrenador;
	Nombre = nombre;
	Sueldo = sueldo;
	SaldoBanco = saldoBanco;
}

public Entrenador() {
	super();
}

@Override
public String toString() {
	return "Entrenador [IdEntrenador=" + IdEntrenador + ", Nombre=" + Nombre + ", Sueldo=" + Sueldo + ", SaldoBanco="
			+ SaldoBanco + "]";
}

public void CobraSueldo(double importe) {
	this.Sueldo += importe;
}
}
