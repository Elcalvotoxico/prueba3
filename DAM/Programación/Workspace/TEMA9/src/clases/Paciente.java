package clases;

import java.util.Date;

public class Paciente extends PersonalSanitaria {
public Date fecha_del_ingreso;
public String causa_del_ingreso;
public Medico medico;
public Enfermero enfermero;
public Paciente(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre, Date fecha_del_ingreso,
		String causa_del_ingreso, Medico medico, Enfermero enfermero) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
	this.fecha_del_ingreso = fecha_del_ingreso;
	this.causa_del_ingreso = causa_del_ingreso;
	this.medico = medico;
	this.enfermero = enfermero;
}
public Paciente(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre) {
	super(nif, nombre, apellidos, edad, cantidad_de_sangre);
}
public Date getFecha_del_ingreso() {
	return fecha_del_ingreso;
}
public void setFecha_del_ingreso(Date fecha_del_ingreso) {
	this.fecha_del_ingreso = fecha_del_ingreso;
}
public String getCausa_del_ingreso() {
	return causa_del_ingreso;
}
public void setCausa_del_ingreso(String causa_del_ingreso) {
	this.causa_del_ingreso = causa_del_ingreso;
}
public Medico getMedico() {
	return medico;
}
public void setMedico(Medico medico) {
	this.medico = medico;
}
public Enfermero getEnfermero() {
	return enfermero;
}
public void setEnfermero(Enfermero enfermero) {
	this.enfermero = enfermero;
}

@Override
public double donarSangre(double Cantidad) {
	if(cantidad_de_sangre - Cantidad >= 5) {
		cantidad_de_sangre = cantidad_de_sangre - Cantidad;
		return Cantidad;
	}
	return 0;
}

}
