import java.util.Scanner;

public class _22_Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Vamos a establecer que en el examen hay un total
		// de 10 preguntas tipo test
		System.out.println("Introduzca el numero de preguntas que tiene correctas");
		double correctas = sc.nextDouble();
		System.out.println("Este es el numero de preguntas correctas: " + correctas);
		System.out.println("Ahora vamos a halla cuanto puntos has obtenido");
		double puntos1 = correctas * 5;
		System.out.println("Estos son los puntos que has obtenido: " + puntos1);
		System.out.println("Introduce el numero de preguntas incorrectas");
		double inc1 = sc.nextDouble();
		double fallos = inc1 * 1;
		System.out.println("Este es el numero de preguntas falladas: " + fallos);
		System.out.println("Introduce el numero de preguntas que has dejado en blanco");
		double blanco = sc.nextDouble();
		System.out.println("Este es el numero de preguntas en blanco: " + blanco);
		System.out.println("Ahora vamos a calcular los puntos obtenidos");
		double puntos = puntos1 - fallos;
		System.out.println("Este es el resultado final de tu examen tipo test si es mayor o igual que 25 has aprobado: " + puntos );

	}

}
