package modelo.interfaz;

import java.util.List;
import java.util.Scanner;

import modelo.entidad.Coche;
import modelo.entidad.Pasajero;
import modelo.entidad.TipoMotor;
import modelo.negocio.GestorCoche;
import modelo.negocio.GestorPasajero;

public class Inrterfaz {
	public static Inrterfaz instance;
	private Scanner scInt;
	private Scanner scStr;
	private GestorCoche carService;
	private GestorPasajero passengerService;

	private Inrterfaz() {
		scInt = new Scanner(System.in);
		scStr = new Scanner(System.in);
		carService = GestorCoche.getInstance();
		passengerService = GestorPasajero.getInstance();
	}

	public static Inrterfaz getInstance() {
		if(instance == null) {
			instance =  new Inrterfaz();
		}
		return instance;
	}

	public void runApp() {
		
		// Toda esta interfaz esta hecho por Dani Costas
		
		printSlowly("CARGANDO", 5);
		print3Points(5, 5);
		
		System.out.println("\n================================");
		System.out.println("|                              |");
		System.out.println("|       🌟 MENÚ PRINCIPAL 🌟     |");
		System.out.println("|                              |");
		System.out.println("================================");

		printMainMenu();
		int opcion = validarOpcion(0, 7);



		while (opcion != 0) {

			switch (opcion) {
			case 1:
				altaCoche();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 2:
				bajaCochePorId();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 3:
				modificarCochePorID();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 4:
				buscarCochePorId();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 5:
				buscarCochePorMarca();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 6:
				listarTodosLosCoches();
				printMainMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 7:
				gestionPasajeros();
				return;
			default:
				break;
			}

		}

		System.out.println("\n===============================");
		System.out.println("       ✨ FIN DEL PROGRAMA ✨    ");
		System.out.println("=================================");

	}
	
	private void gestionPasajeros() {
		
		System.out.println("\n==================================");
		System.out.println("      🚀 MENÚ DE PASAJEROS 🚀       ");
		System.out.println("====================================");
		
		printPassengersMenu();
		int opcion = validarOpcion(0, 7);

		while (opcion != 0) {

			switch (opcion) {
			case 1:
				createPassenger();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 2:
				deletePassengerById();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 3:
				getPassengerById();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 4:
				listAllPassengers();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 5:
				addPassengerToCar1();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 6:
				deletePassengerFromCar();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			case 7:
				listPassengersFromCar1();
				printPassengersMenu();
				opcion = validarOpcion(0, 7);
				break;
			} // end switch-case;
		} // end while();
		runApp();
	}
	private Coche listPassengersFromCar1() {

		askUserIfShowCars();

		System.out.println();
		printSlowly("Elige el ID del coche del que quieres listar sus pasajeros: ", 5);
		int option = scInt.nextInt();
		
		Coche car = carService.selectById(option);
		List<Pasajero> passengerList = passengerService.listaPasajerosDelCoche(option);

		printlnSlowly("=============================================", 5);
		printlnSlowly("Lista de pasajeros del coche: ",5);
		printlnSlowly("     🚗 " + car.getMarca() + " " + car.getModelo() + " (ID: " + car.getId() + ") 🚗", 5);
		printlnSlowly("=============================================",5);

		for (Pasajero p : passengerList) {
			printlnSlowly(p.toString(), 5);
		}

		return car; 

	}


	private void deletePassengerFromCar() {
		Coche car = listPassengersFromCar1();
		System.out.println();

		int option;
		do {
			printSlowly("==============================================", 5);
			printSlowly("🔍 Selecciona el ID del pasajero que quieres sacar del coche: ", 5);
			printSlowly("==============================================", 5);
			int passengerIDSelected = scInt.nextInt();
			Pasajero passenger = passengerService.getPasajeroById(passengerIDSelected);
			printSlowly("==============================================", 5);
			printSlowly("✨ Has seleccionado al pasajero: " + passenger.getNombre() + " (ID: " + passenger.getId() + ") ✨", 5);
			printSlowly("==============================================", 5);

			printlnSlowly("¿Estás seguro de querer eliminarlo? 🤔", 5);

			printSlowly("🔴 Pulsa 1 para eliminarlo o 🔄 Pulsa 0 para elegir otra opción: ", 5);
			option = scInt.nextInt();
			Integer result = null;

			if (option == 1) {
				result = passengerService.borrarPasajeroCoche(passengerIDSelected);
				if (result == 0) {
					printlnSlowly("==============================================", 5);
					printlnSlowly("🎉 Pasajero " + passenger.getNombre() + " (ID: " + passenger.getId() + ") ha sido eliminado del coche: ", 5);
					printlnSlowly("     🚗 " + car.getMarca() + " " + car.getModelo() + " (ID: " + car.getId() + ") 🚗", 5);
					printlnSlowly("==============================================", 5);
				} else if (result == null) {
					printlnSlowly("==============================================", 5);
					printlnSlowly("⚠️ Ha ocurrido un error inesperado ⚠️", 5);
					printlnSlowly("  Por favor, vuelva a intentarlo más tarde.", 5);
					printlnSlowly("==============================================", 5);
				}
			}
		} while (option != 1);

	}

