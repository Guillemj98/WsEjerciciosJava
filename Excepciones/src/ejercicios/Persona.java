package ejercicios;

public class Persona {
	private int  edad;
	private String nombre;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws EdadNoPermitidaException {
		if(edad < 0) {
			throw new EdadNoPermitidaException();
		}
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int edad, String nombre) throws RuntimeException {
		super();
		this.edad = edad;
		if(nombre.isBlank()) {
			throw new NombreVacioNoPermitidoRuntimeException();
		}
		if(nombre.equals(null)) {
			throw new IllegalArgumentException();
		}
		this.nombre = nombre;
	}
	public Persona() {
		super();
	}
	

}
