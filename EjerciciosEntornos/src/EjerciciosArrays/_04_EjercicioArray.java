package EjerciciosArrays;

import java.util.Scanner;

public class _04_EjercicioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------PROMEDIO DE ELEMENTOS-----");
		System.out.println("Introduce un numero que será el tamaño del array");
		int tamañoArray = sc.nextInt();
		System.out.println("Este es tamaño de tu array: " + tamañoArray);
		int[]numerosEnteros = new int[tamañoArray];		
		for(int i= 0; i< tamañoArray;i++) {
			System.out.println("Introduce numeros hasta rellenar el array");
			numerosEnteros [i]= sc.nextInt();			
		}
		for(int i=0; i<numerosEnteros.length;i++) {
		System.out.println(" La posicion " + i + " tiene el valor " + numerosEnteros [i]);
		}
		int j = tamañoArray -1;
		// Creamos la variable j para que me indique las posiciones del array invertido
		// esta j la igualamos al tamaño del array -1 porque los arrays son n-1 siempre 
		int[]arrayInverso = new int[tamañoArray];
		for(int i = 0; i<tamañoArray; i++) {
			arrayInverso[j] = numerosEnteros[i];
			j--;
		}
		System.out.println("---------------Invertimos el array----------");
		for(int i =0 ; i<arrayInverso.length; i++) {
			
			System.out.println(" La posicion " + i + " tiene el valor " + arrayInverso[i]);
		}
		

	}

}
