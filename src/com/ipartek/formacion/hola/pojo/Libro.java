package com.ipartek.formacion.hola.pojo;

public class Libro {

	private String titulo;
	private String autor;
	private int numeroPaginas;

	/*
	 * Constructores
	 * 
	 * sirven para instanciar objetos en la clase <br> tienen el mismo nombre
	 * que la clase no hace falta especificar el <code>return</code>
	 * 
	 * sobrecarga: es un metodo con el mismo nombre y mismo return, <br> pero
	 * con diferentes parametros
	 */
	/**
	 * Contructor basico de libro que empieza con los atributos inicializados a
	 * titulo desconocido, autor anonimo y numeroPaginas 0
	 */
	public Libro() {
		super();
		this.titulo = "desconocido";
		this.numeroPaginas = 0;
		this.autor = "anonimo";

	}

	// Constructores con parametros
	public Libro(String titulo, String autor, int numeroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public Libro(String titulo, int numeroPaginas) {
		super();
		this.titulo = titulo;
		this.setNumeroPaginas(numeroPaginas);
		this.autor = "anonimo";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * Getter de numeroPaginas que controla que paginas sea 0 en caso de
	 * negativo
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = (numeroPaginas > 0) ? numeroPaginas : 0;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}

}
