package Principal;

import Modelo.BaseDatos;

public class Main {

	public static void main(String[] args) {
		BaseDatos bd = new BaseDatos ();
		bd.Consulta_Equipos();
		bd.Mostrar_Equipos();
	}

}
