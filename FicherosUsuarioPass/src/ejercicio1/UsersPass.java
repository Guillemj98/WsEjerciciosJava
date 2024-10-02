package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsersPass {
	public static final String NOMBRE_FICHERO = "UsuarioPass.txt";	
	static Scanner sc ;

	public static void main(String[] args) {
		agregarUsuario();
		String respuesta = null;
		
		while(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Quieres agregar un nuevo usuario? si o no?");
			respuesta = sc.nextLine();
			if(respuesta.equalsIgnoreCase("si")) {
				agregarUsuario();
			}else {
				System.out.println("Saliendo del programa");
			}
			
			
		}
	}
	public static void agregarUsuario() {
		sc = new Scanner(System.in);
		System.out.println("Pon un nombre de usuario");
		String nombre = sc.nextLine();
		System.out.println("Pon la contraseña del usuario");
		String contrasenia = sc.nextLine();
		try(FileWriter fw = new FileWriter(NOMBRE_FICHERO,true);
				BufferedWriter pw = new BufferedWriter(fw);){
			pw.write(nombre + "/" + contrasenia);
			pw.flush();
			System.out.println("Usuario creado con exito");
					
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fichero Creado");

		
	}

}
