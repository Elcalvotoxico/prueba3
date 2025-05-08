package Clases;

import java.time.LocalDate;

public class Concierto extends Evento{
	private String artista;
	private String nombre;
	private int precioEntrada;
	
	public Concierto(LocalDate fecha, int numeroPersonas, Sitio sitio, String artista, String nombre,
			int precioEntrada) {
		super(fecha, numeroPersonas, sitio);
		this.artista = artista;
		this.nombre = nombre;
		this.precioEntrada = precioEntrada;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	@Override
	public double calcularCosto() {
		double costeInicial = 10000;
		double costeActualizado;
		costeActualizado = costeInicial + numeroPersonas * (precioEntrada * 0.3);
		
		return costeActualizado;
	}
	
	
	
}
