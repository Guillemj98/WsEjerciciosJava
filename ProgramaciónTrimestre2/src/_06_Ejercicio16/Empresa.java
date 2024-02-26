package _06_Ejercicio16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {
	String nombre;
	String nif;
	ArrayList <Trabajador> listaTrabajadores;
	public Empresa() {
		super();
		listaTrabajadores = new ArrayList<>();
	}

	

	public Empresa(String nombre, String nif, ArrayList<Trabajador> listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}

	
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", listaTrabajadores=" + listaTrabajadores + "]";
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

	
	public boolean existeElTrabajador(String dni) {
		for(Trabajador t: listaTrabajadores) {
			if(t.dni.equalsIgnoreCase(dni));
			return true;
		}
		return false;
			

	}
	public int cuantosTrabajadoresHay() {
		int contador =0;
		for(Trabajador t : this.listaTrabajadores) {
			if(t!=null) {
				contador ++;
			}
			
	}
		return contador;
}
	public double cuantoSeGastaLaEmpresa() {
		double suma =0;
		for(Trabajador t : listaTrabajadores) {
			if(t !=null) {
				suma+=t.salario;
			}
		}
		return suma;
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
	public int cuantosTrabajadoresGanasMas(double salario) {
		int contador = 0;
		for(Trabajador t: listaTrabajadores) {
			if(t.salario>salario) {
				contador ++;
			}
		}
		
		return contador;
	}

	public boolean cuantosTrabajadoresDniValido() {
		for (Trabajador t : listaTrabajadores) {
			if (t.esValidoDni() == false) {
				return false;
			}
		}
		return true;
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
