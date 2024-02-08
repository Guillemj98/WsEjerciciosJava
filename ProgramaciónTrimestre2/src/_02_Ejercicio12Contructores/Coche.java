package _02_Ejercicio12Contructores;

import java.util.Scanner;

public class Coche {
	int id;
	String marca;
	String modelo;
	double precioBase;
	String fecha;
	long km;
	public Coche() {
		super();
		
		
	}
	public Coche(int id, String marca, String modelo, double precioBase, String fecha, long km) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fecha = fecha;
		this.km = km;
	}
	
	
	public String toString() {
		return "Coche: id=" + id + ", La marca del coche es: " + marca + ", El modelo es: " + modelo + ", El coche cuesta: " 
	+ precioBase + ", Se matriculo en:"
				+ fecha + ", Tiene hechos: " + km + "km";
	}
	public void mostrarPrecio() {
		System.out.println("El precio del coche es: " + this.precioBase + "€" );
		
	}
	public void mostrarFecha() {
		System.out.println("La fecha del coche es: " + this.fecha  );
		
	}
	public void verSiEsBisiesto() {
	  String fecha = this.fecha;
	  String[] cadenaPartida = fecha.split("/");
	  int number = Integer.parseInt(cadenaPartida[2]);
	  if (this.fecha==null) {
          System.out.println("Error: El formato de fecha no es válido.");
          return;
	  }
	  if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)) {
          System.out.println("Tu coche se hizo en un año bisiesto.");
      } else {
          System.out.println("Tu coche no se hizo en un año bisiesto.");
      }
	
	  
	}
	public double mostrarPrecioSegunKm() {
		double precioDevolver =0;
		if (this.precioBase< 10000) {
			precioDevolver = this.precioBase;
		}else if (this.precioBase > 10000 && this.precioBase < 50000) {
			precioDevolver = this.precioBase * 0.80;	
		}else if (this.precioBase >= 50000 ) {
			precioDevolver = this.precioBase/2;
		}
		
		return precioDevolver;
	}
	
	public boolean numeroKilometrosPrimos() {
		int contador =0;
		for(int i =1; i<= this.km;i++) {
			contador++;		
		}
		if(contador ==2) {
			return true;
		}else {
			return false;
			
		}
		
	}
	public double cuantosKmQuedan() {
		double kmQuedan =0;
		if(this.km < 200000) {
			kmQuedan = 200000 - this.km;
		}else if (this.km ==200000) {
			kmQuedan =0;
		}else if (this.km >200000) {
			kmQuedan = 200000 - this.km;
		}
		return kmQuedan;
	}
	public int contadorDeLetrasMarca() {
		int contandorMarca =0;		
		String textoMarca = this.marca;		
		for(int i=0; i<textoMarca.length();i++ ) {
			char caracter = textoMarca.charAt(i);
			contandorMarca++;
		}		
		return contandorMarca;
		
	}
	public int contadorDeLetrasModelo() {
		int contandorModelo =0;
		String textoModelo = this.modelo;
		for(int i=0; i<textoModelo.length();i++ ) {
			char caracter = textoModelo.charAt(i);
			contandorModelo++;
		}
		return contandorModelo;
	}
	public int contadorLetras() {
		int contador =0;
		String textoMarca = this.marca;	
		String textoModelo = this.modelo;
		String resultado = textoMarca.concat(textoModelo);
		for(int i=0; i<resultado.length();i++ ) {
			char caracter = resultado.charAt(i);
			contador++;
		}
		return contador;
		
	}
	public double diferenciaKm(Coche otroCoche) {
		double diferencia = 0;
		diferencia = this.km - otroCoche.km;
		return diferencia;
	}
	public double diferenciaPrecio(Coche otroCoche) {
		double diferenciaPrecio = 0;
		diferenciaPrecio = this.km - otroCoche.precioBase;
		return diferenciaPrecio;
	}
	public boolean seraMasCaro(Coche v2) {
		boolean esCaro=false;
		if(this.precioBase<v2.precioBase) {
			esCaro = false;
		}else {
			esCaro =true;
		}
		return esCaro;
	}
	public void cambiarAtributosDesdeTeclado() {
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Ingrese Marca del coche: ");
        String nuevoMarca = sc.nextLine();
        cambiarMarca(nuevoMarca);

        System.out.print("Ingrese nuevo ID: ");
        int nuevaPuntuacion = sc.nextInt();
        cambiarId(nuevaPuntuacion);

        System.out.print("Ingrese modelo del coche: ");
        String nuevoModelo = sc.nextLine();
        cambiarModelo(nuevoModelo);

        System.out.print("Pon la fecha de matriculación: ");
        String cambioFecha = sc.nextLine();
        cambiarFecha(cambioFecha);
        
        System.out.print("Pon los Km que tiene el coche: ");
        long cambiarKm = sc.nextLong();
        cambiarKm(cambiarKm);
    }
	public void cambiarPrecio(double nuevoPrecio) {
		this.precioBase= nuevoPrecio;
		
	}
	public void cambiarId(int nuevoId) {
		this.id = nuevoId;
		
	}
	public void cambiarMarca(String nuevoMarca) {
		this.marca = nuevoMarca;
		
	}
	public void cambiarModelo(String nuevoModelo) {
		this.modelo = nuevoModelo;
		
	}
	public void cambiarFecha(String cambioFecha) {
		this.fecha = cambioFecha;
		
	}
	public void cambiarKm(long cambioDeKm) {
		this.km = cambioDeKm;
		
	}
	
	

}
