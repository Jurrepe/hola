package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	private boolean volar;

	public Pajaro(boolean volar) {
		super();
		this.volar = volar;
	}

	public Pajaro(String raza, int precio, boolean volar) {
		super(raza, precio);
		this.volar = volar;
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

}
