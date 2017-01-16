package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaTest {
	// Variables globales, se inicializan en "setUp"
	public Receta tortillaPatatas = null;
	public Ingrediente huevos = new Ingrediente(12f, "huevos", true);
	public Ingrediente cebolla = new Ingrediente(1f, "Cebolla", true);
	public Ingrediente patatas = new Ingrediente(4f, "patatas", true);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		tortillaPatatas = new Receta("tortilla de patatas", null);
		tortillaPatatas.addIngrediente(huevos);
		tortillaPatatas.addIngrediente(cebolla);
		tortillaPatatas.addIngrediente(patatas);
	}

	@After
	public void tearDown() throws Exception {
		tortillaPatatas = null;
	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta("Tortila de patatas", null);
		int numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0f, "", true));
		numero = r.getIngredientes().size();
		assertEquals("debe existir un ingrediente", 1, numero);
	}

	@Test
	public void testRemoveIngrediente() {
		Receta r = new Receta("Tortila de patatas", null);
		assertFalse(r.removeIngrediente(null));

		tortillaPatatas.addIngrediente(huevos);

		huevos.setNombre("HueVoS");
		tortillaPatatas.removeIngrediente(huevos);

		ArrayList<Ingrediente> ingredientes = tortillaPatatas.getIngredientes();
		assertEquals(3, tortillaPatatas.getIngredientes().size());

		// TODO comprobar que sean huevo, cebolla y patatas
		assertFalse(tortillaPatatas.contiene(null));
		assertFalse(tortillaPatatas.contiene(new Ingrediente(2f, "salmonela", true)));
		assertTrue(tortillaPatatas.contiene(huevos));
		assertTrue(tortillaPatatas.contiene(cebolla));
		assertTrue(tortillaPatatas.contiene(patatas));
	}

	@Test
	public void testConstructor() {

		Receta r = new Receta("Tortila de patatas", null);

		assertNotNull("deberia estar inicializado a new", r.getIngredientes());

	}

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
		ingredientes.clear();
		assertEquals("Tiene que ser 0", 0, ingredientes.size());

		ingredientes.add(new Ingrediente(4f, "patatas", false));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", false));
		ingredientes.add(new Ingrediente(2f, "cebolletas", true));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", false));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", true));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", false));
		prueba.setIngredientes(ingredientes);
		assertEquals("Tiene que ser 6", 6, ingredientes.size());
		assertTrue("No encuentro el tercer ingrediente", prueba.removeIngrediente(ingredientes.get(3)));
		assertEquals("Tiene que ser 5", 5, ingredientes.size());
		assertFalse("Le meto un null", prueba.removeIngrediente(null));
		assertFalse("caso 2 algunos con gluten", prueba.isGlutenFree());
		ingredientes.clear();

		ingredientes.add(new Ingrediente(4f, "patatas", true));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", true));
		ingredientes.add(new Ingrediente(2f, "cebolletas", true));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", true));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", true));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", true));
		prueba.setIngredientes(ingredientes);
		assertFalse("caso 3 todos con gluten", prueba.isGlutenFree());
		ingredientes.clear();

		prueba.setIngredientes(null);
		assertTrue("caso 4 uno es null", prueba.isGlutenFree());

	}

}
