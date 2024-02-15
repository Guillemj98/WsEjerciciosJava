package EjerciciosEntornos;

import java.util.Scanner;

public class _08_CalculadoraV1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			menu();
			System.out.println("Introduce un numero entre 1-5");
			int numeroMenu = sc.nextInt();
			if (numeroMenu < 1 || numeroMenu > 5) {
				do {
					System.out.println("Introduce un numero entre el 1-5");
					numeroMenu = sc.nextInt();
				} while (numeroMenu < 1 || numeroMenu > 5);
			}
			if (numeroMenu == 5) {
				System.out.println("Fin del programa");
				flag = false;
			}
			if (numeroMenu == 1) {
				System.out.println("Has elegido sumar");
				System.out.println("Introduce el primer numero");
				int numero1 = sc.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero2 = sc.nextInt();
				sumar(numero1, numero2);
				flag = true;
			}
			if (numeroMenu == 2) {
				System.out.println("Has elegido restar");
				System.out.println("Introduce el primer numero");
				int numero1 = sc.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero2 = sc.nextInt();
				restar(numero1, numero2);
				flag = true;
			}
			if (numeroMenu == 3) {
				System.out.println("Has elegido multiplicar");
				System.out.println("Introduce el primer numero");
				int numero1 = sc.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero2 = sc.nextInt();
				multiplicar(numero1, numero2);
				flag = true;
			}
			if (numeroMenu == 4) {
				System.out.println("Has elegido dividir");
				System.out.println("Introduce el primer numero");
				int numero1 = sc.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero2 = sc.nextInt();
				dividir(numero1, numero2);
				flag = true;
			}

		} while (flag == true);

	}

	public static void menu() {
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir del programa");

	}

	public static void sumar(int numero1, int numero2) {
		int sumar = numero1 + numero2;
		System.out.println("El resultado es: " + sumar);
		System.out.println("--------------------------");
	}

	public static void restar(int numero1, int numero2) {
		int restar = numero1 - numero2;
		System.out.println("El resultado es: " + restar);
		System.out.println("--------------------------");
	}

	public static void multiplicar(int numero1, int numero2) {
		int multiplicar = numero1 * numero2;
		System.out.println("El resultado es: " + multiplicar);
		System.out.println("--------------------------");
	}

	public static void dividir(int numero1, int numero2) {
		int dividir = numero1 / numero2;
		System.out.println("El resultado es: " + dividir);
		System.out.println("--------------------------");
	}

}
