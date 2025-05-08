package clases;

import java.util.List;

public abstract class Barcos{
	protected String nombre;
	protected int eslora;
	protected Motor motor;
	protected int capacidadCombustible;
	protected int numeroPasajeros;

	public abstract double calcularAutonomia(int capacidadCombustible, int consumoMotor);
	
	public Barcos(String nombre, int eslora, Motor motor, int capacidadCombustible, int numeroPasajeros) {
		this.nombre = nombre;
		this.eslora = eslora;
		this.motor = motor;
		this.capacidadCombustible = capacidadCombustible;
		this.numeroPasajeros = numeroPasajeros;
		
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	

    @Override
	public String toString() {
		return "Barcos [nombre=" + nombre + ", eslora=" + eslora + ", motor=" + motor + ", capacidadCombustible="
				+ capacidadCombustible + ", numeroPasajeros=" + numeroPasajeros + "]";
	}

	public double calcularPrecioViaje(int horas) {
        double autonomia = calcularAutonomia(capacidadCombustible, motor.getConsumo());
        if (autonomia < horas) {
            return -1;
        }
        return horas * Puerto.precioGasolina * motor.getConsumo();
    }
	public static List<Barcos> mayorCombustible(List<Barcos> barcos) {
		List<Barcos> barcoscopia = barcos;
		barcoscopia.sort(new OrdenarPorCombustible());
		return barcoscopia;
	}
}
