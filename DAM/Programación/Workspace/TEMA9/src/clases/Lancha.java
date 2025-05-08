package clases;

public class Lancha extends Barcos{
	protected boolean proaCubierta;
	
	public Lancha(String nombre, int eslora, Motor motor, int capacidadCombustible, boolean proaCubierta,
			int numeroPasajeros) {
		super(nombre, eslora, motor, capacidadCombustible, numeroPasajeros);
		this.proaCubierta = proaCubierta;
		
	}
	public Lancha(String nombre, int eslora, Motor motor, boolean proaCubierta) {
		super(nombre, eslora, motor, 60, 6);
		this.proaCubierta = proaCubierta;
		
	}	
	public boolean capacidadDelCombustible(int capacidadCombustible) {
		if(capacidadCombustible>=50&&capacidadCombustible<=80) {
			return true;
		}else {
			return capacidadCombustible==50;
		}
		
	}
	

	@Override
	public double calcularAutonomia(int capacidadCombustible, int consumoMotor) {
		if(eslora>10) {
			return (capacidadCombustible/100*90)/motor.getConsumo();	
		}else {
			return (capacidadCombustible/motor.getConsumo());	

		}
	}
}
