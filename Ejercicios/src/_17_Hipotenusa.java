import java.util.Scanner;

public class _17_Hipotenusa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular la hipotenusa de un traingulo rectángulo, ojo pon , si vas a usar un numero decimal");
		System.out.println("Introduzca uno de los catetos");
		double a = sc.nextDouble();
		
		System.out.println("introduzca el otro cateto");
		double b = sc.nextDouble();
		double c = Math.sqrt((a*a)+(b*b));
		System.out.println("Este es el resultado de la hipotenusa: " + c);

	}

}
