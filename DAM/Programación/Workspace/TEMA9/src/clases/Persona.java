package clases;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	private double altura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Persona(String nombre, LocalDate fechaNacimiento, double altura) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
	}
	public Persona() {
		super();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", altura=" + altura + "]";
	}
	public boolean CumpleAnios() {
	LocalDate Hoy = LocalDate.now();
	fechaNacimiento = LocalDate.of(Hoy.getYear(), fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth());
	if(fechaNacimiento.isEqual(Hoy)) {
		return true;
	}
		return false;
	}

}
