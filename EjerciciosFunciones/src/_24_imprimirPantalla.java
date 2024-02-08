
public class _24_imprimirPantalla {

	public static void main(String[] args) {
		menu();
		menu();
		menu();
		eligeMenu();

	}

	public static void menu() {
		System.out.println("Entrar en la apliacación");
		System.out.println("Registarse en la aplicación");
		System.out.println("Salir de la aplicación");

	}
	public static void eligeMenu() {
		// Usando \n cuando imprimos por consola \n hace un salto de linea
		System.out.print("Entrar en la aplicación \n");
		System.out.print("Registarse en la aplicación\n");
		System.out.print("Salir de la aplicación\n");
	}

}
