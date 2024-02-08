import java.util.Scanner;

public class _01_ContadorPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------CONTADOR PARES---------");
		System.out.println("Introduzca un numero que sea menor que el segundo");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca otro numero que sea menor que el anterior");
		int numero2 = sc.nextInt();
		int contador = 0;
		// el usuario me introduce 2 numeros, si el numero 1 es mayor que el numero 2
		// quiero que vaya decreciendo hasta que llegue a numero2
		if (numero2<numero1) {
			do {
			System.out.println("No vale el primer numero tiene que ser mayor que el segundo");
			System.out.println("Introduzca un numero que sea mayor que el segundo");
			numero1 = sc.nextInt();
			System.out.println("Introduzca otro numero que sea menor que el anterior");
			numero2 = sc.nextInt();
			}while (numero1 > numero2);
		}
			
			
		for (int i= numero1; i<=numero2;i++) {
			if (i %2==0) {			
				contador++;
			}
			System.out.println(i);
		}
		System.out.println("El numero de pares es: " + contador);
		
			
		
				
		
		
		
	}
}
