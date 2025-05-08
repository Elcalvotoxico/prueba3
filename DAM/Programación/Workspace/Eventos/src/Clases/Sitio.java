package Clases;

public class Sitio {
	private int cpacidad;
	private String direccion;
	public int getCpacidad() {
		return cpacidad;
	}
	public void setCpacidad(int cpacidad) {
		this.cpacidad = cpacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Sitio(int cpacidad, String direccion) {
		super();
		this.cpacidad = cpacidad;
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Sitio [cpacidad=" + cpacidad + ", direccion=" + direccion + "]";
	}
	
	
}
