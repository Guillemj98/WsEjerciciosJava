package Actividad24Abstraccion;

public class Guerrero extends Personaje {
	private double fuerza;

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		double dañoBase= this.getArma().getDaño();
		p.setVida(p.getVida() - dañoBase);
		if(this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			p.setVida(p.getVida()-(this.fuerza));
		}
		System.out.println("En la batalla, se revela la verdadera fortaleza de un hombre.");		
	}

	@Override
	public String toString() {
		return "Guerrero{" +
		           "fuerza=" + fuerza +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}
	
	
	
}
