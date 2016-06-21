package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {
	private Connection conexion;
	private String bd, login, pwd, url;
	private String [][] tabla;

	public BaseDatos() {
		try {
			login = "SYSTEM";
			pwd = "merchan";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String mi_url = "jdbc:oracle:thin:@10.34.20.79:1521:XE";
			conexion = DriverManager.getConnection(mi_url, "XEMA", "merchan");
			System.out.println("-- Conexión establecida --");
		} catch (ClassNotFoundException e) {
			System.out.println("No tengo el driver cargado");
		} catch (SQLException e) {
			System.out.println("Falla la conexión");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Consulta_Equipos () {
		try {
			String query = "Select * from xema.material";
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			int i = 0;
			tabla = new String [20][3];
			while (rset.next()){
				tabla [i][0]= rset.getString(1);
				tabla [i][1]= rset.getString(2);
				tabla [i][2]= rset.getString(3);
				i++;
			}	
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	public void Mostrar_Equipos (){
		System.out.print("COD\tNombre\t\tSubfamilia\tWeb\tPuntos");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla [i][0] + "\t" + tabla [i][1] + "\t" + tabla [i][2]);
			System.out.println();
		}
	}
}
