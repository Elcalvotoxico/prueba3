package Clases;

import java.time.LocalDate;

public abstract class Evento {
	protected LocalDate fecha;
	protected int numeroPersonas;
	protected Sitio sitio;
	
	public Evento(LocalDate fecha, int numeroPersonas, Sitio sitio) {
		super();
		this.fecha = fecha;
		this.numeroPersonas = numeroPersonas;
		this.sitio = sitio;
	}
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public int getNumeroPersonas() {
		return numeroPersonas;
	}



	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}



	public Sitio getSitio() {
		return sitio;
	}



	public void setSitio(Sitio sitio) {
		this.sitio = sitio;
	}



	@Override
	public String toString() {
		return "Evento [fecha=" + fecha + ", numeroPersonas=" + numeroPersonas + ", sitio=" + sitio + "]";
	}



	public abstract double calcularCosto();
	
	public boolean validarFecha() {
		LocalDate fechaHoy = LocalDate.now();
		if(fecha.isAfter(fechaHoy)) {
			return true;
		}else {
			return false;
		}
	}
}
