import java.util.Random;
import java.util.Scanner;

public class _05_AdivinaNumero {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		 int valorDado = r.nextInt(10)+1;
		 System.out.println(valorDado);
		 System.out.println("-----------------ADVINA EL NUMERO--------");
		 System.out.println("VAMOS A GENERAR UN NUMERO ALEATORIO, Y TU VAS A TENER QUE ADIVINARLO");
		 System.out.println("Introduce un numero");
		 int numero1 = sc.nextInt();
		 boolean flag = true;
		 do {
			 if(numero1<valorDado) {
				 System.out.println("Te has quedado corto");
			 System.out.println("Introduce un numero");
			 numero1 = sc.nextInt();
			 }
			 if(numero1>valorDado){
				 System.out.println("Te has pasado");				 
				 System.out.println("Introduce un numero");
				 numero1 = sc.nextInt();
			 }			 
			 if(numero1== valorDado) {
				 System.out.println("---HAS GANADOOO----" + "el numero dado era: " +  valorDado);
				 flag= false;
			 }
		 }while(flag==true);		 

	}

}
