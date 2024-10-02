package paquete1;

public class Empleado {
	private String nombre;
	private String sexo;
	private int edad;
	private Direccion direccion;
	private double sueldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", direccion=" + direccion
				+ ", sueldo=" + sueldo + "]";
	}
	public double salarioTotal() {
		return this.sueldo;
	}

}
