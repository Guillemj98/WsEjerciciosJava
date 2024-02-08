package _01_Ejercicio11Constructores;
import java.util.Scanner;
public class Videojuego {
	int id;
	String nombre;
	int puntuacion;
	double precio;
	String fechaCreacion;
	boolean esDeSegundaMano;
	
	public Videojuego() {
		// Primer contructor el de por defecto
		this.fechaCreacion = "01/01/1970";
		
		
	}
	public Videojuego(String nombre, int puntuacion, double precio, String fechaCreacion,boolean esDeSegundaMano ) {
		// Segundo contructor con todos los "atributos"
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.esDeSegundaMano = esDeSegundaMano;
		
	}
	public Videojuego(String nombre,String fechaCreacion ) {
		// Tercer contructor con solo 2 parametros de entrada "nombre" y "fechaCreacion"
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		
	}
	public void mostrarDatos() {
		System.out.println("El nombre del juego es: " + this.nombre);
		System.out.println("La puntuación del videojuego es: " + this.puntuacion );
		System.out.println("El precio es: " + this.precio + "€" );
		System.out.println("La fecha de creación es: " + this.fechaCreacion);
		System.out.println("Es de segunda mano?: " + this.esDeSegundaMano );
	}
	public void nombreYPuntuacion() {
		System.out.println("El nombre del juego es: " + this.nombre);
		System.out.println("La puntuación del videojuego es: " + this.puntuacion );
	}
	public void precioLibras() {
		double precioLibras = 0;
		precioLibras = this.precio * 0.86;
		System.out.println("El precio en libras del juego es: " + precioLibras );
	}
	public void mostrarFechaAlReves() {
		// Lo pasas a modo split y luego concatenas un nuevo String cambiando
		// las posiciones del String
		String fecha = this.fechaCreacion;
		String[]partesFecha = fecha.split("/");
		String fechaConOtroOrden = partesFecha[2] + "/" + partesFecha[1] + "/" + partesFecha[0];
		System.out.println(fechaConOtroOrden);
		// también se puede hacer mas simple
		// String []fechaPartida = this.fechaCreacion.split("/");
		
		
		
	}
	public double descuentoSiEsSegundaMano() {
		double precioDescuento =0;
		if(this.esDeSegundaMano == true) {
			precioDescuento = this.precio-(this.precio*0.30);
		}else {
			System.out.println("No tienes descuento por no ser de segunda mano");
		}
		return precioDescuento;
	}
	public void aptoParaJugar() {
		if(this.puntuacion >=5) {
			System.out.println("Tu juego es jugable");
		}else {
			System.out.println("Tu juego es un mierdón");
		}
	}
	public void numerosNaturales() {
		for(int i= this.puntuacion;i<=10;i++) {
			System.out.println("Estos son todos los numeros: " + i);
		}
	}
	/**
	 * Esto es para hacer documentación del método que estamos 
	 * haciendo
	 * @param v2
	 * @return
	 */
	public boolean seraMasCaro(Videojuego v2) {
		boolean esCaro=false;
		if(this.precio<v2.precio) {
			esCaro = false;
		}else {
			esCaro =true;
		}
		return esCaro;
	}
    public void cambiarAtributosDesdeTeclado() {
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Ingrese nuevo nombre para el videojuego: ");
        String nuevoNombre = sc.nextLine();
        cambiarNombre(nuevoNombre);

        System.out.print("Ingrese nueva puntuación para el videojuego: ");
        int nuevaPuntuacion = sc.nextInt();
        cambiarPuntuacion(nuevaPuntuacion);

        System.out.print("Ingrese nuevo precio para el videojuego: ");
        double nuevoPrecio = sc.nextDouble();
        cambiarPrecio(nuevoPrecio);

        System.out.print("¿Es de segunda mano? (true/false): ");
        boolean nuevoEsDeSegundaMano = sc.nextBoolean();
        cambiarEsDeSegundaMano(nuevoEsDeSegundaMano);
        sc.close();
    }
	public void cambiarPrecio(double nuevoPrecio) {
		this.precio= nuevoPrecio;
		
	}
	public void cambiarPuntuacion(int nuevaPuntuacion) {
		this.puntuacion = nuevaPuntuacion;
		
	}
	public void cambiarNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
		
	}
	public void cambiarEsDeSegundaMano(boolean setEsDeSegundaMano) {
		this.esDeSegundaMano = setEsDeSegundaMano;
		
	}
	

}
