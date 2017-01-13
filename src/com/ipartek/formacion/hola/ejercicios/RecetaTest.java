package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaTest {

	@Test
	public void testGlutenFree() {
		Ingrediente[] aIngredientes = new Ingrediente[5];
		aIngredientes[0] = new Ingrediente(4f, "patatas", false);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", false);
		aIngredientes[2] = new Ingrediente(2f, "cebolletas", false);
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", false);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", false);
		Receta prueba = new Receta();
		prueba.setIngredientes(aIngredientes);
		assertTrue(prueba.isGlutenFree());

		aIngredientes[0] = new Ingrediente(4f, "patatas", false);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", true);
		aIngredientes[2] = new Ingrediente(2f, "cebolletas", false);
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", true);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", false);
		assertTrue(prueba.isGlutenFree());

		aIngredientes[0] = new Ingrediente(4f, "patatas", false);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", false);
		aIngredientes[2] = null;
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", true);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", false);
		assertTrue(prueba.isGlutenFree());

	}

}
