package Actividad23HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainNumeroTelefonos {
		private static Scanner sc ;
	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		HashMap<String,Integer>listadoNumeroTelefono = new HashMap<String, Integer>();
		
		for ( int i=0; i <5 ; i++) {
			listadoNumeroTelefono.put(rellenarNombresListin(), rellenarDatosNumeros());
		}
		listadoNumeroTelefono.forEach((k,v)->{
			System.out.println("El nombre es: " + k);
			System.out.println("El numero es: " + v);
		});
		
	}
	public static int rellenarDatosNumeros() {
		System.out.println("Introduce el numero de telefono");
		String sNumeroTelefono = sc.nextLine();
		int iNumeroTelefono = Integer.parseInt(sNumeroTelefono);
		return iNumeroTelefono;
		
	}
	public static String rellenarNombresListin() {
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		return nombre;
		
	}

}
