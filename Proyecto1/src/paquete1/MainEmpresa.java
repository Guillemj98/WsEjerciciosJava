package paquete1;

import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Direccion direccionEmpresa = new Direccion();
		direccionEmpresa.setCodigoPostal("28031");
		direccionEmpresa.setNombreVia("Poniente");
		direccionEmpresa.setTipoVia("Avenida");
		
		empresa.setDireccionEmpresa(direccionEmpresa);
		empresa.setNIF("F234567");
		empresa.setNombre("Upgrade-Hub");
		
		Direccion direccionEmpleado1 = new Direccion();
		Direccion direccionEmpleado2 = new Direccion();
		Direccion direccionEmpleado3 = new Direccion();
		
		direccionEmpleado1.setCodigoPostal("30303");
		direccionEmpleado1.setNombreVia("Pantalla");
		direccionEmpleado1.setTipoVia("Calle");
		
		direccionEmpleado2.setCodigoPostal("30003");
		direccionEmpleado2.setNombreVia("Mongolo");
		direccionEmpleado2.setTipoVia("Plaza");
		
		direccionEmpleado3.setCodigoPostal("22222");
		direccionEmpleado3.setNombreVia("Bobito");
		direccionEmpleado3.setTipoVia("Paseo");
		
		Curritos empleado1 = new Curritos();
		Curritos empleado2 = new Curritos();
		JefeCurrito empleado3 = new JefeCurrito();
		Curritos empleado4 = new Curritos();
		empleado1.setSexo("Masculino");
		empleado1.setEdad(40);
		empleado1.setNombre("Piero");
		empleado1.setSueldo(1200.01);
		empleado1.setDireccion(direccionEmpleado1);
		empleado1.setHorasExtras(20);
		empleado1.setJornadaLaboral(37.5);	
		
		empleado2.setSexo("Femenino");
		empleado2.setEdad(30);
		empleado2.setNombre("María");
		empleado2.setSueldo(1199.01);
		empleado2.setDireccion(direccionEmpleado2);
		empleado2.setHorasExtras(30);
		empleado2.setJornadaLaboral(47.5);
		
		
		empleado3.setSexo("HelicopteroDeCombate");
		empleado3.setEdad(25);
		empleado3.setNombre("Miguel");
		empleado3.setSueldo(4200.01);
		empleado3.setDireccion(direccionEmpleado3);
		empleado3.setDespacho("Vistas al Mar");
		
		empleado4.setSexo("Masculino");
		empleado4.setEdad(40);
		empleado4.setNombre("Piero");
		empleado4.setSueldo(1200.01);
		empleado4.setDireccion(direccionEmpleado1);
		empleado4.setHorasExtras(20);
		empleado4.setJornadaLaboral(37.5);	
		
		
		List <Empleado> listaEmpleadoJefe = new ArrayList<>();
		listaEmpleadoJefe.add(empleado2);
		listaEmpleadoJefe.add(empleado1);
		
		
		
		List <Empleado>listaEmpleadosEmpresa = new ArrayList<Empleado>();
		listaEmpleadosEmpresa.add(empleado3);
		listaEmpleadosEmpresa.add(empleado2);
		listaEmpleadosEmpresa.add(empleado1);
		empresa.setListaEmpleados(listaEmpleadosEmpresa);
		empleado3.setListaDeEmpleadosACargo(listaEmpleadoJefe);
		System.out.println( "MUÑONES A SU CARGO " + empleado3.getNumeroEmpleado());
		listaEmpleadoJefe.add(empleado4);
		System.out.println("MUÑONES A SU CARGO " + empleado3.getNumeroEmpleado());
		
		
		System.out.println("El salario que se funde la empresa en bobitos es: " + empresa.calcularSalarioEmpleados());
		System.out.println("Cuantos se creen que van a heredar la empresa: " + empresa.cuantosSonDirectores());
		System.out.println("Cuanto gana el bobito numero 1: " + empleado1.salarioTotal());
		System.out.println("Cuanto gana el mongolo numero 2: " +empleado2.salarioTotal());
		System.out.println("Cuanto gana el jefe XDD: " +empleado3.salarioTotal());

	}

}
