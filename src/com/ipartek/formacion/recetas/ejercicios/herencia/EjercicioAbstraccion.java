package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * Comprobar que solo podemos instanciar objetos de las Clases que no sean
 * abstractas
 * 
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {

		// ObjetoGrafico og = new ObjetoGrafico(0,0);
		Linea linea = new Linea(0, 0);
		// Circulo circulo = new Circulo(0,0);
		// En principio no se puede instancias un objeto de clase abstrado
		// a menos que se implemente en el momento de la instanciacion
		// clase anonima
		Circulo circulo = new Circulo(0, 0) {
			@Override
			public void dibujar() {
				System.out.println("Dibujando circulo");
			}
		};

		CirculoNoAbstracto c = new CirculoNoAbstracto(0, 0);
	}

}
