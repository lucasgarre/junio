import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Escribe un n�mero");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("El n�mero es positivo");
		} else {
			if (num == 0) {
				System.out.println("cero");
			} else {
				System.out.println("Es negativo");
			}
		}
	}

}
