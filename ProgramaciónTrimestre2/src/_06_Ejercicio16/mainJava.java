package _06_Ejercicio16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Empresa> arrayEmpresas = new ArrayList <Empresa>();
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();

		arrayEmpresas.add(e1);
		arrayEmpresas.add(e2);

		ArrayList<Trabajador> arrayTrabajadores = new ArrayList <Trabajador>();
		Trabajador t1 = new Trabajador();
		Trabajador t2 = new Trabajador();
		Trabajador t3 = new Trabajador();
		
		e1.listaTrabajadores = arrayTrabajadores;

		e1.listaTrabajadores.add(t1);
		e1.listaTrabajadores.add(t2);
		e1.listaTrabajadores.add(t3);
		
		ArrayList<Trabajador> arrayTrabajadores2 = new ArrayList <Trabajador>();
		
		e2.listaTrabajadores = arrayTrabajadores2;

		e2.listaTrabajadores.add(t1);
		e2.listaTrabajadores.add(t2);
		e2.listaTrabajadores.add(t3);
		

		for (Empresa e : arrayEmpresas) {
			pedirDatos(e, sc);
		}
		for (Trabajador t : arrayTrabajadores) {
			pedirDatosTrabajadores(t, sc);
		}
		for(int i =0; i<arrayEmpresas.size();i++) {
			System.out.println(arrayEmpresas.get(i).toString());
			arrayEmpresas.get(i).mostrarDatosTrabajadores();
			for(int j =0; j<arrayEmpresas.get(i).listaTrabajadores.size();j++) {
				System.out.println(arrayEmpresas.get(i).listaTrabajadores.get(j).esValidoDni());
				System.out.println(arrayEmpresas.get(i).listaTrabajadores.get(j).ganaMasDinero(t2));
				System.out.println(arrayEmpresas.get(i).listaTrabajadores.get(j).esIgual(t2));
				
				
			}
			System.out.println(arrayEmpresas.get(i).existeElTrabajador("53953294D"));
			System.out.println(arrayEmpresas.get(i).cuantosTrabajadoresHay());
			System.out.println(arrayEmpresas.get(i).cuantoSeGastaLaEmpresa());
			System.out.println(arrayEmpresas.get(i).cuantosTrabajadoresGanasMas3000());
			System.out.println(arrayEmpresas.get(i).cuantosTrabajadoresGanasMenosSmi());
			System.out.println(arrayEmpresas.get(i).cuantosTrabajadoresGanasMas(1000));
			System.out.println(arrayEmpresas.get(i).cuantosTrabajadoresDniValido());
			System.out.println(arrayEmpresas.get(i).esIgual(e2));
		}
		for(int i =0; i<arrayTrabajadores.size();i++) {
			System.out.println(arrayTrabajadores.get(i).esValidoDni());
			System.out.println(arrayTrabajadores.get(i).ganaMasDinero(t2));
			System.out.println(arrayTrabajadores.get(i).esIgual(t2));
			
			
		}

	}

	public static void pedirDatos(Empresa empresa, Scanner sc) {
		System.out.println("Introduce el nombre de la empresa");
		empresa.nombre = sc.nextLine();
		System.out.println("Introduce el NIF de la empresa");
		empresa.nif = sc.nextLine();

	}

	public static void pedirDatosTrabajadores(Trabajador trabajador, Scanner sc) {
		System.out.println("Introduce el nombre de los trabajadores");
		trabajador.nombre = sc.nextLine();
		System.out.println("Introduce el el DNI");
		trabajador.dni = sc.nextLine();
		System.out.println("Introduce el salario");
		trabajador.salario = sc.nextDouble();
		sc.nextLine();
	}

}
