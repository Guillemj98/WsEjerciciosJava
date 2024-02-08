
public class _31_notaFinal {

	public static void main(String[] args) {
		System.out.println("Esta es tu nota final: " + nota(5,5,5,5,5));
		System.out.println("Esta es tu nota final: " + nota(8,8,8,8,8));
		System.out.println("Esta es tu nota final: " + nota(10,10,10,10,10));
		System.out.println("Esta es tu nota final: " + nota(10,5,8,5,2));
		System.out.println("Esta es tu nota final: " + nota(5,5,5,5,5));
		

	}
	public static double nota (double x, double g, double h, double y, double z) {	
		// las variables x, g y h son las notas de los parciales
	
		double nota = (((x + g + h)/3)*( 0.55)) + (y * 0.30) + (z * 0.15);
		return nota;
	}
	

}
