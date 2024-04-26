package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Jugador;

class pruebasUnitariasJugador {
	private Jugador j1;
	
	@BeforeEach
	void crearJugador() {
		System.out.println("Antes de la clase");
		j1 = new Jugador();
	}

	@Test
	void ponerDorsalDentroDelRango() {
		int dorsal = 2;
		int resultadoEsperado =2;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void ponerDorsalFueraDelRango() {
		int dorsal = 31;
		int resultadoEsperado = -1;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void estaExpulsado1() {
		int numeroTarjetaAmarillas = 1;
		int numeroTarjetasRojas = 1;
		j1.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j1.setNumeroTarjetasRojas(numeroTarjetasRojas);
		assertTrue(j1.estaExpulsado());
	}
	@Test
	void estaExpulsado2() {
		int numeroTarjetaAmarillas = 0;
		int numeroTarjetasRojas = 0;
		j1.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j1.setNumeroTarjetasRojas(numeroTarjetasRojas);
		assertFalse(j1.estaExpulsado());
	}
	@Test
	void estaExpulsado3() {
		int numeroTarjetaAmarillas = 0;
		int numeroTarjetasRojas = 1;
		j1.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j1.setNumeroTarjetasRojas(numeroTarjetasRojas);
		assertTrue(j1.estaExpulsado());
	}
	@Test
	void estaExpulsado4() {
		int numeroTarjetaAmarillas = 2;
		int numeroTarjetasRojas = 0;
		j1.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j1.setNumeroTarjetasRojas(numeroTarjetasRojas);
		assertTrue(j1.estaExpulsado());
	}
	@Test
	void probarSetDorsal() {
		int dorsal = 2;
		j1.setDorsal(dorsal);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, j1.getDorsal());
	}
	@Test
	void probarGetAmarillas() {
		int amarillas = 1;
		j1.setNumeroTarjetasAmarillas(amarillas);
		assertEquals(amarillas, j1.getNumeroTarjetasAmarillas());
	}
	@Test
	void probarGetRojas() {
		int rojas = 1;
		j1.setNumeroTarjetasRojas(rojas);
		assertEquals(rojas, j1.getNumeroTarjetasRojas());
	}
	
	
	

}
