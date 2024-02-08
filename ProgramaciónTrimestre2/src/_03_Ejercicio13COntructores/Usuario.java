package _03_Ejercicio13COntructores;

import java.util.Arrays;

public class Usuario {
	int id;
	String nombre;
	int[]arrayPuntuaciones;
	
	// CONTRUCTORES
	public Usuario() {
		super();
	}
	public Usuario(int id, String nombre, int[] arrayPuntuaciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.arrayPuntuaciones = arrayPuntuaciones;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", arrayPuntuaciones=" + Arrays.toString(arrayPuntuaciones)
				+ "]";
	}
	public double devolverMedia() {
		int suma =0;
		double media =0;
		for(int i =0; i<this.arrayPuntuaciones.length;i++) {
			suma+=this.arrayPuntuaciones[i];
		}
		media = suma/this.arrayPuntuaciones.length;
		
		return media;
	}
	public void mostrarValoraciones() {
		for(int i=0; i<this.arrayPuntuaciones.length;i++) {
			System.out.println(this.arrayPuntuaciones[i]);
		}
	}
	public int cuantasValoracionesSonSuperiores(int numero) {
		int contador =0;
		for(int i=0; i<this.arrayPuntuaciones.length;i++) {
			if(this.arrayPuntuaciones[i]>numero) {
				contador++;
			}
		}
		
		return contador;
	}
	public boolean esMayorQueLaMedia(int numero) {
		boolean esMayorMedia =false;
		if(devolverMedia()<numero) {
			esMayorMedia =true;			
		}
		return esMayorMedia;
	}

}
