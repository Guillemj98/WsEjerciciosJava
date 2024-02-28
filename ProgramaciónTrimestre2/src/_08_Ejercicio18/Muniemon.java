package _08_Ejercicio18;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipoMuneimon;
	

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipoMuneimon=" + tipoMuneimon + "]";
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
	

}
