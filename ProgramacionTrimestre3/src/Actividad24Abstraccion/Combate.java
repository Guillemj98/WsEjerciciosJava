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
		System.out.println("----EMPIEZA LA BATALLA POR EL TESOSORO DENTRO DEL CASTILLO----");
		System.out.println("           ___    /\\\r\n"
				+ "                  `---|  /%%\\/\\\r\n"
				+ "                     ,`./,--.\\%\\\r\n"
				+ "                    /%%%\\|  |--.\\\r\n"
				+ "                   /,---.|[]|  |\r\n"
				+ "                    |]_'||__| [|\r\n"
				+ "                    ||]|[|]|[| |\r\n"
				+ "               ._..-':\\._ ''/`-'.._.\r\n"
				+ "        ._._.  |  _.:\"'|-'`|-..__.:|  ._._.\r\n"
				+ "        '._,'_.''_    _|  _| .-. ``'._'._.'\r\n"
				+ "         | |_  ,'.\\  '-| '-| |_|   [] _| |\r\n"
				+ "    _____|]|-'|,++:_   ||] |_     _  '-|[|_________\r\n"
				+ "    ~  ,-|`|  |+++|-'  |  _|-'   '-'   |.|  ~   SSt\r\n"
				+ "      ~) |_|__||  |    ; '-:         __|_|`-.___ ~\r\n"
				+ "    _  \\-._..''`--:.__/-'   \\__..--''    __...-,'__\r\n"
				+ "     `-,-'    _.-'-.   `---''   _____..')..-~~'|\\\r\n"
				+ "       `-._.-'`-._'`)         ,'`_..-~~' ~_____;'\r\n"
				+ "            `. ~~ `.`.________`.( ~~  ___)\r\n"
				+ "              )    ~`.\\ '  '    ,'  ~\\\r\n"
				+ "            ,'|  ~    ')__:__:_( ~   |)\r\n"
				+ "             `-...______________....-'");
			do {		
				p1.atacar(p2);
				System.out.println("Pulsa enter para continuar");
				sc.nextLine();
				System.out.println( p2.getNombre() + " HP: " + p2.getVida());
				p2.atacar(p1);
				System.out.println("Pulsa enter para continuar");
				sc.nextLine();
				System.out.println( p1.getNombre() + " HP: " + p1.getVida());
				if(p1.getVida()<=0) {
					System.out.println(p1.getNombre()+
							"	\" ESTA MUERTOO \"\r\n"
							+ "+ \"             ...\\r\\n\"\r\n"
							+ "+ \"             ;::::;\\r\\n\"\r\n"
							+ "+ \"           ;::::; :;\\r\\n\"\r\n"
							+ "+ \"         ;:::::'   :;\\r\\n\"\r\n"
							+ "+ \"        ;:::::;     ;.\\r\\n\"\r\n"
							+ "+ \"       ,:::::'       ;           OOO\\\\\\r\\n\"\r\n"
							+ "+ \"       ::::::;       ;          OOOOO\\\\\\r\\n\"\r\n"
							+ "+ \"       ;:::::;       ;         OOOOOOOO\\r\\n\"\r\n"
							+ "+ \"      ,;::::::;     ;'         / OOOOOOO\\r\\n\"\r\n"
							+ "+ \"    ;:::::::::`. ,,,;.        /  / DOOOOOO\\r\\n\"\r\n"
							+ "+ \"  .';:::::::::::::::::;,     /  /     DOOOO\\r\\n\"\r\n"
							+ "+ \" ,::::::;::::::;;;;::::;,   /  /        DOOO\\r\\n\"\r\n"
							+ "+ \";`::::::`'::::::;;;::::: ,#/  /          DOOO\\r\\n\"\r\n"
							+ "+ \":`:::::::`;::::::;;::: ;::#  /            DOOO\\r\\n\"\r\n"
							+ "+ \"::`:::::::`;:::::::: ;::::# /              DOO\\r\\n\"\r\n"
							+ "+ \"`:`:::::::`;:::::: ;::::::#/               DOO\\r\\n\"\r\n"
							+ "+ \" :::`:::::::`;; ;:::::::::##                OO\\r\\n\"\r\n"
							+ "+ \" ::::`:::::::`;::::::::;:::#                OO\\r\\n\"\r\n"
							+ "+ \" `:::::`::::::::::::;'`:;::#                O\\r\\n\"\r\n"
							+ "+ \"  `:::::`::::::::;' /  / `:#\\r\\n\"\r\n"
							+ "+ \"   ::::::`:::::;'  /  /   `#");
				}
				if(p2.getVida()<=0) {
					System.out.println(p2.getNombre()+
							"						\" ESTA MUERTOO \"\r\n"
							+ "+ \"             ...\\r\\n\"\r\n"
							+ "+ \"             ;::::;\\r\\n\"\r\n"
							+ "+ \"           ;::::; :;\\r\\n\"\r\n"
							+ "+ \"         ;:::::'   :;\\r\\n\"\r\n"
							+ "+ \"        ;:::::;     ;.\\r\\n\"\r\n"
							+ "+ \"       ,:::::'       ;           OOO\\\\\\r\\n\"\r\n"
							+ "+ \"       ::::::;       ;          OOOOO\\\\\\r\\n\"\r\n"
							+ "+ \"       ;:::::;       ;         OOOOOOOO\\r\\n\"\r\n"
							+ "+ \"      ,;::::::;     ;'         / OOOOOOO\\r\\n\"\r\n"
							+ "+ \"    ;:::::::::`. ,,,;.        /  / DOOOOOO\\r\\n\"\r\n"
							+ "+ \"  .';:::::::::::::::::;,     /  /     DOOOO\\r\\n\"\r\n"
							+ "+ \" ,::::::;::::::;;;;::::;,   /  /        DOOO\\r\\n\"\r\n"
							+ "+ \";`::::::`'::::::;;;::::: ,#/  /          DOOO\\r\\n\"\r\n"
							+ "+ \":`:::::::`;::::::;;::: ;::#  /            DOOO\\r\\n\"\r\n"
							+ "+ \"::`:::::::`;:::::::: ;::::# /              DOO\\r\\n\"\r\n"
							+ "+ \"`:`:::::::`;:::::: ;::::::#/               DOO\\r\\n\"\r\n"
							+ "+ \" :::`:::::::`;; ;:::::::::##                OO\\r\\n\"\r\n"
							+ "+ \" ::::`:::::::`;::::::::;:::#                OO\\r\\n\"\r\n"
							+ "+ \" `:::::`::::::::::::;'`:;::#                O\\r\\n\"\r\n"
							+ "+ \"  `:::::`::::::::;' /  / `:#\\r\\n\"\r\n"
							+ "+ \"   ::::::`:::::;'  /  /   `#");
				}
			}while(p1.getVida() >0 && p2.getVida()> 0);
			System.out.println("Final del combate");
		
		}

	}

