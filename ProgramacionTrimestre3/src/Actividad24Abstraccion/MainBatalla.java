package Actividad24Abstraccion;

import java.util.List;

public class MainBatalla {

	public static void main(String[] args) {
		Personaje p1 = new Guerrero();
		Personaje p2 = new Curandero();
		Arma a1 = new Espada();
		Arma a2 = new Hechizo();
		Combate c = new Combate(p1, p2);
		a1.setDaño(5);
		a1.setNombre("Hacedora de Viudas");
	
		
		a2.setDaño(3);
		a2.setNombre("Bola de Fuegoo");
		
		p1.setNombre("Dalinar");
		p1.setVida(20);
		p1.setArma(a1);
		
		p2.setNombre("Piero");
		p2.setVida(20);
		p2.setArma(a2);
		
		
		c.empezarCombate(p1, p2);
		
		
	}
	
}
