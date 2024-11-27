package modelo.negocio;

import java.util.List;

import modelo.entidad.Pasajero;
import modelo.persistencia.DaoPasajeroMySQL;

public class GestorPasajero {
	public static GestorPasajero instance = null;
	private DaoPasajeroMySQL daoPasajero;
	
	private GestorPasajero() {
		
	}
	public static GestorPasajero getInstance() {
		if(instance == null) {
			instance = new GestorPasajero();
		}
		return instance;
	}
	public boolean[] validarDatos(Pasajero p) {
		boolean[] respuestaValidacion = new boolean[4];
		
		if(p.getNombre().isBlank()) {
			respuestaValidacion[0]= true;
		}
		if(p.getEdad()== 0) {
			respuestaValidacion[1]= true;
		}
		
		if(p.getPeso() ==0) {
			respuestaValidacion[2]= true;
		}
		
		if(p.getPeso() == 0) {
			respuestaValidacion[3]= true;
		}
			
		return respuestaValidacion;
	}
	/**
	 * Llamada al metodo crear Pasajero del daoPasajero guardar el pasajero
	 * @param p pasajero que se desea guardar
	 * @return 1 si el guardado ha sido exitoso 0 si no se ha guardado y null
	 * si ha habido algun problema
	 */
	public Integer guardar(Pasajero p) {
		return daoPasajero.crearPasajero(p);
	}
	
	/**
	 * Llamada al metodo deletePasajeroById del daoPasajero para eliminar
	 * un pasajero mediante su id
	 * @param id el ID del pasajero que se quiere eliminar
	 * @return el numero de filas eliminadas, 0 si no ha eliminado ninguna
	 * y null si ocurre alguna excepcion.
	 */
	public Integer borrarById(int id) {
		return daoPasajero.deletePasajeroById(id);
	}
	
	/**
	 * Metodo que llama al metodo getPasajeroById del daoPasajero para recuperar 
	 * un pasajero por su ID
	 * @param id el ID del pasajero a buscar
	 * @return el objeto Pasajero si existe, o null si no se encuentra.
	 */
	public Pasajero getPasajeroById(int id) {
		return daoPasajero.getPasajeroById(id);
	}
	
	/**
	 * Metodo que llama al metodo listaPasajeros del daoPasajero para recuperar
	 * todos los pasajeros guardados en la BBDD
	 * @return lista de pasajeros o lista vacia en caso de que no contenga
	 * ningun pasajero
	 */
	public List<Pasajero> selectAll(){
		
		return daoPasajero.listPasajeros();
	}
	public Integer addPasajeroCoche(int pasajerId, int cocheId) {
		return daoPasajero.addPasajeroCoche(pasajerId, cocheId);
	}
	public Integer borrarPasajeroCoche(int pasajeroID, int cocheID) {
		return daoPasajero.borrarPasajeroCoche(pasajeroID, cocheID);
	}
	public List<Pasajero>listaPasajerosDelCoche(int cocheID){
		return daoPasajero.listPasajeroFromCoche(cocheID);
	}

}
