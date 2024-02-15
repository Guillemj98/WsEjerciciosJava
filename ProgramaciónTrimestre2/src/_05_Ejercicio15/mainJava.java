package _05_Ejercicio15;

import java.util.Scanner;

public class mainJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empresa[] arrayEmpresas = new Empresa[2];
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();

		arrayEmpresas[0] = e1;
		arrayEmpresas[1] = e2;

		Trabajador[] arrayTrabajadores = new Trabajador[3];
		Trabajador t1 = new Trabajador();
		Trabajador t2 = new Trabajador();
		Trabajador t3 = new Trabajador();
		
		e1.listaTrabajadores = arrayTrabajadores;

		e1.listaTrabajadores[0] = t1;
		e1.listaTrabajadores[1] = t2;
		e1.listaTrabajadores[2] = t3;
		
		Trabajador[] arrayTrabajadores2 = new Trabajador[3];
		
		e2.listaTrabajadores = arrayTrabajadores2;

		e2.listaTrabajadores[0] = t3;
		e2.listaTrabajadores[1] = t1;
		e2.listaTrabajadores[2] = t2;
		

		for (Empresa e : arrayEmpresas) {
			pedirDatos(e, sc);
		}
		for (Trabajador t : arrayTrabajadores) {
			pedirDatosTrabajadores(t, sc);
		}
		for(int i =0; i<arrayEmpresas.length;i++) {
			System.out.println(arrayEmpresas[i].toString());
			arrayEmpresas[i].mostrarDatosTrabajadores();
			for(int j =0; j<arrayEmpresas[i].listaTrabajadores.length;j++) {
				System.out.println(arrayEmpresas[i].listaTrabajadores[j].esValidoDni());
				System.out.println(arrayEmpresas[i].listaTrabajadores[j].ganaMasDinero(t2));
				System.out.println(arrayEmpresas[i].listaTrabajadores[j].esIgual(t2));
				
				
			}
			System.out.println(arrayEmpresas[i].existeElTrabajador("53953294D"));
			System.out.println(arrayEmpresas[i].cuantosTrabajadoresHay());
			System.out.println(arrayEmpresas[i].cuantoSeGastaLaEmpresa());
			System.out.println(arrayEmpresas[i].cuantosTrabajadoresGanasMas3000());
			System.out.println(arrayEmpresas[i].cuantosTrabajadoresGanasMenosSmi());
			System.out.println(arrayEmpresas[i].cuantosTrabajadoresGanasMas(1000));
			System.out.println(arrayEmpresas[i].cuantosTrabajadoresDniValido());
			System.out.println(arrayEmpresas[i].esIgual(e2));
		}
		for(int i =0; i<arrayTrabajadores.length;i++) {
			System.out.println(arrayTrabajadores[i].esValidoDni());
			System.out.println(arrayTrabajadores[i].ganaMasDinero(t2));
			System.out.println(arrayTrabajadores[i].esIgual(t2));
			
			
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
