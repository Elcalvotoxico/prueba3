package clases1;

public class Persona1{
private double altura;
@Override
public String toString() {
	return "Persona1 [altura=" + altura + "]";
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public void cambiarAltura() {
	altura = altura + 5;
}

}
