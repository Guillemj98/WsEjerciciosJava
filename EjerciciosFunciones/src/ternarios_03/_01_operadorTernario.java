package ternarios_03;

import java.util.Scanner;

public class _01_operadorTernario {

	public static void main(String[] args) {
		mayorMenor();
	}
	public static void mayorMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a comprobar que numero es mayor o menor");
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro numero");
		int numero2= sc.nextInt();
		String mayor=(numero1 > numero2)? numero1 + " " +"Es mayor que " + " " + numero2: numero1 + " " +"Es menor que" + " " + numero2 ;
		System.out.println(mayor);
		
	}
	
	

}
