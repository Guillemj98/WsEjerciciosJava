package com.videojuegos.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videojuegos.entidad.Videojuego;

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer> {
	// Al tener la interface JpaRepository ya vienen los metodos CRUD basicos 
	/*
	 * Como:
	 * save() para crear o actualizar
	 * findById() para leer un registro por su ID
	 * findAll() para leer todos los registros
	 * deleteByID()para eliminar un registro por su ID
	 */
	
	public Boolean  ifindByName(String nombre);
	public Videojuego  findByName(String nombre);
	
}
