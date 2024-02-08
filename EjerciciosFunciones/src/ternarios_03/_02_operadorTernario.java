package ternarios_03;

import java.util.Scanner;

public class _02_operadorTernario {

	public static void main(String[] args) {
		nota();
	}
	public static void nota () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el puntuaje que sacaste en el examen");
		int numero1 = sc.nextInt();
		String examen = (numero1>=50)? "Has aprobado el examen": "Has suspendido el examen";
		System.out.println(examen);
	}

}
