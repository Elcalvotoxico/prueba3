package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Particular2 {
	private String nombre;
	private int edad;
	private String email;
	private ArrayList<String> listaTelefonica;
	public int calcularSeguro() {
		 return 1000/edad;
	}
	public void anadirTelefono(String telefono) {
		listaTelefonica.add(telefono);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Particular2 [nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", listaTelefonica="
				+ listaTelefonica + "]";
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
	public ArrayList<String> getListaTelefonica() {
		return listaTelefonica;
	}
	public void setListaTelefonica(ArrayList<String> listaTelefonica) {
		this.listaTelefonica = listaTelefonica;
	}
	public Particular2(String nombre, int edad, String email, ArrayList<String> listaTelefonica) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.listaTelefonica = listaTelefonica;
	}
	public Particular2(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	public Particular2() {
		super();
	}
	
}
