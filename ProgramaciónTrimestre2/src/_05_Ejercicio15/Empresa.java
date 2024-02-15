package _05_Ejercicio15;

import java.util.Arrays;

public class Empresa {
	String nombre;
	String nif;
	Trabajador []listaTrabajadores;
	public Empresa() {
		super();
	}
	public Empresa(String nombre, String nif, Trabajador[] listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", listaTrabajadores="
				+ Arrays.toString(listaTrabajadores) + "]";
	}
	public void mostrarDatosTrabajadores() {
		for(Trabajador t : listaTrabajadores) {
			System.out.println(t.toString());
		}
	}
	public boolean existeTrabajdorDni() {
		boolean siExiste = false;
		return siExiste;
	}
	public int cuantosTrabajadoresHay(Trabajador trabajador) {
		int contador =0;
		for(Trabajador t : this.listaTrabajadores) {
			if(t!=null) {
				contador ++;
			}
			
	}
		return contador;
}
	public int cuantosTrabajadoresGanasMas3000() {
		int contador = 0;
		for(Trabajador t: listaTrabajadores) {
			if(t.salario>3000) {
				contador ++;
			}
		}
		
		return contador;
	}
	public int cuantosTrabajadoresGanasMenosSmi() {
		int contador = 0;
		for(Trabajador t: listaTrabajadores) {
			if(t.salario<1134 ) {
				contador ++;
			}
		}
		
		return contador;
	}
	public int cuantosTrabajadoresGanasMas(Trabajador trabajador) {
		int contador = 0;
		for(Trabajador t: listaTrabajadores) {
			if(t.salario>trabajador.salario) {
				contador ++;
			}
		}
		
		return contador;
	}
	public boolean cuantosTrabajadoresDniValido(Trabajador trabajador) {
		int contador =0;
		for(Trabajador t: listaTrabajadores) {
			if(t.esValidoDni() == true) {
				contador++;
			}
		}
		if(contador == listaTrabajadores.length) {
			return true;
		}
		
		
		return false;
	}
	public boolean esIgual(Empresa empresa) {
		boolean esIgual = false;
		if((this.nombre.equalsIgnoreCase(empresa.nombre))&& 
		(this.nif.equalsIgnoreCase(empresa.nif))) {
			esIgual = true;
		}
		return esIgual;
	}
	
	

}
