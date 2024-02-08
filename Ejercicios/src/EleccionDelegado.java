import java.util.Random;
import java.util.Scanner;

public class EleccionDelegado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su numero");
		long L1 = sc.nextLong();
		System.out.println("Este es su numero" + L1);
		System.out.println("Introduzca otro numero");
		long L2 = sc.nextLong();
		System.out.println("Otro numero" + L2);
		System.out.println("Ahora se van a sumar los 2 numero anteriores");
		long L3 = L1 + L2;
		System.out.println("La suma de L1 y L2 es : " + L3);
		
		System.out.println("Introduce tu numero decimal");
		double d1 = sc.nextDouble();
		System.out.println("Este es tu numero dcimal: " + d1);
		System.out.println("Bienvenidos a la elección de delegado");
		System.out.println("---------------------------------");
		System.out.println("Autor: Felix de Pablo");
		System.out.println("Que dios reparta suerte");
		
		System.out.println("introduzca el numero de alumnos que se presentan");
		Scanner Sc = new Scanner (System.in);
		
		int numeroAlumno = sc.nextInt();
		
		Random rd = new Random();
		numeroAlumno++;
		int numeroAleatorio = rd.nextInt(1,numeroAlumno);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("EL numero de alumno premiado como delegado/subdelegado es :" + numeroAleatorio);
		
		
		//rd.nextInt(1,21); // El primer valor se incluye pero el segundo no se incluye
		
		

	}

}
