package bucleFor;

import java.util.Scanner;

public class _11_EjercicioPotencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------CALCULO DE LA POTENCIA-------");
		System.out.println("Introduce un numero que va a ser la base ");
		int base = sc.nextInt();
		System.out.println("Introduce un numero que va a ser el exponente");
		int exponente = sc.nextInt();
		int potencia = 1;
		
		for(int i = 0; i <exponente; i ++) {
			potencia = potencia*base;
			
		}
		System.out.println( base + " ^ " + exponente + " = " + potencia);
		

	}

}
