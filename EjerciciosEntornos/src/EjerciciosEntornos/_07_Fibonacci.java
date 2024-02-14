package EjerciciosEntornos;

import java.util.Scanner;

public class _07_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a poner la secuencia de fibonacci");
		System.out.println("Vamos a poner tantos numeros de la secuencia como tu desees");
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		int numero2 = 1;
		int numero3 =0;
		int suma = 1;
		//System.out.println("Los primeros " + numero1 + " numeros de la secuencia de Fibonacci son:  0 ");
		//System.out.println("Los primeros " + numero1 + " numeros de la secuencia de Fibonacci son:  1 ");
		if(numero1==1)  {
			System.out.println("El primer numero de la secuencia de Fibonacci es:  0");
		}else if(numero1 ==2) {
			System.out.println("Los dos primeros numeros de la secuencia de Fibonacci son: " + numero3 + ", " + numero2 );
		}
		if (numero1 >2) {	
		for(int i =0; i<numero1;i++) {
			System.out.println("Los primeros " + numero1 + " numeros de la secuencia de Fibonacci son: " + numero3);
			suma = numero3 + numero2;
			numero3= numero2;
			numero2= suma;
		}
		}
	

	}

}
