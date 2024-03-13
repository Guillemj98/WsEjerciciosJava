package _08_Ejercicio18;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private int velocidad;
	private TipoMuniemon tipoMuneimon;




	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidad=" + velocidad + ", tipoMuneimon=" + tipoMuneimon + "]";
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public TipoMuniemon getTipoMuneimon() {
		return tipoMuneimon;
	}

	public void setTipoMuneimon(TipoMuniemon tipoMuneimon) {
		this.tipoMuneimon = tipoMuneimon;
	}

	public void ataqueMunion(Muniemon m) {
		int ataqueFinal = 0;
		ataqueFinal = this.ataque - m.getDefensa();

		if (this.vida <= 0) {
			System.out.println("No puedes atacar al muñón" + " porque estás debilitado ");

		} else if (m.getVida() > 0) {
			if (ataqueFinal <= 0) {
				System.out.println("Tu ataque es muy débil y le quitas 0 de vida");
			} else if (ataqueFinal > 0) {
				System.out.println("Tu ataque es efectivo");
				m.setVida(m.getVida() - ataqueFinal);
				if (m.getVida() > 0) {
					System.out.println(this.nombre + " le quita " + ataqueFinal + " a " + m.getNombre());
					System.out.println("La vida de " + m.getNombre() + " : " + m.getVida() + "HP");
				} else if (m.getVida() <= 0) {
					System.out.println("El muñón: " + m.getNombre() + " ha sido derrotado");
					m.setVida(0);
				}
			}
		}
		else {
			System.out.println("La vida de " + m.getNombre() + " : " + m.getVida() + "HP, no puede pelear.");
		}

	}

}
