package Actividad24Abstraccion;

public class Mago extends Personaje {
	private double inteligencia;

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	

	@Override
	public String toString() {
		return "Mago{" +
		           "inteligencia=" + inteligencia +
		           ", nombre='" + getNombre() + '\'' +
		           ", vida=" + getVida() +
		           ", arma='" + getArma() + '\'' +
		           '}';
	}
	@Override
	public void atacar(Personaje p) {
		if(this.getVida() >0) {
			System.out.println("¡Que la fuerza de los elementos se desate sobre mis enemigos!");
			System.out.println("        ____\r\n"
					+ "                  .'* *.'\r\n"
					+ "               __/_*_*(_\r\n"
					+ "              / _______ \\\r\n"
					+ "             _\\_)/___\\(_/_\r\n"
					+ "            / _((\\- -/))_ \\\r\n"
					+ "            \\ \\())(-)(()/ /\r\n"
					+ "             ' \\(((()))/ '\r\n"
					+ "            / ' \\)).))/ ' \\\r\n"
					+ "           / _ \\ - | - /_  \\\r\n"
					+ "          (   ( .;''';. .'  )\r\n"
					+ "          _\\\"__ /    )\\ __\"/_\r\n"
					+ "            \\/  \\   ' /  \\/\r\n"
					+ "             .'  '...' ' )\r\n"
					+ "              / /  |  \\ \\\r\n"
					+ "             / .   .   . \\\r\n"
					+ "            /   .     .   \\\r\n"
					+ "           /   /   |   \\   \\\r\n"
					+ "         .'   /    b    '.  '.\r\n"
					+ "     _.-'    /     Bb     '-. '-._\r\n"
					+ " _.-'       |      BBb       '-.  '-.\r\n"
					+ "(________mrf\\____.dBBBb.________)____)");
			System.out.println("El personaje: " + this.getNombre() + " va a atacar a " + p.getNombre() );
			double danio = calcularDanio(p);
			if(danio >0) {
				double vidaP = p.getVida();
				vidaP-=danio;
				System.out.println("El personaje: " + this.getNombre() + " va a hacer un daño de: " 
						+ danio + " a " + p.getNombre());
				
			
		}else {
			System.out.println("Debiste estudiar mas");
		}
		}
		else if (p.getVida() <0) {
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
		if(this.getArma() instanceof Hechizo ) {
			p.setVida(p.getVida()-(this.inteligencia));
		}
			
		return dañoBase;
	}
	
	

}
