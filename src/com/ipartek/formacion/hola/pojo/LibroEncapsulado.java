package com.ipartek.formacion.hola.pojo;

/**
 * Clase {@code Libro} publica para representar un Libro con atributos:
 * numeroPaginas, nombre y autor
 * 
 * @author curso
 *
 */
public class LibroEncapsulado {

	// Atributos
	/**
	 * int numeroPaginas numero paginas que contiene el {@code Libro}
	 */
	public int numeroPaginas;
	/**
	 * String nombre nombre del libro
	 */
	public String nombre;
	/**
	 * String autor nombre del autor del {@code Libro}
	 */
	public String autor;

	// Metodos o Funciones
	/**
	 * Muestra por pantalla los atributos del {@code Libro}
	 */
	public String describete() {
		return "Descripcion: '" + this.nombre + "' tiene " + this.numeroPaginas + " paginas. Escrito por " + this.autor;
	}

	/**
	 * Aumentamos el numero de paginas
	 * 
	 * @param numPaginas
	 *            int numero de paginas nuevas escritas
	 */
	public void escribir(int numPaginas) {
		// this.numeroPaginas = this.numeroPaginas + 1;
		this.numeroPaginas += numPaginas;
	}
}
