package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import com.ipartek.formacion.recetas.ejercicios.herencia.Pajaro;
import com.ipartek.formacion.recetas.ejercicios.herencia.Vehiculo;

public class InterfazTest {

	ArrayList<IEstupida> estupido = new ArrayList<IEstupida>();
	
	@Test
	public void testMulticlase() {

		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		
		Pajaro p1 = new Pajaro();
		Pajaro p2 = new Pajaro();
		
		v1.setModelo("Seat");
		v1.setPotencia(500.33f);
		
		v2.setModelo("Ford K");
		v2.setPotencia(100);
		
		p1.setRaza("Kiwi");
		p1.setNumHuevosSemana(2);
		
		p2.setRaza("Gallina");
		p2.setNumHuevosSemana(700);
		
		estupido.add(v1);
		estupido.add(v2);
		estupido.add(p1);
		estupido.add(p2);
		
		Collections.sort(estupido, new ComparatorHuevosPotencia());
		assertEquals(p1,estupido.get(0));
		assertEquals(v2,estupido.get(1));
		assertEquals(v1,estupido.get(2));
		assertEquals(p2,estupido.get(3));
	}

}
