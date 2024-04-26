package entidades;
/**
 * Clase Jugador para crear Objetos Jugador.
 * <br>
 * El Objeto Jugador tendrá como Atributos:
 * - dorsal, numero de dorsal que tiene el Objeto Jugador.
 * - numeroTarjetasAmarillas, cantidad de tarjetas Amarillas que tiene el Objeto Jugador.
 * -numeroTarjetasRojas, cantidad de tarjetas Rojas que tiene el Objeto Jugador.
 * 
 * El Objeto Jugador tendrá como Metodos:
 * - ponerDorsal()
 * - estaExpulsado()
 */
public class Jugador {
	/**
	 * Atributo que determina el numero del dorsal del jugador
	 */
	private int dorsal;
	/**
	 * Atributo que indica el numero de tarjetas amarillas
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Atributo que indica el numero de tarjetas rojas
	 */
	private int numeroTarjetasRojas;
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
	 * Método que establece el <b>dorsal</b> del jugador comprendido entre los valores
	 * <b>1 y 30 (incluidos)</b> y en caso contrario lo establece a (-1)
	 * @param dorsal numero que introducimos por parámetro
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	/**
	 * El método estaExpulsado devuelve true si el jugador cumple con las
	 * condiciones para ser expulsado y false si no las cumple.
	 * 
	 * @return <b>true</b>, si el atributo numeroTarjetasAmarillas tiene valor
	 * 2 o si el atributo numeroTarjetasRojas tiene valor 1; o devuelve
	 * <b>false</b>, si no se cumplen ninguna de estas condiciones.
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if (numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		return expulsado;
	}
}