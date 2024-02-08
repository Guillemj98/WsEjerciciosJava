import java.util.Scanner;

public class MayusculasYMinusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a devolver tu cadena en mayus y en minus");
		System.out.println("-----------");
		System.out.println("Introduce tu frase");
		String cadena = sc.nextLine();
		System.out.println("------Cadena en MAYUS-----");
		System.out.println(cadena.toUpperCase());
		System.out.println("------Cadena en minus-----");
		System.out.println(cadena.toLowerCase());

	}

}
