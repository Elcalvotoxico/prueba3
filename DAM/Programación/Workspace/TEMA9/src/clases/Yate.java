package clases;

public  class Yate extends Barcos {
	protected boolean camarotes;
	public Yate(String nombre, int eslora, Motor motor, int capacidadCombustible, boolean camarotes,
			int numeroPasajeros) {
		super(nombre,eslora, motor, capacidadCombustible, numeroPasajeros);
		this.camarotes = camarotes;
		
	}
	public boolean capacidadDelCombustible(int capacidadCombustible) {
		if(capacidadCombustible>=500&&capacidadCombustible<=900) {
			return true;
		}else {
			return capacidadCombustible==500;
		}
	}
	
	

	@Override
	public double calcularAutonomia(int capacidadCombustible, int consumoMotor) {
		return capacidadCombustible * motor.getConsumo();

	}
}
