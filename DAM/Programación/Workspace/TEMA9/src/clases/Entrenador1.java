package clases;

import java.util.Date;

public class Entrenador1 {
	protected int IdEntrenador;
	protected String NIf;
	protected String Nombre;
	protected String Apellido;
	protected int edad;
	protected Date Fecha_Fichaje;
	protected Double Nomina_Actual;
	protected Double SaldoCuenta;

	public Entrenador1(int idEntrenador, String nIf, String nombre, String apellido, int edad, Date fecha_Fichaje,
			Double nomina_Actual, Double saldoCuenta) {
		super();
		IdEntrenador = idEntrenador;
		NIf = nIf;
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		Fecha_Fichaje = fecha_Fichaje;
		Nomina_Actual = nomina_Actual;
		SaldoCuenta = saldoCuenta;
	}

	public Entrenador1() {
		super();
	}

	public int getIdEntrenador() {
		return IdEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		IdEntrenador = idEntrenador;
	}

	public String getNIf() {
		return NIf;
	}

	public void setNIf(String nIf) {
		NIf = nIf;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha_Fichaje() {
		return Fecha_Fichaje;
	}

	public void setFecha_Fichaje(Date fecha_Fichaje) {
		Fecha_Fichaje = fecha_Fichaje;
	}

	public Double getNomina_Actual() {
		return Nomina_Actual;
	}

	public void setNomina_Actual(Double nomina_Actual) {
		Nomina_Actual = nomina_Actual;
	}

	public Double getSaldoCuenta() {
		return SaldoCuenta;
	}

	public void setSaldoCuenta(Double saldoCuenta) {
		SaldoCuenta = saldoCuenta;
	}

	@Override
	public String toString() {
		return "Entrenador1 [IdEntrenador=" + IdEntrenador + ", NIf=" + NIf + ", Nombre=" + Nombre + ", Apellido="
				+ Apellido + ", edad=" + edad + ", Fecha_Fichaje=" + Fecha_Fichaje + ", Nomina_Actual=" + Nomina_Actual
				+ ", SaldoCuenta=" + SaldoCuenta + "]";
	}

	private String CumpleAnios() {
		edad = edad + 1;
		return "Felicidades Mister";
	}

	private void CobraSueldo() {
		SaldoCuenta += Nomina_Actual;
	}

	private void CobraSueldo(Double incentivo) {
		SaldoCuenta += Nomina_Actual + incentivo;
	}
}

