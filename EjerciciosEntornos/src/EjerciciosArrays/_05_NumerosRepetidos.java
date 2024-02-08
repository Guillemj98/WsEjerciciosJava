package EjerciciosArrays;

import java.util.Scanner;

public class _05_NumerosRepetidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a eliminar todos los numeros repetidos");
		System.out.println("Introduce el tamaño del array");
		int tamañoArray = sc.nextInt();
		int[]arrayNumero1 = new int[tamañoArray];
		for(int i= 0; i<tamañoArray; i++) {
			System.out.println("Introduce numeros hasta llenar el array");
			arrayNumero1[i] = sc.nextInt();
		}
		for (int i =0;i<tamañoArray;i++) {
			System.out.println("La posoción: " + i + " es: " + arrayNumero1[i]);
		}
		

	}

}
