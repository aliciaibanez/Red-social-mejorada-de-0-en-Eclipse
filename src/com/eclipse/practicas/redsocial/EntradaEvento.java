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

	public String toString() {
		String publicadoHaceStr = "";
		Duration publicadoHace = Duration.between(getMomentoPublicacion(), LocalDateTime.now());
		long segundos = publicadoHace.toSeconds();
		long minutos = publicadoHace.toMinutes();
		long horas = publicadoHace.toHours();
		long dias = publicadoHace.toDays();

		if (segundos < 59) {
			publicadoHaceStr = "Escrito hace 10 segundos";
		} else if (minutos < 59) {
			publicadoHaceStr = "Escrito hace 10 segundos";
		} else if (horas < 23) {
			publicadoHaceStr = "Escrito hace 10 segundos";
		} else if (dias < 359) {
			publicadoHaceStr = "Escrito hace 10 segundos";
		} else {
			publicadoHaceStr = "Escrito hace 10 segundos";
		}

		StringBuilder textoADevolver = new StringBuilder();

		return textoADevolver.append(getUsuario()).append("\n").append(evento).append("\n").append(publicadoHaceStr)
				.append("\n").append(getCantidadMeGusta()).append("\n").toString();
	}

}
