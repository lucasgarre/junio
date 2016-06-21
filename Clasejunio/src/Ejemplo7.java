import java.util.Scanner;

public class Ejemplo7 {
	public static void comparaciones(int num1, int num2) {
		if (num1 > num2) {
			System.out.print("El número " + num1 + "  es mayor que el " + num2);
		} else if (num1 < num2) {
			System.out.print("El número " + num1 + "  es menor que el " + num2);
		} else if (num2 > num1) {
			System.out.print("El número " + num2 + "  es mayor que el " + num1);
		} else if (num2 < num1) {
			System.out.print("El número " + num2 + "  es menor que el " + num1);
		}

	}
	
	public static void aprobaciones (int nota ){
		switch(nota){
		case 0: System.out.println("Suspenso");
		break;
		case 1: System.out.println("Suspenso");
		break;
		case 2: System.out.println("Suspenso");
		break;
		case 3: System.out.println("Suspenso");
		break;
		case 4: System.out.println("Suspenso");
		break;
		case 5: System.out.println("Aprobado");
		break;
		case 6: System.out.println("Aprobado");
		break;
		case 7: System.out.println("Notable");
		break;
		case 8: System.out.println("Notable");
		break;
		case 9: System.out.println("Sobresaliente");
		break;
		case 10: System.out.println("Sobresaliente");
		break;
		
		}
		
	}
	
	public static float frutas (String fruta ){
		float precio=0.0f;
		switch(fruta){
		
		case "fresa": precio=3.0f;		
		break;
		case "uva": precio=10f;
		break;
		case "platono": precio=25.1f;
		break;	
		}
		return precio;
	
	}
	

	public static void main(String[] args) {
		/*Scanner leer = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int num1;
		num1 = leer.nextInt();*/

		/*System.out.println("Introduce el segundo número: ");
		int num2;
		num2 = leer.nextInt();
		comparaciones(num1, num2);*/
		/*System.out.print("Por favor introduzca la nota del alumno: ");
		Scanner leer = new Scanner(System.in);
		int nota;
		nota= leer.nextInt();
		aprobaciones( nota);*/
		
	
		/*Scanner leer= new Scanner(System.in);
		String fruta;
		System.out.print("Seleccione una fruta(fresa, platono o uva): ");
		fruta = leer.next();
		System.out.print("Precio fruta: " +frutas(fruta));*/
		
	}
}
