import java.util.Scanner;

public class _18_SumaRestaDivisión {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Vamos a calcular la suma, la resta, la división y la multiplicación ");
		System.out.println("Introduzca el primer numero, si es deciml use , en vez de un punto");
		double d1 = sc.nextDouble();
		System.out.println("Introduzca el siguiente numero");
		double d2 = sc.nextDouble();
		
		double suma = d1 + d2;
		double resta = d1 - d2;
		double división = d1 / d2;
		double multiplicación = d1 * d2;
		System.out.println("Este es el resultado de la suma: " + suma);
		System.out.println("Este es el resultado de la resta: " + resta);
		System.out.println("Este es el resultado de la división: " + división);
		System.out.println("Este es el resultado de la multiplicación: " + multiplicación);
		

	}

}
