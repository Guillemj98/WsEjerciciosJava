package modelo.vista;

import java.sql.SQLException;
import java.util.Scanner;

import entidad.Coche;
import modelo.negocio.Gestor;

public class Interfaz {
	static Scanner sc = null;
	static Gestor gestor = Gestor.getInstance();
	/*
	 * Usando el modelo de las 3 capas. La capa Dao lo que hace es Conectarte con la
	 * base de datos mediante Connection conn =
	 * DriverManager.getConnection(url,user,pass) y guarda los coches en la base de
	 * datos.
	 * 
	 * La capa gestora se encarga de las las excepciones, es decir, que la marca el
	 * nombre... no puedan ser nulas o estar vacias, aparte de tener un metodo que
	 * se llame guardar coche, en el que invocamos el metodo de insertar coche de la
	 * clase Dao.
	 * 
	 * Y por ultimo la interfaz que pide los datos al usuario.
	 */

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║🚗 Creación de Base de Datos de Coches 🚗 ║");
		System.out.println("╚══════════════════════════════════════════╝\n");

		menu();

		
		System.out.println("Aplicacion finalizada ");

	}

	private static void menu() {
		int opcion = 0;
		do {
			System.out.println("╔══════════════════════════════════════════╗");
			System.out.println("║          MENÚ DE GESTIÓN DE COCHES       ║");
			System.out.println("╠══════════════════════════════════════════╣");
			System.out.println("║ 1. 🚗 Dar de alta coche                  ║");
			System.out.println("║ 2. 🗑️  Dar de baja coche por ID          ║");
			System.out.println("║ 3. ✏️  Modificar coche por ID            ║");
			System.out.println("║ 4. 🔍 Buscar coche por ID                ║");
			System.out.println("║ 5. 🔍 Buscar coches por marca            ║");
			System.out.println("║ 6. 📋 Listar todos los coches            ║");
			System.out.println("║ 0. ❌ Salir de la aplicación             ║");
			System.out.println("╚══════════════════════════════════════════╝");
			System.out.print("Seleccione una opción: ");

			opcion = sc.nextInt();
			sc.nextLine();

			System.out.println();

			switch (opcion) {
			case 1:
				System.out.println("🚗 Dar de alta coche");
				darDeAltaCoche();
				break;
			case 2:
				System.out.println("🗑️  Dar de baja coche por ID");
				darDeBajaCoche();
				break;
			case 3:
				System.out.println("✏️  Modificar coche por ID");
				modificarCochePorId();
				break;
			case 4:
				System.out.println("🔍 Buscar coche por ID");
				buscarCochePorId();
				break;
			case 5:
				System.out.println("🔍 Buscar coches por marca");
				buscarCochePorMarca();
				break;
			case 6:
				System.out.println("📋 Listar todos los coches");
				listarCoches();
				break;
			case 0:
				System.out.println("❌ Saliendo de la aplicación...");
				break;
			default:
				System.out.println("⚠️  Opción no válida. Por favor, intente nuevamente.");
			}

			System.out.println();

		} while (opcion != 0);

		System.out.println("Gracias por usar el sistema de gestión de coches. ¡Hasta pronto!");
	}

	private static void listarCoches() {
		
		
	}

	private static void buscarCochePorMarca() {
		
		
	}

	private static void buscarCochePorId() {
		
		
	}

	private static void modificarCochePorId() {
		
		
	}

	private static void darDeBajaCoche() {
		
		
	}

	private static void darDeAltaCoche() {
		System.out.println("📌 Has elegido insertar un coche en la base de datos.\n");

		System.out.print("🔹 Introduce el ID del coche: ");
		int id = sc.nextInt();
		sc.nextLine(); 
		System.out.print("🔹 Introduce la marca del coche: ");
		String marca = sc.nextLine();
		System.out.print("🔹 Introduce el modelo del coche: ");
		String modelo = sc.nextLine();
		System.out.print("🔹 Introduce el tipo de motor del coche: ");
		String motor = sc.nextLine();
		System.out.print("🔹 Introduce el número de kilómetros que tiene el coche: ");
		double km = sc.nextDouble();
		System.out.println("\n✅ Coche insertado con éxito.\n");
		Coche coche = new Coche(id, marca, modelo, motor, km);
		
		try {
			gestor.guardarCoche(coche);
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
