package clases;

public class Lavadora extends Electrodomesticos{
public int Carga;

public Lavadora() {
	super();
	Carga = 5;
}
public Lavadora(double precio, int peso) {
	super(precio, peso);
	this.Carga = 5;

}
public Lavadora(int carga, double precio, int peso, String color, String consumoEnergetico) {
	super(precio, color, consumoEnergetico, peso);//preguntar
	this.Carga = carga;
}

public int getCarga() {
	return Carga;
}
public void setCarga(int carga) {
	Carga = carga;
}

@Override
public double PrecioFinal() {
	precio = super.PrecioFinal();
	if(Carga < 30) {
		precio += 50;
	}
	return precio;
}
}
