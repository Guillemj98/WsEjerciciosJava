package ejercicios;

public class EdadNoPermitidaException extends Exception {

	public String getLocalizedMessage() {
		return "Excepcion de edad negativa";
	}

}
