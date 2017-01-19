package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testBubbleSort() {
		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };

		int[] aOrdenado = Utilidades.bubbleSort(aDesordenado);
		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(2, aOrdenado[2]);
		assertEquals(3, aOrdenado[3]);
		assertEquals(4, aOrdenado[4]);
		assertEquals(5, aOrdenado[5]);
		assertEquals(6, aOrdenado[6]);
		assertEquals(7, aOrdenado[7]);
		assertEquals(8, aOrdenado[8]);
		assertEquals(9, aOrdenado[9]);
	}

	@Test
	public void testSortAscendente() {
		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = aDesordenado;
		Arrays.sort(aOrdenado);
		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(2, aOrdenado[2]);
		assertEquals(3, aOrdenado[3]);
		assertEquals(4, aOrdenado[4]);
		assertEquals(5, aOrdenado[5]);
		assertEquals(6, aOrdenado[6]);
		assertEquals(7, aOrdenado[7]);
		assertEquals(8, aOrdenado[8]);
		assertEquals(9, aOrdenado[9]);
	}

	@Test
	public void testSortDescendente() {
		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < aDesordenado.length; i++) {
			list.add(aDesordenado[i]);
		}
		;
		Collections.sort(list, Collections.reverseOrder());
		int[] aOrdenado = new int[10];
		for (int i = 0; i < aDesordenado.length; i++) {
			aOrdenado[i] = list.get(i);
		}
		;
		// Collections.sort(aOrdenado, Collections.reverseOrder());
		assertEquals(9, aOrdenado[0]);
		assertEquals(8, aOrdenado[1]);
		assertEquals(7, aOrdenado[2]);
		assertEquals(6, aOrdenado[3]);
		assertEquals(5, aOrdenado[4]);
		assertEquals(4, aOrdenado[5]);
		assertEquals(3, aOrdenado[6]);
		assertEquals(2, aOrdenado[7]);
		assertEquals(1, aOrdenado[8]);
		assertEquals(0, aOrdenado[9]);
	}

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
