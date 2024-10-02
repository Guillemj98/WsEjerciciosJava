package paquete1;

import java.util.Date;

public class HiloThread extends Thread  {
	
	private long numero; 
	
	public HiloThread(long numero) {
		this.numero = numero;
		
	}

	@Override
	public void run() {
		boolean esPrimo = true;
		Date d = new Date();		
		long inicio = d.getTime();
		
		if(this.numero <=1) {
			esPrimo= false;
			
		}else {			
			for(int i = 2;i<=Math.sqrt(numero);i++) {
				if(this.numero % i == 0) {
					esPrimo= false;
					break;
				}
			}
			
		}
		System.out.println(Thread.currentThread().getName() + "Es primo: " + esPrimo);
		Date d2 = new Date();
		long fin = d2.getTime();
		System.out.println("Hilo: "+ Thread.currentThread().getName() + "El tiempo que ha tardado en realizarlo es: " + (fin -inicio) + " milisegundos" );
	}
	
	

}
