package Actividad25Interfaces;

public class Empleado implements Despedible {
	private int id ;
	private String DNI;
	private String nombre;
	private double salarioBase;
	private static int contador;
	
	
	public int getId() {
		return id;
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


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public static int getContador() {
		return contador;
	}


	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", salarioBase=" + salarioBase + "]";
	}


	public Empleado() {
		int id = contador;
		contador ++;
		
	}
	public double calcularSalario() {
		double salarioEmpleado =0;
		this.salarioBase = salarioEmpleado;
		return salarioEmpleado;
		
	}


	@Override
	public double calcularDespidoProcedente() {
		
		return 0;
	}


	@Override
	public double calcularDespidoImprocedente(int aniosTrabajados) {
	     double importe = salarioBase + (salarioBase * 0.10 * aniosTrabajados); 

	        if (this instanceof Director) {
	            
	            importe += importe * 0.20;
	        }

	        return importe;
	  }
	
}
	


