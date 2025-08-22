package com.eclipse.practicas.redsocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Duration;

public class EntradaFoto extends Entrada {

	private String urlImagen;
	private String titulo;

	public EntradaFoto(String autor, String url, String titulo, String momentoPublicacion) {
		super(autor, momentoPublicacion);
		urlImagen = url;
		this.titulo = titulo;

	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public String getTituloImagen() {
		return titulo;
	}

	@Override
	public void mostrarDetallesPorPantalla() {
		System.out.println("urlImagen");
		System.out.println("titulo");
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
		textoADevolver.append(super.toString()).append(urlImagen).append("\n").append(titulo).append("\n");
		return textoADevolver.toString();
	}
}