package paquete1;

public class HiloMillon extends Thread {
	private long numero;
	
	
	public HiloMillon(long numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void run() {
		long numeroLimite = 1000000000;
		for(long i = this.numero; i<= numeroLimite; ++i) {
			System.out.println(i);
		}
		
	}

}
