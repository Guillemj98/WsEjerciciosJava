package paquete1;

import java.util.Scanner;

public class MainHilos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero y te dire si es primo");
		long n1 = sc.nextLong();
		System.out.println("Escribe un numero y te dire si es primo");
		long n2 = sc.nextLong();
		System.out.println("Escribe un numero y te dire si es primo");
		long n3 = sc.nextLong();
		
		HiloThread ht1 = new HiloThread(n1);
		ht1.setName("Hilo 1 ");
		ht1.start();
		
		HiloThread ht2 = new HiloThread(n2);
		ht2.setName("Hilo 2 ");
		ht2.start();
		
		HiloThread ht3 = new HiloThread(n3);
		ht3.setName("Hilo 3 ");
		ht3.start();
		
		
		
		System.out.println("-------------------------");
		ht1.run();
		ht2.run();
		ht3.run();
		
	}

}
