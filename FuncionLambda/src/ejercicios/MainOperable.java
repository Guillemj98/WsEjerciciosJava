package ejercicios;

import java.io.PrintWriter;

public class MainOperable {
	public static void main(String[] args) {
		Operable elevadoCuadrado = new Operable() {

			@Override
			public double operar(double d1, double d2) {
				double resultado =  Math.pow(d1, d2);
				return resultado;
			}
			
			
		};
		Operable raizN = new Operable() {
			
			@Override
			public double operar(double d1, double d2) {
				double resultado = Math.pow(d1, (1.0 /d2));
				return resultado;
			}
		};	
		Operable elevadoAlCuadrado = (op1, op2)->{
			double resultado = 0;
			resultado = Math.pow(op1, op2);
			return resultado;
		};
		Operable raizAN = (op1, op2)->{	
			double resultado = 0;
			resultado = Math.pow(op1, (1.0 /op2));
			
			return resultado;
		};
		
		Imprimible imprimirFichero = (cadena)->{
			 try (PrintWriter pw = new PrintWriter("fichero.txt")) {
			        pw.println(cadena);
			        pw.flush();
			    } catch (Exception e) {
			        e.printStackTrace();
			}	
		};
		Imprimible imprimirImpresora = (cadena)->{
			String IP = "192.168.56.13";
			System.out.println("Imprimiendo por impresora: " + cadena);
		};
		Imprimible imprimirPantalla =(cadena)->{
			System.out.println(cadena);
		};
		
		Stringeable concatenarCadena =(cadena)->{
			
			String cadenaCompleta = ("Hola: " + cadena);
			return cadenaCompleta;
		};
		Stringeable quitarEspacios =(cadena)->{
			String sinEspacios = cadena.trim();
			return sinEspacios;
		};
		
		System.out.println(raizAN.operar(144, 2));
		System.out.println(concatenarCadena.imprimir("Mariano me la agarras con la mano"));
	}
	
	
	

}
