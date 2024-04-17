package Actividad22Herencia;

public class JefeProyecto extends Empleado {
	private double incentivos;
	
	

	@Override
	public double calcularSalario() {
		double salarioTotal = 0;
		salarioTotal = this.getSueldoBase()+ this.incentivos;
		
		return salarioTotal;		
	}

	public double getIncentivos() {
		return incentivos;
	}


	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}


	@Override
	public String toString() {
		return "JefeProyecto [incentivos=" + incentivos + ", toString()=" + super.toString() + "]";
	}
	

}
