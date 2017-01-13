package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testConstructorPorDefecto() {

		Libro libroNuevo = new Libro();
		assertEquals(0, libroNuevo.getNumeroPaginas());
		assertEquals("desconocido", libroNuevo.getTitulo());
		assertEquals("anonimo", libroNuevo.getAutor());
	}

	@Test
	public void testContructorConParametros() {

		Libro l = new Libro("java 7", 324);

		assertEquals("java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(324, l.getNumeroPaginas());

		// paginas negativas
		l = new Libro("java 7", -1);
		assertEquals("java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());
	}

	@Test
	public void testTitulo() {
		Libro libroJava = new Libro();
		libroJava.setTitulo("java 7");

		assertEquals("java 7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();
		// numero paginas positivo
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());

		// numero paginas negativo == 0
		l.setNumeroPaginas(-300);
		assertEquals(0, l.getNumeroPaginas());

	}

}
