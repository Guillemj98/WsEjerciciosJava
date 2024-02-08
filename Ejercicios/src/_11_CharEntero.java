
public class _11_CharEntero {
	public static void main(String[] args) {
		char letra = 'b';
		int numeroEntero = letra;
		System.out.println(numeroEntero);
		// si te deja hacer el intercambio 
		// pero transforma la letra en el numero
		// con el cual se representa en el codigo ASCII
		 numeroEntero = (int)letra;
		 System.out.println(numeroEntero);
		 // aun haciendo cast te transforma la letra 
		 // en el codigo ASCII
	}

}
