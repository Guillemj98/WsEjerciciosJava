package paquete1;

import java.util.Date;

public class HiloString implements Runnable{
	private long inicio;
	private long fin;
	private String cadena;
	
	public HiloString(long inicio, long fin, String cadena) {
		super();
		this.inicio = inicio;
		this.fin = fin;
		this.cadena = cadena;
	}

	@Override
	public void run() {
		Date principio = new Date();
		long inicio = principio.getTime();
		
		
		long resta = 0;
		if(this.inicio> this.fin) {
			resta = inicio -fin;
		}else {
			resta= fin - inicio;
		}
		for(int i=0; i<= resta; i++) {
			System.out.println(cadena);
		}
		
		Date fin = new Date();
		long finn = fin.getTime();
		System.out.println("Ha tardado" + (finn - inicio));
		
		
	}

}
