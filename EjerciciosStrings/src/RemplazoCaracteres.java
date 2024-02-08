import java.util.Scanner;

public class RemplazoCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a remplazar el caracter que quieras");
		System.out.println("Introduce un solo caracter ");
		String caracter = sc.nextLine();
		String cadena = "por colón trozo pocho";
		System.out.println("-------------------------");		
		System.out.println("------------------------");
		System.out.println("Esto es la nueva cadena: " + cadena.replace("o", caracter));
		

	}

}
