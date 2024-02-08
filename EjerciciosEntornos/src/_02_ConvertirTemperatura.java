import java.util.Scanner;

public class _02_ConvertirTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------CONVERSOR DE TEMPERATURA------");
		System.out.println("Pulse 1 para convetir Farenheit a Celsius");
		System.out.println("Pulse 2 para convetir Celsius a Farenheit");
		double numero1 = sc.nextInt();
		System.out.println("Ahora introduzca la temperatura");
		double numero2= sc.nextInt();
		double resultado = 0;
		if (numero1==1) {
			resultado = ((numero2-32)*5/9);
			System.out.println("Tu temperatura farenheit en celsius es: " + resultado);
		}
		if (numero1==2) {
			resultado = (numero2*(9/5))+32;
			System.out.println("Tu temperatura celsius en farenheit es: " + resultado);
		}

	}

}