	private void addPassengerToCar1() {
		askUserIfShowPassengers();
		askUserIfShowCars();
		Pasajero passenger = null;
		Coche car = null;
		int option;
		Integer result = null;

		do {
			printSlowly("==============================================", 5);
			printSlowly("🔍 Selecciona el ID del pasajero que quieres sacar del coche: ", 5);
			printSlowly("==============================================", 5);
			int carIDSelected = scInt.nextInt();
			car = carService.selectById(carIDSelected);
			printSlowly("==============================================================", 5);
			printSlowly("🚗 Seleccione el ID del pasajero a añadir al coche: ", 5);
			printSlowly("     " + car.getMarca() + " " + car.getModelo() + " (ID: " + car.getId() + ")", 5);
			printSlowly("==============================================================", 5);
			int passengerIDSelected = scInt.nextInt();
			passenger = passengerService.getPasajeroById(passengerIDSelected);
			printlnSlowly("Desea confirmar los cambios?", 5);
			printSlowly("Pulsa 1 para confirmar o 0 para volver atrás: ", 5);
			option = scInt.nextInt();

			if (option == 1) {
				result = passengerService.addPasajeroCoche(passengerIDSelected, carIDSelected);
				if (result == 0) {
					printlnSlowly("===========================================", 5);
					printlnSlowly("✅ Pasajero añadido correctamente ✅", 5);
					printlnSlowly("===========================================", 5);
				} else {
					printlnSlowly("==============================================", 5);
					printlnSlowly("⚠️ Ha ocurrido un error inesperado ⚠️", 5);
					printlnSlowly("    Por favor, inténtelo de nuevo más tarde.", 5);
					printlnSlowly("==============================================", 5);
				}
			}

		} while (option != 1);

		
	}

	
	private void listAllPassengers() {
		System.out.println("\n====================================");
		printlnSlowly("🌟 Listar todos los pasajeros 🌟", 5);
		System.out.println("====================================\n");

		List<Pasajero> passengerList = passengerService.selectAll();
		if (passengerList.size() == 0) {
			printlnSlowly("==============================================", 5);
			printlnSlowly("🚫 No hay ningún pasajero en la Base de Datos 🚫", 5);
			printlnSlowly("==============================================", 5);
		} else {
			printlnSlowly("==============================================", 5);
			printlnSlowly("⏳ Pulsa Enter para listar todos los pasajeros ⏳", 5);
			printlnSlowly("==============================================", 5);
			scStr.nextLine();
			System.out.println("");
			for (Pasajero p : passengerList) {
				printlnSlowly(p.toString(), 5);
			}
		}
		
		
	}

	private void getPassengerById() {
		
		printSlowly("==============================================", 5);
		printSlowly("🔍 Selecciona el ID del pasajero que quieres consultar: ", 5);
		printSlowly("==============================================", 5);
		int passengerIDSelected = scInt.nextInt();
		Pasajero passenger = passengerService.getPasajeroById(passengerIDSelected);
		if (passenger != null) {
			// TODO falta controlar el return de getPassengerById, porque null es si hay I/O
			// Exception, pero debería devolver 1 si no hay ningún pasajero con dicho ID
			printlnSlowly("Pasajero seleccionado: ", 5);
			printSlowly(passenger.toString(), 5);
		}

	}

