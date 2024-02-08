package funciones_02;



public class _01_Calculadora {

	public static void main(String[] args) {
		suma(5,5);
		resta(5,5);
		multiplicación(12.43,20.34);
		division(50.2,25.1);
		suma(5.5,5.45);
		resta(45.5,23.4);
		multiplicación(12,20);
		division(50,25);		

	}
	public static void suma (int n1, int n2) {
		int suma = n1+n2;
		System.out.println("Este es el resultado de la suma: " + suma);		
	}
	public static void suma (double d1, double d2) {
		
		double suma = d1+d2;
		System.out.println("Este es el resultado de la suma de numeros en punto flotante : " + suma);		
	}
	public static void resta (int n1, int n2) {
		int resta = n1 - n2;
		System.out.println("Este es el resultado de la resta: " + resta);
	}
	public static void resta (double d1, double d2) {
		double resta = d1 - d2;
		System.out.println("Este es el resultado de la resta con numeros con decimales: " + resta);
	}
	public static void multiplicación (int n1, int n2) {
		int multiplicacion = n1 * n2;
		System.out.println("Este es el resultado de la multiplicacion: " + multiplicacion);
	}
	public static void multiplicación (double d1, double d2) {
		double multiplicacion = d1 * d2;
		System.out.println("Este es el resultado de la multiplicacioncon numeros con decimales: " + multiplicacion);
	}
	public static void division (int n1, int n2) {
		int division = n1 / n2;
		System.out.println("Este es el resultado de la division : " + division);
	}
	public static void division (double d1, double d2) {
		double division = d1 / d2;
		System.out.println("Este es el resultado de la division con numeros con decimales: " + division);
	}
	
	
	


}
