

public class _04_CalculoInteresSimple {
	public static void main(String[] args) {
		double principal = 5000;// inversión principal
		double tasa = 0.09;// esto es un porcentaje
		int tiempo = 10;// esto son años
		double interes = principal * tasa * tiempo;
		
		System.out.println("tu interes simple es: " + interes);
	}

}