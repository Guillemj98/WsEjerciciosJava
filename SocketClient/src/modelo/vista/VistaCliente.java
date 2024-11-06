package modelo.vista;

import java.util.Scanner;

import modelo.gestor.GestorCliente;

public class VistaCliente {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 GestorCliente gc = new GestorCliente();
	     String sOpcion = null;
	     System.out.println("╔════════════════════════════════╗");
	     System.out.println("║       Aplicación Cliente       ║");
	     System.out.println("╚════════════════════════════════╝");
	
		do {
			 System.out.println("\n╔═══════════════════════════════╗");
	         System.out.println("║         Menú de Operaciones   ║");
	         System.out.println("╠═══════════════════════════════╣");
	         System.out.println("║   A. Sumar                    ║");
	         System.out.println("║   B. Restar                   ║");
	         System.out.println("║   C. Multiplicar              ║");
	         System.out.println("║   D. Dividir                  ║");
	         System.out.println("║   E. Salir                    ║");
	         System.out.println("╚═══════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            sOpcion = sc.nextLine();
            if(!sOpcion.equals("E") ) {
            	String num1 = pedirNumeroCliente(sc, "Ingrese el primer número: ");
                String num2 = pedirNumeroCliente(sc, "Ingrese el segundo número: ");
            	String resultado = gc.enviarOperacionNumero(sOpcion,  num1,  num2);
            	System.out.println("Resultado: "  + resultado);
            }
		}while(!sOpcion.equals("E"));
		System.out.println("Programa terminado");

	}

	 private static String pedirNumeroCliente(Scanner sc, String mensaje) {
	        System.out.print(mensaje);
	        return sc.nextLine();
	    }

}
