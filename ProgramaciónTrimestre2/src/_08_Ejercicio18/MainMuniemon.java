package _08_Ejercicio18;
import java.util.ArrayList;
import java.util.Scanner;
public class MainMuniemon {
	
	public static void main(String[] args) {
		ArrayList<Muniemon>listaMuniemones = new ArrayList<Muniemon>();	
		Scanner sc = new Scanner(System.in);
		menuJuego(sc, listaMuniemones);
		
		

	}
	public static void menuJuego(Scanner sc, ArrayList<Muniemon>listaMuniemons) {
		int opcion = 0;
		Combate c = new Combate(null, null);
		do {
		System.out.println("--------------------------------------------------");
		System.out.println("---BIENVENIDO A MUNIEMON---");
		System.out.println("|--Aqui tienes el menú de opciones--|");
		System.out.println("|Pulsa 1 para dar de alta a un Muniemon|");
		System.out.println("|Pulsa 2 Para mostrar los Munioemones creados|");
		System.out.println("|Pulsa 3 para iniciar el combate entre muniones|");
		System.out.println("|Pulsa 4 salir del programa|");
		System.out.println("----------MUNIEMON HAZTE CON ALGUNO--------------");
		System.out.println("Selecciona una opción");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			if(listaMuniemons.size()!=2) {
				System.out.println("Has elegido crear tu  Muñoncito");
				System.out.println("Que te va a ayudar en tu aventura de Muñón");
				crearMuniemon(sc,listaMuniemons);	
			}else {
				System.out.println("Ya no puedes pasar");
			}
			
			break;
			
		case 2:
			System.out.println("Has elegido motrar todos los muniones creados");
			System.out.println("----------------");
			mostrarMuniones(listaMuniemons);
			break;
			
		case 3:
			System.out.println("========Empieza el combate========");
			c.setM1(listaMuniemons.get(0));
			c.setM2(listaMuniemons.get(1));
			c.empezarCombate();
			System.out.println("================");
			break;
		case 4:
			System.out.println("Hasta luego entrenador Muñón");
			break;

		default:
			System.err.println("Te has equivocado como buen Muñon");
		}
		}
		while(opcion !=4);
	}
	// Lo que podemos hacer es devolver el uñon creado y lo añadimos arriba
	// el muñon creado a la lista
	public static void crearMuniemon(Scanner sc,ArrayList<Muniemon>listaMuniemons ) {
		Muniemon m = new Muniemon();
		System.out.println("Elige el nombre de tu Muñoncito");
		sc.nextLine();
		m.setNombre(sc.nextLine());
		
		System.out.println("Elige la vida de tu Muñón");
		m.setVida(sc.nextDouble());
		
		System.out.println("Elige el ataque de tu Muñón");
		m.setAtaque(sc.nextDouble());
		
		System.out.println("Elige la defensa de tu Muñón");
		m.setDefensa(sc.nextDouble());
		
		System.out.println("Elige la velocidad de tu Muñón");
		m.setVelocidad(sc.nextInt());
		
		System.out.println("Estos son los tipos disponibles de tu Muñón");
		int i =0;
		for(TipoMuniemon tm : TipoMuniemon.values() ) {
			System.out.println("[" + i +"]" + tm);
			i++;
		}
		System.out.println("Elige una opción");
		int opcion = sc.nextInt();
		m.setTipoMuneimon(TipoMuniemon.values()[opcion]);
		
		listaMuniemons.add(m);
		
	}
	public static void mostrarMuniones(ArrayList<Muniemon>listaMuniemons) {
		for(Muniemon m : listaMuniemons) {
			System.out.println(m);
		}
	}
	
	
	

}
