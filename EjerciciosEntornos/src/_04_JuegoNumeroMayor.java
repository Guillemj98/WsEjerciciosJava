package EjerciciosEntornos;

import java.util.Scanner;

public class _04_JuegoNumeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------VAMOS A DETERMINAR QUE NUMERO ES MAYOR-------");
		System.out.println("Introduce un numero positivo, si deseas salir del programa pon un numero negativo");
		int numero1 = sc.nextInt();
		int numeroMayor = 0;
		do {
			System.out.println("Introduce otro numero positivo");
			numero1= sc.nextInt();
			if (numero1> numeroMayor) {
				numeroMayor= numero1;
				
			}else {
				System.out.println("Fin del programa");
			}
		}while (numero1>=0);
	System.out.println("El numero mayor introducido es: " + numeroMayor);

	}

}
