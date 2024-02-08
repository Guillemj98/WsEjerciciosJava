import java.util.Scanner;

public class _19_MediaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular la media de 3 numeros, use , en vez de . a la hora de usar decimales");
		System.out.println("Introduzca el primer numero");
		double d5 = sc.nextDouble();
		System.out.println("Este es el primer numero: " + d5);
		System.out.println("Introduzaca el segundo numero");
		double d6 = sc.nextDouble();
		System.out.println("Este es el segundo numero: " + d6);
		System.out.println("Introduzca el ultimo numero");
		
		double d7 = sc.nextDouble();
		System.out.println("Este es el ultimo numero: " + d7);
		
		double media = ((d5 + d6 + d7))/ 3 ;
		System.out.println("Este es el resultado de la media : " + media);

	}

}
