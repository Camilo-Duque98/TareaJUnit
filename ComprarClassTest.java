package net.codejava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComprarClassTest {
	
	@Test
	void testSetCafeLeche() {
		//fail("Not yet implemented");
		ComprarClass comprar = new ComprarClass();
		assertEquals(true,comprar.setCafeLeche(500));
		assertEquals(false,comprar.setCafeLeche(400));
	}

	@Test
	void testSetCapuccino() {
		//fail("Not yet implemented");
		ComprarClass comprar = new ComprarClass();
		assertEquals(true, comprar.setCapuccino(1000));
		assertEquals(false,comprar.setCapuccino(400));
	}

	@Test
	void testSetMocaccino() {
		//fail("Not yet implemented");
		ComprarClass comprar = new ComprarClass();
		assertEquals(true, comprar.setMocaccino(700));
		assertEquals(false,comprar.setMocaccino(400));
	}

	@Test
	void testSetCafeCortado() {
		//fail("Not yet implemented");
		ComprarClass comprar = new ComprarClass();
		assertEquals(true, comprar.setCafeCortado(300));
		assertEquals(false,comprar.setCafeCortado(100));
	}
	@Test
	void testComprar() {
		InventoryClass Inventario = new InventoryClass();
		assertEquals("Su café con leche está listo, el vuelto es de 500 pesos",Inventario.Comprar());//Cafe con leche
		assertEquals("Su Capuccino está listo, el vuelto es de 400 pesos",Inventario.Comprar());//Capuccino
		assertEquals("Su Moccaccino está listo, el vuelto es de 300 pesos",Inventario.Comprar());//Mocaccino
		assertEquals("Su Cafe cortado está listo, el vuelto es de 700 pesos",Inventario.Comprar());//Cafe cortado
	}

}
