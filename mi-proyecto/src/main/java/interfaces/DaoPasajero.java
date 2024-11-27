package interfaces;

import java.util.List;

import modelo.entidad.Pasajero;

public interface DaoPasajero {
	
	/**
	 * Metodo que persiste un pasajero en la BBDD
	 * @param pasajero pasajero que se quiere persistir en la BBDD
	 * @return 0 si se ha logrado persistir, 1 si no se ha logrado o 
	 * null si ha ocurrido alguna excepcion de tipo MySQL
	 */
	Integer crearPasajero(Pasajero pasajero);
	
	/**
	 * Metodo que borra un pasajeor a partir de su ID
	 * @param pasajeroID el ID del pasajero que se quiere eliminar de la BBDD
	 * @return numero de filas que se ha borrado, 0 si no se ha logrado eliminar ninguna
	 * o null en caso de que haya ocurrdo una excepcion de tipo MySQL
	 */
	Integer deletePasajeroById(int pasajeroID);
	
	/**
	 * Metodo que recupera un pasajero de la BBDD a partir de su ID
	 * @param pasajeroID el ID del pasajero del que se quiere recuperar sus datos
	 * de la BBDD
	 * @return pasajero cuyo ID coincida con el introducido, Pasajero vacio 
	 * en caso de que no se encuentre dicho Pasajero o null en caso de que
	 * haya ocurrido alguna excepcion de tipo I/O
	 */
	Pasajero getPasajeroById(int pasajeroID);
	
	/**
	 * Metodo que devuelve todos los pasajeros que se encuentran en 
	 * la BBDD
	 * @return lista de pasajeros con todos los pasajeros que se 
	 * hayan recuperado de la BBDD o una lista vacia 
	 * de pasajeros en caso de que no haya ningun pasajero en la BBDD
	 */
	List<Pasajero> listPasajeros();
	

	/**
	 * Metodo que añade un pasajero a un coche mediante los ID de pasajero 
	 * y coche
	 * @param pasajeroID id del pasajero que se quiere añadir al coche
	 * @param cocheID id del coche en el cual se quiere meter el pasajero
	 * @return 0 en caso de que se haya añadido correctamente el pasajero 
	 * al coche, 1 en caso de que no se haya añadido por no encontrar dicho pasajero
	 * 2 en caso de que no se haya encontrado dicho coche
	 * null een caso de que haya ocurrdio alguna excepcion de tipo I/O
	 */
	Integer addPasajeroCoche(int pasajeroID, int cocheID);
	
	/**
	 * Metodo que borra un pasajero de un coche en la persistencia
	 * @param pasajeroID el ID del pasajero del cual se quiere elimanar del coche
	 * @param cocheID  el ID del coche donde se encuentra el pasajero que se desea eliminar
	 * @return 0 en caso de que se haya eliminado correctamente, 
	 * 1 en caso de que no se haya eliminado por no haberse encontrado al pasajero,
	 * 2 en caso de que no se haya eliminado por no haberse encontrado al coche,
	 * null en caso de que haya ocurrido alguna excepción de I/O
	 */
	Integer borrarPasajeroCoche(int pasajeroID, int cocheID);
	
	/**
	 * Metodo que devuelve una lista de pasajero asociados a un coche mediante su ID
	 * @param carID el ID del coche del cual se quieren recuperar sus pasajeros
	 * @return lista de pasajeros  con todos los pasajeros que hay dentro del coche
	 * o una lista vacia en caso de que no haya ninguno, o null en caso de que haya
	 * ocurrido una excepcion de tipo I/O
	 */
	List<Pasajero> listPasajeroFromCoche(int carID);

}
