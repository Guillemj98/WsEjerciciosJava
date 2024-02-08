package switch_04;

import java.util.Scanner;

public class _04_sentenciaSwitch {

	public static void main(String[] args) {
		imparOPar();

	}

	public static void imparOPar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero y te digo si es par o impar");
		int numero = sc.nextInt();
		if (numero != 0) {
			
			switch (numero % 2) {
			case 0:
				System.out.println("Tu número es par");
				break;
			case 1:
				System.out.println("Tu número es impar");
				break;

			default:
				break;
			}
			
		}else {
			System.out.println("Tu número es 0");
		}
	}

}
