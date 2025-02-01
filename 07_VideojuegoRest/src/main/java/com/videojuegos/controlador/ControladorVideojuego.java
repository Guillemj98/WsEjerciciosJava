package com.videojuegos.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.entidad.Videojuego;
import com.videojuegos.negocio.NegocioVideojuego;

@RestController
@CrossOrigin(origins ="*")
public class ControladorVideojuego {
	@Autowired
	private NegocioVideojuego negocioVideojuego;
	
	
	 @PostMapping
	    public Videojuego darDeAlta(@RequestBody Videojuego videojuego) {
	        return negocioVideojuego.guardar(videojuego);
	    }

	    @DeleteMapping("/{id}")
	    public void darDeBaja(@PathVariable int id) {
	    	negocioVideojuego.eliminar(id);
	    }

	    @PutMapping("/{id}")
	    public Videojuego modificar(@PathVariable int id, @RequestBody Videojuego videojuego) {
	        videojuego.setId(id);
	        return negocioVideojuego.guardar(videojuego);
	    }

	    @GetMapping("/{id}")
	    public Optional<Videojuego> obtenerPorId(@PathVariable int id) {
	        return negocioVideojuego.obtenerVideojuegoId(id);
	    }

	    @GetMapping
	    public List<Videojuego> listarTodos() {
	        return negocioVideojuego.obtenerTodos();
	    }

	    @GetMapping("/nombre/{nombre}")
	    public List<Videojuego> listarPorNombre(@PathVariable String nombre) {
	        return (List<Videojuego>) negocioVideojuego.obtenerPorNombre(nombre);
	    }

}
