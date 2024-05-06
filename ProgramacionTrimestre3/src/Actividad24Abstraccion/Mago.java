package Actividad24Abstraccion;

public class Mago extends Personaje {
	private double inteligencia;

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	

	@Override
	public String toString() {
		return "Mago{" +
		           "inteligencia=" + inteligencia +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}
	@Override
	public void atacar(Personaje p) {
		double dañoBase= this.getArma().getDaño();
		p.setVida(p.getVida() - dañoBase);
		if(this.getArma() instanceof Hechizo) {
			p.setVida(p.getVida()-(this.inteligencia));
		}
		System.out.println("¡Que la fuerza de los elementos se desate sobre mis enemigos!");		
	}
	
	

}
