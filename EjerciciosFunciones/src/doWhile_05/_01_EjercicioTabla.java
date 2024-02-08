package doWhile_05;

import java.util.Scanner;

public class _01_EjercicioTabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------TABLA DE MULTIPLICAR---------");
		System.out.println("Introduzca un numero y hago su tabla de multiplicar");
		int numero1 = sc.nextInt();
		int multiplicar = 1;
		int resultado = 1;
		do {
			resultado = numero1 * multiplicar;
			System.out.println(numero1 + " X " + multiplicar + " = " + resultado);
			multiplicar ++;
			
		}while(multiplicar<=100);

	}

}
