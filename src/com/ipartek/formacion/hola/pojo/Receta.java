package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta implements Comparable<Receta> {

	public String IMG_DEFAULT = "http://es.seaicons.com/wp-content/uploads/2016/03/Recipe-Book-icon.png";
	public static final String DIFICULTAD_FACIL = "FACIL";
	public static final String DIFICULTAD_MODERADA = "MODERADA";
	public static final String DIFICULTAD_DIFICIL = "DIFICIL";

	private String titulo;
	private String imagen;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;
	

	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receta(String titulo) {
		super();
		this.imagen = IMG_DEFAULT;
		this.titulo = titulo;
		setIngredientes(null);
		this.tiempo = 0;
		this.dificultad = "Facil";
		this.comensales = 0;
		this.descripcion = "Wololo wololo";
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setIngredientes(ingredientes);
		this.tiempo = 0;
		this.dificultad = "Facil";
		this.comensales = 0;
		this.descripcion = "Wololo wololo";
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		setIngredientes(ingredientes);
		this.tiempo = tiempo;
		this.imagen = IMG_DEFAULT;
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
		this.ingredientes = (ingredientes == null) ? new ArrayList<Ingrediente>() : ingredientes;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * TODO cuando sea null lanzar Exception personalizada <br>
	 * Añadimos un nuevo {@code Ingrediente} a la receta
	 * 
	 * @param ingrediente
	 *            si es null no hace nada
	 */
	public void addIngrediente(Ingrediente ingrediente) {
		if (ingrediente != null) {
			this.ingredientes.add(ingrediente);
		}
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
		// return this.ingredientes.remove(ingrediente); Funciona por ahora
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}

			} // end for
		} // end if
		return resul;
	}

	/**
	 * Comprueba si contiene el {@code Ingrediente} pasado como parametro
	 * 
	 * @param ingrediente
	 *            {@code Ingrediente} a buscar
	 * @return true si contiene ingrediente<br>
	 *         false en caso contrario
	 */
	public boolean contiene(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterator = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterator = this.ingredientes.get(i);
				if (NOMBRE_BUSCAR.equalsIgnoreCase(iterator.getNombre())) {
					resul = true;
					break;
				}
			}
		}
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
		return "Receta [titulo=" + titulo + ", imagen=" + imagen + ", ingredientes=" + ingredientes + ", tiempo="
				+ tiempo + ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion
				+ "]";
	}


//	@Override
//	public int compare(Receta o1, Receta o2) {
//		
//		return o1.getTitulo().compareTo(o2.getTitulo());
//	}

	//Compara el objeto actual con el que se le pasa por el parametro y lo compara por el titulo
	@Override
	public int compareTo(Receta o) {
		//pasamos a toLowerCase, para ignorar mayusculas y minusculas
		return this.getTitulo().toLowerCase().compareTo(o.getTitulo().toLowerCase());
	}

}
