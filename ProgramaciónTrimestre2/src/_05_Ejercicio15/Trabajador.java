package _05_Ejercicio15;

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
	

}
