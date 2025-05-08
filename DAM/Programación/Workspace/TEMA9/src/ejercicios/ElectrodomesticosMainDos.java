package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Electrodomesticos;
import clases.Lavadora;
import clases.OrdenarPorColorConsumo;
import clases.Television;

public class ElectrodomesticosMainDos {

	public static void main(String[] args){
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// creo los electrodomésticos
		List<Electrodomesticos> listas = new ArrayList<Electrodomesticos>(Arrays.asList(rellena(r)));

		int numero = 0;
		do {
			System.out.println("1. Ver electrodomésticos");
			System.out.println("2. Buscar electrodoméstico");
			System.out.println(
					"3. Pedir por consola un color, consumo, precio y peso y decir si hay algún electrodoméstico que tenga esos datos");
			System.out.println("0. salir");
			numero = Funciones.dimeEntero("opcion", sc);
			switch (numero) {
			case 1:
			verElectrodomesticos(listas); 
				break;
			case 2:
				List<Electrodomesticos> listaAuxiliar = pedirColorConsumo(sc, listas);
				listaAuxiliar.sort(new OrdenarPorColorConsumo());
				for (Electrodomesticos electrodomesticos : listaAuxiliar) {
					System.out.println(electrodomesticos);
				}
				System.out.println("¿Quieres borrar el ultimo electrodomestico?");
				listas.remove(listaAuxiliar.get(listas.size()-1));
				break;
			case 3:
				pedirColorConsumoPrecioPeso(sc, listas);
				break;
			case 0:
				break;
			}
		} while (numero != 0);

	}

	public static Electrodomesticos[] rellena(Random r) {
		List<String> colores = new ArrayList<String>(Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
		List<String> letras = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		Electrodomesticos[] lista = new Electrodomesticos[20];
		int tipo = 0;
		for (int i = 0; i < lista.length; i++) {
			tipo = r.nextInt(3);
			/*
			 * if(tipo==0) lista[i]=new
			 * Electrodomestico(Funciones.redondea(r.nextDouble(300,1000)),
			 * r.nextInt(50,300), colores.get(r.nextInt(colores.size())),
			 * letras.get(r.nextInt(letras.size()))); else if(tipo==1) lista[i]=new
			 * Lavadora(Funciones.redondea(r.nextDouble(300,1000)), r.nextInt(50,300),
			 * colores.get(r.nextInt(colores.size())), letras.get(r.nextInt(letras.size())),
			 * r.nextInt(10,100)); else lista[i]=new
			 * Televisor(Funciones.redondea(r.nextDouble(300,1000)), r.nextInt(50,300),
			 * colores.get(r.nextInt(colores.size())), letras.get(r.nextInt(letras.size())),
			 * r.nextInt(10,50),r.nextBoolean());
			 * 
			 * if(tipo==0) lista[i]=new Electrodomestico(); else if(tipo==1) lista[i]=new
			 * Lavadora(); else lista[i]=new Televisor();
			 */
			if (tipo == 0)
				lista[i] = new Electrodomesticos(Funciones.redondea(r.nextDouble(300, 1000)), r.nextInt(50, 300));
			else if (tipo == 1)
				lista[i] = new Lavadora(Funciones.redondea(r.nextDouble(300, 1000)), r.nextInt(50, 300));
			else
				lista[i] = new Television(Funciones.redondea(r.nextDouble(300, 1000)), r.nextInt(50, 300));
		}
		return lista;
	}
	public static void verElectrodomesticos(List<Electrodomesticos> listas) {
		listas.sort(null);
		for (Electrodomesticos electrodomestico : listas) {
			System.out.println(electrodomestico.toString());
		}
	}
	public static List<Electrodomesticos> pedirColorConsumo(Scanner sc , List<Electrodomesticos> listas) {
		
		System.out.println("Introduce un color de un electrodomestico");
		String color1 = sc.nextLine();
		System.out.println("Introduce un consumo energetico de un electrodomestico");
		String consumo1 = sc.nextLine();
		List<Electrodomesticos> listaAuxiliar = new ArrayList();
		for (Electrodomesticos electrodomesticos : listas) {
			if(electrodomesticos.getColor().equalsIgnoreCase(color1)&&electrodomesticos.getConsumoEnergetico().equalsIgnoreCase(consumo1)) {
				listaAuxiliar.add(electrodomesticos);
			}
			
			
		}
		return listaAuxiliar;
	}
	public static void pedirColorConsumoPrecioPeso(Scanner sc, List<Electrodomesticos> listas) {
		Electrodomesticos electrodomestico = new Electrodomesticos();
		System.out.println("Introduce un color de un electrodomestico");
		String color1 = sc.nextLine();
		System.out.println("Introduce un consumo energetico de un electrodomestico");
		String consumo1 = sc.nextLine();
		System.out.println("Introduce el precio de un electrodomestico");
		String precio1 = sc.nextLine();
		System.out.println("Introduce el peso de un electrodomestico");
		String peso1 = sc.nextLine();
		if(listas.contains(electrodomestico)) {
			System.out.println("Si que lo contiene");
		}else {
			System.out.println("No lo contiene");
		}
	}
		
	

}

/*
 * Partiendo de las clases Electrodomestico, Lavadora y Televisor, tenéis que
 * hacer el siguiente main: De inicio crear 20 electrodomésticos de los 3 tipos,
 * con datos aleatorios, guardándolos todos juntos en la misma lista. Luego
 * mostramos el siguiente menú: 1 – Ver electrodomésticos: saldrán los
 * electrodomésticos ordenados por precio descendente, mostraremos todos sus
 * datos 2 – Buscar electrodoméstico: pediremos por consola un color y un
 * consumo y mostraremos los primeros 5 electrodomésticos que tengan ese color y
 * consumo, ordenados por consumo energético descendente. Si hay menos de 5
 * saldrán los que haya. Preguntaremos al usuario si quiere borrar el último y
 * si dice que si lo borraremos. 3 – Pedir por consola un color, consumo, precio
 * y peso y decir si hay algún electrodoméstico que tenga esos datos. Hacerlo
 * sobreescribiendo el equals en la clase Electrodomestico. 4 - Salir
 */