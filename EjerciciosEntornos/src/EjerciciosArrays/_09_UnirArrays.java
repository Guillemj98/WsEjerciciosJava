package EjerciciosArrays;

import java.util.Scanner;

public class _09_UnirArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Unir arrays------");
		System.out.println("Introduce el tamaño del  pimer array");
		int tamañoArray1 = sc.nextInt();
		int[]arrayNumero1 = new int[tamañoArray1];
		System.out.println("Introduce el tamaño del segundo array");
		int tamañoArray2 = sc.nextInt();
		int[]arrayNumero2 = new int[tamañoArray2];
		int sumaTamañoArray=0;
		int suma =0;
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("Ahora vamos a rellenar el primer array");
		for(int i= 0; i<tamañoArray1; i++) {
			System.out.println("Introduce numeros hasta llenar el primer array");
			arrayNumero1[i] = sc.nextInt();
		}
		System.out.println("Ahora vamos a rellenar el segundo array");
		for(int i= 0; i<tamañoArray2; i++) {
			System.out.println("Introduce numeros hasta llenar el primer array");
			arrayNumero2[i] = sc.nextInt();
		}
		int i =0;
		sumaTamañoArray = tamañoArray1+tamañoArray2;
		System.out.println(" Esto es el tamaño del nuevo array "+ sumaTamañoArray);
		int[]arrayNumero3 = new int [sumaTamañoArray];
		for( i =0; i<arrayNumero1.length; i++) {
			arrayNumero3[i]=arrayNumero1[i];
		}
		for(int a =0; a<arrayNumero2.length; a++) {
			arrayNumero3[i]=arrayNumero2[a];
			i++;
		}
		for(i=0;i<arrayNumero3.length;i++) {
			System.out.println("Este es el nuevo array: " + "posicion " + i + " tiene el valor: " + arrayNumero3[i]);
			suma+=arrayNumero3[i];
		}
		System.out.println("La suma del nuevo array es: " + suma );
	
		

	}

}
