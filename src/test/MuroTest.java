package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eclipse.practicas.redsocial.EntradaFoto;
import com.eclipse.practicas.redsocial.EntradaTexto;
import com.eclipse.practicas.redsocial.EntradaEvento;
import com.eclipse.practicas.redsocial.Muro;

public class MuroTest {
	@Test
	public void test01() {

		Muro muro = new Muro();

		EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
		EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
		EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
		EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
		EntradaEvento entrada05 = new EntradaEvento("Pepe", "Hoy, fiesta en mi casa");
		EntradaEvento entrada06 = new EntradaEvento("Pepita", "Cena de empresa a las 21:00H");

		muro.addEntradaTexto(entrada01);
		muro.addEntradaFoto(entrada02);
		muro.addEntradaTexto(entrada03);
		muro.addEntradaFoto(entrada04);
		muro.addEntradaEvento(entrada05);
		muro.addEntradaEvento(entrada06);

		System.out.println(muro);
		String esperado = "Nacho\n" + "Recién llegado de mis vacaciones en Hawai!\n" + "Escrito hace 10 segundos\n"
				+ "0\n" + "No existen comentarios\n" + "\n" + "Begoña\n" + "Está lloviendo ahí fuera...\n"
				+ "Escrito hace 10 segundos\n" + "0\n" + "No existen comentarios\n" + "\n" + "Luis\n"
				+ "https://bit.ly/2W1dO09\n" + "Gracias\n" + "Escrito hace 10 segundos\n" + "0\n"
				+ "No existen comentarios\n" + "\n" + "Cristina\n" + "https://bit.ly/3cY9vtD\n"
				+ "Una foto de mi nevera\n" + "Escrito hace 10 segundos\n" + "0\n" + "No existen comentarios\n" + "\n"
				+ "Pepe\n" + "Hoy, fiesta en mi casa\n" + "Escrito hace 10 segundos\n" + "0\n" + "\n" + "Pepita\n"
				+ "Cena de empresa a las 21:00H\n" + "Escrito hace 10 segundos\n" + "0\n"
				+ "\n";
		assertEquals(esperado, muro.toString());
	}

}
