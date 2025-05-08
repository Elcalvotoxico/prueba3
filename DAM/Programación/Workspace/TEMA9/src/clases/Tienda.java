package clases;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
private String nombre;
private String direccion;
 private List<Empleado> empleados;
 
public Tienda(String nombre, String direccion, List<Empleado> empleados) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.empleados = empleados;
}
public Tienda(String nombre, String direccion) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
}
public Tienda() {
	empleados = new ArrayList<Empleado>();
}
 public void anadirEmpleado(Empleado empleado) {
	 empleados.add(empleado);
 }
 public double pagoMensual() {
	 double pagoTotal = 0;
	for (Empleado empleado : empleados) {
		pagoTotal += empleado.getSueldo() + empleado.getSueldo() * empleado.getComision();
		
	}
	return pagoTotal;
 }
 public double establecerComision() {
	 if(pagoMensual()>2000) {
		 double pagoTotal = 0;
			for (Empleado empleado : empleados) {
				pagoTotal += empleado.getSueldo() + empleado.getSueldo() * (0.05 + empleado.getComision());
				
			}
			return pagoTotal;
	 }else {
		return pagoMensual();
	 }

 }
}
