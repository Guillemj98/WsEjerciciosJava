import java.util.Scanner;

public class _23_HorasExtras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a hallar el sueldo de un trabajdor");
		System.out.println("Introduce el numero de horas extras trabajadas");
		double horasExtras = sc.nextDouble();
		System.out.println("Esto son sus horas trabajadas: " + horasExtras);
		System.out.println("Ahora vamos a calcular el dinero que gana por sus horas extras");
		double dineroExtras = horasExtras * 40;
		System.out.println("Este es el dinero que ganas con tus horas extras: " + dineroExtras);
		
		System.out.println("Ahora vamos a calcular el sueldo total");
		System.out.println("Introduce tu sueldo base");
		double sueldoBase = sc.nextDouble();
		System.out.println("Ahora te vamos a dar tu sueldo completo");
		double sueldoCompleto = dineroExtras + sueldoBase;
		System.out.println("Esto es lo que ganas a final de mes: " + sueldoCompleto);
	
	}

}
