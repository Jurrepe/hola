package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = 1326.24f;
		float pago = 4 * 500;
		System.out.println("-----------------------------");
		System.out.println("--------- TICKET ------------");
		System.out.println("PAGO: " + compra);
		System.out.println("RETORNO: " + (pago - compra));
		System.out.println("Las vueltas:");
		calcular(pago - compra);
	}

	public static void calcular(float vueltas) {
		final float BILLETE_MINIMO = 5;
		final float EURO = 1;
		final float CENTIMOS = 100;

		ArrayList<Float> listaCambios = new ArrayList<Float>();
		// rellenamos con los cambios
		listaCambios.add((float) 50);
		listaCambios.add((float) 20);
		listaCambios.add((float) 10);
		listaCambios.add((float) 5);
		listaCambios.add((float) 2);
		listaCambios.add((float) 1);
		listaCambios.add((float) 0.50);
		listaCambios.add((float) 0.20);
		listaCambios.add((float) 0.10);
		listaCambios.add((float) 0.05);
		listaCambios.add((float) 0.02);
		listaCambios.add((float) 0.01);

		/*
		 * for (int i = 0; i < listaCambios.size(); i++) {
		 * System.out.println(listaCambios.get(i)); }
		 */
		Float restante = vueltas;
		String tipoCambio = "";
		String valorCambio = "";
		int devolucion = 0;
		for (Float moneda : listaCambios) {
			tipoCambio = (moneda >= BILLETE_MINIMO) ? "Billete(s)" : "Moneda(s)";
			valorCambio = (moneda >= EURO) ? "Euro(s)" : "Centimo(s)";
			if (moneda >= EURO) {
				devolucion = Math.round(moneda);
			} else {
				devolucion = Math.round(moneda * CENTIMOS);
			}
			System.out.println(
					"Te dan " + (int) (restante / moneda) + " " + tipoCambio + " de " + devolucion + " " + valorCambio);
			restante = (restante % moneda);
		}
	}

}
