package com.ipartek.formacion.hola.pojo;

public class Marmitako {

	public static void main(String[] args) {
		Receta marmitako = new Receta();
		Ingrediente[] aIngredientes = new Ingrediente[16];

		marmitako.setTitulo("Marmitako de Karlos arguiñano");

		aIngredientes[0] = new Ingrediente(4f, "patatas", false);
		aIngredientes[1] = new Ingrediente(500f, "bonito limpio", false);
		aIngredientes[2] = new Ingrediente(2f, "cebolletas", false);
		aIngredientes[3] = new Ingrediente(2f, "pimientos verdes", false);
		aIngredientes[4] = new Ingrediente(0.5f, "pimiento rojo", false);
		aIngredientes[5] = new Ingrediente(1f, "pan de sopa", false);
		aIngredientes[6] = new Ingrediente(4f, "pimientos choriceros", false);
		aIngredientes[7] = new Ingrediente(40f, "pan de soa", false);
		aIngredientes[8] = new Ingrediente(0.5f, "vaso de salsa de tomate", false);
		aIngredientes[9] = new Ingrediente(1f, "agua", false);
		aIngredientes[10] = new Ingrediente(1f, "copa de brandy", false);
		aIngredientes[11] = new Ingrediente(1f, "aceite de oliva", false);
		aIngredientes[12] = new Ingrediente(1f, "sal", true);
		aIngredientes[13] = new Ingrediente(1f, "pimienta", false);
		aIngredientes[14] = new Ingrediente(1f, "una guinduilla cayena", false);
		aIngredientes[15] = new Ingrediente(1f, "perejil", false);

		marmitako.setIngredientes(aIngredientes);
		marmitako.setTiempo(60);
		marmitako.setDificultad("Facil para todo");
		marmitako.setComensales(6);
		marmitako.setDescripcion("Un plataco de marmitako para la tripa");
		marmitako.getDescripcion();
		Receta mar1 = new Receta("Marmitako", aIngredientes, 60, "facilisimo", 6, "receta rica rica");
		System.out.println(marmitako.toString());
		System.out.println(mar1.toString());
		System.out.println(marmitako.getTitulo() + " " + ((marmitako.isGlutenFree() ? "" : "no ") + "es gluten free"));
	}

}
