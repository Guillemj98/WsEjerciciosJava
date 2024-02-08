import java.util.Scanner;

public class _21_Alumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular tu media chavalín");
		System.out.println("Introduzca la nota del primer parcial");
		double parcial1 = sc.nextDouble();
		System.out.println("Introduce la nota del segundo parcial");
		double parcial2 = sc.nextDouble();
		System.out.println("Introduce la nota del tercer parcial");
		double parcial3 = sc.nextDouble();
		System.out.println("Ahora calculamos la media de tu notas y hallamos el porcetanje");
		
		double promedio = (((parcial1 + parcial2 + parcial3))/3)* 0.55;
		System.out.println("Este es tu porcentaje de notas de los parciales: " + promedio);
		
		System.out.println("Introduce la nota del examen final");
		double ultimo = sc.nextDouble();
		System.out.println("Ahora vamos a calcular el porcentaje que te queda despues del examen final");
		double porcentaje = ultimo * 0.30;
		System.out.println("Esto es tu porcentaje del examen final: " + porcentaje);
		
		System.out.println("Por ultimo introduce la nota del examen final");
		double trabajo = sc.nextDouble();
		double d1 = trabajo * 0.15;
		System.out.println("Porcentaje que obtienes por la nota de tu trabajo final");
		System.out.println("Por ultimo hallamos tu nota final");
		double notaFinal = promedio + porcentaje + d1;
		System.out.println("Esto es tu nota del curso: " + notaFinal);

	}

}
