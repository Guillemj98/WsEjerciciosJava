import java.util.Scanner;

public class SubCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------SUBCADENAAAAAAA-------");
		System.out.println("Introduce una frase wapo");
		String cadena = sc.nextLine();
		System.out.println("La longitud de tu cadena de ludicolo es: " + cadena.length());
		System.out.println("Introduce un indice que se menor que el segundo ludicolo");
		int indicePrimero = sc.nextInt();
		// El indice que debes introducir es uno menos al tamaño de la cadena
		System.out.println("Introduce un segundo indice, que sea mayor que el segundo crack!");
		int indiceSegundo = sc.nextInt();
		System.out.println("----Frase entre los 2 indices dados-------");
		System.out.println(cadena.substring(indicePrimero , indiceSegundo + 1));

	}

}
