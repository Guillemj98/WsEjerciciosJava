
public class _30_mediaNumeros {

	public static void main(String[] args) {
		media (5,3,2);
		media (6,7,2);
		media (8,12,12);
		media (10,300,9);
		

	}
	public static void media (double x, double y, double z) {
		double media = ((x + y + z)/ 3);
		System.out.println("La media es de estos 3 numero es: " + media);
	}

}
