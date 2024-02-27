package _07_Ejercicio17;

import java.util.ArrayList;

public class mainOrdenador {

	public static void main(String[] args) {
		Procesador pR1 = new Procesador("Intel", "i9", 8, 300.0);
		TarjetaGrafica tg = new TarjetaGrafica("Nvidia", "RTX 4070", 5, 1050.99, new RAM("Nvidia", 16, 0));
		PlacaBase pb = new PlacaBase("MSI", 267.99, "ZTX300");
		RAM r = new RAM("HyperX", 16, 299.99);
		RAM r2 = new RAM("HyperX", 16, 299.99);
		RAM r3 = new RAM("HyperX", 16, 299.99);
		RAM r4 = new RAM("HyperX", 16, 299.99);
		Periferico p = new Periferico("Monitor", "Dell", 100.54);
		Periferico p2 = new Periferico("Ratón", "Logitech", 200.54);
		Periferico p3 = new Periferico("Teclado", "Razer", 95.54);
		
		
		Ordenador o = new Ordenador(0, pR1, tg, pb, new ArrayList<RAM>(),new ArrayList<Periferico>());
		// Rellenamos el array de Ram
		o.getListaRAMs().add(r);
		o.getListaRAMs().add(r2);
		o.getListaRAMs().add(r3);
		o.getListaRAMs().add(r4);
		
		// Rellenamos el array de Perifericos
		o.getListaPerifericos().add(p);
		o.getListaPerifericos().add(p2);
		o.getListaPerifericos().add(p3);
		
		System.out.println(o.toString());
		
		System.out.println("Este es el precio de tu ordenador");
		System.out.println("Tu ordenador vale: " + o.calcularPrecio() + "€");
		
		System.out.println(o.toString());
		
		
		

	}

}
