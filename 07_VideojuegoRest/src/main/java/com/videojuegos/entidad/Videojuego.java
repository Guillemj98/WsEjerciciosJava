package com.videojuegos.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

// Esta es la entidad con la que vamos a trabajar
// La entity tiene que ser de jakarta persistance

@Entity
@Table(name = "videojuegos")
public class Videojuego {
	// Para determinar la clave primaria de Videojuego usamos la anotacion @Id
	// Pero aparte de esa vamos a usar tambien la anotacion @GeneratedValue(strategy = GenerationType.IDENTITY)
	// Para que genere autimaticamente el valor del ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String company;
	private double rating;
	
	
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", name=" + name + ", company=" + company + ", rating=" + rating + "]";
	}
	public Videojuego() {
		super();
	}
	public Videojuego(int id, String name, String company, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	// Estas anotaciones hacen que antes de hacer un INSERT o un UPDATE
	// en la BBDD se ejecute este metodo antes
	@PrePersist
	@PreUpdate
	public void validarNombre() {
		if(this.name == null || this.name.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
	}
	

}
