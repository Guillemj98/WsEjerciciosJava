package entidad;

import java.util.Objects;

public class Pasajero {
	private static int contadorId =0;
	private int id ;
	private String nombre;
	private int edad;
	private double peso;
	private Coche coche;
	
	
	
	
	
	
	@Override
	public String toString() {
	    return """
	            ╔═══════════════════════════════════════╗
	            ║           🚶 DATOS DEL PASAJERO       ║
	            ╠═══════════════════════════════════════╣
	            ║ ID           : %-23d║
	            ║ Nombre       : %-23s║
	            ║ Edad         : %-23d║
	            ║ Peso (kg)    : %-23.2f║
	            ║ Coche        : %-23s║
	            ╚═══════════════════════════════════════╝
	            """.formatted(id, nombre, edad, peso, coche);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	public static int getContadorId() {
		return contadorId;
	}
	public static void setContadorId(int contadorId) {
		Pasajero.contadorId = contadorId;
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
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}

}
