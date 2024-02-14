package ClaseString;

import java.util.Scanner;

public class ejercicioPalindromos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----¿Tu palabra será un palindroma?-----");
		System.out.println("Introduce una palabra");
		String palabraPolindroma = sc.nextLine();
		palabraPolindroma = palabraPolindroma.toLowerCase();
		boolean flag = false;
		int longitudPalabra = palabraPolindroma.length();
		for(int i =0; i<longitudPalabra;i++) {		
			if(palabraPolindroma.charAt(i)== palabraPolindroma.charAt(longitudPalabra-1-i)) {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("Tu palabra es palindroma");
		}else {
			System.out.println("Tu palabra NOO es un palindromo");
		}

	}

}
