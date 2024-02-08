package _04_Ejercicio14;

import java.util.Scanner;

public class invocarEquipo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Equipo[] arrayEquipos = new Equipo[3];
		Equipo e1 = new Equipo("Madrid", new String[] { "ronaldo", "falcao", "messi" });
		Equipo e2 = new Equipo("Madrid", new String[] { "Ronaldo", "Messi", "Falcao" });
		Equipo e3 = new Equipo();

		arrayEquipos[0] = e1;
		arrayEquipos[1] = e2;
		arrayEquipos[2] = e3;
		for (Equipo e : arrayEquipos) {
			pedirDatos(e, sc);
		}
		for (int i = 0; i < arrayEquipos.length; i++) {
			System.out.println(arrayEquipos[i].toString());
			arrayEquipos[i].mostrarJugadores();
			System.out.println("introduce un jugador");
			String jugador = sc.nextLine();
			System.out.println(arrayEquipos[i].existeJugador(jugador));
			System.out.println(arrayEquipos[i].cuantosJugadoresHay());
			System.out.println(arrayEquipos[i].suficientesJugadores());
			System.out.println(arrayEquipos[i].laCadenaEsIgual(e3));
			System.out.println(arrayEquipos[i].sonIguales(e2));

		}

	}

	private static void pedirDatos(Equipo equipo, Scanner sc) {
		System.out.println("Introduce el nombre del Equipo");
		equipo.nombre = sc.nextLine();

		System.out.println("Introduce la cantidad de jugadores");
		int tamañoArray = sc.nextInt();
		String[] arrayJugadores = new String[tamañoArray];
		equipo.listaJugadores = arrayJugadores;
		for (int i = 0; i < equipo.listaJugadores.length; i++) {
			System.out.println("Introduce tu valoración " + (i + 1));
			String jugador = sc.nextLine();
			equipo.listaJugadores[i] = jugador;

		}
	}
}