	private void deletePassengerById() {
		askUserIfShowPassengers();
		int option;
		do {
			printSlowly("==============================================", 5);
			printSlowly("🔍 Selecciona el ID del pasajero que quieres borrar ", 5);
			printSlowly("==============================================", 5);
			int passengerIDSelected = scInt.nextInt();
			Pasajero passenger = passengerService.getPasajeroById(passengerIDSelected);
			if (passenger != null) {
				// TODO falta controlar el return de getPassengerById, porque null es si hay I/O
				// Exception, pero debería devolver 1 si no hay ningún pasajero con dicho ID
				printlnSlowly("Pasajero seleccionado: ", 5);
				printSlowly(passenger.toString(), 5);
			}

			printlnSlowly("===========================================", 5);
			printlnSlowly("❗ Estás seguro de querer eliminarlo? ❗", 5);
			printlnSlowly("===========================================", 5);

			printSlowly("🔴 Pulsa 1 para eliminarlo o 🔄 Pulsa 0 para elegir otra opción: ", 5);
			option = scInt.nextInt();
			Integer result = null;

			if (option == 1) {
				result = passengerService.borrarById(passengerIDSelected);
				if (result == 0) {
					printlnSlowly("==============================================", 5);
					printlnSlowly("✅ Pasajero " + passenger.getNombre() + " (ID: " + passenger.getId() + ") eliminado correctamente. ✅", 5);
					printlnSlowly("==============================================", 5);
				} else if (result == null) {
					printlnSlowly("==============================================", 5);
					printlnSlowly("⚠️ Ha ocurrido un error inesperado ⚠️", 5);
					printlnSlowly("    Vuelva a intentarlo más tarde. 🙇‍♂️", 5);
					printlnSlowly("==============================================", 5);

				}
			}
		} while (option != 1);

		
	}

	private void createPassenger() {
		Pasajero p = new Pasajero();
		int option;
		Integer result = null;

		do {
			printlnSlowly("==============================================", 5);
			printlnSlowly("📝 Cumplimenta los datos del pasajero a añadir: ", 5);
			printlnSlowly("==============================================", 5);

			printSlowly("- Nombre: ", 5);
			p.setNombre(scStr.nextLine());

			printSlowly("- Edad: ", 5);
			p.setEdad(scInt.nextInt());

			printSlowly("- Peso: ", 5);
			p.setPeso(scInt.nextDouble());

			printlnSlowly("==============================================", 5);
			printlnSlowly("💾 ¿Quieres guardar los datos? 💾", 5);
			printlnSlowly("==============================================", 5);

			printSlowly("🔒 Pulsa 1 para guardarlo o 🔄 Pulsa 0 para modificar los datos: ", 5);

			option = scInt.nextInt();
			if (option == 1) {
				result = passengerService.guardar(p);
				if (result == 1) {
					printlnSlowly("==============================================", 5);
					printlnSlowly("✅ Pasajero creado correctamente ✅", 5);
					printlnSlowly("==============================================", 5);

				} else {
					printlnSlowly("==============================================", 5);
					printlnSlowly("⚠️ Ha ocurrido un error inesperado ⚠️", 5);
					printlnSlowly("    Inténtelo de nuevo más tarde. 🙇‍♂️", 5);
					printlnSlowly("==============================================", 5);

				}
			}
		} while (option != 1);
		
	}
	private void askUserIfShowPassengers() {
		printlnSlowly("==============================================", 5);
		printlnSlowly("🔍 ¿Quieres mostrar todos los pasajeros primero? 🔍", 5);
		printlnSlowly("==============================================", 5);

		printlnSlowly("Pulsa 1 para mostrar los pasajeros o", 5);
		printlnSlowly("🔢 Pulsa 0 para introducir el ID del pasajero", 5);

		int option = scInt.nextInt();

		if (option == 1) {
			listAllPassengers();
		}
	}

	private void askUserIfShowCars() {
		printlnSlowly("==============================================", 5);
		printlnSlowly("🚗 ¿Quieres mostrar todos los coches primero? 🚗", 5);
		printlnSlowly("==============================================", 5);

		printlnSlowly("Pulsa 1 para mostrar los coches o", 5);
		printlnSlowly("🔢 Pulsa 0 para introducir el ID del coche", 5);

		int option = scInt.nextInt();

		if (option == 1) {
			listarTodosLosCoches();
		}
	}

	private void printMainMenu() {
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║              MENÚ DE OPCIONES                 ║");
		System.out.println("╠═══════════════════════════════════════════════╣");
		System.out.println("║ 0. ❌ Salir de la aplicación                  ║");
		System.out.println("║ 1. 🚗 Dar de alta coche                       ║");
		System.out.println("║ 2. 🗑️  Dar de baja coche por ID               ║");
		System.out.println("║ 3. ✏️  Modificar coche por ID                 ║");
		System.out.println("║ 4. 🔍 Buscar coche por ID                     ║");
		System.out.println("║ 5. 🔍 Buscar coches por marca                 ║");
		System.out.println("║ 6. 📋 Listar todos los coches                 ║");
		System.out.println("║ 7. 🚶 Gestión de Pasajeros                    ║");
		System.out.println("╚═══════════════════════════════════════════════╝");
		System.out.print("🔄 Seleccione una opción: ");

	}
	
