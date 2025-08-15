package com.eclipse.practicas.redsocial;

import java.time.Duration;
import java.time.LocalDateTime;

public class EntradaEvento extends Entrada {
	private String evento;

	public EntradaEvento(String autor, String evento) {
		super(autor);
		this.evento = evento;
	}

	public String getEvento() {
		return evento;

	}
	@Override
	public void mostrarDetallesPorPantalla() {
		System.out.println(evento);
	}

	public String toString() {
		String publicadoHaceStr = "Escrito hace 10 segundos";
		StringBuilder textoADevolver = new StringBuilder();

		return textoADevolver.append(getUsuario()).append("\n").append(publicadoHaceStr).append("\n")
				.append(getCantidadMeGusta()).append("\n").append(evento).append("\n").toString();
	}

}
