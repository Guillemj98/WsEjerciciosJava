package _06_Ejercicio16_2;

import java.util.ArrayList;
import java.util.Scanner;

public class invocarEquipo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList <Equipo> arrayEquipos = new ArrayList<Equipo>();
		Equipo e1 = new Equipo("Madrid", new ArrayList <String> ());
		Equipo e2 = new Equipo("Madrid", new ArrayList <String> ());
		Equipo e3 = new Equipo();

		arrayEquipos.add(e1);
		arrayEquipos.add(e2);
		arrayEquipos.add(e3);
		for (Equipo e : arrayEquipos) {
			pedirDatos(e, sc);
		}
		for (int i = 0; i < arrayEquipos.size(); i++) {
			System.out.println(arrayEquipos.get(i).toString());
			arrayEquipos.get(i).mostrarJugadores();
			System.out.println("introduce un jugador");
			String jugador = sc.nextLine();
			System.out.println(arrayEquipos.get(i).existeJugador(jugador));
			System.out.println(arrayEquipos.get(i).cuantosJugadoresHay());
			System.out.println(arrayEquipos.get(i).suficientesJugadores());
			System.out.println(arrayEquipos.get(i).laCadenaEsIgual(e3));
			System.out.println(arrayEquipos.get(i).sonIguales(e2));

		}

	}

	private static void pedirDatos(Equipo equipo, Scanner sc) {
		System.out.println("Introduce el nombre del Equipo");
		equipo.nombre = sc.nextLine();
		System.out.println("Introduce la cantidad de jugadores");
		int tamanio = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < tamanio; i++) {
			System.out.println("Introduce tu jugador " + (i + 1));
			String jugador = sc.nextLine();
			equipo.listaJugadores.add(jugador);

		}
	}
}