	private void printPassengersMenu() {
		System.out.println("╔══════════════════════════════════════════════╗");
		System.out.println("║        MENÚ DE GESTIÓN DE PASAJEROS          ║");
		System.out.println("╠══════════════════════════════════════════════╣");
		System.out.println("║ 0️⃣ - Volver al menú principal                ║");
		System.out.println("║ 1️⃣ - Crear nuevo pasajero                    ║");
		System.out.println("║ 2️⃣ - Borrar pasajero por ID                  ║");
		System.out.println("║ 3️⃣ - Consultar pasajero por ID               ║");
		System.out.println("║ 4️⃣ - Listar todos los pasajeros              ║");
		System.out.println("║ 5️⃣ - Añadir pasajero a un coche              ║");
		System.out.println("║ 6️⃣ - Eliminar el pasajero de un coche        ║");
		System.out.println("║ 7️⃣ - Listar todos los pasajeros de un coche  ║");
		System.out.println("╚══════════════════════════════════════════════╝");
		System.out.print("🔑 Seleccione una opción: ");


	}

	private void listarTodosLosCoches() {
		System.out.println("\n==============================================");
		printlnSlowly("🚗 **Listar Todos los Coches** 🚗", 5);
		printlnSlowly("==============================================", 5);


		List<Coche> listaCoches = carService.selectAll();
		if (listaCoches.size() == 0) {
			printlnSlowly("==============================================", 5);
			printlnSlowly("🚫 No hay ningún coche en la Base de Datos 🚫", 5);
			printlnSlowly("==============================================", 5);

		} else {
			printlnSlowly("==============================================", 5);
			printlnSlowly("🔄 Pulsa Enter para listar todos los coches 🚗", 5);
			printlnSlowly("==============================================", 5);

			scStr.nextLine();
			System.out.println("");
			for (Coche coche : listaCoches) {
				System.out.println(coche);
			}
		}

	}

	private void buscarCochePorId() {
		System.out.println("\n===========================");
		printlnSlowly("    Buscar coche por ID    ", 5);
		System.out.println("===========================\n");

		System.out.println("Seleccione el ID a buscar: ");
		int id = validarIntNoVacio("ID");
		Coche c = carService.selectById(id);
		if (c == null) {
			System.out.println("No se ha encontrado ningún coche con el ID especificado.");
		} else {
			System.out.println("Coche seleccionado: ");
			System.out.println(c);
		}

	}

	private void buscarCochePorMarca() {
		System.out.println("\n===========================");
		printlnSlowly("   Buscar coche por marca  ", 5);
		System.out.println("===========================\n");

		printSlowly("Seleccione la marca a buscar: ", 25);
		String marca = validarStringNoVacio("Marca");
		List<Coche> listaCoches = carService.selectByMarca(marca);
		if (listaCoches.size() == 0) {
			printlnSlowly("No se ha encontrado ningún coche con la marca especificada.", 25);
		} else {
			printlnSlowly("Coches con la marca " + marca + ": ", 25);
			for (Coche coche : listaCoches) {
				System.out.println(coche);
			}
		}

	}

	private void modificarCochePorID() {
		System.out.println("\n===========================");
		printlnSlowly("   Modificar coche por ID  ", 5);
		System.out.println("===========================\n");

		printlnSlowly("Seleccione el ID a modificar: ", 25);
		int id = validarIntNoVacio("ID");
		Coche c = carService.selectById(id);

		if (c == null) {
			printlnSlowly("No se ha encontrado ningún coche con el ID especificado.", 25);
		} else {
			printlnSlowly("Coche seleccionado: ", 25);
			System.out.println(c.toString());
			printlnSlowly("¿Seguro que quieres modificarlo?", 25);
			printlnSlowly("\n1. Modificarlo", 10);
			printlnSlowly("2. No modificarlo\n", 10);
			printSlowly("- Seleccione una opción: ", 25);
			int opcion = validarOpcion(1, 2);
			if (opcion == 1) {

				c = pedirDatosCoche();
				c.setId(id);
				int resultado = carService.updateById(c);
				
				if (resultado == 1) {
					printlnSlowly("Coche con id " + id + " modificado correctamente.", 25);
				} else {
					printlnSlowly("Ha ocurrido un error. Inténtelo de nuevo más tarde.", 25);
				}
			}
		}

	}

