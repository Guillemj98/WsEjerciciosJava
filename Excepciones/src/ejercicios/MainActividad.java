package ejercicios;

public class MainActividad {

	public static void main(String[] args) {
		String palabraConcatenada = "";
		String palabraConcatenada2 = "";
		try {
			palabraConcatenada = concatenarPalabras(null, "Pepe");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println(palabraConcatenada);
		

		palabraConcatenada2 = concatenarPalabrasUnChecked("Manolo", "Pepe");

		System.out.println(palabraConcatenada2);
		
		Persona persona = new Persona();
		
		
		try {
			persona.setEdad(-10);
			
		}catch(EdadNoPermitidaException e) {
			e.printStackTrace();
		}
		System.out.println(persona.getEdad());
		
		try {
			persona.setEdad(10);
			
		}catch(EdadNoPermitidaException e) {
			e.printStackTrace();
		}
		
		System.out.println(persona.getEdad());
		
		Persona p2 = new Persona();
		
		try {
			p2.setNombre(" ");
		}catch(NombreVacioNoPermitidoRuntimeException nv) {
			nv.printStackTrace();
		}
		
		try {
			p2.setNombre(null);
		}catch(IllegalArgumentException ia) {
			ia.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

	}
	public static String concatenarPalabras(String s1, String s2) throws Exception {	
		String palabraConcatenada = s1.concat(s2);
		return palabraConcatenada;
		
	}
	public static String concatenarPalabrasUnChecked(String s1, String s2) throws RuntimeException {	
		String palabraConcatenada = s1.concat(s2);
		return palabraConcatenada;
		
	}

}
