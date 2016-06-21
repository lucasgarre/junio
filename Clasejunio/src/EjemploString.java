import java.util.Scanner;
import java.util.StringTokenizer;

public class EjemploString {

	public static void compararcadenas(String STR1, String STR2) {

		if (STR1.equals(STR2) == true) {
			System.out.println(STR1 + " es exactamente igual a " + STR2);
		} else {
			System.out.println(STR1 + " no es exactamente igual a " + STR2);
		}

	}

	public static String devolverpartesdecadenas(String STR1) {
		return STR1.substring(0, 3);

	}

	public static char cogercaracterpos5(String STR1) {// deberemos hacer un
														// casting
		return STR1.charAt(5);
	}

	public static String converitramin(String STR1){
		return STR1.toLowerCase();
	}
	public static String converitramin2(String STR1){
		return STR1.toUpperCase();
	}
	
	public static StringBuilder reverse (String cad1){
		StringBuilder strb = new StringBuilder(cad1);
		return strb.reverse(); 
		
	}
	
	public static StringTokenizer modificartexto(String STR1){
		StringTokenizer strt = new StringTokenizer(STR1, ",");
		System.out.println("la cadena STR1 tiene " + strt.countTokens() +  "elementos");
		while (strt.hasMoreTokens()){
			System.out.println(strt.nextToken());}
		return strt;
	}
	
	public static  StringBuilder concatanar (String STR1, String STR2){
		StringBuilder conc = new StringBuilder (STR1);
		return conc.append(STR2);
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cad1;
		String cad2 = "0" ;
		System.out.print("Introduzca la primer cadena de carácteres: ");
		cad1 = teclado.nextLine();
		// System.out.println(devolverpartesdecadenas(cad1));
		 System.out.print("Introduzca la segunda cadena de carácteres");
		 cad2=teclado.nextLine();
			System.out.println(concatanar(cad1,cad2));

		// compararcadenas(cad1,cad2);
		// devolverpartesdecadenas(cad1);
		//cogercaracterpos5(cad1);
		//converitramin(cad1);
		//converitramin2(cad1);
		//reverse(cad1);
		//modificartexto(cad1);
	}

}
