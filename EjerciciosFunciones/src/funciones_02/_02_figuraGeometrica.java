package funciones_02;

public class _02_figuraGeometrica {

	public static void main(String[] args) {
		
		area(5.34,12.34);
		areaCirculo (2, 3.1415);
		areaTriangulo(20,20);
		
	}
	public static void area (double d1, double d2) {
		double areaRectangulo = d1 * d2;
		System.out.println("Este es el área del rectángulo: " + areaRectangulo);
	}
	public static void areaCirculo (double d1, double d2) {
		 
		double areaCirculo = (d1 * d1)* d2;
		System.out.println("Este es el área del rectángulo: " + areaCirculo);
	}
	// Triangulo acutangulo
	public static void areaTriangulo (double d1, double d2) {
		double areaTriangulo = ((d1 * d2)/2);
		System.out.println("Este es el área del rectángulo: " + areaTriangulo);
	}
	

}
