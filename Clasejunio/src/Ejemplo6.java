import java.util.Scanner;

public class Ejemplo6 {
	public static void main(String[] args) {
     
		Scanner leer= new Scanner(System.in);		
		double num;
		
		System.out.println("Introduce un n�mero");
		num= leer.nextDouble();
		
		if (num>=0 && num<=10){
			System.out.println("Esta dentro del intervalo");
		}
		else{
			System.out.println("No est� en el intervalo");
		}
	}
}
