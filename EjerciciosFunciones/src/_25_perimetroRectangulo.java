
public class _25_perimetroRectangulo {

	public static void main(String[] args) {
		perimetro (5,2);
		perimetro (10,5);
		perimetro (45,37);
		
	}
	public static void perimetro (double numero1, double numero2) {
		double perimetro = ((2*numero1)+(2*numero2));
		System.out.println( "El resultado del perimetro es: " + perimetro);
	}

}
