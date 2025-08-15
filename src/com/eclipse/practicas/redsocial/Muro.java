package com.eclipse.practicas.redsocial;
import java.util.ArrayList;

public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }

    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }

    public String toString() {
        StringBuilder textoADevolver = new StringBuilder();
        for (EntradaTexto mensaje : mensajes) {
            textoADevolver.append(mensaje).append("\n");
        }

        for (EntradaFoto foto : fotos) {
            textoADevolver.append(foto).append("\n");
        }
        return textoADevolver.toString();
    }

    public void imprimirMuro() {
        System.out.println(toString());
    }
}