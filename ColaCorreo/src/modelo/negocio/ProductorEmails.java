package modelo.negocio;

import modelo.entidad.Email;

public class ProductorEmails extends Thread {
	public String nombre ;
	public Cola cola;
	
	public ProductorEmails(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run () {
		GeneradorEmails ge = new GeneradorEmails();
		for( int i =1; i <=10; i++) {
			Email email = ge.generarEmail();
			System.out.println("================================");
			System.out.println("👤 Usuario: " + nombre);
			System.out.println("📧 ID del email: " + email.getId());
			System.out.println("================================");
			
			cola.addEmail(email);

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}

}
