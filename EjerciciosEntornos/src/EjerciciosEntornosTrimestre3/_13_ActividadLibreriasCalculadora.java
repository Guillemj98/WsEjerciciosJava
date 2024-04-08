package EjerciciosEntornosTrimestre3;

import java.util.Scanner;

import matemáticas.Matematicas;

public class _13_ActividadLibreriasCalculadora {
	static Scanner sc ;
	public static void main(String[] args) {
	
		menu();
		

	}
	public static void menu() {
		int opcion = 0;
		sc = new Scanner(System.in);
		do {
		System.out.println("==============================");
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para dividir pulse 3");
		System.out.println("Para multiplicar pulse 4");
		System.out.println("Pulse 5 para salir");
		System.out.println("==============================");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Has elegido sumar");
			System.out.println("Escoge el primer numero");
			int numero1 = sc.nextInt();
			System.out.println("Escoge el segundo numero");
			int numero2 = sc.nextInt();
			System.out.println("El resultado es: " + Matematicas.suma(numero1, numero2));
			break;
		case 2:
			System.out.println("Escogiste restar");
			System.out.println("Escoge el primer numero");
			int numero3 = sc.nextInt();
			System.out.println("Escoge el segundo numero");
			int numero4 = sc.nextInt();
			System.out.println("El resultado es: " +Matematicas.resta(numero3, numero4));
			break;
		case 3:
			System.out.println("Has elegido dividir");
			System.out.println("Escoge el primer numero");
			int numero5 = sc.nextInt();
			System.out.println("Escoge el segundo numero");
			int numero6 = sc.nextInt();
			System.out.println("El resultado es: " +Matematicas.division(numero5, numero6));
			break;
		case 4:
			System.out.println("Has elegido multiplicar");
			System.out.println("Escoge el primer numero");
			int numero7 = sc.nextInt();
			System.out.println("Escoge el segundo numero");
			int numero8 = sc.nextInt();
			System.out.println("El resultado es: " +Matematicas.multiplicacion(numero7, numero8));
			break;
		case 5:
			System.out.println("Saliste del programa");
		}
		}while(opcion!=5);
		
		
	}
	

}
