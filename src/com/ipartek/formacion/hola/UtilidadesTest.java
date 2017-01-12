package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {
		// fail("Not yet implemented");
		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// crear array con todo false
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar 1000 numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// recorrer array y comprobar todo true
		for (int i = 0; i < NUMERO_MAXIMO; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(1 < 2);
	}

	@Test
	public void testSumaTonta() {

		assertEquals("no suma bien", 5, Utilidades.sumatonta(2, 3));
		assertEquals(0, Utilidades.sumatonta(-2, 3));
		assertEquals(0, Utilidades.sumatonta(2, -3));
		assertEquals(0, Utilidades.sumatonta(-2, -3));
		assertEquals(">100 retorna 0", 0, Utilidades.sumatonta(100, 1));

	}
}
