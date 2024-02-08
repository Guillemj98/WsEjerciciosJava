import java.util.Scanner;

public class InversionCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase y la invierto");
		System.out.println("---INTRODUCE LA FRASE---");
		String cadena1 = sc.nextLine();
		
		for(int i = cadena1.length()-1; i>=0;i--){
			System.out.print(cadena1.charAt(i));
			
		}
		sc.close();

	}

}
