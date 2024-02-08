package bucleFor;

import java.util.Scanner;

public class _05_EjercicioTabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero y le sacamos la tabla de multiplicar de dicho numero");
		int numero1 = sc.nextInt();
		int multiplicador;
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(numero1 + " X " + multiplicador + " = " + numero1*multiplicador );
		}

	}

}
