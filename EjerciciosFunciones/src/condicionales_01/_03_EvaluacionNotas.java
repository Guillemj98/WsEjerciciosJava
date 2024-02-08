package condicionales_01;

import java.util.Scanner;

public class _03_EvaluacionNotas {

	public static void main(String[] args) {
		nota ();
	}
	public static void nota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0 y el 100");
		int numero = sc.nextInt();
		if (numero == 100) {
			System.out.println("Perfecto has sacado un 10 en el examen, no te confies");
		}else if (numero >= 50 && numero <100) {
			System.out.println("Has aprobado el examen");
		}else if (numero < 50 && numero >= 0) {
			System.out.println("Has suspendido Crack");
		}else {
			System.out.println("no vale este numero");
		}
	
	
		
	}
	
	
}


