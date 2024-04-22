package Actividad23HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {
	private static Scanner sc;
	private static HashMap<String,Persona>listaPersonas;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		listaPersonas = new HashMap<>();
		int opcion = 0;
		do {
			menu();
			System.out.println("Introduce la opcion");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				crearPersona();
				break;
			case 2:
				mostraPersonas();
				break;
			case 3:
				buscarPersonas();				
				break;
			case 4:
				System.out.println("Salir del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while(opcion ==4);
		

	}
	private static void buscarPersonas() {
		System.out.println("Has elegido seleccionar personas por su nombre");
		System.out.println("Introduce el nombre");
		String nombre = pedirNombres();
		if(listaPersonas.get(nombre)== null) {
			System.out.println("Nombre erroneo");
		}else {
			listaPersonas.get(nombre);
		}
		
	}
	private static void mostraPersonas() {
		System.out.println("Has elegido mostrar a todas las personas");
		listaPersonas.forEach((k,v)->{
			System.out.println("La clave es " + k.toString());
			System.out.println("El valor es: " + v.toString());
		});
	}
	public static void menu() {
		System.out.println("Pulsa 1: " + " Introducir Persona");
		System.out.println("Pulsa 2: " + " Mostrar Persona");
		System.out.println("Pulsa 3: " + " Buscar persona por nombre");
		System.out.println("Pulsa 4: " + " Salir del programa");
	}
	public static void crearPersona() {

		System.out.println("Has elegido crear a la Persona");
		Persona p1 = new Persona();
		System.out.println("Introduce el nombre de la persona");
		String nombre = pedirNombres();
		if(listaPersonas.get(nombre)!=null) {		
			p1.setNombre(nombre);
			
			System.out.println("Introduce la edad de: " + p1.getNombre());
			p1.setEdad(sc.nextInt());
			
			System.out.println("Introduce el peso de: " + p1.getNombre());
			p1.setPeso(sc.nextDouble());
			listaPersonas.put(p1.getNombre(), p1);
		}else if(listaPersonas.get(nombre).equals(nombre)) {
			System.out.println("Ya existe el nombre");
			System.out.println("Quieres sobreescribir");
			System.out.println("Pulsa 'y' si quieres sobrescribir");
			System.out.println("Pulsa 'n' si no deseas hacerlo");
			String opcionSobre= sc.nextLine() ;
			switch (opcionSobre) {
			case "y":
				p1.setNombre(nombre);
				
				System.out.println("Introduce la edad de: " + p1.getNombre());
				p1.setEdad(sc.nextInt());
				
				System.out.println("Introduce el peso de: " + p1.getNombre());
				p1.setPeso(sc.nextDouble());
				listaPersonas.put(p1.getNombre(), p1);
				break;
			case "n":
				System.out.println("Sigue igual");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}	
		
	}
	public static String pedirNombres() {
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		return nombre;
		
	}

}
