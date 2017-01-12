package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.Libro;

/**
 * Clase para la creacion de un hola mundo
 * 
 * @author curso
 *
 */
public class Hola {
	/**
	 * metodo 'main' para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */
	public static void main(String[] args) {

		// operador ternario
		// asignar un valor a una variable en funcion de una 'condicion'
		// (condicion) ? true : false;
		int edad = (3 > 100) ? 18 : 34;

		// declarar variable
		int variableEntera;
		boolean variableBooleana;

		float dineroCuenta = 10.23f; // 10,23€
		float dineroCuenta2 = (float) 10.23;

		char caracter = 'p';
		String cadena = "dobles";

		System.out.println("Hola mundo");

		// Instanciar un objeto de la clase Libro
		Libro libroJava = new Libro();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Roberto Montero";
		System.out.println(libroJava.describete());

		/*
		 * Añadimos meter valor a escribir for (int i = 0; i < 10; i++) {
		 * libroJava.escribir(); }
		 */
		libroJava.escribir(12);
		System.out.println(libroJava.describete());
		Libro libroMySql = new Libro();
		libroMySql.numeroPaginas = 725;
		libroMySql.nombre = "PHP y MySQL";
		libroMySql.autor = "Julio Verne";
		libroMySql.escribir(0);
		System.out.println(libroMySql.describete());

		Libro libroAnillos = new Libro();
		libroAnillos.numeroPaginas = 5000;
		libroAnillos.nombre = "El señor de los anillos";
		libroAnillos.autor = "John Ronald Reuel Tolkien";
		System.out.println(libroAnillos.describete());

	}

}
