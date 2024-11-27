package modelo.entidad;

import java.util.List;
import java.util.Objects;

public class Coche {
	private int id;
	private String marca;
	private String modelo;
	private TipoMotor motor;
	private int kilometros;
	private List<Pasajero> listaPasajeros;
	
	
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
	public TipoMotor getMotor() {
		return motor;
	}
	public void setMotor(TipoMotor motor) {
		this.motor = motor;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
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
	    return "Coche {" +
	           "\n    id=" + id +
	           ",\n    marca='" + marca + '\'' +
	           ",\n    modelo='" + modelo + '\'' +
	           ",\n    motor='" + motor + '\'' +
	           ",\n    kilometros=" + kilometros +
	           ",\n    listaPasajeros=" + listaPasajeros +
	           "\n}";
	}


	public Coche(int id, String marca, String modelo, TipoMotor motor, int kilometros, List<Pasajero> listaPasajeros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.kilometros = kilometros;
		this.listaPasajeros = listaPasajeros;
	}

	public Coche() {
		super();
	}

	public void setId(int int1) {
		
		
	}
	
	
}
