package tema3;
import java.util.Scanner;
public class EJEpag28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero del 1 al 7");
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		switch(n)
		{
		case 1: 
			System.out.println("Hoy es Lunes");
			break;
		case 2: 
			System.out.println("Hoy es martes");
			break;
		case 3: 
			System.out.println("Hoy es miercoles");
			break;
		case 4: 
			System.out.println("Hoy es jueves");
			break;
		case 5: 
			System.out.println("Hoy es viernes");
			break;
		case 6: 
			System.out.println("Hoy es sabado");
			break;
		case 7: 
			System.out.println("Hoy es domingo");
			break;
			default:
			System.out.println("entra en default");
			break;
			
		}
		System.out.println("Fin");
		sc.close();
	}

}
