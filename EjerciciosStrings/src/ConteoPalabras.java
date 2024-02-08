import java.util.Scanner;

public class ConteoPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("VAMOS CONTAR LAS PALABRAS QUE HAY EN LA FRASE ");
		System.out.println("------INTRODUCE TU FRASE------");
		String cadena = sc.nextLine();
		String[]cadenaContadora = cadena.split(" ");
		System.out.println(" Este es el numero de palabras que contiene tu frase: " + cadenaContadora.length);
		for (String s :cadenaContadora) {
			System.out.println(s);
		}
		
	}

}
