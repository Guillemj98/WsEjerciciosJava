package interfaces;

import java.util.List;

import modelo.entidad.Coche;

public interface DaoCoche {

	/**
	 * Guarda un coche en la BBDD
	 * @param c coche a guardar
	 * @return numero de filas modificadas, 0 si no ha sido añadido ninguna
	 * y null si ocurre alguna excepcion MySQL
	 */
	public Integer guardar(Coche c);

	/**
	 * Metodo que elimina un coche de la base de datos a partir de su ID
	 * @param id el ID del coche a eliminar
	 * @return El numero de filas eliminadas, 0 en caso de que no haya sido eliminada ninguna
	 * y null si ocurre alguna excepcion de tipo MySQL
	 */
	public Integer borrarById(int id);

	/**
	 * Metodo que modifica o actualiza un coche a partir de su ID
	 * @param c el objeto coche cuyos datos se quieran actualizar o modificar
	 * @return 1 si la modificacion ha sido existosa, 0 si no se ha podido modificar
	 * y null si ha ocurrido alguna excepcion de tipo MySQL
	 */
	public Integer modificarById(Coche c);

	/**
	 * Metodo que muestra un coche a partir de su ID
	 * @param id el ID del coche a buscar
	 * @return el objeto coche si existe en la BBDD, o null si no existe
	 * o ha ocurrido una excepcion de tipo MySQL
	 */
	public Coche seleccionarById(int id);

	/**
	 * Metodo que muestra todos los coches que tengan la misma marca
	 * @param marca la marca de los coches a buscar
	 * @return lista de coches que tengan la marca especifica, o una lista vacía
	 * en caso de que no exista ninguna coche con esa marca 
	 */
	public List<Coche> seleccionarByMarca(String marca);

	/**
	 * Metodo que muestra todos los coches que hay en la BBDD
	 * @return lista de coches que hay dentro de la BBDD
	 */
	public List<Coche> mostraCoches();

}
