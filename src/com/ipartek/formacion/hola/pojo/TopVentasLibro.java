package com.ipartek.formacion.hola.pojo;

public class TopVentasLibro {

	public static void main(String[] args) {

		/*
		 * Metodo cutre
		 * 
		 * Libro libro1 = new Libro("Amor y asco", "Satebi", 120); Libro libro2
		 * = new Libro("Animales fantasticos y donde encontrarlos", "JK Rowling"
		 * , 600); Libro libro3 = new Libro("El laberinto de los espiritus",
		 * "Carlos Ruiz Zafon", 1000); Libro libro4 = new Libro(
		 * "Cuando abas el paracaidas", "DEFREDS JOSE. A. GOMEZ IGLESIAS", 150);
		 * Libro libro5 = new Libro("TODO ESTO TE DARE", "DOLORES REDONDO",
		 * 1221); Libro libro6 = new Libro(
		 * "SE PROHÍBE MANTENER AFECTOS DESMEDIDOS EN LA PUERTA DE LA PENSIÓN",
		 * "MAMEN SANCHEZ", 111); Libro libro7 = new Libro("CASI SIN QUERER",
		 * "DEFREDS JOSE. A. GOMEZ IGLESIAS", 210); Libro libro8 = new
		 * Libro("PATRIA", "FERNANDO ARAMBURU", 500); Libro libro9 = new Libro(
		 * "CASI SIN QUERER", "DEFREDS JOSE. A. GOMEZ IGLESIAS", 123); Libro
		 * libro10 = new Libro("CON TAL DE VERTE VOLAR", "MIGUEL GANE", 10000);
		 * 
		 * System.out.println(libro1.toString());
		 * System.out.println(libro2.toString());
		 * System.out.println(libro3.toString());
		 * System.out.println(libro4.toString());
		 * System.out.println(libro5.toString());
		 * System.out.println(libro6.toString());
		 * System.out.println(libro7.toString());
		 * System.out.println(libro8.toString());
		 * System.out.println(libro9.toString());
		 * System.out.println(libro10.toString());
		 */

		Libro[] topVentas = { new Libro("Amor y asco", "Satebi", 120),
				new Libro("Animales fantasticos y donde encontrarlos", "JK Rowling", 600),
				new Libro("El laberinto de los espiritus", "Carlos Ruiz Zafon", 1000) };

		for (Libro libro : topVentas) {
			System.out.println(libro.toString());
		}
	}

}
