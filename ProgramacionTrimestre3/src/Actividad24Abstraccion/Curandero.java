package Actividad24Abstraccion;

public class Curandero extends Personaje {
	private double sabiduria;

	public double getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(double sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		double dañoBase= this.getArma().getDaño();
		p.setVida(p.getVida() - dañoBase);
		if(this.getArma() instanceof Rezo) {
			p.setVida(p.getVida()-(this.sabiduria));
		}
		System.out.println("Con la luz de la sanación, también puedo purificar el mal.");		
	}
	@Override
	public String toString() {
		return "Curandero{" +
		           "sabiduria=" + sabiduria +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}

}
