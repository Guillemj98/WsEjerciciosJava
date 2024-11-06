package modelo.gestor;

public class GestorServidor {
	
	public String realizarOperacion (String stringRecibido) {
		int numero1 =0;
		int numero2 =0;
		String operacion = null;
		String[] elecciones = stringRecibido.split("_");
		operacion = elecciones[0];//operacion
		numero1 = Integer.parseInt(elecciones[1]);//numero1
		numero2 = Integer.parseInt(elecciones[2]);//numero2
		switch (operacion) {
		case "A":
			return String.valueOf(numero1 + numero2);
			
		case "B":
			return String.valueOf(numero1 - numero2);
			
		case "C":
			return String.valueOf(numero1 * numero2);
		case "D":
			return String.valueOf(numero1 / numero2);

		
		}
		return operacion;
	}

}
