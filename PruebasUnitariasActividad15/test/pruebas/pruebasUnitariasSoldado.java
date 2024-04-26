package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Jugador;
import entidades.Soldado;

class pruebasUnitariasSoldado {
	private Soldado s1;
	private Soldado s2;

	@BeforeEach
	void crearSoldado() {
		System.out.println("Antes de la clase");
		s1 = new Soldado();
	}
	@BeforeEach
	void crearSoldado2() {
		s2 = new Soldado();
	}
	@Test
	void puedeDisparar1() {
		int balas = 2;
		s1.setNumeroBalas(balas);
		assertTrue(s1.puedeDisparar());
	}
	@Test
	void puedeDisparar2() {
		int balas = -2;
		s1.setNumeroBalas(balas);
		assertFalse(s1.puedeDisparar());
	}
	@Test
	void puedeDisparar3() {
		int balas = 0;
		s1.setNumeroBalas(balas);
		assertFalse(s1.puedeDisparar());
	}
	@Test
	void disparar1() {
		int numeroBalas = 4;	
		int numeroBalasEsperado = 3;
		s1.setNumeroBalas(numeroBalas);
		s2.setEstaMuerto(false);
		s1.disparar(s2);
		assertEquals(numeroBalasEsperado,s1.getNumeroBalas());
		assertTrue(s2.isEstaMuerto());
	}
	@Test
	void disparar2() {
		int numeroBalas = -2;	
		int numeroBalasEsperado = -3;
		s1.setNumeroBalas(numeroBalas);
		s2.setEstaMuerto(false);
		s1.disparar(s2);
		assertEquals(numeroBalasEsperado,s1.getNumeroBalas());
		assertTrue(s2.isEstaMuerto());
	}
	
	

}
