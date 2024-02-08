package EjerciciosArrays;

import java.util.Scanner;

public class _06_BuscarElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arrayNuevo = new int [5];
		arrayNuevo[0]=1;
		arrayNuevo[1]=2;
		arrayNuevo[2]=3;
		arrayNuevo[3]=4;
		arrayNuevo[4]=5;
		System.out.println("---VAMOS A VER SI EL NUMERO QUE PONES ESTA EN EL ARRAY----");
		System.out.println("Introduce un numero y te digo si esta ");
		int numeroAveriguar = sc.nextInt();
		boolean encontrado= true;
		
		for(int i=0 ;i<arrayNuevo.length; i++) {
			System.out.println("La posición " + i + " tiene de valor: " + arrayNuevo[i]);
			if(numeroAveriguar == arrayNuevo[i] ) {
				encontrado= false;
				break;
			}
		}
		if(encontrado==false) {
			System.out.println("El valor " + numeroAveriguar + " esta presente en el array");
		}else {
			System.out.println("El valor " + numeroAveriguar + " no esta presente en el array");
		}

	}

}
