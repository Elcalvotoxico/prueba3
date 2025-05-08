package Ejercicio;

public class ej4 {

	public static void main(String[] args) {
		
	}
	
	public int sumaPositivos(int a, int b) throws MiException{
		if(a<0 || b<0) {
			throw new MiException("No se pueden sumar números negativos");
		}
		else {
			return a+b;
		}
	}
	class MiException extends Exception {
	    public MiException(String mensaje) {
	        super(mensaje);    
		}

	
	}
}
