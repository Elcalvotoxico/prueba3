package clases;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class Persona3 {
	protected String nombre, apellidos, nif;
	protected Date fechaNacimiento;
	protected int altura;
	public Persona3()
	{
		
	}
	public Persona3(String nombre, String apellidos, String nif, Date fechaNacimiento, int altura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calculaEdad (){
		//tengo que ver cuántos años tiene
		//paso la fecha a LocalDate
		LocalDate fn = ejercicios.Funciones.convierteDateToLocalDate(fechaNacimiento);
		return (int)ChronoUnit.YEARS.between(fn,LocalDate.now());
	}

	@Override
	public String toString() {
		return "Persona3 [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", fechaNacimiento="
				+ fechaNacimiento + ", altura=" + altura + "]";
	}
	
	public void cambiaAltura()
	{
		this.altura+=5;
	}
}
