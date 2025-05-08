package clases;

public class Television extends Electrodomesticos{
public int resolucion;
public boolean sintonizador;

public Television() {
	super();
	this.resolucion = 20;
	this.sintonizador = false;
}

public Television(double precio, int peso) {
	super(precio, peso);
	this.resolucion = 20;
	this.sintonizador = false;
}

public Television(int resolucion, boolean sintonizador, double precio, int peso, String color, String consumoEnergetico) {
	super(precio, color, consumoEnergetico, peso);
	this.resolucion = resolucion;
	this.sintonizador = sintonizador;
}

public int getResolucion() {
	return resolucion;
}

public void setResolucion(int resolucion) {
	this.resolucion = resolucion;
}

public boolean isSintonizador() {
	return sintonizador;
}

public void setSintonizador(boolean sintonizador) {
	this.sintonizador = sintonizador;
}

@Override
public double PrecioFinal() {
	precio = super.PrecioFinal();
	if(resolucion > 40) {
		precio = precio*1.3;
	}
	if(sintonizador == true) {
		precio += 50;	
	}
	return precio;
}
}
