package modelo.entidad;

import java.util.Objects;

public class Pasajero {
	private int id;
	private String nombre;
	private int edad;
	private double peso;
	private int id_coche;
	
	

	
	public Pasajero(int id, String nombre, int edad, double peso, int id_coche) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.id_coche = id_coche;
	}

	public Pasajero() {
		super();
	}

	@Override
	public String toString() {
	    return "Pasajero {" +
	           "\n    id=" + id +
	           ",\n    nombre='" + nombre + '\'' +
	           ",\n    edad=" + edad +
	           ",\n    peso=" + peso +
	           ",\n    id_coche=" + id_coche +
	           "\n}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		return edad == other.edad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getId_coche() {
		return id_coche;
	}
	public void setId_coche(int id_coche) {
		this.id_coche = id_coche;
	}

	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
	
	//private Coche coche; // Esto no se si va a aqui o solo se pasa el ID
	
	

}
