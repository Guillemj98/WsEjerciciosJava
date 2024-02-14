package ClaseString;

import java.util.Scanner;

public class ConteoCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String cadena = sc.nextLine();

		System.out.println("Esta es la frase que has escrito: " + cadena);
		System.out.println("Introduce un caracter, una sola letra ");
		char caracterBuscado = sc.next().charAt(0);
		System.out.println("Esta es la letra que has escrito: " + caracterBuscado);
		
		int contador = 0;
		for (int i = 0; i<cadena.length();i++) {
			if(cadena.charAt(i)==caracterBuscado) {
				contador ++;
			}
		}
		System.out.println("El carácter '" + caracterBuscado + "' aparece " + contador + " veces en la cadena.");
	}

	

}
