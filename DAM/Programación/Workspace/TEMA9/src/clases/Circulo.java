package clases;

public class Circulo {
	private double radio;
	public Circulo(double radio){
		this.radio = radio;
	}
	public void getRadio(double radio) {
		this.radio = radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calculaSuperficie() {
		return 2 * Math.PI * radio;
	}

	public double calculaArea() {
		return Math.PI * radio * radio;
	}

}
