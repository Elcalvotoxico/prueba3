package clases1;

import java.time.LocalDate;

public class Profesor extends Persona{
private int IdProfesor;
private double Sueldo;
private double Saldo;

public Profesor(String nombre, String apellidos, int nif, LocalDate fechaNacimiento, double altura, int idProfesor,
		double sueldo, double saldo) {
	super(nombre, apellidos, nif, fechaNacimiento, altura);
	IdProfesor = idProfesor;
	Sueldo = sueldo;
	Saldo = saldo;
}

public int getIdProfesor() {
	return IdProfesor;
}

public void setIdProfesor(int idProfesor) {
	IdProfesor = idProfesor;
}

public double getSueldo() {
	return Sueldo;
}

public void setSueldo(double sueldo) {
	Sueldo = sueldo;
}

public double getSaldo() {
	return Saldo;
}

public void setSaldo(double saldo) {
	Saldo = saldo;
}

@Override
public int calculaEdad() {
	if(super.calculaEdad() > 40) {
		return 40;
	}
	return super.calculaEdad();
}

@Override
public String toString() {
	return super.toString() + "Profesor [IdProfesor=" + IdProfesor + ", Sueldo=" + Sueldo + ", Saldo=" + Saldo + "]";
}


}
