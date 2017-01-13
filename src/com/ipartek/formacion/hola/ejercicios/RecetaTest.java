package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaTest {

	@Test
	public void testGlutenFree() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

		ingredientes.add(new Ingrediente(4f, "patatas", false));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", false));
		ingredientes.add(new Ingrediente(2f, "cebolletas", false));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", false));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", false));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", false));
		Receta prueba = new Receta();
		prueba.setIngredientes(ingredientes);
		assertTrue("caso 1 sin gluten", prueba.isGlutenFree());
		ingredientes.removeAll(ingredientes);

		ingredientes.add(new Ingrediente(4f, "patatas", false));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", false));
		ingredientes.add(new Ingrediente(2f, "cebolletas", true));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", false));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", true));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", false));
		prueba.setIngredientes(ingredientes);
		assertFalse("caso 2 algunos con gluten", prueba.isGlutenFree());
		ingredientes.removeAll(ingredientes);

		ingredientes.add(new Ingrediente(4f, "patatas", true));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", true));
		ingredientes.add(new Ingrediente(2f, "cebolletas", false));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", true));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", true));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", true));
		prueba.setIngredientes(ingredientes);
		assertFalse("caso 3 todos con gluten", prueba.isGlutenFree());
		ingredientes.removeAll(ingredientes);

		prueba.setIngredientes(null);
		assertTrue("caso 4 uno es null", prueba.isGlutenFree());

	}

}
