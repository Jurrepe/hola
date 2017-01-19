package com.ipartek.formacion.recetas.ejercicios.collection;

import java.util.Comparator;

import com.ipartek.formacion.hola.pojo.Receta;

public class ComparatorRecetaNIvelDificultad implements Comparator<Receta> {

	@Override
	public int compare(Receta o1, Receta o2) {
		return getPesoDificultad(o1)-getPesoDificultad(o2);
	}
	
	private int getPesoDificultad(Receta r){
		int resul = 0;
		
		switch (r.getDificultad()) {
		case Receta.DIFICULTAD_FACIL:
			resul = 0;
			break;
			
		case Receta.DIFICULTAD_MODERADA:
			resul = 5;
			break;

		case Receta.DIFICULTAD_DIFICIL:
			resul = 10;
			break;

		default:
			break;
		}
		
		return resul;
	}

}
