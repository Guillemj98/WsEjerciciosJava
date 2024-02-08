package EjerciciosArrays;

import java.util.Scanner;

public class _01_EjercicioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------SUMA DE ELEMENTOS-----");
		System.out.println("Introduce un numero que será el tamaño del array");
		int tamañoArray = sc.nextInt();
		System.out.println("Este es tamaño de tu array: " + tamañoArray);
		int[]numerosEnteros = new int[tamañoArray];
		int suma = 0;
		for(int i= 0; i< tamañoArray;i++) {
			System.out.println("Introduce numeros hasta rellenar el array");
			numerosEnteros [i]= sc.nextInt();
			suma+=numerosEnteros[i];			
		}
		System.out.println("La suma de los numeros del array son: " + suma);
		
		
		

	}

}
