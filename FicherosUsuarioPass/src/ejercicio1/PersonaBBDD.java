package ejercicio1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonaBBDD {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		p1.setNombre("Piero Santana");
		
		String url = "jdbc:mysql://localhost:3306/bbdd";
		String user = "root";
		String pass = "";
		
		String query = "INSERT INTO PERSONAS (NOMBRE) VALUES (?)";
		try(Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement strm = conn.prepareStatement(query);	){
			
			strm.setString(1, p1.getNombre());
			int rows = strm.executeUpdate();
			if(rows ==1) {
				System.out.println("Usuario ingresado.");
			}else {
				System.out.println("Usuario no ingresado.");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
