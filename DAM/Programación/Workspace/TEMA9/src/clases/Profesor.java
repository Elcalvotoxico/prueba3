package clases;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import ejercicios.Funciones;
public class Profesor extends Persona3{
	private double sueldo, saldo;
	private int idProfesor;
	public Profesor()
	{
		super();
	}
	public Profesor(String nombre, String apellidos, String nif, Date fechaNacimiento, int altura, 
			double sueldo, double saldo,int idProfesor) {
		super(nombre, apellidos, nif, fechaNacimiento, altura);
		this.idProfesor = idProfesor;
		this.sueldo = sueldo;
		this.saldo = saldo;
	}
	public int getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public int calculaEdad() {
		int años = super.calculaEdad();
		if(años > 40) {
			return 40;
		}
		return años;
	}
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", sueldo=" + sueldo + ", saldo=" + saldo + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", nif=" + nif + ", fechaNacimiento=" + ejercicios.Funciones.convierte_Date_a_String(fechaNacimiento) + ", altura="
				+ altura + "]";
	}
}
