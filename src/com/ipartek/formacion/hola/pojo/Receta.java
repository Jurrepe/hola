package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	private String titulo;
	// private Ingrediente[] ingredientes;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void addIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	/**
	 * Eliminar el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsesitive
	 * 
	 * @param ingrediente
	 *            a eliminar
	 * @return true si elimina ingrediente false en caso contrario
	 */
	public boolean removeIngrediente(Ingrediente ingrediente) {
		boolean resul = this.ingredientes.contains(ingrediente);
		if (this.ingredientes.contains(ingrediente))
			this.ingredientes.remove(ingrediente);
		return resul;
	}

	/**
	 * Nos indica si es libre de ingrediente con gluten
	 * 
	 * @return true si todos no contienen gluten <br>
	 *         false si alguno(o todos) tiene gluten <br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree() {
		boolean resul = true;
		if (this.ingredientes != null)
			for (int i = 0; i < this.ingredientes.size(); i++) {
				if (ingredientes.get(i).isGluten()) {
					resul = false;
					break;
				}
			}
		return resul;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingredientes=" + ingredientes + ", tiempo=" + tiempo + ", dificultad="
				+ dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

}
