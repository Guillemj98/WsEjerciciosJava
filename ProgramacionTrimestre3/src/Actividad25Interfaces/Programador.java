package Actividad25Interfaces;

public class Programador extends Empleado {

	

	@Override
	public String toString() {
		return "Programador [toString()=" + super.toString() + "]";
	}

	

	@Override
	public double calcularDespidoProcedente() {
		
		return getSalarioBase();
	}


	
	
	
}
