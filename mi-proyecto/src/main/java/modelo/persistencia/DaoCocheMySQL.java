package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.AppConfig;
import interfaces.DaoCoche;
import modelo.entidad.Coche;
import modelo.entidad.TipoMotor;

public class DaoCocheMySQL implements DaoCoche {
	/*
	 * Tabla SQL usada:
	 * 
	 * CREATE TABLE coches ( id INT AUTO_INCREMENT PRIMARY KEY, marca VARCHAR(50)
	 * NOT NULL, modelo VARCHAR(50) NOT NULL, motor VARCHAR(50) NOT NULL, kilometros
	 * INT NOT NULL );
	 */
	private String url = AppConfig.getInstance().getProperty("url");
	private String user = AppConfig.getInstance().getProperty("user");
	private String password = AppConfig.getInstance().getProperty("password");
	
	// Para poder hacerlo singletone
	public static DaoCocheMySQL instance ;
	
	// Añadimos el contructor vacio
	public DaoCocheMySQL() {
		super();
	}
	/**
	 * Método estático para obtener la instancia única de la clase DaoCocheMySQL.
	 * 
	 * Este método implementa el patrón Singleton, asegurando que 
	 * solo exista una instancia de DaoCocheMySQL en toda la aplicación. 
	 * Si la instancia no existe, se crea una nueva; si ya existe, se devuelve la misma.
	 * 
	 * @return La instancia única de DaoCocheMySQL.
	 */
	public static DaoCocheMySQL getInstance() {
		if(instance == null) {
			instance = new DaoCocheMySQL();
		}
		return instance;
	}
	@Override
	public Integer guardar(Coche c) {
		Integer resultado = 0;
		// Conexion con la BBDD 
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			
			// Establecemos la query 
			String query = "INSERT INTO coche (MARCA, MODELO, TIPO_MOTOR, KILOMETROS) VALUES (?, ?, ?, ?)";
			// Para que sea seguro usamos el preparedStatement 
			PreparedStatement ps = conn.prepareStatement(query);
			// Las posiciones empiezan por el 1
			ps.setString(1, c.getMarca());
			ps.setString(2, c.getModelo());
			ps.setString(3, String.valueOf(c.getMotor()));
			ps.setInt(4, c.getKilometros());
			
			int rows = ps.executeUpdate();

			if (rows != 0) {
				resultado = rows;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			resultado = null;
		}
		return resultado;
	}
	@Override
	public Integer borrarById(int id) {
		Integer resultado =0;
		
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = "DELETE FROM coche WHERE id =?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
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
	public Integer modificarById(Coche c) {
		Integer resultado = 0;
		try(Connection conn= DriverManager.getConnection(url, user, password);){
			String query ="UPDATE coche SET marca = ?, modelo = ?, TIPO_MOTOR = ?, kilometros = ? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, c.getMarca().toUpperCase());
			ps.setString(2, c.getModelo().toUpperCase());
			ps.setString(3, String.valueOf(c.getMotor()).toUpperCase());
			ps.setInt(4, c.getKilometros());
			ps.setInt(5, c.getId());
			
			int rows = ps.executeUpdate();
			if (rows!=0) {
				resultado = rows;
			}
			
		} catch (SQLException e) {
			resultado = null;
			e.printStackTrace();
		}
		
		return resultado;
	}
	@Override
	public Coche seleccionarById(int id) {
		List<Coche>listaCoches = new ArrayList<Coche>();
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			String query = 	"SELECT * FROM coche WHERE id =?";		
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			listaCoches = resultSetHandler(ps);
			
			resultSetHandler(ps);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(listaCoches.size()==0) {
			return null;
		}
		
		return listaCoches.get(0);
	}
	@Override
	public List<Coche> seleccionarByMarca(String marca) {
		List<Coche> listaCoches = new ArrayList<Coche>();

		try (Connection conn = DriverManager.getConnection(url, user, password);) {

			String query = "SELECT * FROM coche WHERE marca =?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, marca);
			listaCoches = resultSetHandler(ps);

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return listaCoches;
	}
	@Override
	public List<Coche> mostraCoches() {
		List<Coche> listaCoches = new ArrayList<Coche>();
		try(Connection conn = DriverManager.getConnection(url, user, password);){
			
			String query = "SELECT * FROM coche";
			PreparedStatement ps = conn.prepareStatement(query);
			listaCoches = resultSetHandler(ps);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listaCoches;
	}
	private List<Coche> resultSetHandler(PreparedStatement ps) throws SQLException {

		ResultSet rs = ps.executeQuery();
		Coche c = null;
		List<Coche> listaCoches = new ArrayList<Coche>();
		while (rs.next()) {
			c = new Coche();
			c.setId(rs.getInt(1));
			c.setMarca(rs.getString(2));
			c.setModelo(rs.getString(3));
			String motor = rs.getString(4);

			switch (motor) {
			case "GASOLINA":
				c.setMotor(TipoMotor.GASOLINA);
				break;
			case "DIESEL":
				c.setMotor(TipoMotor.DIESEL);
				break;
			case "ELECTRICO":
				c.setMotor(TipoMotor.ELECTRICO);
				break;
			case "HIBRIDO":
				c.setMotor(TipoMotor.HIBRIDO);
				break;
			
			}

			c.setKilometros(rs.getInt(5));
			listaCoches.add(c);
		}

		return listaCoches;

	}
	
	

}
