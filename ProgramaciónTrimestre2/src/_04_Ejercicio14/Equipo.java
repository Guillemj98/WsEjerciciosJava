package _04_Ejercicio14;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String[]listaJugadores;
	
	
	// Constructores.	
	public Equipo() {
		super();
	}
	public Equipo(String nombre, String[] listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}
	// Métodos.
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + Arrays.toString(listaJugadores) + "]";
	}
	public void mostrarTodosJugadores() {
		for(int i=0; i<this.listaJugadores.length;i++) {
			System.out.println((i+1) + ". " + this.listaJugadores[i]);
		}
	}
	public boolean existeUnJugador(String jugador) {
		 boolean flag = false;
		 for(int i=0; i<this.listaJugadores.length;i++) {
				if(this.listaJugadores[i].equalsIgnoreCase(jugador)) {
					flag = true;
				}
			}
		 
		return flag;
	}
	public boolean sonIguales(Equipo s2) {
		boolean esIgual = false;
		if(this.nombre.equalsIgnoreCase(s2.nombre)&& this.listaJugadores.length == s2.listaJugadores.length) {
		for(int i = 0; i < this.listaJugadores.length;i++) {
			esIgual = false;
			for(int j = 0; j< s2.listaJugadores.length ; j++) {
				if(this.listaJugadores[i].equalsIgnoreCase(s2.listaJugadores[j])) {
					esIgual = true;
				}	
			}
			if(esIgual == false) {
				break;
			}
		}
		}
		
		return esIgual;
	}
	
	
	
	
	

}
