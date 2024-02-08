  package EjerciciosArrays;

import java.util.Scanner;

public class _10_EliminarValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayPrimero ={2,3,4,5};
		for(int i = 0; i<arrayPrimero.length;i++) {
			System.out.println(arrayPrimero[i] );
			
		}
		int nuevoTamaño=0;
		System.out.println("Vamos a eliminar el dato que elijas del array");
		System.out.println("Introduce un numero entero y si esta en el array se va a eliminar");
		int numeroEliminar = sc.nextInt();
		for(int i =0; i<arrayPrimero.length; i++) {
			if(arrayPrimero[i]!=numeroEliminar) {
				arrayPrimero[nuevoTamaño]=arrayPrimero[i];
				nuevoTamaño++;
				
			}
		}
		int j =0;
		int[]segundoArray= new int[nuevoTamaño];
		for(int i =0; i<segundoArray.length; i++) {
			segundoArray[i]=arrayPrimero[i];
			
		}
		for(int i=0; i<segundoArray.length;i++) {
			System.out.println("Este es el nuevo array " +  " posicion " + i + "  " + segundoArray[i]);
		}

	}

}
