package bucleFor;

import java.util.Scanner;

public class _03_EjercicioPantalla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a pedir 2 numeros por pantalla, el primero mayor que el segundo");
		System.out.println("Introduzca el primer numero ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = sc.nextInt();
		
		if(numero1<numero2) {
			for (int i = numero1; i<= numero2; i++) {
			System.out.println(i);
		}
			
		}else {
			System.out.println("Introduce el primer numero mayor que el segundo");
		}
		 
		
	}
}
