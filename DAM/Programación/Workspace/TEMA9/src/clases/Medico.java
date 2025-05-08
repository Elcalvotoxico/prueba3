package clases;

public class Medico extends PersonalSanitaria {
public String especialidad;
public int numero_de_colegiado;
public Medico(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre, String especialidad,
		int numero_de_colegiado) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
	this.especialidad = especialidad;
	this.numero_de_colegiado = numero_de_colegiado;
}
public Medico(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
public int getNumero_de_colegiado() {
	return numero_de_colegiado;
}
public void setNumero_de_colegiado(int numero_de_colegiado) {
	this.numero_de_colegiado = numero_de_colegiado;
}

@Override
public double donarSangre(double Cantidad) {
	if(cantidad_de_sangre - Cantidad >= 2) {
		cantidad_de_sangre = cantidad_de_sangre - Cantidad;
		return Cantidad;
	}
	return 0;
}

}
