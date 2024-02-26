package _06_Ejercicio16;

public class Trabajador {
	String nombre;
	String dni;
	double salario;

	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}



	public boolean esValidoDni() {
		String regex = "\\d{8}[A-HJ-NP-TV-Z]";
		if(dni.matches(regex) && dni.length() == 9) {
			return true;
		}
		return false;
	}
	public char esValidoDni2() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numeroDni = Integer.parseInt(this.dni);
		int indice = numeroDni % 23;
		return letras.charAt(indice);
	}
	
	public boolean ganaMasDinero(Trabajador trabajador) {
		boolean ganaMas = false;
		if(this.salario>trabajador.salario) {
			ganaMas = true;
		}		
		return ganaMas;
	}
	public boolean esIgual(Trabajador trabajador) {
		boolean esIgual = false;
		if((this.nombre.equalsIgnoreCase(trabajador.nombre))&& 
		(this.dni.equalsIgnoreCase(trabajador.dni))&&this.salario==trabajador.salario ) {
			esIgual = true;
		}
		return esIgual;
	}


}
