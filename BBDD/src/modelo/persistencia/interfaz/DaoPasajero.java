package modelo.persistencia.interfaz;

import java.util.List;

import entidad.Pasajero;

public interface DaoPasajero {
	public boolean guardarPasajero(Pasajero pasajero);
	public boolean darDeBajaPasajeroId(int id);
	public Integer buscarPorId(int id);
	public List<Pasajero>listaPasajero();
	public Integer	añadirPasajeroCoche();
	public Integer eliminarPasajeroCoche();
	public List<Pasajero>listaPasajeroCoche();

}
