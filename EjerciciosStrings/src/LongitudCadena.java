import java.util.Scanner;

public class LongitudCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Te vamos a decir la longitud de la frase que introduzcas");
		System.out.println("----------------------");
		System.out.println("Introduce tu frase");
		String cadena = sc.nextLine();
		
		System.out.println("La longitud de tu frase es: " + cadena.length());
		// La longitud de la cadena de pepe me come el ciruelo es 23 es decir hay 23
		// datos pero se empieza a contar desde 0
	

	}

}
