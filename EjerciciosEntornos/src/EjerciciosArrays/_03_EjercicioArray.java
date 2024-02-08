package EjerciciosArrays;

import java.util.Scanner;

public class _03_EjercicioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------PROMEDIO DE ELEMENTOS-----");
		System.out.println("Introduce un numero que será el tamaño del array");
		int tamañoArray = sc.nextInt();
		System.out.println("Este es tamaño de tu array: " + tamañoArray);
		int[]numerosEnteros = new int[tamañoArray];
		int numeroMayor = 0;
		for(int i= 0; i< tamañoArray;i++) {
			System.out.println("Introduce numeros hasta rellenar el array");
			numerosEnteros [i]= sc.nextInt();
			if( i==0 || numerosEnteros[i] > numeroMayor  ) {
				numeroMayor=numerosEnteros[i];
			}
		}
		System.out.println("El numero mayor del array es: " + numeroMayor);

	}

}
