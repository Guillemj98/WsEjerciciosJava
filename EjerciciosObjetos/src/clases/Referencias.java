package clases;

public class Referencias {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche();
		//Ahora cambiamos los valores que estan por defecto
		c1.años= 5;
		c1.electrico= false;
		c1.marca= "Toyota";
		c1.matricula= "12345 CLX";
		c1.modelo = "Prius";
		c1.peso =300;
		
		c2.años= 1;
		c2.electrico= true;
		c2.marca= "BMW";
		c2.matricula= "1230 BYP";
		c2.modelo = "i5";
		c2.peso =3000;
		
		c3.años= 20;
		c3.electrico= false;
		c3.marca= "Ferrari";
		c3.matricula= "723456 KVT";
		c3.modelo = "f40";
		c3.peso =2000;
		
		imprimirValores(c1);
		imprimirValores(c2);
		imprimirValores(c3);
		
		
	}
	public static void imprimirValores(Coche referencia) {
		System.out.println("Años de antiguedad: " + referencia.años);
		System.out.println("Es electrico: " +referencia.electrico);
		System.out.println("Marca: " +referencia.marca);
		System.out.println("Su Matricula es: " +referencia.matricula);
		System.out.println("El modelo es: " +referencia.modelo);
		System.out.println("Peso: " +referencia.peso);
		System.out.println("-----------------------------------------");
		
	}


}
