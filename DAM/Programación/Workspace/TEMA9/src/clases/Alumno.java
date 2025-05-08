package clases;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import ejercicios.Funciones;
public class Alumno extends Persona3 {
	private int idAlumno,curso;
	private String estudiosPrevios;
	
	public Alumno()
	{
		super();
	}
	
	public Alumno(String nombre, String apellidos, String nif, Date fechaNacimiento, int altura, int idAlumno,
			int curso, String estudiosPrevios) {
		super(nombre, apellidos, nif, fechaNacimiento, altura);
		this.idAlumno = idAlumno;
		this.curso = curso;
		this.estudiosPrevios = estudiosPrevios;
	}

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
	

	@Override
	public int calculaEdad() {
		int years = super.calculaEdad();
		if(years > 20) {
			return years - 1;
		}
		return years;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", curso=" + curso + ", estudiosPrevios=" + estudiosPrevios
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", fechaNacimiento="
				+ Funciones.convierte_Date_a_String(fechaNacimiento) + ", altura=" + altura;
	}
}
