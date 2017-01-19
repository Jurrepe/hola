package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;
import com.ipartek.formacion.hola.pojo.comparators.ComparatorCantidadIngredientes;

public class ComparacionesTest {
	public ArrayList<Receta> recetas = new ArrayList<Receta>();
	Receta solomillo = new Receta("solomillo");
	Receta marmitako = new Receta("marmitako");
	Receta tortilla = new Receta("tortilla");
	
	@Before
	public void setUp() throws Exception {
		
		solomillo.setDificultad(Receta.DIFICULTAD_MODERADA);
		marmitako.setDificultad(Receta.DIFICULTAD_DIFICIL);
		tortilla.setDificultad(Receta.DIFICULTAD_FACIL);
		
		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);
	}
	
	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		tortilla = null;
		marmitako = null;
	}
	@Test
	public void testComparable() {

		//Ordenar de A-Z
		Collections.sort(recetas);
		assertEquals(marmitako,recetas.get(0));
		assertEquals(solomillo,recetas.get(1));
		assertEquals(tortilla,recetas.get(2));
		//Ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder());
		assertEquals(marmitako,recetas.get(2));
		assertEquals(solomillo,recetas.get(1));
		assertEquals(tortilla,recetas.get(0));
		
	}
	
	@Test
	public void testComparator() {
		//Vamos a ordenar por nivel de dificultad de Receta
		final String MSG_ERROR = "NO ordena por nivel de dificultad";
		
		Collections.sort(recetas, new ComparatorRecetaNIvelDificultad() );
		
		assertEquals(MSG_ERROR, tortilla,recetas.get(0));
		assertEquals(MSG_ERROR, solomillo,recetas.get(1));
		assertEquals(MSG_ERROR, marmitako,recetas.get(2));
	}
	
	public void testCompararIngredientes() {
		marmitako.addIngrediente(new Ingrediente(2f,"bonito",false));
		marmitako.addIngrediente(new Ingrediente(2f,"tomate",false));
		marmitako.addIngrediente(new Ingrediente(2f,"cebolla",false));
		marmitako.addIngrediente(new Ingrediente(2f,"perejil",false));
		
		solomillo.addIngrediente(new Ingrediente(2f,"carne",false));
		solomillo.addIngrediente(new Ingrediente(2f,"sal",false));
		solomillo.addIngrediente(new Ingrediente(2f,"perejil",false));
		solomillo.addIngrediente(new Ingrediente(2f,"aceite",false));
		solomillo.addIngrediente(new Ingrediente(2f,"caldo",false));
		
		tortilla.addIngrediente(new Ingrediente(2f,"patatas",false));
		
		Collections.sort(recetas, new ComparatorCantidadIngredientes() );
		
		assertEquals(tortilla,recetas.get(0));
		assertEquals(marmitako,recetas.get(1));
		assertEquals(solomillo,recetas.get(2));
	}

}
