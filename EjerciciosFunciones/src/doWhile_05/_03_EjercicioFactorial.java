package doWhile_05;

import java.util.Scanner;

public class _03_EjercicioFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------FACTORIAL-----------");
		System.out.println("Introduzca un numero y calculamos su factorial");
		int numero1 = sc.nextInt();
		int factorial = 1;
		int contador =1;
		do {
			factorial = contador * factorial;
			System.out.println(factorial);
			contador ++;
				
		}while(contador<=numero1);


	}

}
