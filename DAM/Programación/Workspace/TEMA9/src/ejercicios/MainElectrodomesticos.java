package ejercicios;

import clases.Electrodomesticos;
import clases.Lavadora;
import clases.Television;

public class MainElectrodomesticos {

	public static void main(String[] args) {
		Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
		for (int i = 0; i < electrodomesticos.length - 5; i++) {
			electrodomesticos[i] = new Television();
			electrodomesticos[i+5] = new Lavadora();
		}
		
		double precioTele = 0.0;
		double precioLavadora = 0.0;
		double precioElectrodomesticos = 0.0;
		
		for (Electrodomesticos electrodomestico : electrodomesticos) {
			Double preciosuma = electrodomestico.PrecioFinal();
			if(electrodomestico instanceof Lavadora) {
				precioLavadora += preciosuma;
			}else if(electrodomestico instanceof Television) {
				precioTele += preciosuma;
			}
			precioElectrodomesticos += preciosuma;
		}
		System.out.println(precioTele + " "  + precioLavadora + " " +  precioElectrodomesticos);
	}

}
/*Map<String, Integer> letras = new HasMap<String, Integer>();
 * letras.put("A",100)-empezarias a añadir los datos*/
/*Crea un array de Electrodomesticos de 10 posiciones.
 Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
 Ahora, recorre este array y ejecuta el método precioFinal().
 Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones
por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos (puedes
crear objetos Electrodomestico, pero recuerda que Television y Lavadora también
son electrodomésticos). Recuerda el uso operador instanceof.*/