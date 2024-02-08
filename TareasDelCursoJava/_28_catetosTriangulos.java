
public class _28_catetosTriangulos {

	public static void main(String[] args) {
		System.out.println(hipotenusa(5,5));
		System.out.println(hipotenusa(10,7));

	}
	public static double hipotenusa (double x, double y) {
		double hipotenusa = Math.sqrt((x*x)+(y*y));
		return hipotenusa;
	}

}
