package paquete1;

public class Curritos extends Empleado {
	private double jornadaLaboral;
	private double horasExtras;
	public double getJornadaLaboral() {
		return jornadaLaboral;
	}
	public void setJornadaLaboral(double jornadaLaboral) {
		this.jornadaLaboral = jornadaLaboral;
	}
	public double getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	@Override
	public String toString() {
		return "Curritos [jornadaLaboral=" + jornadaLaboral + ", horasExtras=" + horasExtras + "]";
	}
	@Override
	public double salarioTotal() {
		double sueldoTotal = 0;
		sueldoTotal = super.salarioTotal() + (this.horasExtras * 50 );
		return sueldoTotal ;
	}
	

}
