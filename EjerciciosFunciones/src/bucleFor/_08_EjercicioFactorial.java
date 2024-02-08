package bucleFor;

import java.util.Scanner;

public class _08_EjercicioFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Calculo de Factorial---------");
		System.out.println("Introduzca un numero");
		int numero1 = sc.nextInt();
		int factorial = 1;
		for (int i= numero1; i>0; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
