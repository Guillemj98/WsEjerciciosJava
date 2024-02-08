package while_06;

import java.util.Scanner;

public class _03_EjercicioPantalla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Numeros comprendidos-----");
		System.out.println("Introduce un numero por pantalla que sea menor que el segundo");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro numero por pantalla que se mayor que el anterior");
		int numero2 = sc.nextInt();
		if (numero1 >= numero2) {
			for (int i = numero1; i >= numero2; i++) {
				System.out.println("No vale elige otro numero");
				numero1 = sc.nextInt();
				System.out.println("Introduce otro numero por pantalla");
				numero2 = sc.nextInt();
			}
		} else if (numero1 < numero2) {
			System.out.println("Esto si que vale");
		}

		while (numero1 <= numero2) {
			System.out.println(numero1);
			numero1++;
		}

	}

}
