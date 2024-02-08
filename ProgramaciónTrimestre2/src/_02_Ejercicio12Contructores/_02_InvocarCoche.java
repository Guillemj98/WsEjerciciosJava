package _02_Ejercicio12Contructores;

public class _02_InvocarCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		Coche c2 = new Coche(3000, "Toyota", "Prius", 30000, "17/02/2018",500);
		c1.cambiarAtributosDesdeTeclado();
		
		
		// Mostrar datos
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		// Mostrar precio
		c1.mostrarPrecio();
		c2.mostrarPrecio();
		
		//Mostrar la fecha
		c1.mostrarFecha();
		c2.mostrarFecha();
		
		// Ver si es bisiesto
		//c1.verSiEsBisiesto();
		c2.verSiEsBisiesto();
		
		//Devolver precio
		System.out.println(c1.mostrarPrecioSegunKm());
		System.out.println(c2.mostrarPrecioSegunKm());
		
		//Numero de kilometros primo
		System.out.println(c1.numeroKilometrosPrimos());
		System.out.println(c2.numeroKilometrosPrimos());
		
		// Cuantos kilometros quedan
		System.out.println(c1.cuantosKmQuedan());
		System.out.println(c2.cuantosKmQuedan());
		
		// Cuantos caracteres tiene
		//System.out.println(c1.contadorDeLetrasMarca());
		System.out.println(c2.contadorDeLetrasMarca());
		//System.out.println(c1.contadorDeLetrasModelo());
		System.out.println(c2.contadorDeLetrasModelo());
		//System.out.println(c1.contadorLetras());
		System.out.println(c2.contadorLetras());
		
		// Diferencia
		System.out.println(c1.diferenciaKm(c2));
		
		//Coche mas caro
		System.out.println("Mi coche es mas caro? " + c1.seraMasCaro(c2));
		System.out.println("Mi coche es mas caro? " + c2.seraMasCaro(c1));
		
		
		
		

	}

}
