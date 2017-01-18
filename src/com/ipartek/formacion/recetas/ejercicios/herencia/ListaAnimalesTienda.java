package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Ejercicio para aprender a usar la herencia e interfaces <br>
 * Capitulo 8 del libro Java 7.</br>
 * 
 * @author Curso
 *
 */

public class ListaAnimalesTienda {

	public static void main(String[] args) {

		ArrayList<Vendible> animalesVender = new ArrayList<Vendible>();

		Burro platero = new Burro("Burro Hispano", 30, "Platero");
		Burro amador = new Burro("Burro cantador", 500000, "Amador");
		Pajaro kiwi = new Pajaro("Ave que no vuela", 4, false);
		Pajaro buitre = new Pajaro("Carroñero cañonero", 100, true);

		animalesVender.add(platero);
		animalesVender.add(amador);
		animalesVender.add(kiwi);
		animalesVender.add(buitre);

		for (Vendible animal : animalesVender) {
			System.out.println("------------");
			if (animal instanceof Burro) {
				((Burro) animal).generarFactura();
			} else if (animal instanceof Pajaro) {
				((Pajaro) animal).generarFactura();
			} else {
				System.out.println("****** NO SABEMOS QUE ERES ******" + animal.toString());
			}
		}
	}
}
