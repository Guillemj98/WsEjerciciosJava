package modelo.vista;

import java.util.Scanner;

import entidad.Coche;

public class Interfaz {
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
	    System.out.println("=====================================");
        System.out.println("    Creación de Base de Datos de Coches");
        System.out.println("=====================================\n");

        int opcion = 0;
		
 
		
	}

	private static void menu() {
		 System.out.print("Introduce el ID del coche: ");
	        int id = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Introduce la marca del coche: ");
	        String marca = sc.nextLine();

	        System.out.print("Introduce el modelo del coche: ");
	        String modelo = sc.nextLine();

	        System.out.print("Introduce el tipo de motor: ");
	        String tipoModelo = sc.nextLine();

	        System.out.print("Introduce el kilometraje del coche (en Km): ");
	        double kilometros = sc.nextDouble();
	        Coche coche = new Coche();
	        coche.setId(id);
	        coche.setMarca(marca);
	        coche.setModelo(tipoModelo);
	        coche.setTipoMotor(tipoModelo);
	        coche.setKm(kilometros);
	        
	}

}
