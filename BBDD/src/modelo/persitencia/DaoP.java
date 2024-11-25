package modelo.persitencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidad.Pasajero;
import modelo.persistencia.interfaz.DaoCoche;
import modelo.persistencia.interfaz.DaoPasajero;

public class DaoP implements DaoPasajero{
	private static DaoPasajero instance = null;
	private final String url ="jdbc:mysql://localhost:3306/db_pasajeros";
	private final String user = "root";
	private final String pass ="";
	
	private DaoP() {
		
	}
	public static DaoPasajero getInstance() {
		if(instance == null) {
			instance = new DaoP();
		}
		return instance;
	}
	public Connection conectarBaseDeDatos() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}

	@Override
	public boolean guardarPasajero(Pasajero pasajero) {
		String query = "INSERT INTO pasajeros(id, nombre, edad, peso,)VALUES(?,?,?,?)";
		try(Connection conn = conectarBaseDeDatos();
				PreparedStatement stmt = conn.prepareStatement(query)){
				stmt.setInt(1, pasajero.getId());
				stmt.setString(2, pasajero.getNombre());
				stmt.setInt(3, pasajero.getEdad());
				stmt.setDouble(4, pasajero.getPeso());
				
				
				
			}catch(SQLException e ) {
				System.out.println("Error al borrar el cliente");
				System.out.println(e.getMessage());
			}
		return false;
	}

	@Override
	public boolean darDeBajaPasajeroId(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pasajero> listaPasajero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer añadirPasajeroCoche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarPasajeroCoche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pasajero> listaPasajeroCoche() {
		// TODO Auto-generated method stub
		return null;
	}

}
