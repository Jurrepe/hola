package com.ipartek.formacion.recetas.ejercicios.collection;

import java.util.Comparator;

public class ComparatorHuevosPotencia implements Comparator<IEstupida> {

	@Override
	public int compare(IEstupida o1, IEstupida o2) {
		
		return o1.getPeso()-o2.getPeso();
	}

}
