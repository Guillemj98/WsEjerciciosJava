package modelo.persitencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidad.Coche;

public class Dao {
	private static Dao instance = null;
	private final String url ="jdbc:mysql://localhost:3306/db_coches";
	private final String user = "root";
	private final String pass ="";
	
	private Dao() {
		
	}
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	public Connection conectarBaseDeDatos() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}
	
	public void insertarCoches(Coche coche)throws SQLException {
		String query = "INSERT INTO coches (id, marca, modelo, tipoMotor, kilometros)VALUES(?,?,?,?,?)";
		
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			stmt.setInt(1, coche.getId());
			stmt.setString(2, coche.getMarca());
			stmt.setString(3, coche.getModelo());
			stmt.setString(4, coche.getTipoMotor());
			stmt.setDouble(5, coche.getKm());
			
			
		}
	}

}
