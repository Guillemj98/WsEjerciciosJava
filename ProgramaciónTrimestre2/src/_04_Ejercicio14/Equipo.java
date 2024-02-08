package _04_Ejercicio14;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String[] listaJugadores;

	// Contructores
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	// Métodos

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + Arrays.toString(listaJugadores) + "]";
	}

	public void mostrarJugadores() {
		for (int i = 0; i < this.listaJugadores.length; i++) {
			System.out.println(this.listaJugadores[i]);
		}
	}

	public boolean existeJugador(String jugador) {
		boolean existeJugador = false;
		for (int i = 0; i < this.listaJugadores.length; i++) {
			if (this.listaJugadores[i].equalsIgnoreCase(jugador)) {
				existeJugador = true;
			}
		}
		return existeJugador;
	}

	public int cuantosJugadoresHay() {
		return this.listaJugadores.length;
	}

	public boolean suficientesJugadores() {
		boolean esApto = false;
		if (this.listaJugadores.length > 7) {
			esApto = true;
		}
		return esApto;
	}

	public boolean laCadenaEsIgual(Equipo cadena) {
		boolean esIgual = false;
		for (int i = 0; i < this.listaJugadores.length; i++) {
			if (this.listaJugadores[i].equalsIgnoreCase(cadena.listaJugadores[i])) {
				esIgual = true;
			}
		}
		return esIgual;
	}

	public boolean sonIguales(Equipo s2) {
		boolean esIgual = false;
		if (this.nombre.equalsIgnoreCase(s2.nombre) && this.listaJugadores.length == s2.listaJugadores.length) {
			for (int i = 0; i < this.listaJugadores.length; i++) {
				esIgual = false;
				for (int j = 0; j < s2.listaJugadores.length; j++) {
					if (this.listaJugadores[i].equalsIgnoreCase(s2.listaJugadores[j])) {
						esIgual = true;
					}
				}
				if (esIgual == false) {
					break;
				}

			}

		}

		return esIgual;

	}

}
