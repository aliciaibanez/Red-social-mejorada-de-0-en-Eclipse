package com.eclipse.practicas.redsocial;

import java.time.Duration;
import java.time.LocalDateTime;

public class EntradaEvento extends Entrada {
	private String evento;

	public EntradaEvento(String autor, String evento, String momentoPublicacion) {
		super(autor, momentoPublicacion);
		this.evento = evento;

	}

	public String getEvento() {
		return evento;

	}

	@Override
	public void mostrarDetallesPorPantalla() {
		System.out.println(evento);
	}

	@Override
	public String toString() {

		StringBuilder textoADevolver = new StringBuilder();

		return textoADevolver.append(super.toString()).append(evento).append("\n").toString();
	}

}
