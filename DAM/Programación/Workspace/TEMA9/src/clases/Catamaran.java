package clases;

public class Catamaran extends Barcos{
	protected Motor motorSecundario;
	public Catamaran(String nombre, int eslora, Motor motor, int capacidadCombustible, Motor motorSecundario,
			int numeroPasajeros) {
		super(nombre,eslora, motor, capacidadCombustible, numeroPasajeros);
		this.motorSecundario = motorSecundario;
	}
	public boolean capacidadDelCombustible(int capacidadCombustible) {
		if(capacidadCombustible>=300&&capacidadCombustible<=600) {
			return true;
		}else {
			return capacidadCombustible==500;
		}
	}
	@Override
	public double calcularAutonomia(int capacidadCombustible, int consumoMotor) {
		return capacidadCombustible /( motorSecundario.getConsumo()/100*80+motor.getConsumo());
	}
}
