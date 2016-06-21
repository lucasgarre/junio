import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		while (true){
			Scanner leer = new Scanner(System.in);
			System.out.println("Introduzca un número");
			num = leer.nextInt();
			if (num<10){
				break;
			}
		
		}
		
System.out.println("El programa se ha detinido");
	}

}
