package com.eclipse.practicas.redsocial;

import java.util.ArrayList;

public class Muro {
	private ArrayList<Entrada> entradas;

	public Muro() {
		entradas = new ArrayList<>();
	}

	public void addEntrada (Entrada entrada) {
		entradas.add(entrada);
	}

	public String toString() {
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