package _04_Ejercicio14;

public class invocarEquipo {

	public static void main(String[] args) {
		
		Equipo e1 = new Equipo("Madrid", new String []{"ronaldo","falcao","messi"} );
		Equipo e2 = new Equipo("Madrid", new String []{"Ronaldo","Messi","Falcao"} );
		
		
		System.out.println(e2.sonIguales(e1));
		

	}

}
