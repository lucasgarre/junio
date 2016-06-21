import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int n;
		
		System.out.println("Escribe un número");
		n = leer.nextInt();
		if(n%2==0){
			System.out.println("El número es par");
			
		}
		else {
			System.out.println("El número es impar");
		}
	}

}
