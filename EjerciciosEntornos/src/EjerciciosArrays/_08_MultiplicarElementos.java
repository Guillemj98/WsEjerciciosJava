package EjerciciosArrays;

import java.util.Scanner;

public class _08_MultiplicarElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplicación del array");
		System.out.println("Introduce el tamaño del array");
		int tamañoArray = sc.nextInt();
		int[]arrayNumero1 = new int[tamañoArray];
		int multiplicacion = 1;
		for(int i= 0; i<tamañoArray; i++) {
			System.out.println("Introduce numeros hasta llenar el array");
			arrayNumero1[i] = sc.nextInt();
			multiplicacion = multiplicacion*arrayNumero1[i];
		}
		System.out.println("El resultado de multiplicar todos los datos del array es: " + multiplicacion);

	}

}
