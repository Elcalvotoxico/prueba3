package clases;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Electrodomesticos implements Comparable<Electrodomesticos>{
public double precio;
public String color;
public String consumoEnergetico;
public int peso;
private List<String> letraconsumo;
private List<String> comprobarcolor;
private List<Integer> precioconsumo;
private Map<String, Integer> consumoPrecio;
private void rellenarHasMap() {
	letraconsumo = new ArrayList<String>();
	comprobarcolor = new ArrayList<String>();
	precioconsumo = new ArrayList<Integer>();
	consumoPrecio = new HashMap<String, Integer>();
	letraconsumo.add("A");
	letraconsumo.add("B");
	letraconsumo.add("C");
	letraconsumo.add("D");
	letraconsumo.add("E");
	letraconsumo.add("F");
	comprobarcolor.add("Blanco");
	comprobarcolor.add("Negro");
	comprobarcolor.add("Rojo");
	comprobarcolor.add("Azul");
	comprobarcolor.add("Gris");
	precioconsumo.add(100);
	precioconsumo.add(80);
	precioconsumo.add(60);
	precioconsumo.add(50);
	precioconsumo.add(30);
	precioconsumo.add(10);
	for (int i = 0; i < letraconsumo.size(); i++) {
		consumoPrecio.put(letraconsumo.get(i),precioconsumo.get(i));
	}
}
public Electrodomesticos() {
	super();
	this.color = "blanco";
	this.consumoEnergetico = "F";
	this.peso = 5;
	this.precio = 100;
	rellenarHasMap();
	
}
public Electrodomesticos(double precio, int peso) {
	super();
	this.precio = precio;
	this.peso = peso;
	this.consumoEnergetico = "F";
	this.color = "blanco";
}
public Electrodomesticos(double precio, String color, String consumoEnergetico, int peso) {
	super();
	this.precio = precio;
	this.color = color;
	this.consumoEnergetico = consumoEnergetico;
	this.peso = peso;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getConsumoEnergetico() {
	return consumoEnergetico;
}

public void setConsumoEnergetico(String consumoEnergetico) {
	this.consumoEnergetico = consumoEnergetico;
}

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}


@Override
public String toString() {
	return "Electrodomesticos [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
			+ ", peso=" + peso + ", letraconsumo=" + letraconsumo + ", comprobarcolor=" + comprobarcolor
			+ ", precioconsumo=" + precioconsumo + ", consumoPrecio=" + consumoPrecio + "]";
}

private void comprobarConsumoEnergetico(String consumoEnergetico) {
	letraconsumo.contains(consumoEnergetico);
	this.consumoEnergetico = "F";
	
}
private void comprobarColor(String color) {
	comprobarcolor.contains(color);
	this.color = "Blanco";
}
public double PrecioFinal() {
	precio += consumoPrecio.get(consumoEnergetico);
	if(peso >= 0 && peso <= 19) {
		precio += 10;
	}else if(peso >= 20 && peso <= 49) {
		precio += 50;
	}else if(peso >= 50 && peso <= 79) {
		precio += 80;
	}else if(peso >= 80) {
		precio += 100; 
	}
	return precio;
}
@Override
public int compareTo(Electrodomesticos elect) {
	if(precio < elect.getPrecio()) {
		return 1;
	}else if(precio > elect.getPrecio()) {
		return -1;
	}
	return 0;
}

@Override
public boolean equals(Object obj) {
	Electrodomesticos ele = (Electrodomesticos) obj; 
	if(ele.getColor().equalsIgnoreCase(this.color)&&ele.getConsumoEnergetico().equalsIgnoreCase(this.consumoEnergetico)&&ele.getPrecio()==this.precio&&ele.getPeso()==this.peso) {
		return true;
	}
	return false;
}
//&&ele.getPrecio().equalsIgnoreCase(this.Precio)&&ele.getPeso().equalsIgnoreCase(this.Peso)
}
