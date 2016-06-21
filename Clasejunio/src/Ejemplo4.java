import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner leer= new Scanner(System.in);
		double nota;
		
		System.out.println("Dime una nota");
		nota = leer.nextDouble();
		
		if(nota>= 0 && nota <5){
			System.out.println("Has suspendido");	
		}
		else if(nota>=5 && nota < 7){
			System.out.println("Has aprobado");
		}
		else if (nota>=7 && nota<9){
			System.out.println("Has sacado un notable");
		}
		else if (nota>=9 && nota <=10){			
			System.out.println("Tienes un sobresaliente");
		}else{
			System.out.println("Nota no válida");
		}
		
		
		
	
	}

}
