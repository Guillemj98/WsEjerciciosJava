import java.util.Scanner;

public class _20_Vendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular primero lo que gana por cada venta");
		System.out.println("Introduzca la primera venta");
		double d1 = sc.nextDouble();
		System.out.println("Esto es su venta: " + d1);
		System.out.println("introduzca la segunda venta");
		double d2 = sc.nextDouble();
		System.out.println("Esto es su segunda vventa: " + d2);
		System.out.println("Inroduzca su tercera venta");
		double d3 = sc.nextDouble();
		System.out.println("Esto es su tercera venta: " + d3);
		
		System.out.println("Ahora se le va a proporcionar lo que ha ganado de comisión por todas sus ventas");	
		double comision = ((d1 + d2 + d3))* 0.10;
		System.out.println("Esto es lo que ha ganado de comisión: " + comision);
		System.out.println("Ahora vamos a proceder lo que gana al mes en total");
		System.out.println("Introduzca lo que gana al mes");
		double d4 = sc.nextDouble();
		System.out.println("Esto es lo que gana al mes sin comisiones: " + d4);
		System.out.println("Y ahora se va a calcular lo que gana con comisiones");
		double sueldo = d4 + comision;
		System.out.println("Esto es su sueldo total: " + sueldo);
	}

}
