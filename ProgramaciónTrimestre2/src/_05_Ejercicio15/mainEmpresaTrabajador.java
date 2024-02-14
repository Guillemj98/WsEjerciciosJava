package _05_Ejercicio15;

import java.util.Scanner;

public class mainEmpresaTrabajador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empresa[]arrayEmpresas = new Empresa[2];
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		
		arrayEmpresas[0]= e1;
		arrayEmpresas[1]= e2;
		
		Trabajador[] arrayTrabajadores = new Trabajador[2];
		Trabajador t1 = new Trabajador();
		Trabajador t2 = new Trabajador();
		
		arrayTrabajadores[0]= t1;
		arrayTrabajadores[1]= t2;
		
		for(Empresa e: arrayEmpresas) {
			pedirDatos(e,sc);
		}
		for(Trabajador t: arrayTrabajadores) {
			pedirDatosTrabajadores(t, sc);
		}

	}

	public static void pedirDatos(Empresa empresa, Scanner sc) {
		System.out.println("Introduce el nombre de la empresa");
		empresa.nombre = sc.nextLine();
		System.out.println("Introduce el NIF de la empresa");
		empresa.nif= sc.nextLine();
		
		
		
	}
	public static void pedirDatosTrabajadores(Trabajador trabajador, Scanner sc) {
		System.out.println("Introduce el nombre de los trabajadores");
		trabajador.nombre = sc.nextLine();
		System.out.println("Introduce el el DNI");
		trabajador.dni = sc.nextLine();
		System.out.println("Introduce el salario");
		trabajador.salario = sc.nextDouble();
	}

}
