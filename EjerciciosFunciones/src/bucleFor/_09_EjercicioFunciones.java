package bucleFor;

import java.util.Scanner;

public class _09_EjercicioFunciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a pedir 2 numeros por pantalla, el primero mayor que el segundo");
		System.out.println("Introduzca el primer numero ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = sc.nextInt();
		
		numeros(numero1, numero2);
		tablaMultiplicar(numero2, numero1);
		factorial(numero2, numero1);

		
	}
	public static void numeros (int numero1, int numero2) {
	
		if(numero1<numero2) {
			for (int i = numero1; i<= numero2; i++) {
			System.out.println(i);
		}
			
		}else {
			System.out.println("Introduce el primer numero mayor que el segundo");
		}
		 
	}
	public static void tablaMultiplicar (int numero2, int numero1) {
		for (numero2 = 1; numero2 <= 10; numero2++) {
			System.out.println(numero1 + " X " + numero2 + " = " + numero1*numero2 );
		}
	}
	public static void factorial ( int factorial, int numero1) {
		factorial = 1;
		for (int i= numero1; i>0; i-=1) {
			factorial = factorial * i;
			System.out.println(factorial);
		}
	}

}
