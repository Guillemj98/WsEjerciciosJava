package modelo.persistencia.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Coche;

public interface DaoCoche {
	public void insertarCoches(Coche coche)  ;
	public void darDeBajaPorId(int id)  ;
	public void modificarCochePorId(Coche coche)  ;
	public Coche buscarCochePorId(int id)  ;
	public void buscarCochePorMarca(String marca)  ;
	public ArrayList<Coche> listarCoches()  ;
}
