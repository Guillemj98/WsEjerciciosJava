package paquete1;

import java.util.Scanner;

public class MainHilos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de texto");
		String cadena = sc.nextLine();
		
		System.out.println("Intrduce un numero");
		long numero1 = sc.nextLong();
		
		System.out.println("Introduce un segundo numero");
		long numero2 = sc.nextLong();
		
		HiloRunable hr = new HiloRunable(numero1);
		HiloMillon hm = new HiloMillon(numero2);
		hm.setName("Hilo 2");
		hm.start();
		
		HiloString hs = new HiloString(numero1, numero2, cadena);
		Thread t1 = new Thread(hr);
		
		Thread t3 = new Thread(hs);
		t1.setName("Hilo 1");
		t1.start();
		
		t3.setName("Hilo 3");
		t3.start();
	}

}
