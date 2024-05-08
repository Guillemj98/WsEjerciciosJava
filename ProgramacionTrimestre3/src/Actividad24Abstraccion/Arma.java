package Actividad24Abstraccion;

public abstract class Arma {
	private double daño;
	private String nombre;

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
				"Daño:" + daño + 
				",Nombre:" + nombre ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
