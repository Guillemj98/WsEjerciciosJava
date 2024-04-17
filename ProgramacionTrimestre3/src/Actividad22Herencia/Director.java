package Actividad22Herencia;

import java.util.ArrayList;

public class Director extends Empleado {
	private ArrayList<Empleado>listaEmpleados;

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Director [listaEmpleados=" + listaEmpleados + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularSalario() {
		double salarioTotal = 0;
		salarioTotal = this.getSueldoBase()+(100 * listaEmpleados.size());
		return salarioTotal;
	}
	
	

}
