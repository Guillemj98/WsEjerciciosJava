package interfaces_basico;

// Esto sirve para que el compilador chequea que es una interfaz funcional.
@FunctionalInterface 
public interface Operable {
	// Cuando tiene un unico metodo se llama una interfaz funcional.
	double operar(double d1, double d2);

}
