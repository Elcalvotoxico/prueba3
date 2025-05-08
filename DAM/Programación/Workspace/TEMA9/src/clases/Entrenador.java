package clases;

public class Entrenador {
	private int IdEntrenador;
	private String Nombre;
	private int sueldo;
	private int Saldo_Cuenta_Bancaria;

	public int getIdEntrenador() {
		return IdEntrenador;
	}
	
	public void setIdEntrenador(int idEntrenador) {
		IdEntrenador = idEntrenador;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public int getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public int getSaldo_Cuenta_Bancaria() {
		return Saldo_Cuenta_Bancaria;
	}
	
	public void setSaldo_Cuenta_Bancaria(int saldo_Cuenta_Bancaria) {
		Saldo_Cuenta_Bancaria = saldo_Cuenta_Bancaria;
	}
	
	public Entrenador(int idEntrenador,int sueldo, int saldo_Cuenta_Bancaria) {
		super();
		IdEntrenador = idEntrenador;
		this.sueldo = sueldo;
		Saldo_Cuenta_Bancaria = saldo_Cuenta_Bancaria;
	}
	
	public Entrenador() {
		super();
	}
	
	public int cobraSueldo(int importe) {
		return Saldo_Cuenta_Bancaria = Saldo_Cuenta_Bancaria + importe;
	}
}
