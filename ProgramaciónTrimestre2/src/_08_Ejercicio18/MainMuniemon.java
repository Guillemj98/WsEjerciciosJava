package _08_Ejercicio18;
import java.util.Scanner;
public class MainMuniemon {
	public static void main(String[] args) {
		Muniemon m = new Muniemon();
		Scanner sc = new Scanner(System.in);
		menuJuego(sc,m);
		
		

	}
	public static void menuJuego(Scanner sc, Muniemon m) {
		int opcion = 0;
		do {
		System.out.println("--------------------------------------------------");
		System.out.println("--BIENVENIDO A MUNIEMON---");
		System.out.println("A CONTINUACION TE MOSTRARE UN MENÚ DE OPCIONES");
		System.out.println("Pulsa 1 Para dar de alta a un Muniemon");
		System.out.println("Pulsa 2 Para mostrar las caracteristicas de tu Muniemon");
		System.out.println("Pulsa 3 para salir del programa");
		System.out.println("----------MUNIEMON HAZTE CON ALGUNO--------------");
		System.out.println("Selecciona una opción");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Has elegido crear tu Muñoncito");
			System.out.println("Que te va a ayudar en tu aventura de Muñon");
			crearMuniemon(sc, m);
			
			break;
		case 2:
			System.out.println(m.toString());
			
			break;
		case 3:
			System.out.println("Hasta luego entrenador MUÑON");
			break;
		default:
			System.err.println("Te has equivocado como buen Muñon");
		}
		}
		while(opcion !=3);
	}
	public static void crearMuniemon(Scanner sc, Muniemon m) {
		System.out.println("Elige el nombre de tu Muñoncito");
		sc.nextLine();
		m.setNombre(sc.nextLine());
		
		System.out.println("Elige la vida de tu Muñon");
		m.setVida(sc.nextInt());
		
		System.out.println("Elige el ataque de tu Muñon");
		m.setAtaque(sc.nextInt());
		
		System.out.println("Elige la defensa de tu Muñon");
		m.setDefensa(sc.nextInt());
		
		System.out.println("Estos son los tipos disponibles de tu Muñon");
		int i =0;
		for(TipoMuniemon tm : TipoMuniemon.values() ) {
			System.out.println("[" + i +"]" + tm);
			i++;
		}
		System.out.println("Elige una opcion");
		int opcion = sc.nextInt();
		m.setTipoMuneimon(TipoMuniemon.values()[opcion]);
		
		
	}
	

}
