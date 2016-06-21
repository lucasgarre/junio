import java.util.Scanner;

public class Ejemplo5 {
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);		
		int x;
		int y;
		
		System.out.print("Introduzca la coordenada x: ");
		x= leer.nextInt();
	
		System.out.print("Introduzca la coordenada y:");
		y= leer.nextInt();
		
		if ( x>0 && y>0){
			System.out.println("El punnto está en cuadrante: Primero");
		}
		else if(x<0 && y>0){
			System.out.println("El punto está en cuadrante: Segundo");
		}
		else if(x<0 && y<0){
			System.out.println("El punto está en cuadrante: Tercero");
		}
		else if(x>0 && y<0){
			System.out.println("El punto está en el cuarto cuadrante: Cuarto");
		}
		else{
			System.out.println("Esta en el eje de coordenadas");
		}
	}
}
