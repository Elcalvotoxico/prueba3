package clases1;

import java.time.LocalDate;

public class Alumno extends Persona {
private int idAlumno;
private int curso;
private String estudiosPrevios;

public int getIdAlumno() {
	return idAlumno;
}

public void setIdAlumno(int idAlumno) {
	this.idAlumno = idAlumno;
}

public int getCurso() {
	return curso;
}

public void setCurso(int curso) {
	this.curso = curso;
}

public String getEstudiosPrevios() {
	return estudiosPrevios;
}

public void setEstudiosPrevios(String estudiosPrevios) {
	this.estudiosPrevios = estudiosPrevios;
}

public Alumno(String nombre, String apellidos, int nif, LocalDate fechaNacimiento, double altura, int idAlumno, int curso,
		String estudiosPrevios) {
	super(nombre, apellidos, nif, fechaNacimiento, altura);
	this.idAlumno = idAlumno;
	this.curso = curso;
	this.estudiosPrevios = estudiosPrevios;
}

@Override
public int calculaEdad() {
	if(super.calculaEdad() > 20) {
		return super.calculaEdad() - 1;
	}
	return super.calculaEdad();
}
	
@Override
public String toString() {
	return super.toString() + "Alumno [idAlumno=" + idAlumno + ", curso=" + curso + ", estudiosPrevios=" + estudiosPrevios + "]";
}


}
