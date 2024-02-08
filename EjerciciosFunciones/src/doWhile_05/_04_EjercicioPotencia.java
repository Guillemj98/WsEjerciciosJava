package doWhile_05;

import java.util.Scanner;

public class _04_EjercicioPotencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------POTENCIA DE UN NUMERO-------");
		System.out.println("Introduzca un numero el cual va a ser la base");
		int base = sc.nextInt();
		System.out.println("Introduzca un numero el cual va a ser el exponete");
		int exponente = sc.nextInt();
		int resultado = 1;
		int contador = 1;
		boolean flag1 = false;
		do {
			resultado = resultado * base;
			contador ++;
			if(contador > exponente) {
				flag1= true;
			}
		}while(flag1 == false);
		System.out.println("La potencia de base: " + base + "^" + exponente + " = " + resultado);
		
		sc.close();
	}

}
