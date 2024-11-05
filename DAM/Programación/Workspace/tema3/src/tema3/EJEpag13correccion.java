package tema3;
import java.util.Scanner;
public class EJEpag13correccion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la longitud del primer segmento: ");
        double a = scanner.nextDouble();
        
        System.out.print("Introduce la longitud del segundo segmento: ");
        double b = scanner.nextDouble();
        
        System.out.print("Introduce la longitud del tercer segmento: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Se puede construir");
        } else {
            System.out.println("No se puede construir");
        }

        
        scanner.close();
    }

	}


