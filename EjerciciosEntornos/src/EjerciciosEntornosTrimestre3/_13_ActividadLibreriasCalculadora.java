package EjerciciosEntornosTrimestre3;

import java.util.Scanner;

import matemáticas.Matematicas;

public class _13_ActividadLibreriasCalculadora {
	static Scanner sc;
	public static void main(String[] args) {
		menuCosa();
	}
	public static void menuCosa() {
		int opcion = 0;
		sc = new Scanner(System.in);
		do {
			menu();
			opcion = sc.nextInt();
			if (opcion == 5) {
				System.out.println("Saliste del programa");
				break;
				
			}else {
				System.out.println("Escoge el primer numero");
				int numero1 = sc.nextInt();
				System.out.println("Escoge el segundo numero");
				int numero2 = sc.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Has elegido sumar");
					System.out.println("El resultado es: " + Matematicas.suma(numero1, numero2));
					break;
				case 2:
					System.out.println("Escogiste restar");
					System.out.println("El resultado es: " + Matematicas.resta(numero1, numero2));
					break;
				case 3:
					System.out.println("Has elegido dividir");
					System.out.println("El resultado es: " + Matematicas.division(numero1, numero2));
					break;
				case 4:
					System.out.println("Has elegido multiplicar");
					System.out.println("El resultado es: " + Matematicas.multiplicacion(numero1, numero2));
					break;
				default:
					System.out.println("Opcion incorrecta BOBO");
				}
			}
		} while (opcion != 5);

	}
	public static void menu() {
		System.out.println("==============================");
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para dividir pulse 3");
		System.out.println("Para multiplicar pulse 4");
		System.out.println("Pulse 5 para salir");
		System.out.println("==============================");
	}

}
