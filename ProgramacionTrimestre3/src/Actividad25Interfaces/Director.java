package Actividad25Interfaces;

import java.util.ArrayList;

public class Director extends Empleado  {
	private ArrayList<Empleado>listaEmpleadosDirector;
	
	@Override
	public String toString() {
		return "Director [listaEmpleados=" + listaEmpleadosDirector + ", toString()=" + super.toString() + "]";
	}



	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleadosDirector;
	}



	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleadosDirector = listaEmpleados;
	}



	@Override
	public double calcularSalario() {
		double salarioTotal = super.calcularSalario() + (100 * listaEmpleadosDirector.size()); 
		return salarioTotal;
	
	}
	@Override
	public double calcularDespidoProcedente() {
		
		double salarioTotal = this.getSalarioBase() + (100 * listaEmpleadosDirector.size()); 
		return salarioTotal;
	}
}
