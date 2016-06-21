import java.util.Scanner;

public class Ejemplo11 {

	
	static void recorrerLista(int []lista){
		for (int i = 0; i < lista.length; i++) {// i= posiciones del array ,
			// lista.length = tamaño del
			// array
			int num = lista[i];
			// System.out.println(num);
			//if (i > 3) {
				System.out.println(num);
			//}
		}

	}
	
	
	static void insertarDatos(int []lista){
		for (int i = 0; i < lista.length; i++){
			Scanner leer = new Scanner(System.in);
			System.out.println("Por favor mete datos");
			lista[i] = leer.nextInt();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un array de 10 enteros. Una dimensión
		int lista[] = new int[10];
		
		
		insertarDatos(lista);
		
		recorrerLista(lista);
		
		
		System.out.println("El programa se ha detinido");
	}

}
