package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	private String nombre;

	public Burro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Burro(String raza, int precio, String nombre) {
		super(raza, precio);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");

	}

	@Override
	public void detener() {
		System.out.println("Soooooooo");

	}

	@Override
	public void girar(String direccion) {
		System.out.println("giro a " + direccion);

	}

	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + "]";
	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {
		return "Sal pimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		System.out.println("-------------FACTURA-----------");
		System.out.println("Raza: " + this.getRaza());
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Precio: " + this.getPrecio());
		System.out.println("Para cocinarlo: " + this.getDescripcionReceta());
		System.out.println("Es conducible");
		System.out.println("Si le dices DERECHA: " + this.DERECHA);
		System.out.println("Si le dices IZQUIERDA: " + this.IZQUIERDA);
		System.out.print("Para arrancar: ");
		this.arrancar();
		System.out.print("Para parar: ");
		this.detener();
		System.out.println("--------------FIN---------------");

	}

}
