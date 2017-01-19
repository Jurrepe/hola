package com.ipartek.formacion.recetas.ejercicios.herencia;

import com.ipartek.formacion.recetas.ejercicios.collection.IEstupida;

public class Pajaro extends Animal implements Volador, Vendible, IEstupida {

	private boolean volar;
	private int numHuevosSemana;

	public Pajaro() {
		super();
		this.volar = false;
		this.numHuevosSemana = 0;
	}

	public Pajaro(String raza, int precio, boolean volar) {
		super(raza, precio);
		this.volar = volar;
		this.numHuevosSemana = 0;
	}

	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}

	public boolean puedeVolar() {
		return volar;
	}

	@Override
	public void despegar() {
		System.out.println((this.volar) ? "Volando voy" : "En tierra me quedo");

	}

	@Override
	public void aterrizar() {
		System.out.println((this.volar) ? "Volando vengo" : "Llorando me quedo");
	}

	@Override
	public void generarFactura() {
		System.out.println("-------------FACTURA-----------");
		System.out.println("Raza: " + this.getRaza());
		System.out.println((this.isVolar() ? "Vuela" : "No vuela el pobre"));
		System.out.println("Precio: " + this.getPrecio());
		this.despegar();
		this.aterrizar();
		System.out.println("--------------FIN---------------");
	}

	public int getNumHuevosSemana() {
		return numHuevosSemana;
	}

	public void setNumHuevosSemana(int numHuevosSemana) {
		this.numHuevosSemana = numHuevosSemana;
	}

	@Override
	public int getPeso() {
		
		return this.getNumHuevosSemana();
	}

}
