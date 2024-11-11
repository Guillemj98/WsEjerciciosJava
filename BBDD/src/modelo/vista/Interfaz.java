package modelo.vista;

import java.util.Scanner;

import entidad.Coche;
import modelo.negocio.Gestor;

public class Interfaz {
	static Scanner sc = null;
	/*
	 * Usando el modelo de las 3 capas.
	 * La capa Dao lo que hace es Conectarte con la base de datos 
	 * mediante Connection conn = DriverManager.getConnection(url,user,pass)
	 * y guarda los coches en la base de datos.
	 * 
	 * La capa gestora se encarga de las las excepciones, es decir,
	 * que la marca el nombre... no puedan ser nulas o estar vacias,
	 * aparte de tener un metodo que se llame guardar coche, en el
	 * que invocamos el metodo de insertar coche de la clase Dao.
	 * 
	 * Y por ultimo la interfaz que pide los datos al usuario.
	 */
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
	    System.out.println("=====================================");
        System.out.println("    Creación de Base de Datos de Coches");
        System.out.println("=====================================\n");

        boolean continuar = true;
        while(continuar) {
        	continuar = menu();
        }
		System.out.println("Aplicacion finalizada ");
 
		
	}

	private static  boolean menu() {
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
	        // Aqui usando el contructor pasamos los datos que nos ha dado el usuario
	        // al coche y lo establecemos
	        Coche coche = new Coche(id, marca, modelo, tipoModelo, kilometros);
	        try {
	        	// El gestor esta hecho singletone para no usar ningun NEW
	        	// por lo tanto hay que invocar el metodo getInstance para
	        	// poder usar los metodos de la clase
	        	Gestor gestor = Gestor.getInstance();
	        	gestor.guardarCoche(coche);
	        	System.out.println("Coche guardado");
	        	
	        	
	        }catch (Exception e) {
				
			}
	        // A ver cojo el continuar este para cortar el flujo o no 
	        // del while a tenerlo separado, es decir, esta fuera de este 
	        // metodo lo pongo como estatico la variable para que se 
	        // pueda usarse en toda la aplicacion
	        System.out.println("Desear guardar otro coche? (S/N)");
	        String respuesta = sc.nextLine();
	        return respuesta.equalsIgnoreCase("S");
	           
	}

}
