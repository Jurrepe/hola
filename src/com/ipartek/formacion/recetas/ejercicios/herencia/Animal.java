package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Animal {

	private String raza;
	private int precio;

	public Animal() {
		this.raza = "";
		this.precio = 0;
	}

	public Animal(String raza, int precio) {
		super();
		this.raza = raza;
		this.precio = precio;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", precio=" + precio + "]";
	}

}
