package _05_Ejercicio15;

public class Trabajador {
	String nombre;
	String dni;
	double salario;
<<<<<<< HEAD
	public Trabajador() {
		super();
	}
=======
>>>>>>> 53915097a02eb9700935b54767b95722954dc47d
	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
<<<<<<< HEAD
=======
	public Trabajador() {
		super();
	}
>>>>>>> 53915097a02eb9700935b54767b95722954dc47d
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
<<<<<<< HEAD

	public char comprobacionDniValido() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numeroDni = Integer.parseInt(this.dni);
		int indice = numeroDni % 23;

		return letras.charAt(indice);
		
	}
	 public boolean esValidoDni() {
	        String regex = "\\d{8}[A-HJ-NP-TV-Z]";
	        return dni.matches(regex) && dni.length() == 9  ;
	    }
	public boolean ganaMasQue(Trabajador trabajador) {
		if(trabajador.salario<this.salario) {
			return false;
		}
		return true;
	}
	public boolean esIgualAOtroTrabajador(Trabajador trabajador) {
		boolean esIgual = false;
		if(this.dni.equalsIgnoreCase(trabajador.dni) && this.nombre.equalsIgnoreCase(trabajador.nombre) && 
				trabajador.salario == this.salario) {
			esIgual = true;
		}
		return esIgual;
		
	}
	
=======
	
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
>>>>>>> 53915097a02eb9700935b54767b95722954dc47d

}
