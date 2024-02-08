package EjerciciosArrays;

import java.util.Scanner;

public class _07_BuscarParOImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Contador de pares e impares");
		System.out.println("Introduce el tamaño del array");
		int tamañoArray = sc.nextInt();
		int[]arrayNumero1 = new int[tamañoArray];
		int contadorPares =0;
		int contadorImpares=0;
		for(int i= 0; i<tamañoArray; i++) {
			System.out.println("Introduce numeros hasta llenar el array");
			arrayNumero1[i] = sc.nextInt();
			if(arrayNumero1[i]%2==0) {
				contadorPares++;
			}else if(arrayNumero1[i]%2!=0) {
				contadorImpares++;
			}
		}
		System.out.println("El numero de pares es: " + contadorPares + " y el numero de impares es: " + contadorImpares);
	

	}

}
