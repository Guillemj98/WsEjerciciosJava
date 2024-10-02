package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainLambda {

	public static void main(String[] args) {
		//Usando las interfaces funcionales que tiene Java por defecto, crear las siguientes funciones lambda:
		//1. Una función lambda que devuelva el número de letras que tiene una frase pasada por parámetro
		//2. Una función lambda que dados 2 números devuelva la distancia entre ambos
		//3. Una función lambda que dado una cadena y un número, devuelva una subcadena desde el principio hasta el número del caracter pasado por parámetro
		//4. Una función lambda que devuelva true en caso de que una fase introducida por parámetro contiene la cádena "pepe"
		//5. Una función lambda que imprima por pantalla un array de números pasado por parámetro.
		//6. Una función lambda que reciba 3 números y devuelva el mayor de los tres.
		
		// Funcion 1.
		// Asumimos que no hay espacios en blanco en la palabra que ponemos.
		Function<String, Integer>conteoLetras =(v)->{
			int numeroLetras = v.length();	
			return numeroLetras;
		};
		System.out.println("El numero de letras es: " + conteoLetras.apply("Manolo"));
			
		// Funcion 2
		BiFunction<Integer, Integer, Integer>distanciaEntreEllos =(k ,v)->{
			int calcularDistancia = v - k;
			return calcularDistancia;
		};
		System.out.println("La distancia entre los numeros es: "+distanciaEntreEllos.apply(10, 20));
		
		//Funcion 3
		BiFunction<String, Integer, String> devueltaSubCadena = (k , v)->{
			String subCadena = k.substring(v);
			return  subCadena;
		};
		System.out.println("La subcadena es: " + devueltaSubCadena.apply("Catalan el que no bote", 4));
		
		// Funcion 4
		Predicate<String>contienePepe = (v)->{
			boolean flag = false;
			if(v.contains("pepe")) {		
				flag = true;
			}				
			return flag;
		};
		System.out.println(contienePepe.test("La mejor manera de saber si tiene pepe en la cadena es?"));
		
		// Funcion 5
		Consumer<List<Integer>> listaNumero = (v)->{
			for(Integer i : v) {
				System.out.println(i);
			}
		};
		List<Integer>listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(5);
		listaNumeros.add(3);
		listaNumeros.add(10);
		listaNumeros.add(100);
		listaNumeros.add(2);	
		listaNumero.accept(listaNumeros);
		
		// Funcion 6
		QuadriFunction<Integer, Integer, Integer, Integer>reciboTresNumeros = (t, g, h) -> {
			int numeroMayor =0;
			if(t > numeroMayor) {
				numeroMayor = t;
			} 
			if (g > numeroMayor){
				numeroMayor = g;
			} 
			if (h > numeroMayor) {
				numeroMayor =h;
			}
			return numeroMayor;	
		}; 		
		System.out.println(reciboTresNumeros.apply(51, 7, 10));
		
		
		
		
	}

}
