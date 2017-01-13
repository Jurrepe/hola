package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertFalse;
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
		assertTrue("caso 1 sin gluten", prueba.isGlutenFree());

		aIngredientes[0] = new Ingrediente(4f, "patatas", false);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", true);
		aIngredientes[2] = new Ingrediente(2f, "cebolletas", false);
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", true);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", false);
		prueba.setIngredientes(aIngredientes);
		assertFalse("caso 2 algunos con gluten", prueba.isGlutenFree());

		aIngredientes[0] = new Ingrediente(4f, "patatas", true);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", true);
		aIngredientes[2] = new Ingrediente(2f, "cebolletas", true);
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", true);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", true);
		prueba.setIngredientes(aIngredientes);
		assertFalse("caso 3 todos con gluten", prueba.isGlutenFree());

		prueba.setIngredientes(null);
		assertTrue("caso 4 uno es null", prueba.isGlutenFree());

	}

}
