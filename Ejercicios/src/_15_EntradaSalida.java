	import java.util.Scanner;

public class _15_EntradaSalida {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Tipo string
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		System.out.println("Su frase es " + frase);

		// Tipo int
		System.out.println("Introduzca un numero entero");
		int n1 = sc.nextInt();
		System.out.println("Este es su numero entero:" + n1);
		// Si ponemos un string en vez de numero entero dara error
		// Si ponemos decimales tambien tendremos un error como este
		// Exception in thread "main" java.util.InputMismatchException
		// y nos dira en que linea se encuentra
		// at _14_EntradaSalida.main(_14_EntradaSalida.java:14)

		// Tipo double // tanto aqui como en el float hay que poner ","
		System.out.println("Ponga un numero decimal");
		double d1 = sc.nextDouble();
		System.out.println("Este es su numero decimal: " + d1);

		// Tipo float // en el float no ponemos F al final del numero
		System.out.println("Ponga su numero float");
		float f1 = sc.nextFloat();
		System.out.println("Este es su numero float" + f1);

		// Tipo char
		System.out.println("Ponga su carcter favorito");
		// char C1 = sc.nextChar(); da error el metodo char
		// se puede resolver de la siguiente manera
		// char caracter;
		// caracter = sc.next().charAt(0);
		// System.out.println("Este es tu unico caracter: " + caracter);

		// Tipo byte
		System.out.println("Ponga un byte");
		byte b1 = sc.nextByte();
		System.out.println("Este es su numero byte: " + b1);

		// Hay que tener cuidado y ser muy especifico con lo que se introduce
		// si se pide un numero entero no se puede poner un numero double
		// pero si al reves.
		// Esto se debe a el "tamaño" de la variables

		// Tipo long
		System.out.println("Ponga su numero long");
		long l1 = sc.nextLong();
		System.out.println("Esto es tu numero long : " + l1);

		// Tipo Boolean
		System.out.println("Ponga true o false");
		boolean b2 = sc.nextBoolean();
		System.out.println("Has puesto :" + b2);
		// Si quiero volver a poner otro dato solo tengo
		// que hacer lo siguiente
		System.out.println("Vuelva a poner true o false");
		b2 = sc.nextBoolean();
		System.out.println("Ahora has puesto :" + b2);

	}

}
