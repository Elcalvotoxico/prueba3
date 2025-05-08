package clases1;

public class Profesor1 extends Persona1 {
private int cuentaBancaria;

@Override
public String toString() {
	return "Profesor1 [cuentaBancaria=" + cuentaBancaria + "]";
}

public int getCuentaBancaria() {
	return cuentaBancaria;
}

public void setCuentaBancaria(int cuentaBancaria) {
	this.cuentaBancaria = cuentaBancaria;
}

public void cobraSueldo(int incremento) {
	cuentaBancaria = cuentaBancaria + incremento;
}
}
