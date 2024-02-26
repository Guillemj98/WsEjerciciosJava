package _06_Ejercicio16_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {
	String nombre;
	ArrayList <String> listaJugadores;

	// Contructores
	public Equipo() {
		super();
	}

	

	public Equipo(String nombre, ArrayList<String> listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}
	



	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + listaJugadores + "]";
	}



	public void mostrarJugadores() {
		for (int i = 0; i < this.listaJugadores.size(); i++) {
			System.out.println(this.listaJugadores.get(i));
		}
	}

	public boolean existeJugador(String jugador) {
		boolean existeJugador = false;
		for (int i = 0; i < this.listaJugadores.size(); i++) {
			if (this.listaJugadores.get(i).equalsIgnoreCase(jugador)) {
				existeJugador = true;
			}
		}
		return existeJugador;
	}

	public int cuantosJugadoresHay() {
		int contador =0;
		for (String j : listaJugadores) {
			if(j!=null) {
				contador++;
			}
		}
		return contador;
	}

	public boolean suficientesJugadores() {
		boolean esApto = false;
		if (cuantosJugadoresHay() >= 7) {
			esApto = true;
		}
		return esApto;
	}

	public boolean laCadenaEsIgual(Equipo cadena) {
		boolean esIgual = false;
		for (int i = 0; i < this.listaJugadores.size(); i++) {
			esIgual = false;
			for (int j = 0; j < cadena.listaJugadores.size(); j++) {
				if (this.listaJugadores.get(i).equalsIgnoreCase(cadena.listaJugadores.get(j))) {
					esIgual = true;
				}
			}
			if (esIgual == false) {
				break;
			}

		}
		return esIgual;
	}

	public boolean sonIguales(Equipo s2) {
		boolean esIgual = false;
		if (this.nombre.equalsIgnoreCase(s2.nombre) && this.listaJugadores.size() == s2.listaJugadores.size()) {
			for (int i = 0; i < this.listaJugadores.size(); i++) {
				esIgual = false;
				for (int j = 0; j < s2.listaJugadores.size(); j++) {
					if (this.listaJugadores.get(i).equalsIgnoreCase(s2.listaJugadores.get(j))) {
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
