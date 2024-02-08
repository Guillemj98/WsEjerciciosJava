package condicionales_01;

import java.util.Scanner;

public class _06_ImparOPar {

	public static void main(String[] args) {
		numeros();
	}
	public static void numeros () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduza un numero entero");
		int numero1 = sc.nextInt();
		if (numero1 %2==0) {
			System.out.println("Este numero es par");
		}else {
			System.out.println("Este numero es impar");
		}
	}

}
