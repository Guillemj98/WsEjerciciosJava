package Actividad25Interfaces;

// Hay problemas con los scanner pero lo demas esta bien y me da pereza arregrarlos
// Pero bueno la base esta bien se puede reducir mas las cosas y hacerlas con
// mas funciones.
import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpresa {
	public static Scanner sc ;
	public static ArrayList<Empleado>listaEmpleadosEmpresa;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
	    listaEmpleadosEmpresa = new ArrayList<>(); 
		MainEmpresa me = new MainEmpresa();
		me.menuCompleto();
		

	}
	public void menu() {
		System.out.println("<--Elige una de las opciones-->");
		System.out.println("Pulsa 1:--Dar de alta a un empleado--");
		System.out.println("Pulsa 2:--Mostrar empleados de la empresa--");
		System.out.println("Pulsa 3:--Calcular el salario de los trabajadores--");
		System.out.println("Pulsa 4:--Calcular costes de la empresa--");
		System.out.println("Pulsa 5:--Despedir trabajador--");
		System.out.println("Pulsa 0:--Salir del programa--");
	}
	public void menuCompleto() {
		sc = new Scanner(System.in);
		int opcion =0;
		String sOpcion ="";
		do {
			menu();
			sOpcion = sc.nextLine().trim();
			opcion = Integer.parseInt(sOpcion);
			switch (opcion) {
			case 1:
				darAltaEmpleado();
				break;
			case 2:
				mostrarListaEmpleados();
				break;
			case 3:
				mostrarSalarioEmpleado();
				break;
			case 4:
				mostrarGastosEmpresa();
				break;
			case 5:
				System.out.println("Despedir empleado jijijijij");
				menuDespedirEmpleado();
				break;
			case 0:
				System.out.println("ADIOS");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while(opcion!=0);
	}
	
	private void menuDespedirEmpleado() {
		System.out.println("A la p*** calle");
		System.out.println("Pulsa 1 --- Despido Procedente");
		System.out.println("Pulsa 2 --- Despido Improcedente");
		System.out.println("Elige que tipo de despido");
		
		int iOpcion = 0;
		String sOpcion ="";
		sOpcion = sc.nextLine().trim();
		
		iOpcion = Integer.parseInt(sOpcion);
		switch (iOpcion) {
		case 1:
			despidoProcedente() ;
			break;
		case 2:
			despidoImprocedente();
			break ;
		default:
			break;	
	}
	}
	private void despidoProcedente() {
		System.out.println("Despido procedente");
		int opcion1 = 0;
		String sOpcion1 = "";
		do {
			mostrarListaEmpleados();		
			System.out.println("Introduce -1 para salir");
			
			sOpcion1 = sc.nextLine().trim();
			
			opcion1 = Integer.parseInt(sOpcion1);
			if (opcion1 != -1) {
				System.out.println(listaEmpleadosEmpresa.get(opcion1).calcularDespidoProcedente());
			}
		} while (opcion1 != -1);
	}

	private void despidoImprocedente() {
		System.out.println("Despido IMMPROCEDENTE");
		System.out.println("Cuantos años ha estado en la empresa");
		String sAniosEmpresa = sc.nextLine().trim();
		
		int iAniosEmpresa = Integer.parseInt(sAniosEmpresa);
		int opcion2 = 0;
		String sOpcion2 = "";
		do {
			mostrarListaEmpleados();
			System.out.println("Introduce -1 para salir");
			sOpcion2 = sc.nextLine().trim();
			
			opcion2 = Integer.parseInt(sOpcion2);
			if (opcion2 != -1) {
				System.out.println(listaEmpleadosEmpresa.get(opcion2).calcularDespidoImprocedente(iAniosEmpresa));
			}
		} while (opcion2 != -1);

	}
	private void mostrarGastosEmpresa() {
		double dineroTotal =0;
		for (Empleado e : listaEmpleadosEmpresa) {
			dineroTotal+= e.calcularSalario();
		}
		System.out.println("El gasto de la empresa es: " + dineroTotal);
		
	}
	private void mostrarSalarioEmpleado() {
		for(Empleado e : listaEmpleadosEmpresa) {
			System.out.println(e.getSalarioBase());
		}
		
		
	}
	private void darAltaEmpleado() {
		int opcion =0;
		String sOpcion ="";
		do {
			menuEmpleados();
			sOpcion = sc.nextLine().trim();
			
			try {
			opcion = Integer.parseInt(sOpcion);
			switch (opcion) {
			case 1:
				System.out.println("|----Programador----|");
				listaEmpleadosEmpresa.add(crearProgramador());			
				break;
			case 2:
				System.out.println("|----Jefe de proyecto----|");
				listaEmpleadosEmpresa.add(crearJefeProyecto()) ;
				break;
			case 3:
				System.out.println("|----Director----|");
				listaEmpleadosEmpresa.add(crearDirector());
				break;
			case 4:
				System.out.println("ADIOS");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			} catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor ingresa un número válido.");
			}
			
		}while(opcion !=4);	
	}
	private Director crearDirector() {
		Director d = new Director();
		System.out.println("Elige el DNI del director");
		d.setDNI(sc.nextLine());
		System.out.println("Elige el nombre del Director");
		d.setNombre(sc.nextLine());
		System.out.println("Pon lo que va a cobrar el Director");
		d.setSalarioBase(sc.nextDouble());
		ArrayList<Empleado>listaEmpleadosDirector = new ArrayList<>();
		d.setListaEmpleados(listaEmpleadosDirector);
		String sOpcion= null;
		int opcion =0;
		do {
			mostrarListaEmpleados();
			System.out.println("Introduce -1 para Salir");
			sOpcion = sc.nextLine();
			opcion = Integer.parseInt(sOpcion);
			if(opcion != -1) {
				d.getListaEmpleados().add(listaEmpleadosEmpresa.get(opcion));
			}
		}while(opcion != -1);
		
		return d;
		
	}
	private void mostrarListaEmpleados() {
		System.out.println("Aqui estan todos los empleados");
		int contador =0;
		for(Empleado e : listaEmpleadosEmpresa) {
			System.out.println("[" + contador++ +"]" + e);
		}
		
	}
	private JefeProyecto crearJefeProyecto() {
		JefeProyecto jf = new JefeProyecto();
		System.out.println("Elige el DNI del jefe de proyecto");
		jf.setDNI(sc.nextLine());
		System.out.println("Escoge un nombre ");
		jf.setNombre(sc.nextLine());
		System.out.println("Escoge lo que va a cobrar");
		jf.setSalarioBase(sc.nextDouble());
		System.out.println("Escribe la prima que gana ");
		jf.setIncentivos(sc.nextDouble());
		return jf;
		
	}
	private Programador crearProgramador() {
		Programador p = new Programador();
		System.out.println("Escoge un DNI del programador");
		p.setDNI(sc.nextLine());
		System.out.println("Escoge un nombre");
		p.setNombre(sc.nextLine());
		System.out.println("Pon lo que va a cobrar");
		p.setSalarioBase(sc.nextDouble());	
		return p;
	}
	private void menuEmpleados() {
		System.out.println("Que tipo de trabajador quieres crear");
		System.out.println("Elige 1 para crear un PROGRAMADOR");
		System.out.println("Elige 2 para crear un JEFE DE PROYECTO");
		System.out.println("Elige 3 para crear un DIRECTOR");
		System.out.println("Elige 4 para SALIR");
	}

}
