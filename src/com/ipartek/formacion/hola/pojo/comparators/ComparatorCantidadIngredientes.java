package com.ipartek.formacion.hola.pojo.comparators;

import java.util.Comparator;

import com.ipartek.formacion.hola.pojo.Receta;

public class ComparatorCantidadIngredientes implements Comparator<Receta> {

	@Override
	public int compare(Receta o1, Receta o2) {
		
		return o1.getIngredientes().size()-o2.getIngredientes().size();
	}

}
