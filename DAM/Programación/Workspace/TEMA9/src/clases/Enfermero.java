package clases;

public class Enfermero extends PersonalSanitaria {
public String especialidad;
public int anio_de_finalizacion_de_estudios;
public Enfermero(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre, String especialidad,
		int anio_de_finalizacion_de_estudios) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
	this.especialidad = especialidad;
	this.anio_de_finalizacion_de_estudios = anio_de_finalizacion_de_estudios;
}
public Enfermero(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
public int getAnio_de_finalizacion_de_estudios() {
	return anio_de_finalizacion_de_estudios;
}
public void setAnio_de_finalizacion_de_estudios(int anio_de_finalizacion_de_estudios) {
	this.anio_de_finalizacion_de_estudios = anio_de_finalizacion_de_estudios;
}

@Override
public double donarSangre(double Cantidad) {
	if(cantidad_de_sangre - Cantidad >= 3) {
		cantidad_de_sangre = cantidad_de_sangre - Cantidad;
		return Cantidad;
	}
	return 0;
}

}
