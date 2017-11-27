package Topicos.par;

import static org.junit.Assert.*;

import org.junit.Test;

public class frame {


	
	@Test
	public void frameTest(){
		ronda ronda = new ronda();
		assertEquals(10, ronda.sumar());		

	@Test	

	public void juegoTest() {
		juego juego = new juego();
		assertEquals(72, juego.puntaje());
	}

	@Test
	public void plenoTest() {
		ronda ronda = new ronda();
		int[] esperado= {10, 0};
		assertArrayEquals(esperado, ronda.getRonda());		
	}
	
	@Test
	public void juegoExtraTest() {
		juego juego = new juego();	
		boolean res = juego.extra();
		assertTrue(res);		
			
	}
	
	
	

		
	}

}
