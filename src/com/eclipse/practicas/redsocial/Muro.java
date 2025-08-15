package com.eclipse.practicas.redsocial;

import java.util.ArrayList;

public class Muro {
	private ArrayList<EntradaTexto> mensajes;
	private ArrayList<EntradaFoto> fotos;
	private ArrayList<EntradaEvento> eventos;

	public Muro() {
		mensajes = new ArrayList<>();
		fotos = new ArrayList<>();
		eventos = new ArrayList<>();
	}

	public void addEntradaEvento(EntradaEvento entradaEvento) {
		eventos.add(entradaEvento);
	}

	public void addEntradaTexto(EntradaTexto entradaTexto) {
		mensajes.add(entradaTexto);
	}

	public void addEntradaFoto(EntradaFoto entradaFoto) {
		fotos.add(entradaFoto);
	}

	public String toString() {
		StringBuilder textoADevolver = new StringBuilder();
		for (EntradaTexto mensaje : mensajes) {
			textoADevolver.append(mensaje).append("\n");
		}

		for (EntradaFoto foto : fotos) {
			textoADevolver.append(foto).append("\n");
		}

		for (EntradaEvento evento : eventos) {
			textoADevolver.append(evento).append("\n");
		}
		return textoADevolver.toString();
	}

	public void imprimirMuro() {
		System.out.println(toString());
	}
}