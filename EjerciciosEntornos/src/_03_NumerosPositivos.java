import java.util.Scanner;

public class _03_NumerosPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------SUMA DE NUMEROS POSITIVOS");
		System.out.println("VAMOS A SUMAR NUMEROS HASTA QUE INTRODUZCAS UN NUMERO NEGATIVO");
		int numero1 = sc.nextInt();
		int suma = 0;
		do {
			System.out.println("Introduce un numero");
			numero1 = sc.nextInt();
			if (numero1 >=0) {
				suma+=numero1;
			}else {
				System.out.println("Fin del programa");
			}
		}while (numero1>0); {
			System.out.println("Esta es la suma de los nuemeros positivos: " + suma);
		}
		
		

	}
	
}
