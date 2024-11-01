package modelo.negocio;

public class Main {

	public static void main(String[] args) {
		Cola cola = new Cola();
		ProductorEmails pe1 = new ProductorEmails("Productor 1", cola);
		ProductorEmails pe2 = new ProductorEmails("Productor 2", cola);
		ProductorEmails pe3 = new ProductorEmails("Productor 3", cola);
		
		ConsumidorEmails ce1 = new ConsumidorEmails("Consumidor 1", cola);
		ConsumidorEmails ce2 = new ConsumidorEmails("Consumidor 2", cola);

		pe1.start();
		pe2.start();
		pe3.start();
		
		ce1.start();
		ce2.start();
		
	}

}
