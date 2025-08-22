package com.eclipse.practicas.redsocial;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Entrada {
	private String usuario;
	private String momentoPublicacion;
	private int cantidadMeGusta;
	private ArrayList<String> comentarios;

	public Entrada(String autor, String momentoPublicacion) {
		usuario = autor;
		cantidadMeGusta = 0;
		comentarios = new ArrayList<>();
		this.momentoPublicacion = momentoPublicacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public int getCantidadMeGusta() {
		return cantidadMeGusta;
	}

	public ArrayList<String> getComentarios() {

		return comentarios;

	}

	public void meGusta() {
		cantidadMeGusta++;
	}

	public void addComentario(String text) {
		comentarios.add(text);
	}

	public String getMomentoPublicacion() {
		return momentoPublicacion;

	}

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

		return textoADevolver.append(getUsuario()).append("\n").append(momentoPublicacion).append("\n")
				.append(getCantidadMeGusta()).append("\n").append(comentariosStr).append("\n").toString();
	}

	public abstract void mostrarDetallesPorPantalla();

}
