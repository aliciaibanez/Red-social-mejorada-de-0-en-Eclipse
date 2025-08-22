package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eclipse.practicas.redsocial.EntradaFoto;
import com.eclipse.practicas.redsocial.EntradaTexto;
import com.eclipse.practicas.redsocial.EntradaEvento;
import com.eclipse.practicas.redsocial.Entrada;
import com.eclipse.practicas.redsocial.Muro;

public class MuroTest {
	@Test
	public void test01() {

		Muro muro = new Muro();

		Entrada entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!",
				"4 de enero de 2024 a las 17:35");
		Entrada entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias",
				"5 de enero de 2024 a las 17:35");
		Entrada entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...", "6 de enero de 2024 a las 17:35");
		Entrada entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera",
				"7 de enero de 2024 a las 17:35");
		Entrada entrada05 = new EntradaEvento("Pepe", "Hoy, fiesta en mi casa", "8 de enero de 2024 a las 17:35");
		Entrada entrada06 = new EntradaEvento("Pepita", "Cena de empresa a las 21:00H",
				"9 de enero de 2024 a las 17:35");

		muro.addEntrada(entrada01);
		muro.addEntrada(entrada02);
		muro.addEntrada(entrada03);
		muro.addEntrada(entrada04);
		muro.addEntrada(entrada05);
		muro.addEntrada(entrada06);

		System.out.println(muro);
		String esperado = "Nacho\n" + "4 de enero de 2024 a las 17:35\n" + "0\n" + "No existen comentarios\n"
				+ "Recién llegado de mis vacaciones en Hawai!\n" + "\n"

				+ "Luis\n" + "5 de enero de 2024 a las 17:35\n" + "0\n" + "No existen comentarios\n"
				+ "https://bit.ly/2W1dO09\n" + "Gracias\n" + "\n"

				+ "Begoña\n" + "6 de enero de 2024 a las 17:35\n" + "0\n" + "No existen comentarios\n"
				+ "Está lloviendo ahí fuera...\n" + "\n"

				+ "Cristina\n" + "7 de enero de 2024 a las 17:35\n" + "0\n"

				+ "No existen comentarios\n" + "https://bit.ly/3cY9vtD\n" + "Una foto de mi nevera\n" + "\n" + "Pepe\n"
				+ "8 de enero de 2024 a las 17:35\n" + "0\n" + "Hoy, fiesta en mi casa\n" + "\n" + "Pepita\n"

				+ "9 de enero de 2024 a las 17:35\n" + "0\n" + "Cena de empresa a las 21:00H\n" + "\n";
		assertEquals(esperado, muro.toString());
	}

	@Test
	public void testGetUrlsFotos() {
		Muro muro = new Muro();

		Entrada entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!",
				"4 de enero de 2024 a las 17:35");
		Entrada entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias",
				"4 de enero de 2024 a las 17:35");
		Entrada entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...", "4 de enero de 2024 a las 17:35");
		Entrada entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera",
				"4 de enero de 2024 a las 17:35");

		muro.addEntrada(entrada01);
		muro.addEntrada(entrada02);
		muro.addEntrada(entrada03);
		muro.addEntrada(entrada04);

		String esperado = "https://bit.ly/2W1dO09\nhttps://bit.ly/3cY9vtD\n";

		assertEquals(esperado, muro.getUrlsFotos());
	}
}
