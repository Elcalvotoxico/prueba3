package clases;

public class PersonalSanitaria {
	public int nif;
	public String nombre;
	public String apellidos;
	public int edad;
	public double cantidad_de_sangre;
	public PersonalSanitaria(int nif, String nombre, String apellidos, int edad, double cantidad_de_sangre) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cantidad_de_sangre = cantidad_de_sangre;
	}
	public PersonalSanitaria() {
		super();
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getCantidad_de_sangre() {
		return cantidad_de_sangre;
	}
	public void setCantidad_de_sangre(double cantidad_de_sangre) {
		this.cantidad_de_sangre = cantidad_de_sangre;
	}
	
	public double donarSangre(double Cantidad) {
		if(cantidad_de_sangre - Cantidad > 0) {
			cantidad_de_sangre = cantidad_de_sangre - Cantidad;
		return Cantidad;
		}
		return 0;
	}
}
