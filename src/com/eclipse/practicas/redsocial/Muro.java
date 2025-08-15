package com.eclipse.practicas.redsocial;

import java.util.ArrayList;
import java.util.Comparator;

public class Muro {
	private ArrayList<Entrada> entradas;

	public Muro() {
		entradas = new ArrayList<>();
	}

	public void addEntrada(Entrada entrada) {
		entradas.add(entrada);
	}
	
	
	public void mostrarDetallesPorPantalla() {
		StringBuilder textoAMostrar = new StringBuilder();
		
		for (Entrada entrada : entradas) {
			entrada.mostrarDetallesPorPantalla();
		}
		System.out.println(textoAMostrar);
	}

	public String toString() {
		entradas.sort(Comparator.comparing(Entrada::getMomentoPublicacion));
		StringBuilder textoADevolver = new StringBuilder();
		for (Entrada entrada : entradas) {
			textoADevolver.append(entrada).append("\n");
		}

		return textoADevolver.toString();
	}

	public void imprimirMuro() {
		System.out.println(toString());
	}
}