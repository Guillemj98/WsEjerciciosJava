
public class _08_FlotanteEntero {

	public static void main(String[] args) {
		float numeroFloat = 2.53F;
		// int numeroEntero = numeroFloat;
		// en este caso necesitamos hacer un cast
		int numeroEntero = (int) numeroFloat;
		System.out.println(numeroEntero);
		// ahora si que deja con el cast,
		// pero hemos perdido información

	}

}
