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

		Entrada entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
		Entrada entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
		Entrada entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
		Entrada entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
		Entrada entrada05 = new EntradaEvento("Pepe", "Hoy, fiesta en mi casa");
		Entrada entrada06 = new EntradaEvento("Pepita", "Cena de empresa a las 21:00H");

		muro.addEntrada(entrada01);
		muro.addEntrada(entrada02);
		muro.addEntrada(entrada03);
		muro.addEntrada(entrada04);
		muro.addEntrada(entrada05);
		muro.addEntrada(entrada06);

		System.out.println(muro);
		String esperado = "Nacho\n" 
				+ "Escrito hace 10 segundos\n"
				+ "0\n" 
				+ "No existen comentarios\n" 
				+ "Recién llegado de mis vacaciones en Hawai!\n" 
				+ "\n" 
				
				+ "Luis\n"
				+ "Escrito hace 10 segundos\n" 
				+ "0\n"
				+ "No existen comentarios\n" 
				+ "https://bit.ly/2W1dO09\n" 
				+ "Gracias\n"
				+ "\n"

				+ "Begoña\n" 
				+ "Escrito hace 10 segundos\n"
				+ "0\n" 
				+ "No existen comentarios\n" 
				+ "Está lloviendo ahí fuera...\n"
				+ "\n" 
				
				+ "Cristina\n" 
				+ "Escrito hace 10 segundos\n" 
				+ "0\n" 
				
				+ "No existen comentarios\n" 
				+ "https://bit.ly/3cY9vtD\n"
				+ "Una foto de mi nevera\n" 
				+ "\n"
				+ "Pepe\n" 
				+ "Escrito hace 10 segundos\n" 
				+ "0\n" 
				+ "Hoy, fiesta en mi casa\n" 
				+ "\n" 
				+ "Pepita\n"
				
				+ "Escrito hace 10 segundos\n" 
				+ "0\n"
				+ "Cena de empresa a las 21:00H\n" 
				+ "\n";
		assertEquals(esperado, muro.toString());
	}
	
	@Test
	public void testGetUrlsFotos() {
	    Muro muro = new Muro();

	    Entrada entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
	    Entrada entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
	    Entrada entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
	    Entrada entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");

	    muro.addEntrada(entrada01);
	    muro.addEntrada(entrada02);
	    muro.addEntrada(entrada03);
	    muro.addEntrada(entrada04);

	    // Valor esperado: todas las URLs de fotos, cada una en una línea
	    String esperado = "https://bit.ly/2W1dO09\nhttps://bit.ly/3cY9vtD\n";

	    assertEquals(esperado, muro.getUrlsFotos());
	}
}
