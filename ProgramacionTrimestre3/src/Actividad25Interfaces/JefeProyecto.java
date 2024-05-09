package Actividad25Interfaces;

public class JefeProyecto extends Empleado {
	private double incentivos;



	@Override
	public String toString() {
		return "JefeProyecto [incentivos=" + incentivos + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularSalario() {
		double salarioTotal = super.calcularSalario() + this.incentivos;
		return salarioTotal ;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}
	
	@Override
	public double calcularDespidoProcedente() {
		
		double salarioTotal = this.getSalarioBase()+ this.incentivos;
		return salarioTotal ;
	}

}
