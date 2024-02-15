package EjerciciosEntornos;

import java.util.Scanner;

public class _06_VerificarNumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero y te digo si es primo");
		int numero1 = sc.nextInt();
		int primo = 1;
		int contador = 0;
		boolean flag = true;
		for (int i = 1; i <= numero1; i++) {
			if (numero1 % i == 0) {
				contador++;
				if (contador > 2) {
					System.out.println("Tu numero no es primo");
					break;
				}
				
			}

		}
		if(contador==2) {
			System.out.println("Tu numero es primo");
		}

	}

}
