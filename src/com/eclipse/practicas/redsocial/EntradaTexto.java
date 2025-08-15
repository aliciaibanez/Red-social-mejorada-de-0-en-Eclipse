package com.eclipse.practicas.redsocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Duration;

public class EntradaTexto extends Entrada {

	private String mensaje;

	public EntradaTexto(String autor, String texto) {
		super(autor);
		mensaje = texto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String toString() {
		String publicadoHaceStr = "";
		Duration publicadoHace = Duration.between(momentoPublicacion, LocalDateTime.now());
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

		String comentariosStr = "";
		if (comentarios.size() > 0) {
			for (String comentario : comentarios) {
				comentariosStr += comentario + "\n";
			}
		} else {
			comentariosStr = "No existen comentarios";
		}
		StringBuilder textoADevolver = new StringBuilder();

		return textoADevolver.append(usuario).append("\n").append(mensaje).append("\n").append(publicadoHaceStr)
				.append("\n").append(cantidadMeGusta).append("\n").append(comentariosStr).append("\n").toString();
	}
}
