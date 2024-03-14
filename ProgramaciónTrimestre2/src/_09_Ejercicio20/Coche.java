package _09_Ejercicio20;

public class Coche {
	private int id ;
	private String matricula;
	private String marca;
	private static int contador;
	
	public static final String TOYOTA = "TOYOTA";
	public static final String RENAULT = "RENAULT";
	
	
	
	public Coche() {
		super();
		this.id = contador;
		contador++;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
		
	}
	public int getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static int getContador() {
		return contador;
	}

	public static String getToyota() {
		return TOYOTA;
	}

	public static String getRenault() {
		return RENAULT;
	}

	public static void valorActualId() {
		
		System.out.println(contador);
	
	}
	public static void resetearContador() {
		contador =0;
		
	}
	
	

}
