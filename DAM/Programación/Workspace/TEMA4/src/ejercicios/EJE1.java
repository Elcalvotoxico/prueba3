package ejercicios;

public class EJE1 {

	public static void main(String[] args) {
		String saludo = "Buenos días";
		int edad = 18;
		String nombre = "Carlo";
		String apellido = "Calvo Bernal";
		System.out.println(saludo);
		System.out.println(edad);
		System.out.println(nombre);
		System.out.println(apellido);
		String s = notaAsignatura(10);
		System.out.println(s);
		String s1 = diaSemana(5);
		System.out.println(s1);
		for (int i = 1; i <= 20; i++) {
			if (par(i))
				System.out.println(i);
		}
		divisores(15);
	}

	public static void saludaNombreEdad(String saludo, String nombre, String apellido, int edad) {
		System.out.println(saludo + nombre + apellido + edad);
	}

	public static String notaAsignatura(int nota) {
		if (nota < 5)
			return "insuficiente";
		else if (nota == 5)
			return "suficiente";
		else if (nota == 6)
			return "bien";
		else if (nota == 7 || nota == 8)
			return "notable";
		else if (nota > 8)
			return "sobresaliente";
		return null;

	}

	public static String diaSemana(int numero) {
		if (numero == 1)
			return "1-Lunes";
		else if (numero == 2)
			return "2-Martes";
		else if (numero == 3)
			return "3-Miercoles";
		else if (numero == 4)
			return "4-Jueves";
		else if (numero == 5)
			return "5-Viernes";
		else if (numero == 6)
			return "6-Sabado";
		else if (numero == 7)
			return "7-Domingo";
		return null;

	}

	public static boolean par(int numero) {
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	public static void divisores(int numero) {
		if (numero > 1) {
			for (int m = 1; m <= numero; m++)
				if (numero % m == 0) {
					if(m==1) {
					System.out.print(m);
					}
					else
						System.out.print(" , " + m);
				}
		}
	}

}
