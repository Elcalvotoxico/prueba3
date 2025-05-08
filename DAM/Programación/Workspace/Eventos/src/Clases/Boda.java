package Clases;

import java.time.LocalDate;

public class Boda extends Evento {
	private String nombreNovia;
	private String nombreNovio;
	private boolean catering;

	public Boda(LocalDate fecha, int numeroPersonas, Sitio sitio, String nombreNovia, String nombreNovio,
			boolean catering) {
		super(fecha, numeroPersonas, sitio);
		this.nombreNovia = nombreNovia;
		this.nombreNovio = nombreNovio;
		this.catering = catering;
	}
	
	
	
	public String getNombreNovia() {
		return nombreNovia;
	}



	public void setNombreNovia(String nombreNovia) {
		this.nombreNovia = nombreNovia;
	}



	public String getNombreNovio() {
		return nombreNovio;
	}



	public void setNombreNovio(String nombreNovio) {
		this.nombreNovio = nombreNovio;
	}



	public boolean isCatering() {
		return catering;
	}



	public void setCatering(boolean catering) {
		this.catering = catering;
	}



	@Override
	public double calcularCosto() {
		double costeInicial = 5000;
		double costeActualizado;
		if (catering == true) {

			costeActualizado = costeInicial + numeroPersonas * 50;
		} else {
			costeActualizado = costeInicial + numeroPersonas * 10;
		}
		return costeActualizado;
	}
	
	public double calcularPrespuestoPorInvitado() {
		return calcularCosto() / numeroPersonas;
	}

}
