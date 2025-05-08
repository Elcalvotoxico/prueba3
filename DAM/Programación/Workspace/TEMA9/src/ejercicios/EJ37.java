package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import clases.Empleado;
import clases.Tienda;

public class EJ37 {
	public static void main(String[] args) {
		 List<Empleado> empleados = new ArrayList<Empleado>();
		 List<Tienda> tienda = new ArrayList<Tienda>();
		 generarEmpleados(empleados);
		 System.out.println(empleados);
		 generarTiendas(tienda,empleados);
		 System.out.println(tienda);
	}
	
	
	public static void generarEmpleados(List<Empleado> empleados) {
		Random random = new Random();		

		for (int i = 1; i < 11; i++) {
			Empleado emp = new Empleado(i, "nombre" + i, random.nextDouble(800, 1500));
			empleados.add(emp);
	}
	}
	public static void generarTiendas( List<Tienda> tienda, List<Empleado> empleados) {
		Random random = new Random();		

		for (int i = 1; i < 11; i++) {
			Tienda tien = new Tienda("nombre" + i, "direccion" + i);

			tienda.add(tien);
		}
		int empleadosTienda = random.nextInt(1,11);
		Empleado empleado = codigoEmpleado(empleadosTienda,empleados);
		for (Tienda tienda2 : tienda) {
			tienda2.anadirEmpleado(empleado);
		}
	}
	//metes un int id y devuelve un empleado
	public static Empleado codigoEmpleado(int idEmpleado, List<Empleado> empleados) {
		Iterator<Empleado> iter = empleados.iterator();
		while (iter.hasNext()) {
			Empleado empleado2 = iter.next();
			if (idEmpleado == empleado2.getIdEmpleado()) {
				iter.remove();
				return empleado2;
			}
		}
		return null;
			
	}
}