	private void bajaCochePorId() {
		System.out.println("\n===========================");
		printlnSlowly("      Baja coche por ID    ", 5);
		System.out.println("===========================\n");

		printSlowly("Seleccione el ID a borrar: ", 25);
		int id = validarIntNoVacio("ID");
		Coche c = carService.selectById(id);

		if (c == null) {
			printSlowly("No se ha encontrado ningún coche con el ID especificado.", 25);
		} else {
			printlnSlowly("Coche seleccionado: ", 25);
			System.out.println(c.toString());
			printlnSlowly("¿Seguro que quieres eliminarlo?", 25);
			printlnSlowly("\n- 1. Eliminarlo", 10);
			printlnSlowly("- 2. No eliminarlo\n", 10);
			printSlowly("- Seleccione una opción: ", 25);
			int opcion = validarOpcion(1, 2);
			if (opcion == 1) {
				int resultado = carService.deleteById(id);
				if (resultado == 1) {
					printlnSlowly("Coche con ID " + id + " eliminado correctamente.", 25);
				} else {
					printlnSlowly("Ha ocurrido un error. Inténtelo de nuevo más tarde.", 25);
				}
			}
		}

	}

	private void altaCoche() {
		System.out.println("\n===========================");
		printlnSlowly("    Dar de alta un coche   ", 5);
		System.out.println("===========================\n");
		Coche c = pedirDatosCoche();
		Integer resultado = carService.insert(c);
		if (resultado == 1) {
			printlnSlowly("\nCoche insertado correctamente.", 25);
		} else {
			printlnSlowly("Ha ocurrido un error. Inténtelo de nuevo más tarde.", 25);
		}
	}


	private Coche pedirDatosCoche() {

		printSlowly("- Marca: ", 25);
		String marca = validarStringNoVacio("Marca");
		printSlowly("- Modelo: ", 25);
		String modelo = validarStringNoVacio("Modelo");
		printSlowly("- Kilómetros: ", 25);
		int kilometros = validarIntNoVacio("Kilometros");
		printSlowly("- Seleccione un motor: ", 25);
		TipoMotor motor = seleccionMotor();

		return new Coche(kilometros, marca, modelo, motor, kilometros, null);// Aqui tendra que ir la lista de pasajeros

	}

	private TipoMotor seleccionMotor() {
		printlnSlowly("\n\t1. Diésel", 25);
		printlnSlowly("\t2. Gasolina", 25);
		printlnSlowly("\t3. Eléctrico", 25);
		printlnSlowly("\t4. Híbrido", 25);
		printSlowly("- Opción: ", 25);
		int opcionMotor = scInt.nextInt();
		TipoMotor motor = null;

		switch (opcionMotor) {
		case 1:
			motor = TipoMotor.DIESEL;
			break;
		case 2:
			motor = TipoMotor.GASOLINA;
			break;
		case 3:
			motor = TipoMotor.ELECTRICO;
			break;
		case 4:
			motor = TipoMotor.HIBRIDO;
			break;
		
		}

		return motor;
	}

	private int validarIntNoVacio(String atributo) {
		int i = scInt.nextInt();

		while (i == 0) {
			printlnSlowly("Campo vacío no válido.", 25);
			printlnSlowly("- Introduce un valor para " + atributo, 25);
			i = scInt.nextInt();
		}
		return i;
	}

	private String validarStringNoVacio(String atributo) {

		String s = scStr.nextLine();

		while (s.isBlank()) {
			printlnSlowly("Campo vacío no válido.", 25);
			printlnSlowly("- Introduce un valor para " + atributo, 25);
			s = scStr.nextLine();
		}
		return s;
	}

	private int validarOpcion(int i, int j) {
		int opcion = scInt.nextInt();
		System.out.println("");
		while (opcion < i || opcion > j) {
			printlnSlowly("  [ERROR] Introduce una opción correcta", 25);
			System.out.println();
			printSlowly("- Introduce un número entre " + i + " y " + j + ": ", 25);
			opcion = scInt.nextInt();
		}
		return opcion;
	}
	
	public static void print3Points(int time, int time2) {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(time);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		try {
			Thread.sleep(time2);
			System.out.print(" ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void printSlowly(String s, int time) {
		for (int i = 0; i < s.length(); i++) {
			try {
				Thread.sleep(time);
				System.out.print(s.charAt(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void printlnSlowly(String s, int time) {
		for (int i = 0; i < s.length(); i++) {
			try {
				Thread.sleep(time);
				System.out.print(s.charAt(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
	}

}
