package clases1;

import java.time.LocalDate;

public class Persona {
private String nombre;
private String apellidos;
private int nif;
private LocalDate fechaNacimiento;
private double altura;
public Persona(String nombre, String apellidos, int nif, LocalDate fechaNacimiento, double altura) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.nif = nif;
	this.fechaNacimiento = fechaNacimiento;
	this.altura = altura;
}

public Persona() {
	super();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getNif() {
	return nif;
}

public void setNif(int nif) {
	this.nif = nif;
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

public int calculaEdad() {
	int anionacimiento = fechaNacimiento.getYear();
	int anioactual = LocalDate.now().getYear();
	return anioactual - anionacimiento;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", FechaNacimiento="
			+ fechaNacimiento + ", altura=" + altura + "]";
}


}
