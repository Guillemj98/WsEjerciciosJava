

public class _05_ConversionMoneda {
	public static void main(String[] args) {
		final double TASA = 0.85;
		double dolares = 10;
		double euros = dolares * TASA;
		System.out.println(euros);
		dolares = 1;
		euros = dolares * TASA;
		System.out.println(euros);
	
		
	}

}