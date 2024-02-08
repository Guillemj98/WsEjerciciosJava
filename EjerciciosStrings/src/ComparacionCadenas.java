import java.util.Scanner;

public class ComparacionCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Comparación de cadenas");
		System.out.println("Introduce el nombre del Usuario");
		System.out.println("Una pista dimunutivo de capitán");
		String usuario = sc.nextLine();
		String usuarioSinEspacios = usuario.trim();
	
		System.out.println("Introduce una contraseña");
		System.out.println("Te doy una pista ODIOironMAN69, pero juega con las mayus y las minus");
		String password = sc.nextLine();
		String passwordSinEspacios = password.trim();
		
		String usuarioValido = "Capi";
		String passwordValida = "odioAironMan69";
		if(usuarioSinEspacios.equalsIgnoreCase(usuarioValido) && passwordSinEspacios.equals(passwordValida)) {
			System.out.println("Bienvenido al programa Vengadorcito");
			
		}else {
			System.out.println("Error acceso denegado");
		}
		sc.close();
		

	}

}
