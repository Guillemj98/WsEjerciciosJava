package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsersPass {
	public static final String NOMBRE_FICHERO = "usuarios.dat";	
	static Scanner sc ;
	static HashMap<String, String>listaUserPass= new HashMap<String, String>();

	public static void main(String[] args) {
		
		String user = null;
		String password = null;
		
		sc = new Scanner(System.in);
		
		
		menuPrimero();
		
		String opcion = sc.nextLine();
		
		switch (opcion) {
		case "1": {
			System.out.println("Introduzca un nombre de usuario");
			user = sc.nextLine().trim();
			System.out.println("Introduzca una password");
			password = sc.nextLine().trim();
	        
			
			if(listaUserPass.containsKey(user)) {
				String pass = listaUserPass.get(user);
				if(pass.equals(password)) {
					menuLogin();
				}else {
					System.out.println("Esta mal");
				}
			}else {
				System.out.println("Esta mal x2");
			}
			
			break;
		}
		case "2":{
			System.out.println("Introduzca un nombre de usuario");
			user = sc.nextLine().trim();
			System.out.println("Introduzca una password");
			password = sc.nextLine().trim();
			agregarUsuario(user, password);
			
			break;
		}
		default:
			System.out.println("Opcion incorrecta");
		}
					
}
	
	public static void agregarUsuario(String user, String password) {
		sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter(NOMBRE_FICHERO,true);
				BufferedWriter pw = new BufferedWriter(fw);){
			pw.write(user + "/" + password);
			pw.newLine();
			
			
			listaUserPass.put(user, password);
			
			pw.flush();
			System.out.println("Usuario creado con exito");
					
		}catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	
	public static void menuLogin() {
		System.out.println("Bienvenido al Login");
		System.out.println("---------------------");
		System.out.println("Pulsa 1 para crear un nuevo usuario");
		System.out.println("Pulsa 2 para salir del programa");
	}
	
	
	public static void menuPrimero() {
		System.out.println("Pulsa 1- Iniciar sesion");
		System.out.println(" Pulsa 2- Crear usuario");
	}

}
