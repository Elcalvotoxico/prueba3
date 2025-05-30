package clases;

public class Particular {
	private String nombre;
	private int edad;
	private String email;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Particular() {
		super();
	}


	public Particular(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Particular [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}


	public double CalcularSeguro() {
		return 1000/edad; 
	}
}

