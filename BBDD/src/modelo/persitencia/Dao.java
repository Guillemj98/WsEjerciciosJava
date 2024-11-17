package modelo.persitencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public void darDeBajaPorId(int id)throws SQLException{
		String query = "DELETE FROM coches WHERE ID =?";
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			stmt.setInt(1, id);
			int afectados = stmt.executeUpdate();
			System.out.println("Sentencia realizada con exito");
		}catch(SQLException e ) {
			System.out.println("Error al borrar el cliente");
			System.out.println(e.getMessage());
		}
	}
	public void modificarCochePorId(Coche coche)throws SQLException{
		String query = "UPDATE coches SET MARCA=?,MODELO=?,TIPOMOTOR=?,KM=?"
				+ "WHERE ID=?";
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			stmt.setString(1, coche.getMarca());
			stmt.setString(2, coche.getModelo());
			stmt.setString(3, coche.getTipoMotor());
			stmt.setDouble(4, coche.getKm());
			stmt.setInt(5, coche.getId());
			
			int filasActualizadas = stmt.executeUpdate();
			System.out.println("Filas actualizadas" + filasActualizadas);
			
		}catch(SQLException e ) {
			System.out.println("Error al actualizar el coche");
			System.out.println(e.getMessage());
		}
	}
	public Coche buscarCochePorId(int id)throws SQLException{
		String query = "SELECT * FROM coches WHERE ID=?";
		Coche coche = null;
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			 if (rs.next()) {
				 coche = new Coche(
		                rs.getInt("ID"),
		                rs.getString("MARCA"),
		                rs.getString("MODELO"),
		                rs.getString("TIPOMOTOR"),
		                rs.getDouble("KM")
		            );
		        }
		        
		    } catch (SQLException e) {
		        System.out.println("Error al buscar el coche por ID");
		        e.printStackTrace();
		    }
		    
		    return coche;  
}
	public void buscarCochePorMarca(String marca)throws SQLException{
		String query = "SELECT * FROM coches WHERE MARCA=?";
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			
			stmt.setString(1, marca);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("ID"));
				System.out.print(" - "); 
				System.out.print(rs.getString("MARCA"));
				System.out.print(" - "); 
				System.out.print(rs.getString("MODELO"));
				System.out.print(" - "); 
				System.out.print(rs.getString("TIPOMOTOR"));
				System.out.println(" - ");
				System.out.print(rs.getDouble("KM"));
				System.out.println();
				
			}
			
		}catch(SQLException e ) {
			System.out.println("Error al visualizar coche por ID");
			System.out.println(e.getMessage());
		}
	}
	public ArrayList<Coche> listarCoches()throws SQLException{
		String query = "SELECT * FROM coches ";
		ArrayList<Coche>listaCoches = new ArrayList<>();
		try(Connection conn = conectarBaseDeDatos();
			PreparedStatement stmt = conn.prepareStatement(query)){
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("ID");
				String marca = rs.getString("MARCA");
				String modelo = rs.getString("MODELO");
				String tipoMotor = rs.getString("TIPOMOTOR");
				double Km = rs.getDouble("KM");
				
				Coche coche = new Coche(id, marca, modelo, tipoMotor, Km);
				listaCoches.add(coche);
				
			}
			
		}catch(SQLException e ) {
			System.out.println("Error al listar los coches");
			System.out.println(e.getMessage());
		}
		return listaCoches;
	}
	

}
