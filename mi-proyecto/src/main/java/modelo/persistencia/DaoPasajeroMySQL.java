package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition;

import config.AppConfig;
import interfaces.DaoPasajero;
import modelo.entidad.Pasajero;

public class DaoPasajeroMySQL implements DaoPasajero {
	/*
	 * Tabla SQL usada:
	 * 
	 CREATE TABLE pasajeros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    edad INT NOT NULL,  
    peso DOUBLE NOT NULL,
    idCoche INT NOT NULL,
    FOREIGN KEY (idCoche) REFERENCES coches(id)  -- Definimos la FK);
	 */
	
	private String url = AppConfig.getInstance().getProperty("url");
	private String user = AppConfig.getInstance().getProperty("user");
	private String password = AppConfig.getInstance().getProperty("password");
	
	public static DaoPasajeroMySQL instance = null;
	

	public DaoPasajeroMySQL() {
		super();
	}
	public static DaoPasajeroMySQL getInstance () {
		if(instance == null) {
			instance = new DaoPasajeroMySQL();
		}
		return instance;
	}
	
	

	@Override
	public Integer crearPasajero(Pasajero pasajero) {
		Integer resultado = null;
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = "INSERT INTO pasajeros (NOMBRE,EDAD,PESO)VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, pasajero.getNombre());
			ps.setInt(2, pasajero.getEdad());
			ps.setDouble(3, pasajero.getPeso());
			
			int rows = ps.executeUpdate() ;
			if(rows!=0) {
				resultado = rows;
			}
			
		}catch (SQLException e) {
			resultado = null;
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Integer deletePasajeroById(int pasajeroID) {
		Integer resultado = null;
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = "DELETE FROM pasajeros WHERE id =?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, pasajeroID);
			
			int rows = ps.executeUpdate();
			if(rows!=0) {
				resultado = rows;
			}
			
			
		} catch (SQLException e) {
			resultado = null;
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Pasajero getPasajeroById(int pasajeroID) {
		List<Pasajero>listaPasajero = new ArrayList<Pasajero>();
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = "SELECT * FROM PASAJEROS WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, pasajeroID);
			listaPasajero = resultSetHandler(ps);
			
			
			
		} catch (SQLException e) {
			listaPasajero = null;
			e.printStackTrace();
		}
		
		return listaPasajero.get(0);
	}

	@Override
	public List<Pasajero> listPasajeros() {
		
		List<Pasajero>listaPasajero = new ArrayList<Pasajero>();
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = "SELECT * FROM PASAJEROS";
			PreparedStatement ps = conn.prepareStatement(query);
			listaPasajero = resultSetHandler(ps);
			
			
			
		} catch (SQLException e) {
			listaPasajero = null;
			e.printStackTrace();
		}
		
		return listaPasajero;
	}

	@Override
	public Integer addPasajeroCoche(int pasajeroID, int cocheID) {
		Integer resultado = 0;
		try(Connection conn = DriverManager.getConnection(url,user,password);){
			String query = "UPDATE pasajeros SET coche_id=?WHERE id =?";
			PreparedStatement ps = conn.prepareStatement(query);
			int rows = ps.executeUpdate();
			
			if(rows !=0) {
				resultado = rows;
			
			}
		
		} catch (SQLException e) {
			resultado = null;
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Integer borrarPasajeroCoche(int pasajeroID) {
		Integer result = null;

		try (Connection conn = DriverManager.getConnection(url, user, password);) {

			String query = "UPDATE pasajeros SET id_coche=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setNull(1, java.sql.Types.INTEGER);
			ps.setInt(2, pasajeroID);
			result = (ps.executeUpdate() > 0) ? 0 : 1;
			/*
			 * Hay que revisar este método porque no valido si existe coche y/o pasajero y
			 * entonces no estoy cumpliendo con las opciones de return de la interfaz
			 */

		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}

		return result;
		
	}

	@Override
	public List<Pasajero> listPasajeroFromCoche(int cocheID) {
		List<Pasajero>listaPasajeros = new ArrayList<Pasajero>();
		try(Connection conn = DriverManager.getConnection(url,user,password);){
			String query = "SELECT * pasajero WHERE id_coche=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, cocheID);
			listaPasajeros = resultSetHandler(ps);
			resultSetHandler(ps);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(listaPasajeros.size()==0) {
			return null;
		}
		
		return listaPasajeros;
	}
	
	private List<Pasajero> resultSetHandler(PreparedStatement ps) {

		List<Pasajero> listaPasajero = new ArrayList<>();
		Pasajero pasajero = null;

		try {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pasajero = new Pasajero();
				pasajero.setId(rs.getInt(1));
				pasajero.setNombre(rs.getString(2));
				pasajero.setEdad(rs.getInt(3));
				pasajero.setPeso(rs.getDouble(4));
				pasajero.setId_coche(rs.getInt(5));

				listaPasajero.add(pasajero);
			}
		} catch (SQLException e) {
			listaPasajero = null;
			e.printStackTrace();
		}

		return listaPasajero;
	}

}
