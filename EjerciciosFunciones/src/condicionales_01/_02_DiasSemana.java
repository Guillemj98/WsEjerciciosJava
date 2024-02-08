package condicionales_01;

import java.util.Scanner;

public class _02_DiasSemana {

	public static void main(String[] args) {
		semana();
		

	}
	public static void semana () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 7");
		int numero = sc.nextInt();
		if (numero == 1) {
			System.out.println("Hoy es Lunes");
		}else if (numero == 2) {
			System.out.println("Hoy es Martes");
		}
		else if (numero == 3) {
			System.out.println("Hoy es Miercoles");
		}
		else if (numero == 4) {
			System.out.println("Hoy es Jueves");
		}
		else if (numero == 5) {
			System.out.println("Hoy es Viernes");
		}
		else if (numero == 6) {
			System.out.println("Hoy es Sábado");
		}
		else if (numero == 7) {
			System.out.println("Hoy es Domingo");
		}else {
			System.out.println("Numero de la semana invalido");
		}
	}

}
