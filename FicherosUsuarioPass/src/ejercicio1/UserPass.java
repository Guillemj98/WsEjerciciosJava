package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserPass {
	public static final String NOMBRE_FICHERO = "usuarios.dat";	
	static Scanner sc  = new Scanner(System.in);
	static HashMap<String, String>listaUserPass= new HashMap<String, String>();

	public static void main(String[] args) {
		cargarUsuariosDesdeArchivo();
	    if (controlAcceso()) { 
            mostrarMenu(); 
        } else {
            System.out.println("Acceso denegado. Programa terminado.");
        }
    }
		
	public static boolean controlAcceso() {
		int intentos = 3;
		while(intentos >0) {
			System.out.println("Introduce el nombre del usuario");
			String user = sc.nextLine();
			System.out.println("Introduce las password");
			String passWord = sc.nextLine();
			
			if(listaUserPass.containsKey(user)&& listaUserPass.containsValue(passWord)) {
				System.out.println("Bienvenido, " + user + "!");
				return true;
			}else {
				intentos --;
				System.out.println("Usuario o contraseña incorrecto MUÑÓN");
			}
		}
		return false;
	}
	public static void cargarUsuariosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_FICHERO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("/");
                if (partes.length == 2) {
                    String usuario = partes[0];
                    String password = partes[1];
                    listaUserPass.put(usuario, password); // Añadir el usuario y la contraseña al HashMap
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios.");
        }
    }
	public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar usuario al registro.");
            System.out.println("2. Fin del programa.");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarUsuario(); 
                    break;
                case 2:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 2);
    }
	public static void agregarUsuario() {
        System.out.println("Introduce el nombre del nuevo usuario:");
        String nuevoUsuario = sc.nextLine();
        if (listaUserPass.containsKey(nuevoUsuario)) {
            System.out.println("El usuario ya existe.");
            return;
        }
        System.out.println("Introduce la contraseña del nuevo usuario:");
        String nuevaPassword = sc.nextLine();

        
        try (FileWriter fw = new FileWriter(NOMBRE_FICHERO, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nuevoUsuario + "/" + nuevaPassword);
            bw.newLine();
            listaUserPass.put(nuevoUsuario, nuevaPassword); 
            System.out.println("Usuario agregado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
	}
	
	
	

}
