package funciones_02;

import java.util.Scanner;

public class _03_pantallaPedir {

	public static void main(String[] args) {
		
		numero();
		

	}
	public static void numero () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		int numero1 = sc.nextInt();
		System.out.println("Este es tu numero: " + numero1);
		System.out.println("Introduce otro numero entero");
		int numero2 = sc.nextInt();
		System.out.println("Este es tu segundo numero : " + numero2);
		suma (numero1,numero2);
		resta (numero1,numero2);
		multiplicación(numero1,numero2);
		division (numero1,numero2);
		
		
		
	}
	public static void suma (int n1, int n2) {
		int suma = n1+n2;
		System.out.println("Este es el resultado de la suma: " + suma);		
	}
	
	public static void resta (int n1, int n2) {
		int resta = n1 - n2;
		System.out.println("Este es el resultado de la resta: " + resta);
	}
	
	public static void multiplicación (int n1, int n2) {
		int multiplicacion = n1 * n2;
		System.out.println("Este es el resultado de la multiplicacion: " + multiplicacion);
	}
	
	public static void division (int n1, int n2) {
		int division = n1 / n2;
		System.out.println("Este es el resultado de la division : " + division);
	}
	

}
