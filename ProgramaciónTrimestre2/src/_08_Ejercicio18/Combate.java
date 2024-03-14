package _08_Ejercicio18;

import java.util.Scanner;

public class Combate {
	private Muniemon m1;
	private Muniemon m2;	

	public Muniemon getM1() {
		return m1;
	}

	public void setM1(Muniemon m1) {
		this.m1 = m1;
	}

	public Muniemon getM2() {
		return m2;
	}

	public void setM2(Muniemon m2) {
		this.m2 = m2;
	}

	public Combate(Muniemon m1, Muniemon m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
	}

	// Esto es el metodo del combate que quiere decir
	// que esto es el sitema de turnos del combate 
	// basado por las velocidades de los muñones.
	public void empezarCombate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Empieza el combate pokemon");
		
		if(this.m1.getVelocidad()> this.m2.getVelocidad()) {
			do {
			this.m1.ataqueMunion(m2);
			System.out.println("Pulse enter para continuar el combate");
			sc.nextLine();
			this.m2.ataqueMunion(m1);
		
		}while(this.m1.getVida()>0 && this.m2.getVida()>0) ;
		}	
		if(this.m2.getVelocidad()> this.m1.getVelocidad()) {
			do {
				this.m2.ataqueMunion(m1);
				System.out.println("Pulse enter para continuar el combate");
				sc.nextLine();
				this.m1.ataqueMunion(m2);
			}while(this.m1.getVida()>0 && this.m2.getVida()>0);
			}
	
	}
}

/*double ataqueFinal = 0;
		ataqueFinal = this.m1.getAtaque()-this.m2.getDefensa();
		if(this.m1.getVida()<=0) {
			System.out.println("Tu " + this.m1.getNombre() + " esta debilitado y no puede atacar");
		}else if(this.m1.getVida()>0) {
			if(ataqueFinal <=0) {
				System.out.println("El ataque de: " + this.m1.getNombre() + 
						" es muy debil y no le hace daño a: " + this.m2.getNombre());
			}else if (ataqueFinal >0){
				System.out.println("El ataque de " + this.m1.getNombre() + " es efectivo");
			}
		}
			
		if(this.m2.getVida()<=0) {
			System.out.println("Tu " + this.m2.getNombre() + " esta debilitado y no puede atacar");
		}else if(this.m2.getVida()>0) {
			if(ataqueFinal <=0) {
				System.out.println("El ataque de: " + this.m2.getNombre() + 
						" es muy debil y no le hace daño a: " + this.m2.getNombre());
			}else if (ataqueFinal >0){
				System.out.println("El ataque de " + this.m2.getNombre() + " es efectivo");
			}
		}
		Posible mejora del combate
 */