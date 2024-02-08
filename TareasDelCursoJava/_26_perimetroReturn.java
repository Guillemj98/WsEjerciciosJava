
public class _26_perimetroReturn {

	public static void main(String[] args) {
		System.out.println("El resultado del perimetro es: "+ perimetro(5,2));
		System.out.println("El resultado del perimetro es: "+ perimetro(10,5));
		System.out.println("El resultado del perimetro es: "+ perimetro(50.5,43.25));
		

	}
	public static double perimetro (double x, double y) {
		double perimetro = (2*x) + (2*y);
		return perimetro;
	}

}
