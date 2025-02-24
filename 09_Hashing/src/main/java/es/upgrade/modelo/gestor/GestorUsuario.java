package es.upgrade.modelo.gestor;

import es.upgrade.modelo.entidad.Persona;
import es.upgrade.modelo.persistencia.DaoUsuario;

public class GestorUsuario {
	private DaoUsuario daoUsuario;
	
	public GestorUsuario() {
		daoUsuario = DaoUsuario.getInstance();
	}
	
	public boolean elNombreEstaCogido(String nombre) {
		return daoUsuario.findByName(nombre)!= null;
	}
	
	public void registrarPersona(Persona p) {
		if(!elNombreEstaCogido(p.getNombre())) {
			daoUsuario.savePersona(p);
		}else {
			throw new RuntimeException("Maquina el usuario ya esta");
		}
	}
	public void close() {
		daoUsuario.close();
	}
	

}
