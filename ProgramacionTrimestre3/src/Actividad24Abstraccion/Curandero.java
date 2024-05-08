package Actividad24Abstraccion;

public class Curandero extends Personaje {
	private double sabiduria;

	public double getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(double sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		if(this.getVida() >0) {
			System.out.println("Con la luz de la sanación, también puedo purificar el mal.");	
			System.out.println("         ,-----.\r\n"
					+ "                   #,-. ,-.#\r\n"
					+ "                  () a   e ()\r\n"
					+ "                  (   (_)   )\r\n"
					+ "                  #\\_  -  _/#\r\n"
					+ "                ,'   `\"\"\"`    `.\r\n"
					+ "              ,'      \\X/      `.\r\n"
					+ "             /         X     ____\\\r\n"
					+ "            /          v   ,`  v  `,\r\n"
					+ "           /    /         ( <==+==> )\r\n"
					+ "           `-._/|__________\\   ^   /\r\n"
					+ "          (\\\\)  |______@____\\  ^  /\r\n"
					+ "            \\\\  |     ( )    \\ ^ /\r\n"
					+ "             )  |             \\^/\r\n"
					+ "            (   |             |v\r\n"
					+ "           <(^)>|             |\r\n"
					+ "             v  |             |\r\n"
					+ "                |             |\r\n"
					+ "                |_.--.__ .--._|\r\n"
					+ "                  `==='  `==='");
			System.out.println("El personaje: " + this.getNombre() + " va a atacar a " + p.getNombre() );
			double danio = calcularDanio(p);
			if(danio >0) {
				double vidaP = p.getVida();
				vidaP-=danio;
				System.out.println("El personaje: " + this.getNombre() + " va a hacer un daño de: " 
						+ danio + " a " + p.getNombre());
				
			}else {
			System.out.println("El personaje " + this.getNombre() + " no puede atacar");
			}
			}else if (p.getVida() <0) {
				System.out.println(p.getNombre()+
										" ESTA MUERTOO "
						+ "             ...\r\n"
						+ "             ;::::;\r\n"
						+ "           ;::::; :;\r\n"
						+ "         ;:::::'   :;\r\n"
						+ "        ;:::::;     ;.\r\n"
						+ "       ,:::::'       ;           OOO\\\r\n"
						+ "       ::::::;       ;          OOOOO\\\r\n"
						+ "       ;:::::;       ;         OOOOOOOO\r\n"
						+ "      ,;::::::;     ;'         / OOOOOOO\r\n"
						+ "    ;:::::::::`. ,,,;.        /  / DOOOOOO\r\n"
						+ "  .';:::::::::::::::::;,     /  /     DOOOO\r\n"
						+ " ,::::::;::::::;;;;::::;,   /  /        DOOO\r\n"
						+ ";`::::::`'::::::;;;::::: ,#/  /          DOOO\r\n"
						+ ":`:::::::`;::::::;;::: ;::#  /            DOOO\r\n"
						+ "::`:::::::`;:::::::: ;::::# /              DOO\r\n"
						+ "`:`:::::::`;:::::: ;::::::#/               DOO\r\n"
						+ " :::`:::::::`;; ;:::::::::##                OO\r\n"
						+ " ::::`:::::::`;::::::::;:::#                OO\r\n"
						+ " `:::::`::::::::::::;'`:;::#                O\r\n"
						+ "  `:::::`::::::::;' /  / `:#\r\n"
						+ "   ::::::`:::::;'  /  /   `#");
			}

	}
	
				
	
	private double calcularDanio(Personaje p) {
		double dañoBase= this.getArma().getDaño();
		p.setVida(p.getVida() - dañoBase);
		if(this.getArma() instanceof Rezo ) {
			p.setVida(p.getVida()-(this.sabiduria));
		}
		
		return dañoBase;
	}

	@Override
	public String toString() {
		return "Curandero{" +
		           "sabiduria=" + sabiduria +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}

}
