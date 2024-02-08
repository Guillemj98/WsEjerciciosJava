package condicionales_01;

import java.util.Scanner;

public class _07_DescuentoCompra {

	public static void main(String[] args) {
		descuentos ();

	}
	public static void descuentos () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el monto total de la compra si es en decimal ponga , en vez de punto");
		double d1 = sc.nextDouble();
		
		if (d1 >= 100) {
			double descuento =( d1 -(d1 * 0.10));
			System.out.println("Ahora se le va a calcular el descuento");	
			System.out.println("Recibes un 10% de descuento");
			System.out.println("Introduzca el descuento que se le aplica en %");
			double d2 = sc.nextDouble();
			System.out.println("Esto es lo que debes pagar: " + descuento);
		}else if (d1>=50) {
			double descuento = ( d1 -(d1 * 0.05));
			System.out.println("Ahora se le va a calcular el descuento");	
			System.out.println("Recibes el 5% de descuento en la compra");
			System.out.println("Introduzca el descuento que se le aplica en %");
			double d2 = sc.nextDouble();
			System.out.println("Esto es lo que debes pagar: " + descuento);
		}else if (d1 < 50) {
			System.out.println("No recibes descuento, compra más");
		}
		
		
	}
	
	

}
