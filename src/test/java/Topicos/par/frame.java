package Topicos.par;

import static org.junit.Assert.*;

import org.junit.Test;

public class frame {

	//@Test
	//public void test() {
		//fail("Not yet implemented");
		
	//}
	
	@Test
	public void frameTest(){
		ronda ronda = new ronda();
		assertEquals(8, ronda.sumar());		
		
	}
	
	@Test
	public void juegoTest() {
		juego juego = new juego();
		assertEquals(70, juego.puntaje());
	}

	@Test
	public void plenoTest() {
		ronda ronda = new ronda();
		int rond []= {10,0};
		assertEquals(rond, ronda.comparar());		
	}
}
