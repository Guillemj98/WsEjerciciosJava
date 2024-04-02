package Ejercicio16_V2;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<String>listaJugadores;
	
	
	 public Equipo(String nombre, ArrayList<String> listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	public Equipo() {
		 
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + listaJugadores + "]";
	}
	public void mostrarJugadores() {
		for (String jugador : listaJugadores) {
			System.out.println(jugador);
		}
	}
	public boolean existeJugador(String jugador) {
		for(String otroJugador: listaJugadores) {
			if(otroJugador.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	public int cuantosJugadoresTiene() {
		return listaJugadores.size();
	}
	public boolean aptoParaJugar() {
		if(listaJugadores.size()<7) {
			return false;
		}
		return true;
	}
	public boolean listaIgual(Equipo cadena) {
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
	public boolean equipoIgual(Equipo e) {
		if(this.nombre.equalsIgnoreCase(e.nombre)&& listaIgual(e)) {
			return true;
		}
		return false;
		
	}

}
