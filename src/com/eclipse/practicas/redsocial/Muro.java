package com.eclipse.practicas.redsocial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class Muro {
	private ArrayList<Entrada> entradas;

	public Muro() {
		entradas = new ArrayList<>();
	}

	public void addEntrada(Entrada entrada) {
		entradas.add(entrada);
	}

	public boolean saveToDisk() {
		Path rutaArchivo = Paths.get(
				"C:/Users/Usuario/Desktop/Alicia/DAM/Programación y Entornos de desarrollo/Red social/com.eclipse.practicas.redsocial/muro.txt");
		try {
			BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
			archivo.write(toString());
			archivo.close();
			return true;
		} catch (IOException e) {
			System.out.println("¡Vaya, algo ha ido mal al escribir el archivo!");
			System.out.println(e.toString());
			return false;
		}

	}

	public String getUrlsFotos() {
		String urlStr = "";
		ArrayList<String> urls = new ArrayList<>();
		for (Entrada entrada : entradas) {
			if (entrada instanceof EntradaFoto) {
				EntradaFoto foto = (EntradaFoto) entrada;
				urls.add(foto.getUrlImagen());
				urlStr += foto.getUrlImagen() + "\n";

			}

		}

		return urlStr;
	}

	public void mostrarDetallesPorPantalla() {
		StringBuilder textoAMostrar = new StringBuilder();

		for (Entrada entrada : entradas) {
			entrada.mostrarDetallesPorPantalla();
		}
		System.out.println(textoAMostrar);
	}

	public String toString() {
		entradas.sort(Comparator.comparing(Entrada::getMomentoPublicacion));
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