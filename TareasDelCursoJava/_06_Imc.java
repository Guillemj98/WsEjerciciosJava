

public class _06_Imc {

	public static void main(String[] args) {
		double peso = 72;
		double altura = 1.83;
		double imc = peso / (altura * altura);
		System.out.println(imc);
		peso = 90;
		altura = 1.90;
		imc = peso / (altura * altura);
		System.out.println(imc);
	}
}