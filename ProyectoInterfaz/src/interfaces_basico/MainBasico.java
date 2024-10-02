package interfaces_basico;

public class MainBasico {
	public static void main(String[] args) {
		Operable o1 = new Resta();
		Operable o2 = new Suma();
		System.out.println(o1.operar(5, 45));
		System.out.println(o2.operar(305, 45));
		
		Operable multiplicacion = new Operable() {
			
			@Override
			public double operar(double d1, double d2) {
				double resultado = d1 * d2;
				return resultado;
			}
		};
		System.out.println(multiplicacion.operar(3, 4));
		
		Operable division =(op1, op2) ->{
			double resultado = op1 / op2;
			return resultado;
		};
		System.out.println(division.operar(10, 2));
	}

}
