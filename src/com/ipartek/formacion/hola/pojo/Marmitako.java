package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Marmitako {

	public static void main(String[] args) {
		Receta marmitako = new Receta();
		// ya no usamos array
		// Ingrediente[] aIngredientes = new Ingrediente[16];
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		marmitako.setTitulo("Marmitako de Karlos arguiñano");

		ingredientes.add(new Ingrediente(4f, "patatas", false));
		ingredientes.add(new Ingrediente(500f, "bonito limpio", false));
		ingredientes.add(new Ingrediente(2f, "cebolletas", false));
		ingredientes.add(new Ingrediente(2f, "pimientos verdes", false));
		ingredientes.add(new Ingrediente(0.5f, "pimiento rojo", false));
		ingredientes.add(new Ingrediente(1f, "pan de sopa", false));
		ingredientes.add(new Ingrediente(4f, "pimientos choriceros", false));
		ingredientes.add(new Ingrediente(40f, "pan de soa", false));
		ingredientes.add(new Ingrediente(0.5f, "vaso de salsa de tomate", false));
		ingredientes.add(new Ingrediente(1f, "agua", false));
		ingredientes.add(new Ingrediente(1f, "copa de brandy", false));
		ingredientes.add(new Ingrediente(1f, "aceite de oliva", false));
		ingredientes.add(new Ingrediente(1f, "sal", true));
		ingredientes.add(new Ingrediente(1f, "pimienta", false));
		ingredientes.add(new Ingrediente(1f, "una guinduilla cayena", false));
		ingredientes.add(new Ingrediente(1f, "perejil", false));

		marmitako.setIngredientes(ingredientes);
		marmitako.setTiempo(60);
		marmitako.setDificultad("Facil para todo");
		marmitako.setComensales(6);
		marmitako.setDescripcion("Un plataco de marmitako para la tripa");
		marmitako.getDescripcion();
		Receta mar1 = new Receta("Marmitako", ingredientes, 60, "facilisimo", 6, "receta rica rica");
		System.out.println(marmitako.toString());
		System.out.println(mar1.toString());
		System.out.println(marmitako.getTitulo() + " " + ((marmitako.isGlutenFree() ? "" : "no ") + "es gluten free"));
	}

}
