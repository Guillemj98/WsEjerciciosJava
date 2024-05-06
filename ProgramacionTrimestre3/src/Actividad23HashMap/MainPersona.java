package Actividad23HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {
	private static Scanner sc;
	private static HashMap<String,Persona>listaPersonas;
	public static void main(String[] args) {
		menuCompleto();
		

	}
	private static void buscarPersonas() {
		System.out.println("Has elegido seleccionar personas por su nombre");
		System.out.println("Introduce el nombre");
		String nombre = pedirNombres().toLowerCase();
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
		System.out.println("|[Pulsa 1:] " + " Introducir Persona       |");
		System.out.println("|[Pulsa 2:] " + " Mostrar Persona          |");
		System.out.println("|[Pulsa 3:] " + " Buscar persona por nombre|");
		System.out.println("|[Pulsa 4:] " + " Salir del programa       |");
	}
	public static void crearPersona() {
		Persona p1 = new Persona();
		System.out.println("Has elegido crear a la Persona");
		System.out.println("Introduce el nombre de la persona");
		String nombre = pedirNombres();
		sc.nextLine();
		if(!listaPersonas.containsKey(nombre)) {		
			p1.setNombre(nombre);	
			p1.setEdad(pedirEdad());			
			p1.setPeso(pedirPeso());
			listaPersonas.put(p1.getNombre().toLowerCase(), p1);
		}else {
			System.out.println("Ya existe el nombre");
			System.out.println("Quieres sobreescribir");
			System.out.println("Pulsa 'y' si quieres sobrescribir");
			System.out.println("Pulsa 'n' si no deseas hacerlo");
			String opcionSobre= sc.nextLine() ;
			switch (opcionSobre) {
			case "y":
				p1.setNombre(nombre);
				p1.setEdad(pedirEdad());
				p1.setPeso(pedirPeso());
				listaPersonas.put(p1.getNombre().toLowerCase(), p1);
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
		String nombre = sc.nextLine();
		return nombre;
		
	}
	public static int pedirEdad() {
		System.out.println("Ingrese la edad");
		String sEdad = sc.nextLine();
		int iEdad = Integer.parseInt(sEdad);
		return iEdad;
	}
	public static double pedirPeso() {
		System.out.println("Introduce el peso");
		String sPeso = sc.nextLine();
		double dPeso = Double.parseDouble(sPeso);
		return dPeso;
	}
	public static void menuCompleto() {
		sc = new Scanner(System.in);
		listaPersonas = new HashMap<>();
		String opcion = "";
		do {
			menu();
			System.out.println("Introduce la opcion");
			
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				crearPersona();
				break;
			case "2":
				mostraPersonas();
				break;
			case "3":
				buscarPersonas();				
				break;
			case "4":
				System.out.println("Salir del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while(!opcion.equals("4"));
	}

}
