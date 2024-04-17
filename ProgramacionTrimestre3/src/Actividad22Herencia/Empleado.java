package Actividad22Herencia;

public class Empleado {
	private int id;
	private String DNI;
	private String nombre;
	private double sueldoBase;
	private static int contador;
	
	public Empleado() {
		super();
		this.id = contador;
		contador ++;
	}
	
	public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}


	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	public double calcularSalario() {
		
		return this.sueldoBase;
	}

}
