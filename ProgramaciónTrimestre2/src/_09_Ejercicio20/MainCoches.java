package _09_Ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCoches {
	Scanner sc ;
	ArrayList<Coche>listaCoches ;

	public static void main(String[] args) {
		MainCoches mc = new MainCoches();
		mc.arrancarPrograma();

	}
	
	public static void menuCoche() {
		System.out.println("Pulsa 1-- " + " Crear coche");
		System.out.println("Pulsa 2-- " + " Mostrar coches");
		System.out.println("Pulsa 3-- " + " Mostrar contadorID");
		System.out.println("Pulsa 4-- " + " Resetear contadorID");
		System.out.println("Pulsa 5-- " + " Salir del programa");
	}
	public void arrancarPrograma() {
		sc = new Scanner(System.in);
		listaCoches = new ArrayList<Coche>();
		
		int opcion =0;
	
		do {
			menuCoche();
			System.out.println("Introduce la opcion que deseas");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				sc.nextLine();
				System.out.println("--Elegiste crear un coche--");
				crearCoche();
				break;
			case 2:
				System.out.println("--Has elegido mostrar coche--");
				recorrerArrayCoche();
				break;
			case 3:
				System.out.println("--Mostrar contador ID--");
				mostrarId();
				break;
			case 4:
				System.out.println("--Has elegido resetear el ID--");
				resetearId();
				break;
			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("opcion equivocada imbécil");
				break;
			}
		}while(opcion!=5);
	}
	public void crearCoche() {
		Coche coche = new Coche();
		System.out.println("Introduce la matricula de tu coche");
		String matricula = sc.nextLine();
		System.out.println("Introduce la marca del coche");
		String marca = sc.nextLine();
		// Asignamos los datos pedidos al objeto coche
		coche.setMarca(marca);
		coche.setMatricula(matricula);
		// Agreamos el coche con los datos de marca y matricula 
		// a la lista de coches o array que esta creado como un arrayu
		// dinamico arriba.
		listaCoches.add(coche);
	}
	public void recorrerArrayCoche() {
		for(Coche c : listaCoches) {
			System.out.println(c.toString());
		}
		
	}
	public void mostrarId() {
		Coche.valorActualId();
	}
	public void resetearId() {
		Coche.resetearContador();
	}

}
