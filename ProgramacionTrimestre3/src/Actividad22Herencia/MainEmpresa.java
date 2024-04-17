package Actividad22Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpresa {
	public static Scanner sc ;
	public static void main(String[] args) {
			menuCompleto();
	}
	public static void menu() {
		System.out.println("<--Elige una de las opciones-->");
		System.out.println("Pulsa 1:--Dar de alta a un empleado--");
		System.out.println("Pulsa 2:--Mostrar empleados de la empresa--");
		System.out.println("Pulsa 3:--Calcular el salario de los trabajadores--");
		System.out.println("Pulsa 4:--Calcular costes de la empresa--");
		System.out.println("Pulsa 5:--Salir del programa--");
	}
	public static void menuCompleto() {
		sc = new Scanner(System.in);
		int opcion = 0;
		ArrayList<Empleado> listaGeneral = new ArrayList<Empleado>();
		do {
		menu();
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			int opcion2 =0;
			do {
				menuCrearEmpleado();
				opcion2 = sc.nextInt();
				switch (opcion2) {
				case 1:
					listaGeneral.add(crearProgramador());
					break;
				case 2:
					listaGeneral.add(crearJefeProyecto());
					break;
				case 3:
					listaGeneral.add(crearDirector(listaGeneral));
					break;
				case 4:
					System.out.println("Salir el programa");

				default:
					System.out.println("Opcion incorrecta");
					break;
				}
				}while(opcion2 !=4);
			break;
		case 2:
			System.out.println("Aqui estan todos tus empleados");
			for(Empleado e : listaGeneral) {
				System.out.println(e);
			}
			break;
		case 3:
			System.out.println("Aqui estan todos los empleados");
			int contador =0;
			do {
			for(Empleado e : listaGeneral) {
				System.out.println("[" + contador++ + "] " + e);
			}
			System.out.println("Introduce 0 para salir");		
			opcion = sc.nextInt();
			if(opcion !=-1) {
				System.out.println(listaGeneral.get(opcion).calcularSalario()); 
			}
			
			}while(opcion !=-1);		
			break;
		case 4:
			mostraGastoEmpresa(listaGeneral);	
			break;
		case 5: 
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		}while(opcion !=5);
	}
	public static void mostraGastoEmpresa(ArrayList<Empleado> listaGeneral) {
		double dineroTotal =0;
		for (Empleado e : listaGeneral) {
			System.out.println(e.calcularSalario());
			dineroTotal+=e.calcularSalario();
		}
		System.out.println("El gasto total de la empresa es: " + dineroTotal);
		
	}
	public static void menuCrearEmpleado() {
		System.out.println("Que tipo de trabajador quieres crear");
		System.out.println("Elige 1 para crear un PROGRAMADOR");
		System.out.println("Elige 2 para crear un JEFE DE PROYECTO");
		System.out.println("Elige 3 para crear un DIRECTOR");
		System.out.println("Elige 4 para SALIR");
	}
	public static Programador crearProgramador() {
		sc = new Scanner(System.in);
		Programador programador = new Programador();
		
		System.out.println("Elige el DNI del empleado");
		programador.setDNI(sc.nextLine());
		System.out.println("Pon el nombre del empleado");
		programador.setNombre(sc.nextLine());
		System.out.println("Pon lo que va a cobrar el empleado");
		programador.setSueldoBase(sc.nextDouble());
		return programador;
		
			
	}
	public static JefeProyecto crearJefeProyecto() {
		sc = new Scanner(System.in);
		JefeProyecto jf = new JefeProyecto();
		
		System.out.println("Elige el DNI del empleado");
		jf.setDNI(sc.nextLine());
		System.out.println("Pon el nombre del empleado");
		jf.setNombre(sc.nextLine());
		System.out.println("Pon lo que va a cobrar el empleado");
		jf.setSueldoBase(sc.nextDouble());
		System.out.println("Introduce la prima del jefe de proyecto");
		jf.setIncentivos(sc.nextDouble()); 	
		return jf;
		
	}
	public static Director crearDirector(ArrayList<Empleado> listaGeneral) {
		sc = new Scanner(System.in);
		Director dc = new Director();
		
		System.out.println("Elige el DNI del empleado");
		dc.setDNI(sc.nextLine());
		System.out.println("Pon el nombre del empleado");
		dc.setNombre(sc.nextLine());
		System.out.println("Pon lo que va a cobrar el empleado");
		dc.setSueldoBase(sc.nextDouble());
		ArrayList<Empleado>listaEmpleadosDirector = new ArrayList<Empleado>();
		dc.setListaEmpleados(listaEmpleadosDirector);
		int opcion =0;
		do {
		System.out.println("Elige tus empleados");		
		int contador =0;	
		for(Empleado e : listaGeneral) {
			System.out.println("[" + contador++ + "] " + e);
		}
		System.out.println("Introduce -1 para salir");		
		opcion = sc.nextInt();
		if(opcion != -1) {
			dc.getListaEmpleados().add(listaGeneral.get(opcion));
		}
		
		}while(opcion !=-1);	
		return dc;
		
	}
	
}
