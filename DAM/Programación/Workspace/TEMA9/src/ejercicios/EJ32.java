package ejercicios;

import java.util.Random;

import clases.Producto;


public class EJ32 {

	public static void main(String[] args) {

		Producto[] productos = new Producto[10];

		Random random = new Random(); // Generar 10 productos con datos aleatorios 

		for (int i = 0; i <productos.length; i++) { 

			int codigo = i + 1; String nombre = "Producto" + (i + 1); 

			double precio = 10 + (100 - 10) * random.nextDouble(); 

			productos[i] = new Producto(codigo, precio, nombre); }



	for (Producto producto : productos){

		System.out.println(producto); 

		}

}
/*como añadir productos aleatorios no consecutivos
 	list<Producto> productos = generarProductos()
 	public static list<Producto> generarProductos(){
 	list<Producto> productos = new arraylist<Producto>
 	Random r = new Random()
 	for(int i=1; i<11;i++){
 	int codigo = 0;
 	do{
 	codigo = r.nextInt(1,100);
 	}while(esta(productos,codigo); si fuera consecutivo en este parentesis solo habria que poner la "i"
 	Producto p = new Producto("producto"+i,r.nextInt(1,100), r.nextInt}}*/
	
/*funcion esta:
 public static boolean esta(List<producto> productos,codigo){
 	for(Producto p: productos){
 		if(p.getCodigo()==codigo)
 					return true;}
 					return false;} */
}
