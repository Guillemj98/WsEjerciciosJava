package com.videojuegos.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videojuegos.entidad.Videojuego;
import com.videojuegos.persistencia.DaoVideojuego;

@Service
public class NegocioVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public Videojuego guardar(Videojuego videojuego) {
		if(daoVideojuego.ifindByName(videojuego.getName())) {
			System.out.println("Juego con el mismo nombre");
		}
		return daoVideojuego.save(videojuego);
	}
	public void eliminar(int id) {
		daoVideojuego.deleteById(id);
	}
	public Videojuego updateById(Videojuego videojuego, int id) {
		Optional<Videojuego>videojuegoExistente = daoVideojuego.findById(id);
		if(videojuegoExistente.isPresent()) {
			Videojuego videoJuegoActualizado = videojuegoExistente.get();
			
			videoJuegoActualizado.setName(videojuego.getName());
			videoJuegoActualizado.setCompany(videojuego.getCompany());
			videoJuegoActualizado.setRating(videojuego.getRating());
			
			return daoVideojuego.save(videoJuegoActualizado);
		}else {
			System.out.println("Videojuego no encontrado");
		}
		return null;
		
	}
	public Optional<Videojuego> obtenerVideojuegoId(int id) {
		return daoVideojuego.findById(id);
	}
	public List<Videojuego> obtenerTodos(){
		return daoVideojuego.findAll();
	}
	public Videojuego obtenerPorNombre(String nombre) {
		return daoVideojuego.findByName(nombre);
	}
	

}
