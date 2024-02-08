package EjerciciosArrays;

import java.util.Scanner;

public class _05_EjercicioArrayV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------PROMEDIO DE ELEMENTOS-----");
		System.out.println("Introduce un numero que será el tamaño del array");
		int tamañoArray = sc.nextInt();
		System.out.println("Este es tamaño de tu array: " + tamañoArray);
		int[]numerosEnteros = new int[tamañoArray];
		int[]arrayDos =new int [tamañoArray ];
		int i = 0;
		
		
		for(i= 0; i< tamañoArray;i++) {
			System.out.println("Introduce numeros hasta rellenar el array");
			numerosEnteros[i]= sc.nextInt();
		
		}
		for(i =0; i <tamañoArray; i ++) {
		//System.out.println(numerosEnteros[i]);
		for(int j = 0; j<tamañoArray; j++) {
			if(numerosEnteros[j]==numerosEnteros[i]) {
				
			}
		}
	}

	}

}
