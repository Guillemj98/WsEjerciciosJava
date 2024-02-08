

public class _05_ConversionMoneda {
	public static void main(String[] args) {
		final double tasa = 0.85;
		double dolares = 10;
		double euros = dolares * tasa;
		System.out.println(euros);
		dolares = 1;
		euros = dolares * tasa;
		System.out.println(euros);
	
		
	}

}