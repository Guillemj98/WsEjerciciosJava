package _01_Ejercicio11Constructores;

import java.util.Scanner;
public class _01_InvocarVi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Primer objeto con los 3 contructores
		Videojuego primerVideojuego = new Videojuego();
		primerVideojuego.cambiarAtributosDesdeTeclado();
		Videojuego segundoVideojuego = new Videojuego("Monster Hunter World", 9, 59.95, "26/01/2018", true);
		Videojuego tercerVideojuego = new Videojuego("Baldur's gate 3", "03/08/2023");
		
		// Mostrar datos
		primerVideojuego.mostrarDatos();
		System.out.println("-----------");
		segundoVideojuego.mostrarDatos();
		System.out.println("-----------");
		tercerVideojuego.mostrarDatos();
		System.out.println("-----------");
		
		// Nombre y puntuacion
		primerVideojuego.nombreYPuntuacion();
		System.out.println("-----------");
		segundoVideojuego.nombreYPuntuacion();
		System.out.println("-----------");
		tercerVideojuego.nombreYPuntuacion();
		System.out.println("-----------");
		
		//Precio en libras
		primerVideojuego.precioLibras();
		System.out.println("-----------");
		segundoVideojuego.precioLibras();
		System.out.println("-----------");
		tercerVideojuego.precioLibras();
		System.out.println("-----------");
		
		//Fecha de estreno de otra manera
		primerVideojuego.mostrarFechaAlReves();
		segundoVideojuego.mostrarFechaAlReves();
		tercerVideojuego.mostrarFechaAlReves();
		
		//Tendra descuento?
		System.out.println("El precio final es: " +primerVideojuego.descuentoSiEsSegundaMano());
		System.out.println("-----------");
		System.out.println("El precio final es: " +segundoVideojuego.descuentoSiEsSegundaMano());
		System.out.println("-----------");
		System.out.println("El precio final es: " +tercerVideojuego.descuentoSiEsSegundaMano());
		System.out.println("-----------");
		
		// Se puede jugar
		primerVideojuego.aptoParaJugar();
		System.out.println("-----------");
		segundoVideojuego.aptoParaJugar();
		System.out.println("-----------");
		tercerVideojuego.aptoParaJugar();
		System.out.println("-----------");
		
		
		// Numeros con for
		primerVideojuego.numerosNaturales();
		System.out.println("-----------");
		segundoVideojuego.numerosNaturales();
		System.out.println("-----------");
		tercerVideojuego.numerosNaturales();
		System.out.println("-----------");
		
		// Es mas caro
		System.out.println(primerVideojuego.seraMasCaro(tercerVideojuego));		
		System.out.println("-----------");
		System.out.println(segundoVideojuego.seraMasCaro(tercerVideojuego));	
		System.out.println("-----------");
		System.out.println(tercerVideojuego.seraMasCaro(primerVideojuego));
		System.out.println("-----------");
		
		
		
		
		
		/*
		// Segundo objeto con los 3 constructores
		Videojuego segundoVideojuego = new Videojuego();
		//segundoVideojuego.cambiarAtributosDesdeTeclado();		
		segundoVideojuego = new Videojuego("Baldur's gate 3", 10, 60, "03/08/2023", false);
		segundoVideojuego = new Videojuego("Baldur's gate 3", "03/08/2023");	
		
		// Tercer objeto con los 3 contructores
		Videojuego tercerVideojuego = new Videojuego();
		//tercerVideojuego.cambiarAtributosDesdeTeclado();		
		tercerVideojuego = new Videojuego("Prince of Persia: The Lost Crown", 8, 59.95, "15/01/2024", false);
		tercerVideojuego = new Videojuego("Prince of Persia: The Lost Crown", "15/01/2024");
		*/
		
		
	

	}

}
