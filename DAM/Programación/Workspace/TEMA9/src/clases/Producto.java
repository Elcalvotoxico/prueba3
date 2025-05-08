package clases;

public class Producto {
	private int Codigo;
	private double Precio;
	private String Nombre;
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Producto(int codigo, double precio, String nombre) {
		super();
		Codigo = codigo;
		Precio = precio;
		Nombre = nombre;
	}
	public Producto() {
		super();
	}
	@Override
	public String toString() {
		return "Producto [Codigo=" + Codigo + ", Precio=" + Precio + ", Nombre=" + Nombre + "]";
	}
	
}
