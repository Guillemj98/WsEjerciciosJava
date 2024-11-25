package entidad;

import java.util.List;
import java.util.Objects;

public class Coche {
	private static int contadorId=0;
	private int id ;
	private String marca;
	private String modelo;
	private String añoFabricacion;
	private double km;
	private List<Pasajero>listaPasajeros;
	
	
	
	public Coche(String marca, String modelo, String añoFabricacion, double km) {
		super();
		this.id = ++contadorId;
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.km = km;
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
		Coche other = (Coche) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
	    return "=============================\n" +
	           "         Datos del Coche     \n" +
	           "=============================\n" +
	           "ID del Coche    : " + id + "\n" +
	           "Marca           : " + marca + "\n" +
	           "Modelo          : " + modelo + "\n" +
	           "Tipo de Motor   : " + añoFabricacion + "\n" +
	           "Kilometraje (Km): " + km + "\n" +
	           "=============================";
	}

	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(String tipoMotor) {
		this.añoFabricacion = tipoMotor;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	
	

}
