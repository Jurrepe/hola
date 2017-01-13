package com.ipartek.formacion.hola.pojo;

public class Ingrediente {

	private Float cantidad;
	private String nombre;
	boolean gluten;

	public Ingrediente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingrediente(Float cantidad, String nombre, boolean gluten) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.gluten = gluten;
	}

	public Float getCantidad() {
		return cantidad;
	}

	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	@Override
	public String toString() {
		return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + ", gluten=" + gluten + "]";
	}

}
