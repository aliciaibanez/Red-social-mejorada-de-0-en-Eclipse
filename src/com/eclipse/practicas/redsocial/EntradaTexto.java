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

	public void mostrarDetallesPorPantalla() {
		
	}
	@Override
	public String toString() {
		
		String comentariosStr = "";
		if (getComentarios().size() > 0) {
			for (String comentario : getComentarios()) {
				comentariosStr += comentario + "\n";
			}
		} else {
			comentariosStr = "No existen comentarios";
		}
		StringBuilder textoADevolver = new StringBuilder();
		textoADevolver.append(super.toString()).append(mensaje).append("\n");
		return textoADevolver.toString();
	}
}
