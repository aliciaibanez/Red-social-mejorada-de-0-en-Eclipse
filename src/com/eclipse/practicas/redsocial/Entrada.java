package com.eclipse.practicas.redsocial;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Entrada {
	private String usuario;
	private LocalDateTime momentoPublicacion;
	private int cantidadMeGusta;
	private ArrayList<String> comentarios;

	public Entrada(String autor) {
		usuario = autor;
		momentoPublicacion = LocalDateTime.now();
		cantidadMeGusta = 0;
		comentarios = new ArrayList<>();
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

	public LocalDateTime getMomentoPublicacion() {
		return momentoPublicacion;

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

		String comentariosStr = "";
		if (getComentarios().size() > 0) {
			for (String comentario : getComentarios()) {
				comentariosStr += comentario + "\n";
			}
		} else {
			comentariosStr = "No existen comentarios";
		}
		StringBuilder textoADevolver = new StringBuilder();

		return textoADevolver.append(getUsuario()).append("\n").append(publicadoHaceStr).append("\n")
				.append(getCantidadMeGusta()).append("\n").append(comentariosStr).append("\n").toString();
	}

	public void mostrarDetallesPorPantalla() {
		String comentariosStr = "";
		for (String comentario : comentarios) {
			comentariosStr += comentario;
		}
		System.out.println(usuario + getMomentoPublicacion() + cantidadMeGusta + comentariosStr);

	}

}
