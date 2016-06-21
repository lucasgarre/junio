import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {

		Scanner leer= new Scanner(System.in);
		int num1;		
		int num2;
		
		System.out.println("Escribe el primer número");
		num1= leer.nextInt();
		System.out.println("Escribe el segundo número");
		num2= leer.nextInt();
		
		if (num1>num2){
			System.out.println("El mayor es " + num1);
		}
		else if(num1<num2){
			System.out.println("El mayor es " +num2);
		}
		else{
			System.out.println("Los números son iguales");
		}
		
	}

}
