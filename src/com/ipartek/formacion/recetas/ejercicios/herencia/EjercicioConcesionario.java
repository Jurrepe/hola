package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */
public class EjercicioConcesionario {

	public static void main(String[] args) {

		// crear vehiculos
		Vehiculo v1 = new Vehiculo("Prius");
		Vehiculo v2 = new Vehiculo("Ibiza");
		Vehiculo v3 = new Vehiculo("Ford Fiesta");
		v1.setPlazas(5);
		v1.setPotencia(300);

		v2.setPlazas(5);
		v2.setPotencia(500);

		v3.setPlazas(4);
		v3.setPotencia(100);

		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla");
		ve1.setPlazas(5);
		ve1.setPotencia(150);
		ve1.setCapacidadBaterias(500);

		VehiculoDiesel vd1 = new VehiculoDiesel("Citroen Sara");
		VehiculoDiesel vd2 = new VehiculoDiesel("Opel Astra");
		vd1.setPlazas(5);
		vd1.setPotencia(100);
		vd1.setCapacidadCombustible(95);

		vd2.setPlazas(5);
		vd2.setPotencia(120);
		vd2.setCapacidadCombustible(98);
		// mostrar por pantalla
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println(ve1.toString());
		System.out.println(vd1.toString());
		System.out.println(vd2.toString());

	}

}
