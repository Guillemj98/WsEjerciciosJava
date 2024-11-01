package modelo.negocio;

import java.util.LinkedList;
import java.util.Queue;

import modelo.entidad.Email;

public class Cola {
	public final static int MAX_ELEMENT = 5;
	
	private Queue<Email>cola = new LinkedList<>();
	
	
	public synchronized void AddEmail(Email email) {
		
		while(cola.size()== MAX_ELEMENT) {
			
			try {
				
				wait();
				
			}catch (InterruptedException  e) {
				e.printStackTrace();
			}
		}
		if(email.getDestinatario().equals("pikachu@gmail.com")) {
			System.out.println("No se dejan enviar emails a pokachu ");
		}else {
			// Añadimos un elemento en la cola
			cola.offer(email);
			notify();
		}
		
	
	}
	public synchronized Email getEmail() {
		Email email = null;
		while(cola.size()==0) {
			try {
				wait();
			}catch (InterruptedException  e) {
				e.printStackTrace();
			}
		}
		//Sacamos el email de la cola
		email = cola.poll();
		notify();
		return email;
	}

}
