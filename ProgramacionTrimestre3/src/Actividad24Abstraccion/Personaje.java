package Actividad24Abstraccion;

public abstract class  Personaje {
	private String nombre;
	private double vida;
	private Arma arma;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	@Override
	public String toString() {
		return this.getClass().getTypeName() 
				+ "Nombre:" + nombre.toUpperCase() + 
				", Vida:" + vida + 
				", Arma:" + arma  ;
	}
	
	public abstract void atacar(Personaje p);

}
