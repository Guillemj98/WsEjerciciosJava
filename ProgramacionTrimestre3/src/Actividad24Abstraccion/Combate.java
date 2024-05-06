package Actividad24Abstraccion;

import java.util.Scanner;

public class Combate {
	private Personaje p1 ;
	private Personaje p2;
	

	public Combate(Personaje p1, Personaje p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public void empezarCombate(Personaje p1, Personaje p2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----EMPIEZA LA BATALLA POR LA TIERRA MEDIA----");
		if(p1.getVida() <0 || p2.getVida()<0) {
			System.out.println("   ______\r\n"
					+ "        .-\"      \"-.\r\n"
					+ "       /            \\\r\n"
					+ "      |              |\r\n"
					+ "      |,  .-.  .-.  ,|\r\n"
					+ "      | )(__/  \\__)( |\r\n"
					+ "      |/     /\\     \\|\r\n"
					+ "      (_     ^^     _)\r\n"
					+ "       \\__|IIIIII|__/\r\n"
					+ "        | \\IIIIII/ |\r\n"
					+ "        \\          /\r\n"
					+ "         `--------`");
			
		}else {
			do {		
				p1.atacar(p2);
				System.out.println("Pulsa enter para continuar");
				sc.nextLine();
				p2.atacar(p1);
				System.out.println("Pulsa enter para continuar");
				sc.nextLine();
			}while(p1.getVida() >0||p2.getVida()> 0);
		}
		
		
	}
	
	

}
