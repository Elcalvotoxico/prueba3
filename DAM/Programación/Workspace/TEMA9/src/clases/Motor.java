package clases;

public class Motor {
	protected String modelo;
	protected int potencia;
	protected int consumo;
	public Motor(String modelo, int potencia, int consumo) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
		this.consumo = consumo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", potencia=" + potencia + ", consumo=" + consumo + "]";
	}
	
	
	
}
