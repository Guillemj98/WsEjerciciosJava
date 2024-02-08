
public class _32_sueldoTrabajador {

	public static void main(String[] args) {
		sueldo (1000,10,10);
		sueldo (2000,40,10);
		sueldo (30000,1,20);
	}
	public static void sueldo (double x, double y, double z) {
		// el parametro x es el sueldo base
		// el parametro y es el numero de horas extras trabajadas
		// el parametro z es el valor o el precio de las horas extras
		double sueldo = (x + (y * z));
		System.out.println("El sueldo que obtienes a final de mes es: " + sueldo);
	
	}
	

}
