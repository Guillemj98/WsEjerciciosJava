package switch_04;

import java.util.Scanner;

public class _03_sentenciaSwitch {

	public static void main(String[] args) {
		menu();
		switches();
	}
	public static int suma(int d1, int d2) {
		int suma = d1 + d2;
		return suma;
	}
	public static int resta(int d1, int d2) {
		int resta = d1 - d2;
		return resta;
	}
	public static int multiplicacion(int d1, int d2) {
		int multiplicacion = d1 * d2;
		return multiplicacion;
	}
	public static int division(int d1, int d2) {
		int division = d1 / d2;
		return division;
	}
	public static int resto(int n1, int n2) {
		int resto = n1 % n2;
		return resto;
	}
	public static void menu() {
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para multiplicar pulse 3");
		System.out.println("Para dividir pulse 4");
		System.out.println("Para saber el resto de la división entera pulse 5");
	}
	public static void switches() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("Introduce el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("El resultado de la suma es: " + suma(numero1, numero2));
			break;
		case 2:
			System.out.println("El resultado de la resta es: " + resta(numero1, numero2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicación es: " + multiplicacion(numero1, numero2));
			break;
		case 4:
			System.out.println("El resultado de la división es: " + division(numero1, numero2));
			break;
		case 5:
			System.out.println("El resultado del resto es: " + resto(numero1, numero2));
			break;
		}
	}
}
