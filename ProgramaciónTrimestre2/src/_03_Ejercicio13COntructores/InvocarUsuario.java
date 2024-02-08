package _03_Ejercicio13COntructores;

import java.util.Scanner;

public class InvocarUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario[]arrayUsuarios = new Usuario[3];
	
	
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario(0, null, null);
		Usuario u3 = new Usuario(0, null, null);
		
		
		arrayUsuarios[0]= u1;
		arrayUsuarios[1]= u2;
		arrayUsuarios[2]= u3;
		
		// Aqui usamos un for each para pedir datos al usuario
		// sin tener que repetir el codigo constantemente.
		for(Usuario u : arrayUsuarios) {
			pedirDatos(u,sc);
		}
		
	
		
		
		for(int i =0;i< arrayUsuarios.length;i++) {
			System.out.println(arrayUsuarios[i].toString());
			System.out.println(arrayUsuarios[i].devolverMedia());
			arrayUsuarios[i].mostrarValoraciones();
			
			System.out.println("introduce un numero");
			int numero = sc.nextInt();
			System.out.println(arrayUsuarios[i].cuantasValoracionesSonSuperiores(numero));
			System.out.println(arrayUsuarios[i].esMayorQueLaMedia(numero));
			
			
		}
		
		}

	private static void pedirDatos(Usuario usuario, Scanner sc) {
		
		System.out.println("Introduce el id del usuario");
		usuario.id= sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Introduce el nombre");
		usuario.nombre= sc.nextLine();
		
		System.out.println("Introduce la cantidad de valoraciones");
		int tamañoArray = sc.nextInt();
		int [] arrayValoraciones = new int [tamañoArray];
		usuario.arrayPuntuaciones = arrayValoraciones;
		
		for(int i =0; i<usuario.arrayPuntuaciones.length;i++) {
			System.out.println("Introduce tu valoración " + (i+1));
			int valoracion = sc.nextInt();
			if(valoracion >10 || valoracion <0) {
				System.out.println("Esta mal");
				i--;
			}else {
			usuario.arrayPuntuaciones[i]= valoracion;
			}
		}
		
		
		
	}
	

}
