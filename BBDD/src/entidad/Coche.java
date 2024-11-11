package entidad;

import java.util.Objects;

public class Coche {
	private int id;
	private String marca;
	private String modelo;
	private String tipoMotor;
	private double km;
	
	
	
	public Coche(int id, String marca, String modelo, String tipoMotor, double km) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoMotor = tipoMotor;
		this.km = km;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, km, marca, modelo, tipoMotor);
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
		return id == other.id && Double.doubleToLongBits(km) == Double.doubleToLongBits(other.km)
				&& Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(tipoMotor, other.tipoMotor);
	}
	@Override
	public String toString() {
	    return "=============================\n" +
	           "         Datos del Coche     \n" +
	           "=============================\n" +
	           "ID del Coche    : " + id + "\n" +
	           "Marca           : " + marca + "\n" +
	           "Modelo          : " + modelo + "\n" +
	           "Tipo de Motor   : " + tipoMotor + "\n" +
	           "Kilometraje (Km): " + km + "\n" +
	           "=============================";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	
	

}
