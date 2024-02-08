
public class _29_sumaRestaDivisionMultiplicacion {

	public static void main(String[] args) {
		System.out.println("El resultado es: " + suma(5,5));
		System.out.println("El resultado es: " + resta(10,5));
		System.out.println("El resultado es: " + multiplicacion(2,5));
		System.out.println("El resultado es: " + division(20,10));	
	}
	public static int suma (int x, int y) {
		int suma = x + y;
		return suma;		
	}
	public static int resta (int x, int y) {
		int resta = x - y;
		return resta;		
	}
	public static int multiplicacion (int x, int y) {
		int multiplicacion = x * y;
		return multiplicacion;		
	}
	public static int division (int x, int y) {
		int division = x / y;
		return division;		
	}

}
