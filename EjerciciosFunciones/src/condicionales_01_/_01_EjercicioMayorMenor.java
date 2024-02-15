package condicionales_01_;

public class _01_EjercicioMayorMenor {

	public static void main(String[] args) {
		mayorMenor(5, 2);
		mayorMenor(1, 100);
		mayorMenor(10, 10);
		

	}
	public static void mayorMenor (int n1, int n2) {
		if (n1>n2) {
			System.out.println( n1 + " " + "es mayor que: " + n2);
		}else if (n1<n2) {
			System.out.println( n1 + " " +"es menor que: " + n2);
		}else if (n1 == n2) {
			System.out.println( n1 + " " +"es igual que: " + n2);
		}
	}

}
