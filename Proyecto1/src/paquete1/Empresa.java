package paquete1;

import java.util.List;

public class Empresa {
	private String nombre;
	private String NIF;
	private List <Empleado> listaEmpleados;
	private Direccion direccionEmpresa;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public Direccion getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(Direccion direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", NIF=" + NIF + ", listaEmpleados=" + listaEmpleados
				+ ", direccionEmpresa=" + direccionEmpresa + "]";
	}
	public double  calcularSalarioEmpleados() {
		double salarioTotal= 0;
		for(Empleado e : listaEmpleados) {
			salarioTotal += e.salarioTotal();
		}
		return salarioTotal;
	}
	public int cuantosSonDirectores() {
		int contador =0;
		for(Empleado e : listaEmpleados) {
			if(e instanceof JefeCurrito) {
				contador ++;
			}
		}
		return contador;
		
	}

}
