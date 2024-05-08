package Actividad24Abstraccion;

public class Guerrero extends Personaje {
	private double fuerza;

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		if(this.getVida() >0) {
			System.out.println("En la batalla, se revela la verdadera fortaleza de un hombre.");
			System.out.println("                 _.--.    .--._\r\n"
					+ "                 .\"  .\"      \".  \".\r\n"
					+ "                ;  .\"    /\\    \".  ;\r\n"
					+ "                ;  '._,-/  \\-,_.`  ;\r\n"
					+ "                \\  ,`  / /\\ \\  `,  /\r\n"
					+ "                 \\/    \\/  \\/    \\/\r\n"
					+ "                 ,=_    \\/\\/    _=,\r\n"
					+ "                 |  \"_   \\/   _\"  |\r\n"
					+ "                 |_   '\"-..-\"'   _|\r\n"
					+ "                 | \"-.        .-\" |\r\n"
					+ "                 |    \"\\    /\"    |\r\n"
					+ "                 |      |  |      |\r\n"
					+ "         ___     |      |  |      |     ___\r\n"
					+ "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\r\n"
					+ "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\r\n"
					+ " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\r\n"
					+ "!     \\  \\  \\   \\                  /   /  /  /     !\r\n"
					+ ":      \\  \\  \\   \\                /   /  /  /      ");
			System.out.println("El personaje: " + this.getNombre() + " va a atacar a " + p.getNombre() );
			double danio = calcularDanio(p);
			if(danio >0) {
				double vidaP = p.getVida();
				vidaP-=danio;
				System.out.println("El personaje: " + this.getNombre() + " va a hacer un daño de: " 
						+ danio + " a " + p.getNombre());
				
			}else {
				System.out.println("No entrenaste lo suficiente");
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
		if(this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			p.setVida(p.getVida()-(this.fuerza));
		}
			
		return dañoBase;
	}

	@Override
	public String toString() {
		return "Guerrero{" +
		           "fuerza=" + fuerza +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}
	
	
	
}
