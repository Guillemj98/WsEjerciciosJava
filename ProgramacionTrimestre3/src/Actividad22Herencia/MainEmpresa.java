package Actividad22Herencia;

import java.util.ArrayList;

public class MainEmpresa {
	public static void main(String[] args) {
		Programador programador1 = new Programador();
		Programador programador2 = new Programador();
		Programador programador3 = new Programador();
		JefeProyecto jf1 = new JefeProyecto();
		JefeProyecto jf2 = new JefeProyecto();
		JefeProyecto jf3 = new JefeProyecto();
		Director d1 = new Director();
		Director d2 = new Director();
		
		
		programador1.setDNI("546798D");
		programador1.setNombre("Juan");
		programador1.setSueldoBase(1500);
		
		programador2.setDNI("5436798G");
		programador2.setNombre("Manuel");
		programador2.setSueldoBase(1550);
		
		programador3.setDNI("5486798C");
		programador3.setNombre("Pepe");
		programador3.setSueldoBase(1000);
		
		jf1.setDNI("9046798D");
		jf1.setNombre("Felix");
		jf1.setSueldoBase(1800);
		
		jf2.setDNI("9146798D");
		jf2.setNombre("Piero");
		jf2.setSueldoBase(1800);
		
		jf3.setDNI("92546798D");
		jf3.setNombre("Carlos");
		jf3.setSueldoBase(1750);
		
		d1.setDNI("00546798C");
		d1.setNombre("Felipe");
		d1.setSueldoBase(2000);
		
		d2.setDNI("00546798H");
		d2.setNombre("Daniel");
		d2.setSueldoBase(2000);
		
		ArrayList<Empleado>listaEmpleadosDirector = new ArrayList<Empleado>();
		d1.setListaEmpleados(listaEmpleadosDirector);
		
		d1.getListaEmpleados().add(programador3);
		d1.getListaEmpleados().add(programador2);
		d1.getListaEmpleados().add(jf2);
		
		d2.setListaEmpleados(listaEmpleadosDirector);
		d2.getListaEmpleados().add(programador1);
		d2.getListaEmpleados().add(d1);
		d2.getListaEmpleados().add(jf2);
		
		
		ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(programador1);
		listaEmpleados.add(programador2);
		listaEmpleados.add(programador3);
		listaEmpleados.add(jf1);
		listaEmpleados.add(jf2);
		listaEmpleados.add(jf3);
		listaEmpleados.add(d1);
		listaEmpleados.add(d2);
		for(Empleado e : listaEmpleados) {
			System.out.println(e.calcularSalario());
		}
		
		
		
	}

}
