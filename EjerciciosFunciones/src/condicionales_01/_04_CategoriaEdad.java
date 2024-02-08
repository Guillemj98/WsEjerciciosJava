package condicionales_01;

import java.util.Scanner;

public class _04_CategoriaEdad {

	public static void main(String[] args) {
		edad();
	}
	public static void edad () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad y te dire a que categoría perteneces");
		int edad = sc.nextInt();
		
		if (edad < 0) {
			System.out.println("No vale este rango");
		}
		else if (edad <= 12) {
			System.out.println("Niño");
		}else if (edad <= 19) {
			System.out.println("Adolescente");
		}else if (edad <= 64) {
			System.out.println("Adulto");
		}
		else if (edad >= 65) {
			System.out.println("Viejo de cojones");
		}
	}
	

}
