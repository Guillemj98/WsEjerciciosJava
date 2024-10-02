package paquete1;

import java.util.List;

public class JefeCurrito extends Empleado {
	private int numeroEmpleado ;
	private String despacho;
	private List <Empleado> listaDeEmpleadosACargo;
	
	
	public int getNumeroEmpleado() {
		return listaDeEmpleadosACargo.size();
	}
	
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public List<Empleado> getListaDeEmpleadosACargo() {
		return listaDeEmpleadosACargo;
	}
	public void setListaDeEmpleadosACargo(List<Empleado> listaDeEmpleadosACargo) {
		this.listaDeEmpleadosACargo = listaDeEmpleadosACargo;
		
	}
	@Override
	public String toString() {
		return "JefeCurrito [numeroEmpleado=" + numeroEmpleado + ", despacho=" + despacho + ", listaDeEmpleadosACargo="
				+ listaDeEmpleadosACargo + "]";
	}

	@Override
	public double salarioTotal() {
		double sueldoTotal = this.getSueldo();
		for(Empleado e : listaDeEmpleadosACargo) {
			if(e instanceof Curritos) {
				sueldoTotal += 0.10 * e.salarioTotal();
			}
		}
		
		return sueldoTotal;
	}
	
	

}
