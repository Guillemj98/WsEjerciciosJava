import java.util.Scanner;

public class _16_EjerciciosOperadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ponga el valor de la base del rectángulo");
		int n1 = sc.nextInt();
		System.out.println("Este es el valor de la base del rectangulo :" + n1);
		System.out.println("Ponga el valor del lateral del rectángulo");
		int n2 = sc.nextInt();
		int perimetro = 2*(n1+n2);
		System.out.println("Este es valor del lateral del rectángulo");
		System.out.println("Este es el resultado del perimetro del rectángulo : " + perimetro );
		int area = n1 * n2;
		System.out.println("Este es el valor del area de su rectangulo: " + area);
		
		

	}

}
