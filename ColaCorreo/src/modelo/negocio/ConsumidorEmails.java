package modelo.negocio;

import modelo.entidad.Email;

public class ConsumidorEmails extends Thread {
	
	public String nombre;
	public Cola cola;
	
	public ConsumidorEmails(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run () {
		for(int i = 1; i<=10;i++) {
			Email email = cola.getEmail();
			System.out.println(nombre + "ha consumido el email: " + email);
		}
	}

}
